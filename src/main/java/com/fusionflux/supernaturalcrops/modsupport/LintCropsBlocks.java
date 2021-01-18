package com.fusionflux.supernaturalcrops.modsupport;

import com.fusionflux.supernaturalcrops.block.OreBush;
import com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import me.hydos.lint.item.LintItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;
import techreborn.init.TRContent;

public class LintCropsBlocks {
    public static final OreBush JUREL_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.LINT_NUGGET_BALANCE.ENABLE_JUREL_CROP_NUGGETS.getValue() ?  LintItems.JUREL_POWDER : LintItems.HARDENED_JUREL_INGOT);

    public static void registerBlocks() {
        if (SupernaturalCropsConfig.LINT_ENABLED.ENABLE_JUREL_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("jurel_bush", LintCropsBlocks.JUREL_BUSH, LintItems.HARDENED_JUREL_INGOT);
        }
    }

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(LintCropsBlocks.JUREL_BUSH, RenderLayer.getCutout());
    }

}
