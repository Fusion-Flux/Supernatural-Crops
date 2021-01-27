package com.fusionflux.supernaturalcrops.modsupport;

import com.fusionflux.supernaturalcrops.OreBush;
import com.fusionflux.supernaturalcrops.block.OreBushBlock;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.Item;
import net.minecraft.util.Lazy;
import techreborn.init.TRContent;

import java.util.function.Supplier;

import static com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks.*;
import static com.fusionflux.supernaturalcrops.resource.SupernaturalCropsResources.registerBushResources;

public class TechRebornCropsBlocks {
    public enum OreBushes implements OreBush {
        COPPER("copper_bush", TRContent.Ingots.COPPER.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableCopperCropNuggets
                        ? TRContent.Nuggets.COPPER.item
                        : TRContent.Ingots.COPPER.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableCopperCrops),
        ALUMINUM("aluminum_bush", TRContent.Ingots.ALUMINUM.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableAluminumCropNuggets
                        ? TRContent.Nuggets.ALUMINUM.item
                        : TRContent.Ingots.ALUMINUM.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableAluminumCrops),
        BRASS("brass_bush", TRContent.Ingots.BRASS.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableBrassCropNuggets
                        ? TRContent.Nuggets.BRASS.item
                        : TRContent.Ingots.BRASS.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableBrassCrops),
        BRONZE("bronze_bush", TRContent.Ingots.BRONZE.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableBronzeCropNuggets
                        ? TRContent.Nuggets.BRONZE.item
                        : TRContent.Ingots.BRONZE.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableBronzeCrops),
        ELECTRUM("electrum_bush", TRContent.Ingots.ELECTRUM.item, new Lazy<>(() ->
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
        LEAD("lead_bush", TRContent.Ingots.LEAD.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableLeadCropNuggets
                        ? TRContent.Nuggets.LEAD.item
                        : TRContent.Ingots.LEAD.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableLeadCrops),
        NICKEL("nickel_bush", TRContent.Ingots.NICKEL.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableNickelCropNuggets
                        ? TRContent.Nuggets.NICKEL.item
                        : TRContent.Ingots.NICKEL.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableNickelCrops),
        PLATINUM("platinum_bush", TRContent.Ingots.PLATINUM.item, new Lazy<>(() ->
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
        TUNGSTEN("tungsten_bush", TRContent.Ingots.TUNGSTEN.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableTungstenCropNuggets
                        ? TRContent.Nuggets.TUNGSTEN.item
                        : TRContent.Ingots.TUNGSTEN.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableTungstenCrops),
        ZINC("zinc_bush", TRContent.Ingots.ZINC.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableZincCropNuggets
                        ? TRContent.Nuggets.ZINC.item
                        : TRContent.Ingots.ZINC.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableZincCrops),
        REFINED_IRON("refined_iron_bush", TRContent.Ingots.REFINED_IRON.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableRefinedIronCropNuggets
                        ? TRContent.Nuggets.REFINED_IRON.item
                        : TRContent.Ingots.REFINED_IRON.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableRefinedIronCrops),
        CHROME("chrome_bush", TRContent.Ingots.CHROME.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableChromeCropNuggets
                        ? TRContent.Nuggets.CHROME.item
                        : TRContent.Ingots.CHROME.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableChromeCrops),
        TUNGSTENSTEEL("tungstensteel_bush", TRContent.Ingots.TUNGSTENSTEEL.item, new Lazy<>(() ->
                SupernaturalCropsConfig.get().techRebornNuggetBalance.enableTungstensteelCropNuggets
                        ? TRContent.Nuggets.TUNGSTENSTEEL.item
                        : TRContent.Ingots.TUNGSTENSTEEL.item),
                () -> SupernaturalCropsConfig.get().techRebornEnabled.enableTungstensteelCrops);

        private final String path;
        private final Item ingot;
        private final Lazy<Item> harvestResult;
        private final Lazy<Boolean> enabled;
        private final Lazy<OreBushBlock> block;

        OreBushes(String path, Item ingot, Lazy<Item> harvestResult, Supplier<Boolean> enabled) {
            this.path = "techreborn_" + path;
            this.ingot = ingot;
            this.harvestResult = harvestResult;
            this.enabled = new Lazy<>(enabled);
            block = new Lazy<>(() -> new OreBushBlock(bushBlockSettings(), this));
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
        public OreBushBlock getBlock() {
            return block.get();
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

    public static void registerBlocks() {
        registerBushBlocksAndItems(OreBushes.values());
        registerBushResources(OreBushes.values());
    }

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayers() {
        registerBushRenderLayers(OreBushes.values());
    }
}
