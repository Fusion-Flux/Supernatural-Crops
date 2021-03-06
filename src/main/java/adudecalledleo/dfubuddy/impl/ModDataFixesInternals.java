package adudecalledleo.dfubuddy.impl;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import net.minecraft.SharedConstants;
import net.minecraft.datafixer.DataFixTypes;
import net.minecraft.datafixer.Schemas;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.Map;
import java.util.function.BiFunction;

@ApiStatus.Internal
public final class ModDataFixesInternals {
    private ModDataFixesInternals() { }

    public static final Logger LOGGER = LogManager.getLogger("ModDataFixesInternals");

    private static Map<String, DataFixerEntry> modDataFixers = new Object2ReferenceOpenHashMap<>();
    private static Schema modSchema;
    private static boolean locked = false;

    public static void registerFixer(@NotNull String modId, int currentVersion, @NotNull DataFixer dataFixer) {
        modDataFixers.put(modId, new DataFixerEntry(dataFixer, currentVersion));
    }

    public static @Nullable DataFixerEntry getFixerEntry(String modId) {
        return modDataFixers.get(modId);
    }

    public static @NotNull Schema getModSchema() {
        if (modSchema == null)
            modSchema = new Schema(0, VanillaDataFixers.VANILLA_DATAFIXER.apply(-1, null));
        return modSchema;
    }

    public static @NotNull CompoundTag updateWithAllFixers(@NotNull DataFixTypes dataFixTypes, @NotNull CompoundTag compoundTag) {
        CompoundTag currentTag = compoundTag;

        for (Map.Entry<String, DataFixerEntry> entry : modDataFixers.entrySet()) {
            String currentModId = entry.getKey();
            int modIdCurrentDynamicVersion = getModDataVersion(compoundTag, currentModId);
            DataFixerEntry dataFixerEntry = entry.getValue();

            currentTag = (CompoundTag) dataFixerEntry.dataFixer.update(dataFixTypes.getTypeReference(),
                    new Dynamic<>(NbtOps.INSTANCE, currentTag), modIdCurrentDynamicVersion, dataFixerEntry.currentVersion).getValue();
        }

        return currentTag;
    }

    public static void addModDataVersions(@NotNull CompoundTag compoundTag) {
        for (Map.Entry<String, DataFixerEntry> entry : modDataFixers.entrySet())
            compoundTag.putInt(entry.getKey() + "_DataVersion", entry.getValue().currentVersion);
    }

    public static int getModDataVersion(@NotNull CompoundTag compoundTag, @NotNull String modId) {
        return compoundTag.getInt(modId + "_DataVersion");
    }

    public static void lock() {
        if (!locked) {
            modDataFixers = Collections.unmodifiableMap(modDataFixers);
            LOGGER.info("DataFixer registration locked!");
        }
        locked = true;
    }

    public static boolean isLocked() {
        return locked;
    }

    public static final class DataFixerEntry {
        public final @NotNull DataFixer dataFixer;
        public final int currentVersion;

        public DataFixerEntry(@NotNull DataFixer dataFixer, int currentVersion) {
            this.dataFixer = dataFixer;
            this.currentVersion = currentVersion;
        }
    }

    public static final class VanillaDataFixers {
        private static final int LATEST_VANILLA_SCHEMA_VERSION =
                DataFixUtils.makeKey(SharedConstants.getGameVersion().getWorldVersion());

        private static Schema getVanillaDataFixer(Integer integer, Schema schema) {
            LOGGER.info("[DFUBuddy DataFixer] Started with a Vanilla Schema version of " + LATEST_VANILLA_SCHEMA_VERSION);
            return Schemas.getFixer().getSchema(LATEST_VANILLA_SCHEMA_VERSION);
        }

        public static final BiFunction<Integer, Schema, Schema> VANILLA_DATAFIXER =
                (version, parent) -> Schemas.getFixer().getSchema(LATEST_VANILLA_SCHEMA_VERSION);
    }
}
