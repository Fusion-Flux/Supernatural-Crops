package com.fusionflux.supernaturalcrops.modsupport;

import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.fusionflux.supernaturalcrops.blocks.CustomBush;
import com.fusionflux.supernaturalcrops.blocks.SupernaturalCropsBlocks;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nourl.mythicmetals.registry.RegisterIngots;
import nourl.mythicmetals.registry.RegisterNuggets;
import paulevs.betternether.registry.ItemsRegistry;
import ru.betterend.registry.EndItems;

public class BetterEndCropsBlocks {
    public static final CustomBush TERMINITE_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.BETTER_END_NUGGET_BALANCE.ENABLE_TERMINITE_CROP_NUGGETS.getValue() ? EndItems.ENDER_DUST : EndItems.TERMINITE_INGOT);
    public static final CustomBush AMBER_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.BETTER_END_NUGGET_BALANCE.ENABLE_AMBER_CROP_NUGGETS.getValue() ? EndItems.RAW_AMBER : EndItems.AMBER_GEM);

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
