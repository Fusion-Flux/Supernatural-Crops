package adudecalledleo.dfubuddy.mixin;

import adudecalledleo.dfubuddy.impl.ModDataFixesInternals;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {
    @Inject(method = "writeCustomDataToTag", at = @At("RETURN"))
    public void addFixerVersions(CompoundTag tag, CallbackInfo ci) {
        ModDataFixesInternals.addFixerVersions(tag);
    }
}
