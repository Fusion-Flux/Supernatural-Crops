package com.fusionflux.supernaturalcrops.modsupport;

import com.fusionflux.supernaturalcrops.block.OreBush;
import com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;
import techreborn.init.TRContent;

public class TechRebornCropsBlocks {
    public static final OreBush TRCOPPER_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_COPPER_CROP_NUGGETS.getValue() ? TRContent.Nuggets.COPPER.item : TRContent.Ingots.COPPER.item);


    public static void registerBlocks() {
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_COPPER_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trcopper_bush", TechRebornCropsBlocks.TRCOPPER_BUSH, TRContent.Ingots.COPPER.item);
        }
    }

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.TRCOPPER_BUSH, RenderLayer.getCutout());
    }
}
