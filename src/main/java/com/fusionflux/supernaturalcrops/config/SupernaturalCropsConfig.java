package com.fusionflux.supernaturalcrops.config;

import com.google.common.collect.ImmutableList;
import com.oroarmor.util.config.Config;
import com.oroarmor.util.config.ConfigItem;
import com.oroarmor.util.config.ConfigItemGroup;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.util.List;

public final class SupernaturalCropsConfig extends Config {


	public static class ENABLED extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLED_CONFIG_PRINT = new ConfigItem<>("config_debug_print", false,
				"config.amelias_fishing_overhaul.enabled.config_debug_print");

		public static final ConfigItem<Boolean> ENABLE_COAL_CROPS = new ConfigItem<>("coal_crop_enabled", true,
				"config.amelias_fishing_overhaul.enabled.coal_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_IRON_CROPS = new ConfigItem<>("iron_crop_enabled", true,
				"config.amelias_fishing_overhaul.enabled.iron_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_GOLD_CROPS = new ConfigItem<>("gold_crop_enabled", true,
				"config.amelias_fishing_overhaul.enabled.gold_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_DIAMOND_CROPS = new ConfigItem<>("diamond_crop_enabled", true,
				"config.amelias_fishing_overhaul.enabled.diamond_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_EMERALD_CROPS = new ConfigItem<>("lapis_lazuli_crop_enabled", true,
				"config.amelias_fishing_overhaul.enabled.lapis_lazuli_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_NETHERITE_CROPS = new ConfigItem<>("netherite_crop_enabled", true,
				"config.amelias_fishing_overhaul.enabled.netherite_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_REDSTONE_CROPS = new ConfigItem<>("diamond_crop_enabled", true,
				"config.amelias_fishing_overhaul.enabled.diamond_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_LAPIS_LAZULI_CROPS = new ConfigItem<>("lapis_lazuli_crop_enabled", true,
				"config.amelias_fishing_overhaul.enabled.lapis_lazuli_crop_enabled");



		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLED_CONFIG_PRINT,ENABLE_COAL_CROPS, ENABLE_IRON_CROPS,ENABLE_GOLD_CROPS,ENABLE_DIAMOND_CROPS,ENABLE_EMERALD_CROPS,ENABLE_NETHERITE_CROPS,ENABLE_LAPIS_LAZULI_CROPS,ENABLE_REDSTONE_CROPS);

		public ENABLED() {
			super(OPTIONS, "enabled");
		}
	}



	private static final String CONFIG_FILE_NAME = "amelias_fishing_overhaul.json";

	private static final List<ConfigItemGroup> CONFIGS = ImmutableList.of(new ENABLED());


	public SupernaturalCropsConfig() {
		super(CONFIGS, new File(FabricLoader.getInstance().getConfigDir().toFile(), CONFIG_FILE_NAME));
	}





}
