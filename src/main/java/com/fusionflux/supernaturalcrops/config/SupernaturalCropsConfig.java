package com.fusionflux.supernaturalcrops.config;

import com.google.common.collect.ImmutableList;
import com.oroarmor.config.Config;
import com.oroarmor.config.ConfigItem;
import com.oroarmor.config.ConfigItemGroup;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.util.List;

public final class SupernaturalCropsConfig extends Config {


	public static class ENABLED extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLED_CONFIG_PRINT = new ConfigItem<>("config_debug_print", false,
				"config.supernaturalcrops.enabled.config_debug_print");

		public static final ConfigItem<Boolean> ENABLE_COAL_CROPS = new ConfigItem<>("coal_crop_enabled", true,
				"config.supernaturalcrops.enabled.coal_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_IRON_CROPS = new ConfigItem<>("iron_crop_enabled", true,
				"config.supernaturalcrops.enabled.iron_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_GOLD_CROPS = new ConfigItem<>("gold_crop_enabled", true,
				"config.supernaturalcrops.enabled.gold_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_DIAMOND_CROPS = new ConfigItem<>("diamond_crop_enabled", true,
				"config.supernaturalcrops.enabled.diamond_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_EMERALD_CROPS = new ConfigItem<>("lapis_lazuli_crop_enabled", true,
				"config.supernaturalcrops.enabled.lapis_lazuli_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_NETHERITE_CROPS = new ConfigItem<>("netherite_crop_enabled", true,
				"config.supernaturalcrops.enabled.netherite_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_REDSTONE_CROPS = new ConfigItem<>("diamond_crop_enabled", true,
				"config.supernaturalcrops.enabled.diamond_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_LAPIS_LAZULI_CROPS = new ConfigItem<>("lapis_lazuli_crop_enabled", true,
				"config.supernaturalcrops.enabled.lapis_lazuli_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_QUARTZ_CROPS = new ConfigItem<>("quartz_crop_enabled", true,
				"config.supernaturalcrops.enabled.quartz_crop_enabled");

