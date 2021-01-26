package com.fusionflux.supernaturalcrops.config;

import com.google.common.collect.ImmutableList;
import com.oroarmor.config.Config;
import com.oroarmor.config.ConfigItem;
import com.oroarmor.config.ConfigItemGroup;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.util.List;

public final class SupernaturalCropsConfig extends Config {
	public static class Enabled extends ConfigItemGroup {
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
		public Enabled() {
			super(OPTIONS, "enabled");
		}
	}

	public static class NuggetBalance extends ConfigItemGroup {
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

		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_IRON_CROP_NUGGETS,ENABLE_GOLD_CROP_NUGGETS,ENABLE_DIAMOND_CROP_NUGGETS,ENABLE_EMERALD_CROP_NUGGETS,ENABLE_NETHERITE_CROP_NUGGETS);
		public NuggetBalance() {
			super(OPTIONS, "nugget_balance");
		}
	}

	public static class MythicalMetalsEnabled extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_ADAMANTITE_CROPS = new ConfigItem<>("adamantite_enabled", true,
				"config.supernaturalcrops.enabled.adamantite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_AETHERIUM_CROPS = new ConfigItem<>("aetherium_enabled", true,
				"config.supernaturalcrops.enabled.aetherium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_AQUARIUM_CROPS = new ConfigItem<>("aquarium_enabled", true,
				"config.supernaturalcrops.enabled.aquarium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_ARGONIUM_CROPS = new ConfigItem<>("argonium_enabled", true,
				"config.supernaturalcrops.enabled.argonium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_BANGLUM_CROPS = new ConfigItem<>("banglum_enabled", true,
				"config.supernaturalcrops.enabled.banglum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_BRASS_CROPS = new ConfigItem<>("brass_enabled", true,
				"config.supernaturalcrops.enabled.brass_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_BRONZE_CROPS = new ConfigItem<>("bronze_enabled", true,
				"config.supernaturalcrops.enabled.bronze_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_CARMOT_CROPS = new ConfigItem<>("carmot_enabled", true,
				"config.supernaturalcrops.enabled.carmot_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_CELESTIUM_CROPS = new ConfigItem<>("celestium_enabled", true,
				"config.supernaturalcrops.enabled.celestium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_COPPER_CROPS = new ConfigItem<>("copper_enabled", true,
				"config.supernaturalcrops.enabled.copper_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_DISCORDIUM_CROPS = new ConfigItem<>("discordium_enabled", true,
				"config.supernaturalcrops.enabled.discordium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_DURASTEEL_CROPS = new ConfigItem<>("durasteel_enabled", true,
				"config.supernaturalcrops.enabled.durasteel_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_ELECTRUM_CROPS = new ConfigItem<>("electrum_enabled", true,
				"config.supernaturalcrops.enabled.electrum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_ETHERITE_CROPS = new ConfigItem<>("etherite_enabled", true,
				"config.supernaturalcrops.enabled.etherite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_HALLOWED_CROPS = new ConfigItem<>("hallowed_enabled", true,
				"config.supernaturalcrops.enabled.hallowed_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_KYBER_CROPS = new ConfigItem<>("kyber_enabled", true,
				"config.supernaturalcrops.enabled.kyber_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_MANGANESE_CROPS = new ConfigItem<>("manganese_enabled", true,
				"config.supernaturalcrops.enabled.manganese_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_METALLURGIUM_CROPS = new ConfigItem<>("metallurgium_enabled", true,
				"config.supernaturalcrops.enabled.metallurgium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_MIDAS_GOLD_CROPS = new ConfigItem<>("midas_gold_enabled", true,
				"config.supernaturalcrops.enabled.midas_gold_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_MYTHRIL_CROPS = new ConfigItem<>("mythril_enabled", true,
				"config.supernaturalcrops.enabled.mythril_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_ORICHALCUM_CROPS = new ConfigItem<>("orichalcum_enabled", true,
				"config.supernaturalcrops.enabled.orichalcum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_OSMIUM_CROPS = new ConfigItem<>("osmium_enabled", true,
				"config.supernaturalcrops.enabled.osmium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_PLATINUM_CROPS = new ConfigItem<>("platinum_enabled", true,
				"config.supernaturalcrops.enabled.platinum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_PROMETHEUM_CROPS = new ConfigItem<>("prometheum_enabled", true,
				"config.supernaturalcrops.enabled.prometheum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_QUADRILLUM_CROPS = new ConfigItem<>("quadrillum_enabled", true,
				"config.supernaturalcrops.enabled.quadrillum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_QUICKSILVER_CROPS = new ConfigItem<>("quicksilver_enabled", true,
				"config.supernaturalcrops.enabled.quicksilver_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_RUNITE_CROPS = new ConfigItem<>("runite_enabled", true,
				"config.supernaturalcrops.enabled.runite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_SILVER_CROPS = new ConfigItem<>("silver_enabled", true,
				"config.supernaturalcrops.enabled.silver_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_SLOWSILVER_CROPS = new ConfigItem<>("slowsilver_enabled", true,
				"config.supernaturalcrops.enabled.slowsilver_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_STARRITE_CROPS = new ConfigItem<>("starrite_enabled", true,
				"config.supernaturalcrops.enabled.starrite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_STEEL_CROPS = new ConfigItem<>("steel_enabled", true,
				"config.supernaturalcrops.enabled.steel_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_STORMYX_CROPS = new ConfigItem<>("stormyx_enabled", true,
				"config.supernaturalcrops.enabled.stormyx_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_TANTALITE_CROPS = new ConfigItem<>("tantalite_enabled", true,
				"config.supernaturalcrops.enabled.tantalite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_TIN_CROPS = new ConfigItem<>("tin_enabled", true,
				"config.supernaturalcrops.enabled.tin_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_TRUESILVER_CROPS = new ConfigItem<>("truesilver_enabled", true,
				"config.supernaturalcrops.enabled.truesilver_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_UNOBTAINIUM_CROPS = new ConfigItem<>("unobtainium_enabled", true,
				"config.supernaturalcrops.enabled.unobtainium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_UR_CROPS = new ConfigItem<>("ur_enabled", true,
				"config.supernaturalcrops.enabled.ur_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_ZINC_CROPS = new ConfigItem<>("zinc_enabled", true,
				"config.supernaturalcrops.enabled.zinc_crop_enabled");

		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_ADAMANTITE_CROPS,
				ENABLE_AETHERIUM_CROPS, ENABLE_AQUARIUM_CROPS, ENABLE_ARGONIUM_CROPS, ENABLE_BANGLUM_CROPS,
				ENABLE_BRASS_CROPS, ENABLE_BRONZE_CROPS, ENABLE_CARMOT_CROPS, ENABLE_CELESTIUM_CROPS,
				ENABLE_COPPER_CROPS, ENABLE_DISCORDIUM_CROPS, ENABLE_DURASTEEL_CROPS, ENABLE_ELECTRUM_CROPS,
				ENABLE_ETHERITE_CROPS, ENABLE_HALLOWED_CROPS, ENABLE_KYBER_CROPS, ENABLE_MANGANESE_CROPS,
				ENABLE_METALLURGIUM_CROPS, ENABLE_MIDAS_GOLD_CROPS, ENABLE_MYTHRIL_CROPS, ENABLE_ORICHALCUM_CROPS,
				ENABLE_OSMIUM_CROPS, ENABLE_PLATINUM_CROPS, ENABLE_PROMETHEUM_CROPS, ENABLE_QUADRILLUM_CROPS,
				ENABLE_QUICKSILVER_CROPS, ENABLE_RUNITE_CROPS, ENABLE_SILVER_CROPS, ENABLE_SLOWSILVER_CROPS,
				ENABLE_STARRITE_CROPS, ENABLE_STEEL_CROPS, ENABLE_STORMYX_CROPS, ENABLE_TANTALITE_CROPS,
				ENABLE_TIN_CROPS, ENABLE_TRUESILVER_CROPS, ENABLE_UNOBTAINIUM_CROPS, ENABLE_UR_CROPS, ENABLE_ZINC_CROPS);
		public MythicalMetalsEnabled() {
			super(OPTIONS, "mythical_metals_enabled");
		}
	}

	public static class MythicalMetalsNuggetBalance extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_ADAMANTITE_CROP_NUGGETS = new ConfigItem<>("adamantite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.adamantite_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_AETHERIUM_CROP_NUGGETS = new ConfigItem<>("aetherium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.aetherium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_AQUARIUM_CROP_NUGGETS = new ConfigItem<>("aquarium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.aquarium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_ARGONIUM_CROP_NUGGETS = new ConfigItem<>("argonium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.argonium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_BANGLUM_CROP_NUGGETS = new ConfigItem<>("banglum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.banglum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_BRASS_CROP_NUGGETS = new ConfigItem<>("brass_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.brass_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_BRONZE_CROP_NUGGETS = new ConfigItem<>("bronze_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.bronze_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_CARMOT_CROP_NUGGETS = new ConfigItem<>("carmot_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.carmot_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_CELESTIUM_CROP_NUGGETS = new ConfigItem<>("celestium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.celestium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_COPPER_CROP_NUGGETS = new ConfigItem<>("copper_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.copper_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_DISCORDIUM_CROP_NUGGETS = new ConfigItem<>("discordium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.discordium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_DURASTEEL_CROP_NUGGETS = new ConfigItem<>("durasteel_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.durasteel_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_ELECTRUM_CROP_NUGGETS = new ConfigItem<>("electrum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.electrum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_ETHERITE_CROP_NUGGETS = new ConfigItem<>("etherite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.etherite_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_HALLOWED_CROP_NUGGETS = new ConfigItem<>("hallowed_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.hallowed_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_KYBER_CROP_NUGGETS = new ConfigItem<>("kyber_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.kyber_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_MANGANESE_CROP_NUGGETS = new ConfigItem<>("manganese_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.manganese_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_METALLURGIUM_CROP_NUGGETS = new ConfigItem<>("metallurgium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.metallurgium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_MIDAS_GOLD_CROP_NUGGETS = new ConfigItem<>("midas_gold_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.midas_gold_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_MYTHRIL_CROP_NUGGETS = new ConfigItem<>("mythril_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.mythril_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_ORICHALCUM_CROP_NUGGETS = new ConfigItem<>("orichalcum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.orichalcum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_OSMIUM_CROP_NUGGETS = new ConfigItem<>("osmium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.osmium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_PLATINUM_CROP_NUGGETS = new ConfigItem<>("platinum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.platinum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_PROMETHEUM_CROP_NUGGETS = new ConfigItem<>("prometheum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.prometheum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_QUADRILLUM_CROP_NUGGETS = new ConfigItem<>("quadrillum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.quadrillum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_QUICKSILVER_CROP_NUGGETS = new ConfigItem<>("quicksilver_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.quicksilver_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_RUNITE_CROP_NUGGETS = new ConfigItem<>("runite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.runite_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_SILVER_CROP_NUGGETS = new ConfigItem<>("silver_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.silver_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_SLOWSILVER_CROP_NUGGETS = new ConfigItem<>("slowsilver_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.slowsilver_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_STARRITE_CROP_NUGGETS = new ConfigItem<>("starrite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.starrite_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_STEEL_CROP_NUGGETS = new ConfigItem<>("steel_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.steel_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_STORMYX_CROP_NUGGETS = new ConfigItem<>("stormyx_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.stormyx_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_TANTALITE_CROP_NUGGETS = new ConfigItem<>("tantalite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.tantalite_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_TIN_CROP_NUGGETS = new ConfigItem<>("tin_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.tin_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_TRUESILVER_CROP_NUGGETS = new ConfigItem<>("truesilver_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.truesilver_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_UNOBTAINIUM_CROP_NUGGETS = new ConfigItem<>("unobtainium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.unobtainium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_UR_CROP_NUGGETS = new ConfigItem<>("ur_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.ur_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_ZINC_CROP_NUGGETS = new ConfigItem<>("zinc_crop_nuggets_enabled", false,
				"config.supernaturalcrops.mythical_metals_nugget_balance.zinc_crop_nuggets_enabled");

		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_ADAMANTITE_CROP_NUGGETS,
				ENABLE_AETHERIUM_CROP_NUGGETS, ENABLE_AQUARIUM_CROP_NUGGETS, ENABLE_ARGONIUM_CROP_NUGGETS,
				ENABLE_BANGLUM_CROP_NUGGETS, ENABLE_BRASS_CROP_NUGGETS, ENABLE_BRONZE_CROP_NUGGETS,
				ENABLE_CARMOT_CROP_NUGGETS, ENABLE_CELESTIUM_CROP_NUGGETS, ENABLE_COPPER_CROP_NUGGETS,
				ENABLE_DISCORDIUM_CROP_NUGGETS, ENABLE_DURASTEEL_CROP_NUGGETS, ENABLE_ELECTRUM_CROP_NUGGETS,
				ENABLE_ETHERITE_CROP_NUGGETS, ENABLE_HALLOWED_CROP_NUGGETS, ENABLE_KYBER_CROP_NUGGETS,
				ENABLE_MANGANESE_CROP_NUGGETS, ENABLE_METALLURGIUM_CROP_NUGGETS, ENABLE_MIDAS_GOLD_CROP_NUGGETS,
				ENABLE_MYTHRIL_CROP_NUGGETS, ENABLE_ORICHALCUM_CROP_NUGGETS, ENABLE_OSMIUM_CROP_NUGGETS,
				ENABLE_PLATINUM_CROP_NUGGETS, ENABLE_PROMETHEUM_CROP_NUGGETS, ENABLE_QUADRILLUM_CROP_NUGGETS,
				ENABLE_QUICKSILVER_CROP_NUGGETS, ENABLE_RUNITE_CROP_NUGGETS, ENABLE_SILVER_CROP_NUGGETS,
				ENABLE_SLOWSILVER_CROP_NUGGETS, ENABLE_STARRITE_CROP_NUGGETS, ENABLE_STEEL_CROP_NUGGETS,
				ENABLE_STORMYX_CROP_NUGGETS, ENABLE_TANTALITE_CROP_NUGGETS, ENABLE_TIN_CROP_NUGGETS,
				ENABLE_TRUESILVER_CROP_NUGGETS, ENABLE_UNOBTAINIUM_CROP_NUGGETS, ENABLE_UR_CROP_NUGGETS,
				ENABLE_ZINC_CROP_NUGGETS);
		public MythicalMetalsNuggetBalance() {
			super(OPTIONS, "mythical_metals_nugget_balance");
		}
	}

	public static class BetterEndNuggetBalance extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_TERMINITE_CROP_NUGGETS = new ConfigItem<>("terminite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.better_end_nugget_balance.terminite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_AMBER_CROP_NUGGETS = new ConfigItem<>("amber_crop_nuggets_enabled", false,
				"config.supernaturalcrops.better_end_nugget_balance.amber_crop_enabled");

		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_TERMINITE_CROP_NUGGETS,ENABLE_AMBER_CROP_NUGGETS);
		public BetterEndNuggetBalance() {
			super(OPTIONS, "better_end_nugget_balance");
		}
	}

	public static class BetterEndEnabled extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_TERMINITE_CROPS = new ConfigItem<>("terminite_enabled", true,
				"config.supernaturalcrops.enabled.terminite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_AMBER_CROPS = new ConfigItem<>("amber_enabled", true,
				"config.supernaturalcrops.enabled.amber_crop_enabled");

		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_TERMINITE_CROPS,ENABLE_AMBER_CROPS);
		public BetterEndEnabled() {
			super(OPTIONS, "better_end_enabled");
		}
	}

	public static class BetterNetherNuggetBalance extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_CINCINNASITE_CROP_NUGGETS = new ConfigItem<>("cincinnasite_crop_nuggets_enabled", false,
				"config.supernaturalcrops.better_end_nugget_balance.cincinnasite_crop_enabled");

		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_CINCINNASITE_CROP_NUGGETS);
		public BetterNetherNuggetBalance() {
			super(OPTIONS, "better_end_nugget_balance");
		}
	}

	public static class BetterNetherEnabled extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_CINCINNASITE_CROPS = new ConfigItem<>("cincinnasite_enabled", true,
				"config.supernaturalcrops.enabled.cincinnasite_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_NETHER_RUBY_CROPS = new ConfigItem<>("nether_ruby_enabled", true,
				"config.supernaturalcrops.enabled.nether_ruby_crop_enabled");

		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_CINCINNASITE_CROPS,ENABLE_NETHER_RUBY_CROPS);
		public BetterNetherEnabled() {
			super(OPTIONS, "better_end_enabled");
		}
	}

	public static class TechRebornNuggetBalance extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_COPPER_CROP_NUGGETS = new ConfigItem<>("trcopper_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trcopper_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_ALUMINUM_CROP_NUGGETS = new ConfigItem<>("traluminum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.traluminum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_BRASS_CROP_NUGGETS = new ConfigItem<>("trbrass_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trbrass_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_BRONZE_CROP_NUGGETS = new ConfigItem<>("trbronze_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trbronze_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_ELECTRUM_CROP_NUGGETS = new ConfigItem<>("trelectrum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trelectrum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_INVAR_CROP_NUGGETS = new ConfigItem<>("trinvar_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trinvar_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_IRIDIUM_CROP_NUGGETS = new ConfigItem<>("triridium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.triridium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_LEAD_CROP_NUGGETS = new ConfigItem<>("trlead_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trlead_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_NICKEL_CROP_NUGGETS = new ConfigItem<>("trnickel_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trnickel_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_PLATINUM_CROP_NUGGETS = new ConfigItem<>("trplatinum_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trplatinum_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_SILVER_CROP_NUGGETS = new ConfigItem<>("trsilver_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trsilver_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_STEEL_CROP_NUGGETS = new ConfigItem<>("trsteel_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trsteel_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_TIN_CROP_NUGGETS = new ConfigItem<>("trtin_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trtin_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_TITANIUM_CROP_NUGGETS = new ConfigItem<>("trtitanium_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trtitanium_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_TUNGSTEN_CROP_NUGGETS = new ConfigItem<>("trtungsten_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trtungsten_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_ZINC_CROP_NUGGETS = new ConfigItem<>("trzinc_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trzinc_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_REFINED_IRON_CROP_NUGGETS = new ConfigItem<>("trrefined_iron_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trrefined_iron_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_CHROME_CROP_NUGGETS = new ConfigItem<>("trchrome_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trchrome_crop_nuggets_enabled");
		public static final ConfigItem<Boolean> ENABLE_TUNGSTENSTEEL_CROP_NUGGETS = new ConfigItem<>("trtungstensteel_crop_nuggets_enabled", false,
				"config.supernaturalcrops.nugget_balance.trtungstensteel_crop_nuggets_enabled");

		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_COPPER_CROP_NUGGETS,ENABLE_ALUMINUM_CROP_NUGGETS,ENABLE_BRASS_CROP_NUGGETS,ENABLE_BRONZE_CROP_NUGGETS,ENABLE_ELECTRUM_CROP_NUGGETS,ENABLE_INVAR_CROP_NUGGETS,ENABLE_IRIDIUM_CROP_NUGGETS,ENABLE_LEAD_CROP_NUGGETS,ENABLE_NICKEL_CROP_NUGGETS,ENABLE_PLATINUM_CROP_NUGGETS,ENABLE_SILVER_CROP_NUGGETS,ENABLE_STEEL_CROP_NUGGETS,ENABLE_TIN_CROP_NUGGETS,ENABLE_TITANIUM_CROP_NUGGETS,ENABLE_TUNGSTEN_CROP_NUGGETS,ENABLE_ZINC_CROP_NUGGETS,ENABLE_REFINED_IRON_CROP_NUGGETS,ENABLE_CHROME_CROP_NUGGETS,ENABLE_TUNGSTENSTEEL_CROP_NUGGETS);
		public TechRebornNuggetBalance() {
			super(OPTIONS, "techreborn_nugget_balance");
		}
	}

	public static class TechRebornEnabled extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_COPPER_CROPS = new ConfigItem<>("trcopper_enabled", true,
				"config.supernaturalcrops.enabled.trcopper_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_ALUMINUM_CROPS = new ConfigItem<>("traluminum_enabled", true,
				"config.supernaturalcrops.enabled.traluminum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_BRASS_CROPS = new ConfigItem<>("trbrass_enabled", true,
				"config.supernaturalcrops.enabled.trbrass_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_BRONZE_CROPS = new ConfigItem<>("trbronze_enabled", true,
				"config.supernaturalcrops.enabled.trbronze_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_ELECTRUM_CROPS = new ConfigItem<>("trelectrum_enabled", false,
				"config.supernaturalcrops.enabled.trelectrum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_INVAR_CROPS = new ConfigItem<>("trinvar_enabled", false,
				"config.supernaturalcrops.enabled.trinvar_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_IRIDIUM_CROPS = new ConfigItem<>("triridium_enabled", true,
				"config.supernaturalcrops.enabled.triridium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_LEAD_CROPS = new ConfigItem<>("trlead_enabled", true,
				"config.supernaturalcrops.enabled.trlead_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_NICKEL_CROPS = new ConfigItem<>("trnickel_enabled", false,
				"config.supernaturalcrops.enabled.trnickel_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_PLATINUM_CROPS = new ConfigItem<>("trplatinum_enabled", false,
				"config.supernaturalcrops.enabled.trplatinum_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_SILVER_CROPS = new ConfigItem<>("trsilver_enabled", true,
				"config.supernaturalcrops.enabled.trsilver_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_STEEL_CROPS = new ConfigItem<>("trsteel_enabled", false,
				"config.supernaturalcrops.enabled.trsteel_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_TIN_CROPS = new ConfigItem<>("trtin_enabled", true,
				"config.supernaturalcrops.enabled.trtin_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_TITANIUM_CROPS = new ConfigItem<>("trtitanium_enabled", false,
				"config.supernaturalcrops.enabled.trtitanium_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_TUNGSTEN_CROPS = new ConfigItem<>("trtungsten_enabled", true,
				"config.supernaturalcrops.enabled.trtungsten_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_ZINC_CROPS = new ConfigItem<>("trzinc_enabled", false,
				"config.supernaturalcrops.enabled.trzinc_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_REFINED_IRON_CROPS = new ConfigItem<>("trrefined_iron_enabled", false,
				"config.supernaturalcrops.enabled.trrefined_iron_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_CHROME_CROPS = new ConfigItem<>("trchrome_enabled", false,
				"config.supernaturalcrops.enabled.trchrome_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_TUNGSTENSTEEL_CROPS = new ConfigItem<>("trtungstensteel_enabled", false,
				"config.supernaturalcrops.enabled.trtungstensteel_crop_enabled");

		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_COPPER_CROPS,ENABLE_ALUMINUM_CROPS,ENABLE_BRASS_CROPS,ENABLE_BRONZE_CROPS,ENABLE_ELECTRUM_CROPS,ENABLE_INVAR_CROPS,ENABLE_IRIDIUM_CROPS,ENABLE_LEAD_CROPS,ENABLE_NICKEL_CROPS,ENABLE_PLATINUM_CROPS,ENABLE_SILVER_CROPS,ENABLE_STEEL_CROPS,ENABLE_TIN_CROPS,ENABLE_TITANIUM_CROPS,ENABLE_TUNGSTEN_CROPS,ENABLE_ZINC_CROPS,ENABLE_REFINED_IRON_CROPS,ENABLE_CHROME_CROPS,ENABLE_TUNGSTENSTEEL_CROPS);
		public TechRebornEnabled() {
			super(OPTIONS, "techreborn_enabled");
		}
	}

	public static class LintNuggetBalance extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_JUREL_CROP_NUGGETS = new ConfigItem<>("trcopper_crop_nuggets_enabled", false,
				"config.supernaturalcrops.lint_nugget_balance.jurel_crop_enabled");
		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_JUREL_CROP_NUGGETS);

		public LintNuggetBalance() {
			super(OPTIONS, "lint_nugget_balance");
		}
	}

	public static class LintEnabled extends ConfigItemGroup {
		public static final ConfigItem<Boolean> ENABLE_JUREL_CROPS = new ConfigItem<>("trcopper_enabled", true,
				"config.supernaturalcrops.enabled.jurel_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_SICIERON_CROPS = new ConfigItem<>("sicieron_enabled", true,
				"config.supernaturalcrops.enabled.sicieron_crop_enabled");
		public static final ConfigItem<Boolean> ENABLE_TARSCAN_CROPS = new ConfigItem<>("tarscan_enabled", true,
				"config.supernaturalcrops.enabled.tarscan_crop_enabled");

		public static final List<ConfigItem<?>> OPTIONS = ImmutableList.of(ENABLE_JUREL_CROPS,ENABLE_SICIERON_CROPS,ENABLE_TARSCAN_CROPS);
		public LintEnabled() {
			super(OPTIONS, "lint_enabled");
		}
	}

	private static final String CONFIG_FILE_NAME = "supernaturalcrops.json";

	private static final List<ConfigItemGroup> CONFIGS = ImmutableList.of(
			new Enabled(),
			new NuggetBalance(),
			new MythicalMetalsEnabled(),
			new MythicalMetalsNuggetBalance(),
			new BetterEndEnabled(),
			new BetterEndNuggetBalance(),
			new BetterNetherEnabled(),
			new BetterNetherNuggetBalance(),
			new TechRebornEnabled(),
			new TechRebornNuggetBalance(),
			new LintEnabled(),
			new LintNuggetBalance());


	public SupernaturalCropsConfig() {
		super(CONFIGS, new File(FabricLoader.getInstance().getConfigDir().toFile(), CONFIG_FILE_NAME), "supernaturalcrops");
	}





}
