package com.fusionflux.supernaturalcrops;

import com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import com.fusionflux.supernaturalcrops.item.SupernaturalCropsItems;
import com.fusionflux.supernaturalcrops.modsupport.BetterEndCropsBlocks;
import com.fusionflux.supernaturalcrops.modsupport.BetterNetherCropsBlocks;
import com.fusionflux.supernaturalcrops.modsupport.MythicMetalsCropsBlocks;
import com.fusionflux.supernaturalcrops.modsupport.TechRebornCropsBlocks;
import com.fusionflux.supernaturalcrops.world.feature.Features;
import com.oroarmor.config.ConfigItemGroup;
import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SupernaturalCrops implements ModInitializer {
	public static final String MOD_ID = "supernaturalcrops";

	public static final SupernaturalCropsConfig CONFIG = new SupernaturalCropsConfig();

	public static final RuntimeResourcePack RESOURCE_PACK = RuntimeResourcePack.create(MOD_ID + ":runtime");

	public static final Logger LOGGER = LogManager.getLogger("Supernatural Crops");

	@Override
	public void onInitialize() {
		RRPCallback.EVENT.register(a -> a.add(RESOURCE_PACK));
		readConfig();
		SupernaturalCropsItems.register();
		SupernaturalCropsBlocks.register();
		Features.register();

		if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
			MythicMetalsCropsBlocks.registerBlocks();
		}
		if (FabricLoader.getInstance().isModLoaded("betterend")) {
			BetterEndCropsBlocks.registerBlocks();
		}
		if (FabricLoader.getInstance().isModLoaded("betternether")) {
			BetterNetherCropsBlocks.registerBlocks();
		}
		if (FabricLoader.getInstance().isModLoaded("techreborn")) {
			TechRebornCropsBlocks.registerBlocks();
		}
	}

	private void readConfig() {
		CONFIG.readConfigFromFile();

		if (SupernaturalCropsConfig.ENABLED.ENABLED_CONFIG_PRINT.getValue()) {
			CONFIG.getConfigs().stream().map(ConfigItemGroup::getConfigs)
					.forEach(l -> l.forEach(ci -> LOGGER.log(Level.INFO, ci.toString())));
		}

		ServerLifecycleEvents.SERVER_STOPPED.register(l -> CONFIG.saveConfigToFile());
	}
}
