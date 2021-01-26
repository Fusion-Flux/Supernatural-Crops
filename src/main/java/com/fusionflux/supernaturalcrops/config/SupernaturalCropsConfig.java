package com.fusionflux.supernaturalcrops.config;

import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;

@Config(name = SupernaturalCrops.MOD_ID)
public final class SupernaturalCropsConfig implements ConfigData {
	public static void register() {
		AutoConfig.register(SupernaturalCropsConfig.class, JanksonConfigSerializer::new);
	}

	public static SupernaturalCropsConfig get() {
		return AutoConfig.getConfigHolder(SupernaturalCropsConfig.class).getConfig();
	}

	public static void save() {
		AutoConfig.getConfigHolder(SupernaturalCropsConfig.class).save();
	}

	public enum UncraftingRecipeOption {
		OFF, TO_INGOTS_AND_SEED, TO_INGOTS, TO_SEED;

		public Text toText() {
			// TODO
			return new LiteralText(name());
		}
	}
	
	public static class Recipes {
		public UncraftingRecipeOption uncraftingRecipe = UncraftingRecipeOption.TO_INGOTS_AND_SEED;
	}

	public static class Enabled {
		public boolean enableScrapedStoneMagmatedDamage = false;

		public boolean enableCoalCrops = true;
		public boolean enableIronCrops = true;
		public boolean enableGoldCrops = true;
		public boolean enableDiamondCrops = true;
		public boolean enableEmeraldCrops = true;
		public boolean enableNetheriteCrops = true;
		public boolean enableRedstoneCrops = true;
		public boolean enableLapisLazuliCrops = true;
		public boolean enableQuartzCrops = true;
	}

	public static class NuggetBalance {
		public boolean enableIronCropNuggets = false;
		public boolean enableGoldCropNuggets = false;
		public boolean enableDiamondCropNuggets = false;
		public boolean enableEmeraldCropNuggets = false;
		public boolean enableNetheriteCropNuggets = false;
	}

	public static class MythicalMetalsEnabled {
		public boolean enableAdamantiteCrops = true;
		public boolean enableAetheriumCrops = true;
		public boolean enableAquariumCrops = true;
		public boolean enableArgoniumCrops = true;
		public boolean enableBanglumCrops = true;
		public boolean enableBrassCrops = true;
		public boolean enableBronzeCrops = true;
		public boolean enableCarmotCrops = true;
		public boolean enableCelestiumCrops = true;
		public boolean enableCopperCrops = true;
		public boolean enableDiscordiumCrops = true;
		public boolean enableDurasteelCrops = true;
		public boolean enableElectrumCrops = true;
		public boolean enableEtheriteCrops = true;
		public boolean enableHallowedCrops = true;
		public boolean enableKyberCrops = true;
		public boolean enableManganeseCrops = true;
		public boolean enableMetallurgiumCrops = true;
		public boolean enableMidasGoldCrops = true;
		public boolean enableMythrilCrops = true;
		public boolean enableOrichalcumCrops = true;
		public boolean enableOsmiumCrops = true;
		public boolean enablePlatinumCrops = true;
		public boolean enablePrometheumCrops = true;
		public boolean enableQuadrillumCrops = true;
		public boolean enableQuicksilverCrops = true;
		public boolean enableRuniteCrops = true;
		public boolean enableSilverCrops = true;
		public boolean enableSlowsilverCrops = true;
		public boolean enableStarriteCrops = true;
		public boolean enableSteelCrops = true;
		public boolean enableStormyxCrops = true;
		public boolean enableTantaliteCrops = true;
		public boolean enableTinCrops = true;
		public boolean enableTruesilverCrops = true;
		public boolean enableUnobtainiumCrops = true;
		public boolean enableUrCrops = true;
		public boolean enableZincCrops = true;
	}

