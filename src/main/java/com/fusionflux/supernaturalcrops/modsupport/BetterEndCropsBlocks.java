package com.fusionflux.supernaturalcrops.modsupport;

import com.fusionflux.supernaturalcrops.OreBush;
import com.fusionflux.supernaturalcrops.block.OreBushBlock;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.Item;
import net.minecraft.util.Lazy;
import paulevs.betternether.registry.ItemsRegistry;
import ru.betterend.registry.EndBlocks;
import ru.betterend.registry.EndItems;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

import static com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks.*;
import static com.fusionflux.supernaturalcrops.resource.SupernaturalCropsResources.registerBushResources;

public class BetterEndCropsBlocks {
    public enum OreBushes implements OreBush {
        TERMINITE("terminite_bush", EndBlocks.TERMINITE.ingot, () ->
                SupernaturalCropsConfig.get().betterEndNuggetBalance.enableTerminiteCropNuggets
                        ? EndItems.ENDER_DUST
                        : EndBlocks.TERMINITE.ingot,
                () -> SupernaturalCropsConfig.get().betterEndEnabled.enableTerminiteCrops),
        AMBER("amber_bush", EndItems.AMBER_GEM, () ->
                SupernaturalCropsConfig.get().betterEndNuggetBalance.enableAmberCropNuggets
                        ? EndItems.RAW_AMBER
                        : EndItems.AMBER_GEM,
                () -> SupernaturalCropsConfig.get().betterEndEnabled.enableAmberCrops),
        CRYSTAL_SHARD("crystal_shard_bush", EndItems.CRYSTAL_SHARDS,
                () -> SupernaturalCropsConfig.get().betterEndEnabled.enableCrystalShardCrops);

        private final String path;
        private final Item ingot;
        private final Supplier<Item> harvestResult;
        private final BooleanSupplier enabled;
        private final Lazy<OreBushBlock> block;

        OreBushes(String path, Item ingot, Supplier<Item> harvestResult, BooleanSupplier enabled) {
            this.path = "betterend_" + path;
            this.ingot = ingot;
            this.harvestResult = harvestResult;
            this.enabled = enabled;
            block = new Lazy<>(() -> new OreBushBlock(bushBlockSettings(), this));
        }

        OreBushes(String path, Item ingot, BooleanSupplier enabled) {
            this(path, ingot, () -> ingot, enabled);
        }

        @Override
        public boolean isEnabled() {
            return enabled.getAsBoolean();
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
