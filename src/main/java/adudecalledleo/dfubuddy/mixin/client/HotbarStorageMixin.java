package adudecalledleo.dfubuddy.mixin.client;

import adudecalledleo.dfubuddy.impl.ModDataFixesInternals;
import net.minecraft.client.options.HotbarStorage;
import net.minecraft.nbt.CompoundTag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(HotbarStorage.class)
public abstract class HotbarStorageMixin {
    @Inject(method = "save",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/nbt/NbtIo;write(Lnet/minecraft/nbt/CompoundTag;Ljava/io/File;)V"),
            locals = LocalCapture.CAPTURE_FAILEXCEPTION)
    public void addFixerVersions(CallbackInfo ci, CompoundTag tag) {
        ModDataFixesInternals.addFixerVersions(tag);
    }
}
