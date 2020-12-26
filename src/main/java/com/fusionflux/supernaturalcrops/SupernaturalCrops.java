package com.fusionflux.supernaturalcrops;

import com.fusionflux.supernaturalcrops.blocks.SupernaturalCropsBlocks;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import com.oroarmor.util.config.ConfigItemGroup;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
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

	public static final Logger LOGGER = LogManager.getLogger("Supernatural Crops");

	private static ConfiguredFeature<?, ?> EMBEDDED_ABYSS_VIEN = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
					SupernaturalCropsBlocks.EMBEDDED_ABYSS.getDefaultState(),
					10))
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
					0,
					0,
					255)))
			.spreadHorizontally()
			.repeat(7);

	@Override
	public void onInitialize() {
		SupernaturalCropsBlocks.registerBlocks();
		RegistryKey<ConfiguredFeature<?, ?>> oreWoolEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("supernaturalcrops", "embedded_abyss_vien"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreWoolEnd.getValue(), EMBEDDED_ABYSS_VIEN);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreWoolEnd);
	}

	private void processConfig() {
		CONFIG.readConfigFromFile();

		if (SupernaturalCropsConfig.ENABLED.ENABLED_CONFIG_PRINT.getValue()) {
			CONFIG.getConfigs().stream().map(ConfigItemGroup::getConfigs)
					.forEach(l -> l.forEach(ci -> LOGGER.log(Level.INFO, ci.toString())));
		}

		ServerLifecycleEvents.SERVER_STOPPED.register(l -> CONFIG.saveConfigToFile());
	}

}
