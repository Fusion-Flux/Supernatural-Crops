package adudecalledleo.dfubuddy.mixin;

import adudecalledleo.dfubuddy.impl.ModDataFixesInternals;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.structure.Structure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Structure.class)
public abstract class StructureMixin {
    @Inject(method = "toTag", at = @At("TAIL"), cancellable = true)
    private void addModDataVersions(CompoundTag tag, CallbackInfoReturnable<CompoundTag> cir) {
        CompoundTag out = cir.getReturnValue();
        ModDataFixesInternals.addModDataVersions(out);
        cir.setReturnValue(out);
    }
}
