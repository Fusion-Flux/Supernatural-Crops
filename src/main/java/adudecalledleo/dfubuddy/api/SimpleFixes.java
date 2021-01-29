package adudecalledleo.dfubuddy.api;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.schemas.Schema;
import net.minecraft.datafixer.fix.BiomeRenameFix;
import net.minecraft.datafixer.fix.BlockNameFix;
import net.minecraft.datafixer.fix.ItemNameFix;
import net.minecraft.datafixer.schema.IdentifierNormalizingSchema;

import java.util.Objects;

import static com.google.common.base.Preconditions.checkNotNull;

public final class SimpleFixes {
    private SimpleFixes() { }

    public static void addBlockRenameFix(DataFixerBuilder builder, String name, String oldId, String newId, Schema schema) {
        checkNotNull(builder, "DataFixerBuilder cannot be null");
        checkNotNull(name, "Fix name cannot be null");
        checkNotNull(oldId, "Old ID cannot be null");
        checkNotNull(newId, "New ID cannot be null");
        checkNotNull(schema, "Schema cannot be null");
        builder.addFixer(BlockNameFix.create(schema, name, (inputName) ->
                Objects.equals(IdentifierNormalizingSchema.normalize(inputName), oldId) ? newId : inputName));
    }

    public static void addItemRenameFix(DataFixerBuilder builder, String name, String oldId, String newId, Schema schema) {
        checkNotNull(builder, "DataFixerBuilder cannot be null");
        checkNotNull(name, "Fix name cannot be null");
        checkNotNull(oldId, "Old ID cannot be null");
        checkNotNull(newId, "New ID cannot be null");
        checkNotNull(schema, "Schema cannot be null");
        builder.addFixer(ItemNameFix.create(schema, name, (inputName) ->
                Objects.equals(IdentifierNormalizingSchema.normalize(inputName), oldId) ? newId : inputName));
    }

    public static void addBiomeRenameFix(DataFixerBuilder builder, String name, ImmutableMap<String, String> changes, Schema schema) {
        checkNotNull(builder, "DataFixerBuilder cannot be null");
        checkNotNull(name, "Fix name cannot be null");
        checkNotNull(changes, "Changes cannot be null");
        checkNotNull(schema, "Schema cannot be null");
        builder.addFixer(new BiomeRenameFix(schema, false, name, changes));
    }
}
