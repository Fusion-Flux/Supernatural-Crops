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
import ru.betterend.registry.EndItems;

import java.util.function.Supplier;

import static com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks.bushBlockSettings;
import static com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks.registerBush;
import static com.fusionflux.supernaturalcrops.resource.SupernaturalCropsResources.registerBushResources;

public class BetterEndCropsBlocks {
    public enum OreBushes implements OreBush {
        TERMINITE("terminite_bush", EndItems.TERMINITE_INGOT, new Lazy<>(() ->
                SupernaturalCropsConfig.get().betterEndNuggetBalance.enableTerminiteCropNuggets
                        ? EndItems.ENDER_DUST
                        : EndItems.TERMINITE_INGOT),
                () -> SupernaturalCropsConfig.get().betterEndEnabled.enableTerminiteCrops),
        AMBER("amber_bush", EndItems.AMBER_GEM, new Lazy<>(() ->
                SupernaturalCropsConfig.get().betterEndNuggetBalance.enableAmberCropNuggets
                        ? EndItems.RAW_AMBER
                        : EndItems.AMBER_GEM),
                () -> SupernaturalCropsConfig.get().betterEndEnabled.enableAmberCrops);

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

    public static final OreBushBlock TERMINITE_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.TERMINITE);
    public static final OreBushBlock AMBER_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.AMBER);

    public static void registerBlocks() {
        registerBush(TERMINITE_BUSH);
        registerBush(AMBER_BUSH);
        registerBushResources(OreBushes.values());
    }

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(BetterEndCropsBlocks.TERMINITE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BetterEndCropsBlocks.AMBER_BUSH, RenderLayer.getCutout());
    }

}
