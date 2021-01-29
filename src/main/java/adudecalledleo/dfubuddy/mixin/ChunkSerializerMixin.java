package adudecalledleo.dfubuddy.mixin;

import adudecalledleo.dfubuddy.impl.ModDataFixesInternals;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.ChunkSerializer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ChunkSerializer.class)
public abstract class ChunkSerializerMixin {
    @ModifyVariable(method = "serialize",
                    at = @At(value = "INVOKE", target = "net/minecraft/nbt/CompoundTag.putInt(Ljava/lang/String;I)V", ordinal = 0),
                    name = "compoundTag")
    private static CompoundTag addFixerVersions(CompoundTag input) {
        ModDataFixesInternals.addFixerVersions(input);
        return input;
    }
}
