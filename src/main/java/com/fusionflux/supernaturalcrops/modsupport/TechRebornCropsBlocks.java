package com.fusionflux.supernaturalcrops.modsupport;

import com.fusionflux.supernaturalcrops.OreBush;
import com.fusionflux.supernaturalcrops.block.OreBushBlock;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
import net.minecraft.util.Lazy;
import techreborn.init.TRContent;

import java.util.function.Supplier;

import static com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks.bushBlockSettings;
import static com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks.registerBush;
import static com.fusionflux.supernaturalcrops.resource.SupernaturalCropsResources.registerBushResources;

public class TechRebornCropsBlocks {
    public enum OreBushes implements OreBush {
        COPPER("trcopper_bush", TRContent.Ingots.COPPER.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableCopperCropNuggets
                        ? TRContent.Nuggets.COPPER.item
                        : TRContent.Ingots.COPPER.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableCopperCrops),
        ALUMINUM("traluminum_bush", TRContent.Ingots.ALUMINUM.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableAluminumCropNuggets
                        ? TRContent.Nuggets.ALUMINUM.item
                        : TRContent.Ingots.ALUMINUM.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableAluminumCrops),
        BRASS("trbrass_bush", TRContent.Ingots.BRASS.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableBrassCropNuggets
                        ? TRContent.Nuggets.BRASS.item
                        : TRContent.Ingots.BRASS.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableBrassCrops),
        BRONZE("trbronze_bush", TRContent.Ingots.BRONZE.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableBronzeCropNuggets
                        ? TRContent.Nuggets.BRONZE.item
                        : TRContent.Ingots.BRONZE.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableBronzeCrops),
        ELECTRUM("trelectrum_bush", TRContent.Ingots.ELECTRUM.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableElectrumCropNuggets
                        ? TRContent.Nuggets.ELECTRUM.item
                        : TRContent.Ingots.ELECTRUM.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableElectrumCrops),
        INVAR("invar_bush", TRContent.Ingots.INVAR.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableInvarCropNuggets
                        ? TRContent.Nuggets.INVAR.item
                        : TRContent.Ingots.INVAR.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableInvarCrops),
        IRIDIUM("iridium_bush", TRContent.Ingots.IRIDIUM.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableIridiumCropNuggets
                        ? TRContent.Nuggets.IRIDIUM.item
                        : TRContent.Ingots.IRIDIUM.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableIridiumCrops),
        LEAD("trlead_bush", TRContent.Ingots.LEAD.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableLeadCropNuggets
                        ? TRContent.Nuggets.LEAD.item
                        : TRContent.Ingots.LEAD.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableLeadCrops),
        NICKEL("trnickel_bush", TRContent.Ingots.NICKEL.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableNickelCropNuggets
                        ? TRContent.Nuggets.NICKEL.item
                        : TRContent.Ingots.NICKEL.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableNickelCrops),
        PLATINUM("trplatinum_bush", TRContent.Ingots.PLATINUM.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enablePlatinumCropNuggets
                        ? TRContent.Nuggets.PLATINUM.item
                        : TRContent.Ingots.PLATINUM.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enablePlatinumCrops),
        SILVER("silver_bush", TRContent.Ingots.SILVER.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableSilverCropNuggets
                        ? TRContent.Nuggets.SILVER.item
                        : TRContent.Ingots.SILVER.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableSilverCrops),
        STEEL("steel_bush", TRContent.Ingots.STEEL.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableSteelCropNuggets
                        ? TRContent.Nuggets.STEEL.item
                        : TRContent.Ingots.STEEL.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableSteelCrops),
        TIN("tin_bush", TRContent.Ingots.TIN.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableTinCropNuggets
                        ? TRContent.Nuggets.TIN.item
                        : TRContent.Ingots.TIN.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableTinCrops),
        TITANIUM("titanium_bush", TRContent.Ingots.TITANIUM.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableTitaniumCropNuggets
                        ? TRContent.Nuggets.TITANIUM.item
                        : TRContent.Ingots.TITANIUM.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableTitaniumCrops),
        TUNGSTEN("trtungsten_bush", TRContent.Ingots.TUNGSTEN.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableTungstenCropNuggets
                        ? TRContent.Nuggets.TUNGSTEN.item
                        : TRContent.Ingots.TUNGSTEN.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableTungstenCrops),
        ZINC("trzinc_bush", TRContent.Ingots.ZINC.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableZincCropNuggets
                        ? TRContent.Nuggets.ZINC.item
                        : TRContent.Ingots.ZINC.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableZincCrops),
        REFINED_IRON("trrefined_iron_bush", TRContent.Ingots.REFINED_IRON.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableRefinedIronCropNuggets
                        ? TRContent.Nuggets.REFINED_IRON.item
                        : TRContent.Ingots.REFINED_IRON.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableRefinedIronCrops),
        CHROME("trhrome_bush", TRContent.Ingots.CHROME.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableChromeCropNuggets
                        ? TRContent.Nuggets.CHROME.item
                        : TRContent.Ingots.CHROME.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableChromeCrops),
        TUNGSTENSTEEL("trtungstensteel_bush", TRContent.Ingots.TUNGSTENSTEEL.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableTungstensteelCropNuggets
                        ? TRContent.Nuggets.TUNGSTENSTEEL.item
                        : TRContent.Ingots.TUNGSTENSTEEL.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableTungstensteelCrops);

