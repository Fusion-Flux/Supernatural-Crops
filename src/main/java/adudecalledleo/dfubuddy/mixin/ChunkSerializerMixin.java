package adudecalledleo.dfubuddy.mixin;

import adudecalledleo.dfubuddy.impl.ModDataFixesInternals;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.ChunkSerializer;
import net.minecraft.world.chunk.Chunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(ChunkSerializer.class)
public abstract class ChunkSerializerMixin {
    // original injection by i5
    // this seems to crash outside of dev tho, so we use an alternate @Inject
    /*
    @ModifyVariable(method = "serialize",
                    at = @At(value = "INVOKE", target = "net/minecraft/nbt/CompoundTag.putInt(Ljava/lang/String;I)V", ordinal = 0),
                    name = "compoundTag")
    private static CompoundTag addModDataVersions(CompoundTag input) {
        ModDataFixesInternals.addModDataVersions(input);
        return input;
    }
     */

    @Inject(method = "serialize",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/nbt/CompoundTag;putInt(Ljava/lang/String;I)V", ordinal = 0),
            locals = LocalCapture.CAPTURE_FAILEXCEPTION)
    private static void addModDataVersions(ServerWorld world, Chunk chunk, CallbackInfoReturnable<CompoundTag> cir,
            ChunkPos chunkPos, CompoundTag compoundTag) {
        ModDataFixesInternals.addModDataVersions(compoundTag);
    }
}
