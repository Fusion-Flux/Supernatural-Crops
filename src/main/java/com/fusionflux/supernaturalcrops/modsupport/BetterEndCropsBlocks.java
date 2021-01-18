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
import ru.betterend.registry.EndItems;

public class BetterEndCropsBlocks {
    public static final OreBush TERMINITE_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.BETTER_END_NUGGET_BALANCE.ENABLE_TERMINITE_CROP_NUGGETS.getValue() ? EndItems.ENDER_DUST : EndItems.TERMINITE_INGOT);
    public static final OreBush AMBER_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.BETTER_END_NUGGET_BALANCE.ENABLE_AMBER_CROP_NUGGETS.getValue() ? EndItems.RAW_AMBER : EndItems.AMBER_GEM);

    public static void registerBlocks() {
        if (SupernaturalCropsConfig.BETTER_END_ENABLED.ENABLE_TERMINITE_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("terminite_bush", BetterEndCropsBlocks.TERMINITE_BUSH, EndItems.TERMINITE_INGOT);
        }
        if (SupernaturalCropsConfig.BETTER_END_ENABLED.ENABLE_AMBER_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("amber_bush", BetterEndCropsBlocks.AMBER_BUSH, EndItems.AMBER_GEM);
        }
    }

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(BetterEndCropsBlocks.TERMINITE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BetterEndCropsBlocks.AMBER_BUSH, RenderLayer.getCutout());
    }

}
