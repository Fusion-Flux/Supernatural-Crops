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
import paulevs.betternether.registry.ItemsRegistry;

import java.util.function.Supplier;

import static com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks.bushBlockSettings;
import static com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks.registerBush;
import static com.fusionflux.supernaturalcrops.resource.SupernaturalCropsResources.registerBushResources;

public class BetterNetherCropsBlocks {
    public enum OreBushes implements OreBush {
        CINCINNASITE("cincinnasite_bush", ItemsRegistry.CINCINNASITE_INGOT, new Lazy<>(() ->
                SupernaturalCropsConfig.get().betterNetherNuggetBalance.enableCincinnasiteCropNuggets
                        ? ItemsRegistry.CINCINNASITE
                        : ItemsRegistry.CINCINNASITE_INGOT),
                () -> SupernaturalCropsConfig.get().betterNetherEnabled.enableCincinnasiteCrops),
        NETHER_RUBY("nether_ruby_bush", ItemsRegistry.NETHER_RUBY,
                () -> SupernaturalCropsConfig.get().betterNetherEnabled.enableNetherRubyCrops);

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

        OreBushes(String path, Item ingot, Supplier<Boolean> enabled) {
            this(path, ingot, new Lazy<>(() -> ingot), enabled);
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

    public static final OreBushBlock CINCINNASITE_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.CINCINNASITE);
    public static final OreBushBlock NETHER_RUBY_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.NETHER_RUBY);

    public static void registerBlocks() {
        registerBush(CINCINNASITE_BUSH);
        registerBush(NETHER_RUBY_BUSH);
        registerBushResources(OreBushes.values());
    }

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(BetterNetherCropsBlocks.CINCINNASITE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BetterNetherCropsBlocks.NETHER_RUBY_BUSH, RenderLayer.getCutout());
    }

}