		public static final ConfigItem<Boolean> ENABLE_SCRAPED_STONE_MAGMATED_DAMAGE = new ConfigItem<>("scraped_stone_magmated_damage_enabled", false,
				"config.supernaturalcrops.enabled.scraped_stone_magmated_damage_enabled");

		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLED_CONFIG_PRINT,ENABLE_COAL_CROPS, ENABLE_IRON_CROPS,ENABLE_GOLD_CROPS,ENABLE_DIAMOND_CROPS,ENABLE_EMERALD_CROPS,ENABLE_NETHERITE_CROPS,ENABLE_LAPIS_LAZULI_CROPS,ENABLE_REDSTONE_CROPS,ENABLE_SCRAPED_STONE_MAGMATED_DAMAGE);

		public ENABLED() {
			super(OPTIONS, "enabled");
		}
	}

	public static class NUGGET_BALANCE extends ConfigItemGroup {

		//public static final ConfigItem<Boolean> ENABLE_COAL_CROP_NUGGETS = new ConfigItem<>("coal_crop_nuggets_enabled", false,
		//		"config.supernaturalcrops.nugget_balance.coal_crop_nuggets_enabled");

		public static final ConfigItem<Boolean> ENABLE_IRON_CROP_NUGGETS = new ConfigItem<>("iron_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.iron_crop_nuggets_enabled");

		public static final ConfigItem<Boolean> ENABLE_GOLD_CROP_NUGGETS = new ConfigItem<>("gold_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.gold_crop_nuggets_enabled");

		public static final ConfigItem<Boolean> ENABLE_DIAMOND_CROP_NUGGETS = new ConfigItem<>("diamond_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.diamond_crop_nuggets_enabled");

		public static final ConfigItem<Boolean> ENABLE_EMERALD_CROP_NUGGETS = new ConfigItem<>("emerald_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.emerald_crop_nuggets_enabled");

		public static final ConfigItem<Boolean> ENABLE_NETHERITE_CROP_NUGGETS = new ConfigItem<>("netherite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.netherite_crop_nuggets_enabled");

		//public static final ConfigItem<Boolean> ENABLE_REDSTONE_CROP_NUGGETS = new ConfigItem<>("diamond_crop_nuggets_enabled", false,
		//		"config.supernaturalcrops.nugget_balance.diamond_crop_nuggets_enabled");

		//public static final ConfigItem<Boolean> ENABLE_LAPIS_LAZULI_CROP_NUGGETS = new ConfigItem<>("lapis_lazuli_crop_nuggets_enabled", false,
		//		"config.supernaturalcrops.nugget_balance.lapis_lazuli_crop_nuggets_enabled");



		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_IRON_CROP_NUGGETS,ENABLE_GOLD_CROP_NUGGETS,ENABLE_DIAMOND_CROP_NUGGETS,ENABLE_EMERALD_CROP_NUGGETS,ENABLE_NETHERITE_CROP_NUGGETS);

		public NUGGET_BALANCE() {
			super(OPTIONS, "nugget_balance");
		}
	}

	public static class MYTHICAL_METALS_ENABLED extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_Adamantite_CROPS = new ConfigItem<>("adamantite_enabled", true,
				"config.supernaturalcrops.enabled.adamantite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Aetherium_CROPS = new ConfigItem<>("aetherium_enabled", true,
				"config.supernaturalcrops.enabled.aetherium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Aquarium_CROPS = new ConfigItem<>("aquarium_enabled", true,
				"config.supernaturalcrops.enabled.aquarium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Argonium_CROPS = new ConfigItem<>("argonium_enabled", true,
				"config.supernaturalcrops.enabled.argonium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Banglum_CROPS = new ConfigItem<>("banglum_enabled", true,
				"config.supernaturalcrops.enabled.banglum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Brass_CROPS = new ConfigItem<>("brass_enabled", true,
				"config.supernaturalcrops.enabled.brass_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Bronze_CROPS = new ConfigItem<>("bronze_enabled", true,
				"config.supernaturalcrops.enabled.bronze_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Carmot_CROPS = new ConfigItem<>("carmot_enabled", true,
				"config.supernaturalcrops.enabled.carmot_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Celestium_CROPS = new ConfigItem<>("celestium_enabled", true,
				"config.supernaturalcrops.enabled.celestium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Copper_CROPS = new ConfigItem<>("copper_enabled", true,
				"config.supernaturalcrops.enabled.copper_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Discordium_CROPS = new ConfigItem<>("discordium_enabled", true,
				"config.supernaturalcrops.enabled.discordium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Durasteel_CROPS = new ConfigItem<>("durasteel_enabled", true,
				"config.supernaturalcrops.enabled.durasteel_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Electrum_CROPS = new ConfigItem<>("electrum_enabled", true,
				"config.supernaturalcrops.enabled.electrum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Etherite_CROPS = new ConfigItem<>("etherite_enabled", true,
				"config.supernaturalcrops.enabled.etherite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Hallowed_CROPS = new ConfigItem<>("hallowed_enabled", true,
				"config.supernaturalcrops.enabled.hallowed_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Kyber_CROPS = new ConfigItem<>("kyber_enabled", true,
				"config.supernaturalcrops.enabled.kyber_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Manganese_CROPS = new ConfigItem<>("manganese_enabled", true,
				"config.supernaturalcrops.enabled.manganese_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Metallurgium_CROPS = new ConfigItem<>("metallurgium_enabled", true,
				"config.supernaturalcrops.enabled.metallurgium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Midas_Gold_CROPS = new ConfigItem<>("midas_gold_enabled", true,
				"config.supernaturalcrops.enabled.midas_gold_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Mythril_CROPS = new ConfigItem<>("mythril_enabled", true,
				"config.supernaturalcrops.enabled.mythril_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Orichalcum_CROPS = new ConfigItem<>("orichalcum_enabled", true,
				"config.supernaturalcrops.enabled.orichalcum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Osmium_CROPS = new ConfigItem<>("osmium_enabled", true,
				"config.supernaturalcrops.enabled.osmium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Platinum_CROPS = new ConfigItem<>("platinum_enabled", true,
				"config.supernaturalcrops.enabled.platinum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Prometheum_CROPS = new ConfigItem<>("prometheum_enabled", true,
				"config.supernaturalcrops.enabled.prometheum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Quadrillum_CROPS = new ConfigItem<>("quadrillum_enabled", true,
				"config.supernaturalcrops.enabled.quadrillum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Quicksilver_CROPS = new ConfigItem<>("quicksilver_enabled", true,
				"config.supernaturalcrops.enabled.quicksilver_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Runite_CROPS = new ConfigItem<>("runite_enabled", true,
				"config.supernaturalcrops.enabled.runite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Silver_CROPS = new ConfigItem<>("silver_enabled", true,
				"config.supernaturalcrops.enabled.silver_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Slowsilver_CROPS = new ConfigItem<>("slowsilver_enabled", true,
				"config.supernaturalcrops.enabled.slowsilver_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Starrite_CROPS = new ConfigItem<>("starrite_enabled", true,
				"config.supernaturalcrops.enabled.starrite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Steel_CROPS = new ConfigItem<>("steel_enabled", true,
				"config.supernaturalcrops.enabled.steel_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Stormyx_CROPS = new ConfigItem<>("stormyx_enabled", true,
				"config.supernaturalcrops.enabled.stormyx_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Tantalite_CROPS = new ConfigItem<>("tantalite_enabled", true,
				"config.supernaturalcrops.enabled.tantalite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Tin_CROPS = new ConfigItem<>("tin_enabled", true,
				"config.supernaturalcrops.enabled.tin_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Truesilver_CROPS = new ConfigItem<>("truesilver_enabled", true,
				"config.supernaturalcrops.enabled.truesilver_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Unobtainium_CROPS = new ConfigItem<>("unobtainium_enabled", true,
				"config.supernaturalcrops.enabled.unobtainium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Ur_CROPS = new ConfigItem<>("ur_enabled", true,
				"config.supernaturalcrops.enabled.ur_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_Zinc_CROPS = new ConfigItem<>("zinc_enabled", true,
				"config.supernaturalcrops.enabled.zinc_crop_enabled");
		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_Adamantite_CROPS,ENABLE_Aetherium_CROPS,ENABLE_Aquarium_CROPS,ENABLE_Argonium_CROPS,ENABLE_Banglum_CROPS,ENABLE_Brass_CROPS,ENABLE_Bronze_CROPS,ENABLE_Carmot_CROPS,ENABLE_Celestium_CROPS,ENABLE_Copper_CROPS,ENABLE_Discordium_CROPS,ENABLE_Durasteel_CROPS,ENABLE_Electrum_CROPS,ENABLE_Etherite_CROPS,ENABLE_Hallowed_CROPS,ENABLE_Kyber_CROPS,ENABLE_Manganese_CROPS,ENABLE_Metallurgium_CROPS,ENABLE_Midas_Gold_CROPS,ENABLE_Mythril_CROPS,ENABLE_Orichalcum_CROPS,ENABLE_Osmium_CROPS,ENABLE_Platinum_CROPS,ENABLE_Prometheum_CROPS,ENABLE_Quadrillum_CROPS,ENABLE_Quicksilver_CROPS,ENABLE_Runite_CROPS,ENABLE_Silver_CROPS,ENABLE_Slowsilver_CROPS,ENABLE_Starrite_CROPS,ENABLE_Steel_CROPS,ENABLE_Stormyx_CROPS,ENABLE_Tantalite_CROPS,ENABLE_Tin_CROPS,ENABLE_Truesilver_CROPS,ENABLE_Unobtainium_CROPS,ENABLE_Ur_CROPS,ENABLE_Zinc_CROPS);

		public MYTHICAL_METALS_ENABLED() {
			super(OPTIONS, "mythical_metals_enabled");
		}
	}

	public static class MYTHICAL_METALS_NUGGET_BALANCE extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_Adamantite_CROP_NUGGETS = new ConfigItem<>("adamantite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.adamantite_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Aetherium_CROP_NUGGETS = new ConfigItem<>("aetherium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.aetherium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Aquarium_CROP_NUGGETS = new ConfigItem<>("aquarium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.aquarium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Argonium_CROP_NUGGETS = new ConfigItem<>("argonium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.argonium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Banglum_CROP_NUGGETS = new ConfigItem<>("banglum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.banglum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Brass_CROP_NUGGETS = new ConfigItem<>("brass_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.brass_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Bronze_CROP_NUGGETS = new ConfigItem<>("bronze_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.bronze_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Carmot_CROP_NUGGETS = new ConfigItem<>("carmot_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.carmot_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Celestium_CROP_NUGGETS = new ConfigItem<>("celestium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.celestium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Copper_CROP_NUGGETS = new ConfigItem<>("copper_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.copper_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Discordium_CROP_NUGGETS = new ConfigItem<>("discordium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.discordium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Durasteel_CROP_NUGGETS = new ConfigItem<>("durasteel_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.durasteel_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Electrum_CROP_NUGGETS = new ConfigItem<>("electrum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.electrum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Etherite_CROP_NUGGETS = new ConfigItem<>("etherite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.etherite_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Hallowed_CROP_NUGGETS = new ConfigItem<>("hallowed_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.hallowed_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Kyber_CROP_NUGGETS = new ConfigItem<>("kyber_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.kyber_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Manganese_CROP_NUGGETS = new ConfigItem<>("manganese_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.manganese_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Metallurgium_CROP_NUGGETS = new ConfigItem<>("metallurgium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.metallurgium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Midas_Gold_CROP_NUGGETS = new ConfigItem<>("midas_gold_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.midas_gold_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Mythril_CROP_NUGGETS = new ConfigItem<>("mythril_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.mythril_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Orichalcum_CROP_NUGGETS = new ConfigItem<>("orichalcum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.orichalcum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Osmium_CROP_NUGGETS = new ConfigItem<>("osmium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.osmium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Platinum_CROP_NUGGETS = new ConfigItem<>("platinum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.platinum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Prometheum_CROP_NUGGETS = new ConfigItem<>("prometheum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.prometheum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Quadrillum_CROP_NUGGETS = new ConfigItem<>("quadrillum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.quadrillum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Quicksilver_CROP_NUGGETS = new ConfigItem<>("quicksilver_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.quicksilver_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Runite_CROP_NUGGETS = new ConfigItem<>("runite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.runite_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Silver_CROP_NUGGETS = new ConfigItem<>("silver_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.silver_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Slowsilver_CROP_NUGGETS = new ConfigItem<>("slowsilver_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.slowsilver_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Starrite_CROP_NUGGETS = new ConfigItem<>("starrite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.starrite_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Steel_CROP_NUGGETS = new ConfigItem<>("steel_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.steel_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Stormyx_CROP_NUGGETS = new ConfigItem<>("stormyx_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.stormyx_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Tantalite_CROP_NUGGETS = new ConfigItem<>("tantalite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.tantalite_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Tin_CROP_NUGGETS = new ConfigItem<>("tin_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.tin_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Truesilver_CROP_NUGGETS = new ConfigItem<>("truesilver_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.truesilver_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Unobtainium_CROP_NUGGETS = new ConfigItem<>("unobtainium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.unobtainium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Ur_CROP_NUGGETS = new ConfigItem<>("ur_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.ur_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_Zinc_CROP_NUGGETS = new ConfigItem<>("zinc_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.zinc_crop_nuggets_enabled");
		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_Adamantite_CROP_NUGGETS,ENABLE_Aetherium_CROP_NUGGETS,ENABLE_Aquarium_CROP_NUGGETS,ENABLE_Argonium_CROP_NUGGETS,ENABLE_Banglum_CROP_NUGGETS,ENABLE_Brass_CROP_NUGGETS,ENABLE_Bronze_CROP_NUGGETS,ENABLE_Carmot_CROP_NUGGETS,ENABLE_Celestium_CROP_NUGGETS,ENABLE_Copper_CROP_NUGGETS,ENABLE_Discordium_CROP_NUGGETS,ENABLE_Durasteel_CROP_NUGGETS,ENABLE_Electrum_CROP_NUGGETS,ENABLE_Etherite_CROP_NUGGETS,ENABLE_Hallowed_CROP_NUGGETS,ENABLE_Kyber_CROP_NUGGETS,ENABLE_Manganese_CROP_NUGGETS,ENABLE_Metallurgium_CROP_NUGGETS,ENABLE_Midas_Gold_CROP_NUGGETS,ENABLE_Mythril_CROP_NUGGETS,ENABLE_Orichalcum_CROP_NUGGETS,ENABLE_Osmium_CROP_NUGGETS,ENABLE_Platinum_CROP_NUGGETS,ENABLE_Prometheum_CROP_NUGGETS,ENABLE_Quadrillum_CROP_NUGGETS,ENABLE_Quicksilver_CROP_NUGGETS,ENABLE_Runite_CROP_NUGGETS,ENABLE_Silver_CROP_NUGGETS,ENABLE_Slowsilver_CROP_NUGGETS,ENABLE_Starrite_CROP_NUGGETS,ENABLE_Steel_CROP_NUGGETS,ENABLE_Stormyx_CROP_NUGGETS,ENABLE_Tantalite_CROP_NUGGETS,ENABLE_Tin_CROP_NUGGETS,ENABLE_Truesilver_CROP_NUGGETS,ENABLE_Unobtainium_CROP_NUGGETS,ENABLE_Ur_CROP_NUGGETS,ENABLE_Zinc_CROP_NUGGETS);

		public MYTHICAL_METALS_NUGGET_BALANCE() {
			super(OPTIONS, "mythical_metals_nugget_balance");
		}
	}

	public static class BETTER_END_NUGGET_BALANCE extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_TERMINITE_CROP_NUGGETS = new ConfigItem<>("terminite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.better_end_nugget_balance.terminite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_AMBER_CROP_NUGGETS = new ConfigItem<>("amber_crop_nuggets_enabled", false,
				"config.supernaturalcrops.better_end_nugget_balance.amber_crop_enabled");
		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_TERMINITE_CROP_NUGGETS,ENABLE_AMBER_CROP_NUGGETS);
		public BETTER_END_NUGGET_BALANCE() {
			super(OPTIONS, "better_end_nugget_balance");
		}
	}

	public static class BETTER_END_ENABLED extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_TERMINITE_CROPS = new ConfigItem<>("terminite_enabled", true,
				"config.supernaturalcrops.enabled.terminite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_AMBER_CROPS = new ConfigItem<>("amber_enabled", true,
				"config.supernaturalcrops.enabled.amber_crop_enabled");
		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_TERMINITE_CROPS,ENABLE_AMBER_CROPS);
		public BETTER_END_ENABLED() {
			super(OPTIONS, "better_end_enabled");
		}
	}

	public static class BETTER_NETHER_NUGGET_BALANCE extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_CINCINNASITE_CROP_NUGGETS = new ConfigItem<>("cincinnasite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.better_end_nugget_balance.cincinnasite_crop_enabled");
		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_CINCINNASITE_CROP_NUGGETS);
		public BETTER_NETHER_NUGGET_BALANCE() {
			super(OPTIONS, "better_end_nugget_balance");
		}
	}

	public static class BETTER_NETHER_ENABLED extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_CINCINNASITE_CROPS = new ConfigItem<>("cincinnasite_enabled", true,
				"config.supernaturalcrops.enabled.cincinnasite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_NETHER_RUBY_CROPS = new ConfigItem<>("nether_ruby_enabled", true,
				"config.supernaturalcrops.enabled.nether_ruby_crop_enabled");
		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_CINCINNASITE_CROPS,ENABLE_NETHER_RUBY_CROPS);
		public BETTER_NETHER_ENABLED() {
			super(OPTIONS, "better_end_enabled");
		}
	}


	private static final String CONFIG_FILE_NAME = "supernaturalcrops.json";

	private static final List<ConfigItemGroup> CONFIGS = ImmutableList.of(new ENABLED(),
			new NUGGET_BALANCE(),
			new MYTHICAL_METALS_ENABLED(),
			new MYTHICAL_METALS_NUGGET_BALANCE(),
			new BETTER_END_ENABLED(),
			new BETTER_END_NUGGET_BALANCE());


	public SupernaturalCropsConfig() {
		super(CONFIGS, new File(FabricLoader.getInstance().getConfigDir().toFile(), CONFIG_FILE_NAME), "supernaturalcrops");
	}





}
