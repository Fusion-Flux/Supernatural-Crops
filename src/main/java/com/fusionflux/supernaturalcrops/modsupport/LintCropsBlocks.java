package com.fusionflux.supernaturalcrops.modsupport;

import com.fusionflux.supernaturalcrops.OreBush;
import com.fusionflux.supernaturalcrops.block.OreBushBlock;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import me.hydos.lint.item.LintItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

import static com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks.bushBlockSettings;
import static com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks.registerBush;
import static com.fusionflux.supernaturalcrops.resource.SupernaturalCropsResources.registerBushResources;

public class LintCropsBlocks {
    public enum OreBushes implements OreBush {
        JUREL("jurel_bush", LintItems.HARDENED_JUREL_INGOT, new Lazy<>(() ->
                SupernaturalCropsConfig.get().lintNuggetBalance.enableJurelCropNuggets
                        ?  LintItems.JUREL_POWDER
                        : LintItems.HARDENED_JUREL_INGOT),
                () -> SupernaturalCropsConfig.get().lintEnabled.enableJurelCrops),
        SICIERON("sicieron_bush", LintItems.SICIERON_INGOT,
                () -> SupernaturalCropsConfig.get().lintEnabled.enableSicieronCrops),
        TARSCAN("tarscan_bush", LintItems.TARSCAN_SHARD,
                () -> SupernaturalCropsConfig.get().lintEnabled.enableTarscanCrops);

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

    public static final OreBushBlock JUREL_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.JUREL);
    public static final OreBushBlock SICIERON_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.SICIERON);
    public static final OreBushBlock TARSCAN_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.TARSCAN);

    public static void registerBlocks() {
        registerBush(LintCropsBlocks.JUREL_BUSH);
        registerBush(LintCropsBlocks.SICIERON_BUSH);
        registerBush(LintCropsBlocks.TARSCAN_BUSH);
        registerBushResources(OreBushes.values());
    }

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(LintCropsBlocks.JUREL_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LintCropsBlocks.SICIERON_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LintCropsBlocks.TARSCAN_BUSH, RenderLayer.getCutout());
    }

}
