package com.fusionflux.supernaturalcrops.modsupport;

import com.fusionflux.supernaturalcrops.block.OreBushBlock;
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
    public static final OreBushBlock COPPER_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_COPPER_CROP_NUGGETS.getValue() ? TRContent.Nuggets.COPPER.item : TRContent.Ingots.COPPER.item);
    public static final OreBushBlock ALUMINUM_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_ALUMINUM_CROP_NUGGETS.getValue() ? TRContent.Nuggets.ALUMINUM.item : TRContent.Ingots.ALUMINUM.item);
    public static final OreBushBlock BRASS_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_BRASS_CROP_NUGGETS.getValue() ? TRContent.Nuggets.BRASS.item : TRContent.Ingots.BRASS.item);
    public static final OreBushBlock BRONZE_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_BRONZE_CROP_NUGGETS.getValue() ? TRContent.Nuggets.BRONZE.item : TRContent.Ingots.BRONZE.item);
    public static final OreBushBlock ELECTRUM_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_ELECTRUM_CROP_NUGGETS.getValue() ? TRContent.Nuggets.ELECTRUM.item : TRContent.Ingots.ELECTRUM.item);
    public static final OreBushBlock INVAR_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_INVAR_CROP_NUGGETS.getValue() ? TRContent.Nuggets.INVAR.item : TRContent.Ingots.INVAR.item);
    public static final OreBushBlock IRIDIUM_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_IRIDIUM_CROP_NUGGETS.getValue() ? TRContent.Nuggets.IRIDIUM.item : TRContent.Ingots.IRIDIUM.item);
    public static final OreBushBlock LEAD_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_LEAD_CROP_NUGGETS.getValue() ? TRContent.Nuggets.LEAD.item : TRContent.Ingots.LEAD.item);
    public static final OreBushBlock NICKEL_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_NICKEL_CROP_NUGGETS.getValue() ? TRContent.Nuggets.NICKEL.item : TRContent.Ingots.NICKEL.item);
    public static final OreBushBlock PLATINUM_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_PLATINUM_CROP_NUGGETS.getValue() ? TRContent.Nuggets.PLATINUM.item : TRContent.Ingots.PLATINUM.item);
    public static final OreBushBlock SILVER_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_SILVER_CROP_NUGGETS.getValue() ? TRContent.Nuggets.SILVER.item : TRContent.Ingots.SILVER.item);
    public static final OreBushBlock STEEL_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_STEEL_CROP_NUGGETS.getValue() ? TRContent.Nuggets.STEEL.item : TRContent.Ingots.STEEL.item);
    public static final OreBushBlock TIN_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_TIN_CROP_NUGGETS.getValue() ? TRContent.Nuggets.TIN.item : TRContent.Ingots.TIN.item);
    public static final OreBushBlock TITANIUM_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_TITANIUM_CROP_NUGGETS.getValue() ? TRContent.Nuggets.TITANIUM.item : TRContent.Ingots.TITANIUM.item);
    public static final OreBushBlock TUNGSTEN_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_TUNGSTEN_CROP_NUGGETS.getValue() ? TRContent.Nuggets.TUNGSTEN.item : TRContent.Ingots.TUNGSTEN.item);
    public static final OreBushBlock ZINC_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_ZINC_CROP_NUGGETS.getValue() ? TRContent.Nuggets.ZINC.item : TRContent.Ingots.ZINC.item);
    public static final OreBushBlock REFINED_IRON_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_REFINED_IRON_CROP_NUGGETS.getValue() ? TRContent.Nuggets.REFINED_IRON.item : TRContent.Ingots.REFINED_IRON.item);
    public static final OreBushBlock CHROME_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_CHROME_CROP_NUGGETS.getValue() ? TRContent.Nuggets.CHROME.item : TRContent.Ingots.CHROME.item);
    public static final OreBushBlock TUNGSTENSTEEL_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_TUNGSTENSTEEL_CROP_NUGGETS.getValue() ? TRContent.Nuggets.TUNGSTENSTEEL.item : TRContent.Ingots.TUNGSTENSTEEL.item);

    public static void registerBlocks() {
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_COPPER_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.COPPER_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_ALUMINUM_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.ALUMINUM_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_BRASS_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.BRASS_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_BRONZE_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.BRONZE_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_ELECTRUM_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.ELECTRUM_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_INVAR_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.INVAR_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_IRIDIUM_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.IRIDIUM_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_LEAD_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.LEAD_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_NICKEL_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.NICKEL_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_PLATINUM_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.PLATINUM_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_SILVER_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.SILVER_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_STEEL_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.STEEL_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_TIN_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.TIN_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_TITANIUM_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.TITANIUM_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_TUNGSTEN_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.TUNGSTEN_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_ZINC_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.ZINC_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_REFINED_IRON_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.REFINED_IRON_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_CHROME_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.CHROME_BUSH);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_TUNGSTENSTEEL_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush(TechRebornCropsBlocks.TUNGSTENSTEEL_BUSH);
        }
    }

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.COPPER_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.ALUMINUM_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.BRASS_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.BRONZE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.ELECTRUM_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.INVAR_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.IRIDIUM_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.LEAD_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.NICKEL_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.PLATINUM_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.SILVER_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.STEEL_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.TIN_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.TITANIUM_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.TUNGSTEN_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.ZINC_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.REFINED_IRON_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.CHROME_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TechRebornCropsBlocks.TUNGSTENSTEEL_BUSH, RenderLayer.getCutout());
    }
}
