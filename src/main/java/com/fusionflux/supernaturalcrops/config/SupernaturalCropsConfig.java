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
				"config.supernatural_crops.enabled.config_debug_print");

		public static final ConfigItem<Boolean> ENABLE_COAL_CROPS = new ConfigItem<>("coal_crop_enabled", true,
				"config.supernatural_crops.enabled.coal_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_IRON_CROPS = new ConfigItem<>("iron_crop_enabled", true,
				"config.supernatural_crops.enabled.iron_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_GOLD_CROPS = new ConfigItem<>("gold_crop_enabled", true,
				"config.supernatural_crops.enabled.gold_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_DIAMOND_CROPS = new ConfigItem<>("diamond_crop_enabled", true,
				"config.supernatural_crops.enabled.diamond_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_EMERALD_CROPS = new ConfigItem<>("lapis_lazuli_crop_enabled", true,
				"config.supernatural_crops.enabled.lapis_lazuli_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_NETHERITE_CROPS = new ConfigItem<>("netherite_crop_enabled", true,
				"config.supernatural_crops.enabled.netherite_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_REDSTONE_CROPS = new ConfigItem<>("diamond_crop_enabled", true,
				"config.supernatural_crops.enabled.diamond_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_LAPIS_LAZULI_CROPS = new ConfigItem<>("lapis_lazuli_crop_enabled", true,
				"config.supernatural_crops.enabled.lapis_lazuli_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_SCRAPED_STONE_MAGMATED_DAMAGE = new ConfigItem<>("scraped_stone_magmated_damage_enabled", false,
				"config.supernatural_crops.enabled.scraped_stone_magmated_damage_enabled");

		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLED_CONFIG_PRINT,ENABLE_COAL_CROPS, ENABLE_IRON_CROPS,ENABLE_GOLD_CROPS,ENABLE_DIAMOND_CROPS,ENABLE_EMERALD_CROPS,ENABLE_NETHERITE_CROPS,ENABLE_LAPIS_LAZULI_CROPS,ENABLE_REDSTONE_CROPS,ENABLE_SCRAPED_STONE_MAGMATED_DAMAGE);

		public ENABLED() {
			super(OPTIONS, "enabled");
		}
	}

	public static class NUGGET_BALANCE extends ConfigItemGroup {

		//public static final ConfigItem<Boolean> ENABLE_COAL_CROP_NUGGETS = new ConfigItem<>("coal_crop_nuggets_enabled", false,
		//		"config.supernatural_crops.enabled.coal_crop_nuggets_enabled");

		public static final ConfigItem<Boolean> ENABLE_IRON_CROP_NUGGETS = new ConfigItem<>("iron_crop_nuggets_enabled", false,
				"config.supernatural_crops.enabled.iron_crop_nuggets_enabled");

		public static final ConfigItem<Boolean> ENABLE_GOLD_CROP_NUGGETS = new ConfigItem<>("gold_crop_nuggets_enabled", false,
				"config.supernatural_crops.enabled.gold_crop_nuggets_enabled");

		public static final ConfigItem<Boolean> ENABLE_DIAMOND_CROP_NUGGETS = new ConfigItem<>("diamond_crop_nuggets_enabled", false,
				"config.supernatural_crops.enabled.diamond_crop_nuggets_enabled");

		public static final ConfigItem<Boolean> ENABLE_EMERALD_CROP_NUGGETS = new ConfigItem<>("lapis_lazuli_crop_nuggets_enabled", false,
				"config.supernatural_crops.enabled.lapis_lazuli_crop_nuggets_enabled");

		public static final ConfigItem<Boolean> ENABLE_NETHERITE_CROP_NUGGETS = new ConfigItem<>("netherite_crop_nuggets_enabled", false,
				"config.supernatural_crops.enabled.netherite_crop_nuggets_enabled");

		//public static final ConfigItem<Boolean> ENABLE_REDSTONE_CROP_NUGGETS = new ConfigItem<>("diamond_crop_nuggets_enabled", false,
		//		"config.supernatural_crops.enabled.diamond_crop_nuggets_enabled");

		//public static final ConfigItem<Boolean> ENABLE_LAPIS_LAZULI_CROP_NUGGETS = new ConfigItem<>("lapis_lazuli_crop_nuggets_enabled", false,
		//		"config.supernatural_crops.enabled.lapis_lazuli_crop_nuggets_enabled");



		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_IRON_CROP_NUGGETS,ENABLE_GOLD_CROP_NUGGETS,ENABLE_DIAMOND_CROP_NUGGETS,ENABLE_EMERALD_CROP_NUGGETS,ENABLE_NETHERITE_CROP_NUGGETS);

		public NUGGET_BALANCE() {
			super(OPTIONS, "nugget_balance");
		}
	}

	private static final String CONFIG_FILE_NAME = "supernaturalcrops.json";

	private static final List<ConfigItemGroup> CONFIGS = ImmutableList.of(new ENABLED(),new NUGGET_BALANCE());


	public SupernaturalCropsConfig() {
		super(CONFIGS, new File(FabricLoader.getInstance().getConfigDir().toFile(), CONFIG_FILE_NAME));
	}





}
