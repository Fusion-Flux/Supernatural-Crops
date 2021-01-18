package com.fusionflux.supernaturalcrops.world.feature;

import com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
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

public class Features {

	public static void register() {
		ConfiguredFeature<?, ?> EMBEDDED_ABYSS_VIEN = Feature.ORE
				.configure(new OreFeatureConfig(
						new BlockMatchRuleTest(Blocks.END_STONE),
						SupernaturalCropsBlocks.EMBEDDED_ABYSS.getDefaultState(),
						10))
				.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
						0,
						0,
						255)))
				.spreadHorizontally()
				.repeat(7);
		RegistryKey<ConfiguredFeature<?, ?>> oreWoolEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("supernaturalcrops", "embedded_abyss_vien"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreWoolEnd.getValue(), EMBEDDED_ABYSS_VIEN);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreWoolEnd);
	}
}
