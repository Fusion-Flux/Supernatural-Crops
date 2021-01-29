package adudecalledleo.dfubuddy.mixin;

import adudecalledleo.dfubuddy.impl.ModDataFixesInternals;
import com.mojang.datafixers.DataFixer;
import net.minecraft.datafixer.DataFixTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(NbtHelper.class)
public abstract class NbtHelperMixin {
    @Inject(method = "update(Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/datafixer/DataFixTypes;Lnet/minecraft/nbt/CompoundTag;II)Lnet/minecraft/nbt/CompoundTag;",
            at = @At("RETURN"), cancellable = true)
    private static void updateDataWithFixers(DataFixer vanillaDataFixer, DataFixTypes dataFixTypes, CompoundTag inputTag$unused, int vanillaDynamicDataVersion, int vanillaRuntimeDataVersion, CallbackInfoReturnable<CompoundTag> cir) {
        CompoundTag original = cir.getReturnValue(); // we do our fixes after vanilla
        CompoundTag finalTag = ModDataFixesInternals.updateWithAllFixers(dataFixTypes, original);
        cir.setReturnValue(finalTag);
    }
}
