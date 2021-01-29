package adudecalledleo.dfubuddy.api;

import adudecalledleo.dfubuddy.impl.ModDataFixesInternals;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.schemas.Schema;
import net.minecraft.nbt.CompoundTag;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.function.BiFunction;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public final class ModDataFixes {
    private ModDataFixes() { }

    public static final BiFunction<Integer, Schema, Schema> MOD_SCHEMA =
            (versionKey, parent) -> ModDataFixesInternals.getModSchema();

    public static void registerFixer(@NotNull String modId, int currentVersion, @NotNull DataFixer dataFixer) {
        checkNotNull(modId, "modId cannot be null");
        checkArgument(currentVersion >= 0, "currentVersion must be positive");
        checkNotNull(dataFixer, "dataFixer cannot be null");
        if (isLocked())
            throw new IllegalStateException("Can't register data fixer after registration is locked!");
        ModDataFixesInternals.registerFixer(modId, currentVersion, dataFixer);
    }

    public static @NotNull Optional<DataFixer> getFixer(@NotNull String modId) {
        checkNotNull(modId, "modId cannot be null");
        ModDataFixesInternals.DataFixerEntry entry = ModDataFixesInternals.getFixerEntry(modId);
        if (entry == null)
            return Optional.empty();
        return Optional.of(entry.dataFixer);
    }

    public static int getModDataVersion(@NotNull CompoundTag compoundTag, @NotNull String modId) {
        checkNotNull(compoundTag, "compoundTag cannot be null");
        checkNotNull(modId, "modId cannot be null");
        return ModDataFixesInternals.getModDataVersion(compoundTag, modId);
    }

    public static boolean isLocked() {
        return ModDataFixesInternals.isLocked();
    }
}