	public static class MythicalMetalsNuggetBalance {
		public boolean enableAdamantiteCropNuggets = false;
		public boolean enableAetheriumCropNuggets = false;
		public boolean enableAquariumCropNuggets = false;
		public boolean enableArgoniumCropNuggets = false;
		public boolean enableBanglumCropNuggets = false;
		public boolean enableBrassCropNuggets = false;
		public boolean enableBronzeCropNuggets = false;
		public boolean enableCarmotCropNuggets = false;
		public boolean enableCelestiumCropNuggets = false;
		public boolean enableCopperCropNuggets = false;
		public boolean enableDiscordiumCropNuggets = false;
		public boolean enableDurasteelCropNuggets = false;
		public boolean enableElectrumCropNuggets = false;
		public boolean enableEtheriteCropNuggets = false;
		public boolean enableHallowedCropNuggets = false;
		public boolean enableKyberCropNuggets = false;
		public boolean enableManganeseCropNuggets = false;
		public boolean enableMetallurgiumCropNuggets = false;
		public boolean enableMidasGoldCropNuggets = false;
		public boolean enableMythrilCropNuggets = false;
		public boolean enableOrichalcumCropNuggets = false;
		public boolean enableOsmiumCropNuggets = false;
		public boolean enablePlatinumCropNuggets = false;
		public boolean enablePrometheumCropNuggets = false;
		public boolean enableQuadrillumCropNuggets = false;
		public boolean enableQuicksilverCropNuggets = false;
		public boolean enableRuniteCropNuggets = false;
		public boolean enableSilverCropNuggets = false;
		public boolean enableSlowsilverCropNuggets = false;
		public boolean enableStarriteCropNuggets = false;
		public boolean enableSteelCropNuggets = false;
		public boolean enableStormyxCropNuggets = false;
		public boolean enableTantaliteCropNuggets = false;
		public boolean enableTinCropNuggets = false;
		public boolean enableTruesilverCropNuggets = false;
		public boolean enableUnobtainiumCropNuggets = false;
		public boolean enableUrCropNuggets = false;
		public boolean enableZincCropNuggets = false;
	}

	public static class BetterEndEnabled {
		public boolean enableTerminiteCrops = true;
		public boolean enableAmberCrops = true;
	}

	public static class BetterEndNuggetBalance {
		public boolean enableTerminiteCropNuggets = false;
		public boolean enableAmberCropNuggets = false;
	}

	public static class BetterNetherEnabled {
		public boolean enableCincinnasiteCrops = true;
		public boolean enableNetherRubyCrops = true;
	}

	public static class BetterNetherNuggetBalance {
		public boolean enableCincinnasiteCropNuggets = false;
	}

	public static class TechRebornEnabled {
		public boolean enableCopperCrops = true;
		public boolean enableAluminumCrops = true;
		public boolean enableBrassCrops = true;
		public boolean enableBronzeCrops = true;
		public boolean enableElectrumCrops = false;
		public boolean enableInvarCrops = false;
		public boolean enableIridiumCrops = true;
		public boolean enableLeadCrops = true;
		public boolean enableNickelCrops = false;
		public boolean enablePlatinumCrops = false;
		public boolean enableSilverCrops = true;
		public boolean enableSteelCrops = false;
		public boolean enableTinCrops = true;
		public boolean enableTitaniumCrops = false;
		public boolean enableTungstenCrops = true;
		public boolean enableZincCrops = false;
		public boolean enableRefinedIronCrops = false;
		public boolean enableChromeCrops = false;
		public boolean enableTungstensteelCrops = false;
	}

	public static class TechRebornNuggetBalance {
		public boolean enableCopperCropNuggets = false;
		public boolean enableAluminumCropNuggets = false;
		public boolean enableBrassCropNuggets = false;
		public boolean enableBronzeCropNuggets = false;
		public boolean enableElectrumCropNuggets = false;
		public boolean enableInvarCropNuggets = false;
		public boolean enableIridiumCropNuggets = false;
		public boolean enableLeadCropNuggets = false;
		public boolean enableNickelCropNuggets = false;
		public boolean enablePlatinumCropNuggets = false;
		public boolean enableSilverCropNuggets = false;
		public boolean enableSteelCropNuggets = false;
		public boolean enableTinCropNuggets = false;
		public boolean enableTitaniumCropNuggets = false;
		public boolean enableTungstenCropNuggets = false;
		public boolean enableZincCropNuggets = false;
		public boolean enableRefinedIronCropNuggets = false;
		public boolean enableChromeCropNuggets = false;
		public boolean enableTungstensteelCropNuggets = false;
	}