        private final String path;
        private final Item ingot;
        private final Lazy<Item> harvestResult;
        private final Lazy<Boolean> enabled;

        OreBushes(String path, Item ingot, Lazy<Item> harvestResult, Supplier<Boolean> enabled) {
            this.path = path;
            this.ingot = ingot;
            this.harvestResult = harvestResult;
            this.enabled = new Lazy<>(enabled);
        }

        @Override
        public boolean isEnabled() {
            return enabled.get();
        }

        @Override
        public String getPath() {
            return path;
        }

        @Override
        public Item getIngot() {
            return ingot;
        }

        @Override
        public Item getHarvestResult() {
            return harvestResult.get();
        }
    }

    public static final OreBushBlock COPPER_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.COPPER);
    public static final OreBushBlock ALUMINUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.ALUMINUM);
    public static final OreBushBlock BRASS_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.BRASS);
    public static final OreBushBlock BRONZE_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.BRONZE);
    public static final OreBushBlock ELECTRUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.ELECTRUM);
    public static final OreBushBlock INVAR_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.INVAR);
    public static final OreBushBlock IRIDIUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.IRIDIUM);
    public static final OreBushBlock LEAD_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.LEAD);
    public static final OreBushBlock NICKEL_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.NICKEL);
    public static final OreBushBlock PLATINUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.PLATINUM);
    public static final OreBushBlock SILVER_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.SILVER);
    public static final OreBushBlock STEEL_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.STEEL);
    public static final OreBushBlock TIN_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.TIN);
    public static final OreBushBlock TITANIUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.TITANIUM);
    public static final OreBushBlock TUNGSTEN_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.TUNGSTEN);
    public static final OreBushBlock ZINC_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.ZINC);
    public static final OreBushBlock REFINED_IRON_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.REFINED_IRON);
    public static final OreBushBlock CHROME_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.CHROME);
    public static final OreBushBlock TUNGSTENSTEEL_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.TUNGSTENSTEEL);

    public static void registerBlocks() {
        registerBush(TechRebornCropsBlocks.COPPER_BUSH);
        registerBush(TechRebornCropsBlocks.ALUMINUM_BUSH);
        registerBush(TechRebornCropsBlocks.BRASS_BUSH);
        registerBush(TechRebornCropsBlocks.BRONZE_BUSH);
        registerBush(TechRebornCropsBlocks.ELECTRUM_BUSH);
        registerBush(TechRebornCropsBlocks.INVAR_BUSH);
        registerBush(TechRebornCropsBlocks.IRIDIUM_BUSH);
        registerBush(TechRebornCropsBlocks.LEAD_BUSH);
        registerBush(TechRebornCropsBlocks.NICKEL_BUSH);
        registerBush(TechRebornCropsBlocks.PLATINUM_BUSH);
        registerBush(TechRebornCropsBlocks.SILVER_BUSH);
        registerBush(TechRebornCropsBlocks.STEEL_BUSH);
        registerBush(TechRebornCropsBlocks.TIN_BUSH);
        registerBush(TechRebornCropsBlocks.TITANIUM_BUSH);
        registerBush(TechRebornCropsBlocks.TUNGSTEN_BUSH);
        registerBush(TechRebornCropsBlocks.ZINC_BUSH);
        registerBush(TechRebornCropsBlocks.REFINED_IRON_BUSH);
        registerBush(TechRebornCropsBlocks.CHROME_BUSH);
        registerBush(TechRebornCropsBlocks.TUNGSTENSTEEL_BUSH);
        registerBushResources(OreBushes.values());
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
