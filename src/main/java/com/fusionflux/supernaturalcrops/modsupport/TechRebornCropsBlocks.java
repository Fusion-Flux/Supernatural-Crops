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
    public static final OreBush COPPER_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_COPPER_CROP_NUGGETS.getValue() ? TRContent.Nuggets.COPPER.item : TRContent.Ingots.COPPER.item);
    public static final OreBush ALUMINUM_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_ALUMINUM_CROP_NUGGETS.getValue() ? TRContent.Nuggets.ALUMINUM.item : TRContent.Ingots.ALUMINUM.item);
    public static final OreBush BRASS_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_BRASS_CROP_NUGGETS.getValue() ? TRContent.Nuggets.BRASS.item : TRContent.Ingots.BRASS.item);
    public static final OreBush BRONZE_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_BRONZE_CROP_NUGGETS.getValue() ? TRContent.Nuggets.BRONZE.item : TRContent.Ingots.BRONZE.item);
    public static final OreBush ELECTRUM_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_ELECTRUM_CROP_NUGGETS.getValue() ? TRContent.Nuggets.ELECTRUM.item : TRContent.Ingots.ELECTRUM.item);
    public static final OreBush INVAR_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_INVAR_CROP_NUGGETS.getValue() ? TRContent.Nuggets.INVAR.item : TRContent.Ingots.INVAR.item);
    public static final OreBush IRIDIUM_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_IRIDIUM_CROP_NUGGETS.getValue() ? TRContent.Nuggets.IRIDIUM.item : TRContent.Ingots.IRIDIUM.item);
    public static final OreBush LEAD_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_LEAD_CROP_NUGGETS.getValue() ? TRContent.Nuggets.LEAD.item : TRContent.Ingots.LEAD.item);
    public static final OreBush NICKEL_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_NICKEL_CROP_NUGGETS.getValue() ? TRContent.Nuggets.NICKEL.item : TRContent.Ingots.NICKEL.item);
    public static final OreBush PLATINUM_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_PLATINUM_CROP_NUGGETS.getValue() ? TRContent.Nuggets.PLATINUM.item : TRContent.Ingots.PLATINUM.item);
    public static final OreBush SILVER_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_SILVER_CROP_NUGGETS.getValue() ? TRContent.Nuggets.SILVER.item : TRContent.Ingots.SILVER.item);
    public static final OreBush STEEL_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_STEEL_CROP_NUGGETS.getValue() ? TRContent.Nuggets.STEEL.item : TRContent.Ingots.STEEL.item);
    public static final OreBush TIN_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_TIN_CROP_NUGGETS.getValue() ? TRContent.Nuggets.TIN.item : TRContent.Ingots.TIN.item);
    public static final OreBush TITANIUM_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_TITANIUM_CROP_NUGGETS.getValue() ? TRContent.Nuggets.TITANIUM.item : TRContent.Ingots.TITANIUM.item);
    public static final OreBush TUNGSTEN_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_TUNGSTEN_CROP_NUGGETS.getValue() ? TRContent.Nuggets.TUNGSTEN.item : TRContent.Ingots.TUNGSTEN.item);
    public static final OreBush ZINC_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_ZINC_CROP_NUGGETS.getValue() ? TRContent.Nuggets.ZINC.item : TRContent.Ingots.ZINC.item);
    public static final OreBush REFINED_IRON_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_REFINED_IRON_CROP_NUGGETS.getValue() ? TRContent.Nuggets.REFINED_IRON.item : TRContent.Ingots.REFINED_IRON.item);
    public static final OreBush CHROME_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_CHROME_CROP_NUGGETS.getValue() ? TRContent.Nuggets.CHROME.item : TRContent.Ingots.CHROME.item);
    public static final OreBush TUNGSTENSTEEL_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.TECHREBORN_NUGGET_BALANCE.ENABLE_TUNGSTENSTEEL_CROP_NUGGETS.getValue() ? TRContent.Nuggets.TUNGSTENSTEEL.item : TRContent.Ingots.TUNGSTENSTEEL.item);

    public static void registerBlocks() {
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_COPPER_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trcopper_bush", TechRebornCropsBlocks.COPPER_BUSH, TRContent.Ingots.COPPER.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_ALUMINUM_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("traluminum_bush", TechRebornCropsBlocks.ALUMINUM_BUSH, TRContent.Ingots.ALUMINUM.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_BRASS_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trbrass_bush", TechRebornCropsBlocks.BRASS_BUSH, TRContent.Ingots.BRASS.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_BRONZE_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trbronze_bush", TechRebornCropsBlocks.BRONZE_BUSH, TRContent.Ingots.BRONZE.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_ELECTRUM_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trelectrum_bush", TechRebornCropsBlocks.ELECTRUM_BUSH, TRContent.Ingots.ELECTRUM.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_INVAR_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trinvar_bush", TechRebornCropsBlocks.INVAR_BUSH, TRContent.Ingots.INVAR.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_IRIDIUM_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("triridium_bush", TechRebornCropsBlocks.IRIDIUM_BUSH, TRContent.Ingots.IRIDIUM.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_LEAD_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trlead_bush", TechRebornCropsBlocks.LEAD_BUSH, TRContent.Ingots.LEAD.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_NICKEL_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trnickel_bush", TechRebornCropsBlocks.NICKEL_BUSH, TRContent.Ingots.NICKEL.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_PLATINUM_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trplatinum_bush", TechRebornCropsBlocks.PLATINUM_BUSH, TRContent.Ingots.PLATINUM.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_SILVER_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trsilver_bush", TechRebornCropsBlocks.SILVER_BUSH, TRContent.Ingots.SILVER.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_STEEL_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trsteel_bush", TechRebornCropsBlocks.STEEL_BUSH, TRContent.Ingots.STEEL.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_TIN_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trtin_bush", TechRebornCropsBlocks.TIN_BUSH, TRContent.Ingots.TIN.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_TITANIUM_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trtitanium_bush", TechRebornCropsBlocks.TITANIUM_BUSH, TRContent.Ingots.TITANIUM.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_TUNGSTEN_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trtungsten_bush", TechRebornCropsBlocks.TUNGSTEN_BUSH, TRContent.Ingots.TUNGSTEN.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_ZINC_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trzinc_bush", TechRebornCropsBlocks.ZINC_BUSH, TRContent.Ingots.ZINC.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_REFINED_IRON_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trrefined_iron_bush", TechRebornCropsBlocks.REFINED_IRON_BUSH, TRContent.Ingots.REFINED_IRON.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_CHROME_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trchrome_bush", TechRebornCropsBlocks.CHROME_BUSH, TRContent.Ingots.CHROME.item);
        }
        if (SupernaturalCropsConfig.TECHREBORN_ENABLED.ENABLE_TUNGSTENSTEEL_CROPS.getValue()) {
            SupernaturalCropsBlocks.registerBush("trtungstensteel_bush", TechRebornCropsBlocks.TUNGSTENSTEEL_BUSH, TRContent.Ingots.TUNGSTENSTEEL.item);
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