	public static class LintEnabled {
		public boolean enableJurelCrops = true;
		public boolean enableSicieronCrops = true;
		public boolean enableTarscanCrops = true;
	}

	public static class LintNuggetBalance {
		public boolean enableJurelCropNuggets = false;
	}

	@ConfigEntry.Gui.TransitiveObject
	@ConfigEntry.Category("recipes")
	public Recipes recipes = new Recipes();
	
	@ConfigEntry.Gui.TransitiveObject
	@ConfigEntry.Category("enabled")
	public Enabled enabled = new Enabled();
	@ConfigEntry.Gui.TransitiveObject
	@ConfigEntry.Category("nuggetBalance")
	public NuggetBalance nuggetBalance = new NuggetBalance();

	@ConfigEntry.Gui.TransitiveObject
	@ConfigEntry.Category("mythicalMetalsEnabled")
	public MythicalMetalsEnabled mythicalMetalsEnabled = new MythicalMetalsEnabled();
	@ConfigEntry.Gui.TransitiveObject
	@ConfigEntry.Category("mythicalMetalsNuggetBalance")
	public MythicalMetalsNuggetBalance mythicalMetalsNuggetBalance = new MythicalMetalsNuggetBalance();

	@ConfigEntry.Gui.TransitiveObject
	@ConfigEntry.Category("betterEndEnabled")
	public BetterEndEnabled betterEndEnabled = new BetterEndEnabled();
	@ConfigEntry.Gui.TransitiveObject
	@ConfigEntry.Category("betterEndNuggetBalance")
	public BetterEndNuggetBalance betterEndNuggetBalance = new BetterEndNuggetBalance();

	@ConfigEntry.Gui.TransitiveObject
	@ConfigEntry.Category("betterNetherEnabled")
	public BetterNetherEnabled betterNetherEnabled = new BetterNetherEnabled();
	@ConfigEntry.Gui.TransitiveObject
	@ConfigEntry.Category("betterNetherNuggetBalance")
	public BetterNetherNuggetBalance betterNetherNuggetBalance = new BetterNetherNuggetBalance();

	@ConfigEntry.Gui.TransitiveObject
	@ConfigEntry.Category("techRebornEnabled")
	public TechRebornEnabled techRebornEnabled = new TechRebornEnabled();
	@ConfigEntry.Gui.TransitiveObject
	@ConfigEntry.Category("techRebornNuggetBalance")
	public TechRebornNuggetBalance techRebornNuggetBalance = new TechRebornNuggetBalance();

	@ConfigEntry.Gui.TransitiveObject
	@ConfigEntry.Category("lintEnabled")
	public LintEnabled lintEnabled = new LintEnabled();
	@ConfigEntry.Gui.TransitiveObject
	@ConfigEntry.Category("lintNuggetBalance")
	public LintNuggetBalance lintNuggetBalance = new LintNuggetBalance();

	@Override
	public void validatePostLoad() {
		if (enabled == null)
			enabled = new Enabled();
		if (nuggetBalance == null)
			nuggetBalance = new NuggetBalance();

		if (mythicalMetalsEnabled == null)
			mythicalMetalsEnabled = new MythicalMetalsEnabled();
		if (mythicalMetalsNuggetBalance == null)
			mythicalMetalsNuggetBalance = new MythicalMetalsNuggetBalance();

		if (betterEndEnabled == null)
			betterEndEnabled = new BetterEndEnabled();
		if (betterEndNuggetBalance == null)
			betterEndNuggetBalance = new BetterEndNuggetBalance();

		if (betterNetherEnabled == null)
			betterNetherEnabled = new BetterNetherEnabled();
		if (betterNetherNuggetBalance == null)
			betterNetherNuggetBalance = new BetterNetherNuggetBalance();

		if (techRebornEnabled == null)
			techRebornEnabled = new TechRebornEnabled();
		if (techRebornNuggetBalance == null)
			techRebornNuggetBalance = new TechRebornNuggetBalance();

		if (lintEnabled == null)
			lintEnabled = new LintEnabled();
		if (lintNuggetBalance == null)
			lintNuggetBalance = new LintNuggetBalance();
	}
}
