package com.fusionflux.supernaturalcrops.modsupport;

import appeng.client.AppEngClient;
import appeng.core.AppEngBase;
import appeng.decorative.solid.QuartzLampBlock;
import appeng.items.materials.MaterialType;
import com.fusionflux.supernaturalcrops.OreBush;
import com.fusionflux.supernaturalcrops.block.OreBushBlock;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import me.hydos.lint.item.LintItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.Item;
import net.minecraft.util.Lazy;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

import static com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks.*;
import static com.fusionflux.supernaturalcrops.resource.SupernaturalCropsResources.registerBushResources;

public class AE2CropsBlocks {
    public enum OreBushes implements OreBush {
        CERTUS_QUARTZ_CRYSTAL("certus_quartz_crystal_bush", MaterialType.CERTUS_QUARTZ_CRYSTAL.getItemInstance(),
                () -> SupernaturalCropsConfig.get().ae2Enabled.enableCertusQuartzCrystalCrops),
        CHARGED_CERTUS_QUARTZ_CRYSTAL("charged_certus_quartz_crystal_bush", MaterialType.CERTUS_QUARTZ_CRYSTAL_CHARGED.getItemInstance(),
                () -> SupernaturalCropsConfig.get().ae2Enabled.enableChargedCertusQuartzCrystalCrops),
        FLUIX_CRYSTAL("fluix_crystal_bush", MaterialType.FLUIX_CRYSTAL.getItemInstance(),
                () -> SupernaturalCropsConfig.get().ae2Enabled.enableFluixCrystalCrops);

        private final String path;
        private final Item ingot;
        private final Supplier<Item> harvestResult;
        private final BooleanSupplier enabled;
        private final Lazy<OreBushBlock> block;

        OreBushes(String path, Item ingot, Supplier<Item> harvestResult, BooleanSupplier enabled) {
            this.path = "ae2_" + path;
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
