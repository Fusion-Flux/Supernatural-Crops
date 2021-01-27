package com.fusionflux.supernaturalcrops.modsupport;

import com.fusionflux.supernaturalcrops.OreBush;
import com.fusionflux.supernaturalcrops.block.OreBushBlock;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.Item;
import net.minecraft.util.Lazy;
import nourl.mythicmetals.registry.RegisterIngots;
import nourl.mythicmetals.registry.RegisterNuggets;

import java.util.function.Supplier;

import static com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks.*;
import static com.fusionflux.supernaturalcrops.resource.SupernaturalCropsResources.registerBushResources;

public class MythicMetalsCropsBlocks {
	public enum OreBushes implements OreBush {
		ADAMANTITE("adamantite_bush", RegisterIngots.Adamantite_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableAdamantiteCropNuggets
						? RegisterNuggets.Adamantite_Nugget
						: RegisterIngots.Adamantite_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableAdamantiteCrops),
		AETHERIUM("aetherium_bush", RegisterIngots.Aetherium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableAetheriumCropNuggets
						? RegisterNuggets.Aetherium_Nugget
						: RegisterIngots.Aetherium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableAetheriumCrops),
		AQUARIUM("aquarium_bush", RegisterIngots.Aquarium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableAquariumCropNuggets
						? RegisterNuggets.Aquarium_Nugget
						: RegisterIngots.Aquarium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableAquariumCrops),
		ARGONIUM("argonium_bush", RegisterIngots.Argonium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableArgoniumCropNuggets
						? RegisterNuggets.Argonium_Nugget
						: RegisterIngots.Argonium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableArgoniumCrops),
		BANGLUM("banglum_bush", RegisterIngots.Banglum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableBanglumCropNuggets
						? RegisterNuggets.Banglum_Nugget
						: RegisterIngots.Banglum_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableBanglumCrops),
		BRASS("mmbrass_bush", RegisterIngots.Brass_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableBrassCropNuggets
						? RegisterNuggets.Brass_Nugget
						: RegisterIngots.Brass_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableBrassCrops),
		BRONZE("mmbronze_bush", RegisterIngots.Bronze_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableBronzeCropNuggets
						? RegisterNuggets.Bronze_Nugget
						: RegisterIngots.Bronze_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableBronzeCrops),
		CARMOT("carmot_bush", RegisterIngots.Carmot_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableCarmotCropNuggets
						? RegisterNuggets.Carmot_Nugget
						: RegisterIngots.Carmot_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableCarmotCrops),
		CELESTIUM("celestium_bush", RegisterIngots.Celestium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableCelestiumCropNuggets
						? RegisterNuggets.Celestium_Nugget
						: RegisterIngots.Celestium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableCelestiumCrops),
		COPPER("mmcopper_bush", RegisterIngots.Copper_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableCopperCropNuggets
						? RegisterNuggets.Copper_Nugget
						: RegisterIngots.Copper_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableCopperCrops),
		DISCORDIUM("discordium_bush", RegisterIngots.Discordium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableDiscordiumCropNuggets
						? RegisterNuggets.Discordium_Nugget
						: RegisterIngots.Discordium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableDiscordiumCrops),
		DURASTEEL("durasteel_bush", RegisterIngots.Durasteel_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableDurasteelCropNuggets
						? RegisterNuggets.Durasteel_Nugget
						: RegisterIngots.Durasteel_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableDurasteelCrops),
		ELECTRUM("mmelectrum_bush", RegisterIngots.Electrum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableElectrumCropNuggets
						? RegisterNuggets.Electrum_Nugget
						: RegisterIngots.Electrum_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableElectrumCrops),
		ETHERITE("etherite_bush", RegisterIngots.Etherite_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableEtheriteCropNuggets
						? RegisterNuggets.Etherite_Nugget
						: RegisterIngots.Etherite_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableEtheriteCrops),
		KYBER("kyber_bush", RegisterIngots.Kyber_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableKyberCropNuggets
						? RegisterNuggets.Kyber_Nugget
						: RegisterIngots.Kyber_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableKyberCrops),
		MANGANESE("manganese_bush", RegisterIngots.Manganese_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableManganeseCropNuggets
						? RegisterNuggets.Manganese_Nugget
						: RegisterIngots.Manganese_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableManganeseCrops),
		METALLURGIUM("metallurgium_bush", RegisterIngots.Metallurgium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableMetallurgiumCropNuggets
						? RegisterNuggets.Metallurgium_Nugget
						: RegisterIngots.Metallurgium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableMetallurgiumCrops),
		MIDAS_GOLD("midas_gold_bush", RegisterIngots.Midas_Gold_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableMidasGoldCropNuggets
						? RegisterNuggets.Midas_Gold_Nugget
						: RegisterIngots.Midas_Gold_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableMidasGoldCrops),
		MYTHRIL("mythril_bush", RegisterIngots.Mythril_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableMythrilCropNuggets
						? RegisterNuggets.Mythril_Nugget
						: RegisterIngots.Mythril_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableMythrilCrops),
		ORICHALCUM("orichalcum_bush", RegisterIngots.Orichalcum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableOrichalcumCropNuggets
						? RegisterNuggets.Orichalcum_Nugget
						: RegisterIngots.Orichalcum_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableOrichalcumCrops),
		OSMIUM("osmium_bush", RegisterIngots.Osmium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableOsmiumCropNuggets
						? RegisterNuggets.Osmium_Nugget
						: RegisterIngots.Osmium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableOsmiumCrops),
		PLATINUM("platinum_bush", RegisterIngots.Platinum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enablePlatinumCropNuggets
						? RegisterNuggets.Platinum_Nugget
						: RegisterIngots.Platinum_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enablePlatinumCrops),
		PROMETHEUM("prometheum_bush", RegisterIngots.Prometheum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enablePrometheumCropNuggets
						? RegisterNuggets.Prometheum_Nugget
						: RegisterIngots.Prometheum_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enablePrometheumCrops),
		QUADRILLUM("quadrillum_bush", RegisterIngots.Quadrillum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableQuadrillumCropNuggets
						? RegisterNuggets.Quadrillum_Nugget
						: RegisterIngots.Quadrillum_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableQuadrillumCrops),
		QUICKSILVER("quicksilver_bush", RegisterIngots.Quicksilver_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableQuicksilverCropNuggets
						? RegisterNuggets.Quicksilver_Nugget
						: RegisterIngots.Quicksilver_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableQuicksilverCrops),
		RUNITE("runite_bush", RegisterIngots.Runite_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableRuniteCropNuggets
						? RegisterNuggets.Runite_Nugget
						: RegisterIngots.Runite_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableRuniteCrops),
		SILVER("mmsilver_bush", RegisterIngots.Silver_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableSilverCropNuggets
						? RegisterNuggets.Silver_Nugget
						: RegisterIngots.Silver_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableSilverCrops),
		SLOWSILVER("slowsilver_bush", RegisterIngots.Slowsilver_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableSlowsilverCropNuggets
						? RegisterNuggets.Slowsilver_Nugget
						: RegisterIngots.Slowsilver_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableSlowsilverCrops),
		STARRITE("starrite_bush", RegisterIngots.Starrite_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableStarriteCropNuggets
						? RegisterNuggets.Starrite_Nugget
						: RegisterIngots.Starrite_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableStarriteCrops),
		STEEL("mmsteel_bush", RegisterIngots.Steel_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableSteelCropNuggets
						? RegisterNuggets.Steel_Nugget
						: RegisterIngots.Steel_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableSteelCrops),
		STORMYX("stormyx_bush", RegisterIngots.Stormyx_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableStormyxCropNuggets
						? RegisterNuggets.Stormyx_Nugget
						: RegisterIngots.Stormyx_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableStormyxCrops),
		TANTALITE("tantalite_bush", RegisterIngots.Tantalite_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableTantaliteCropNuggets
						? RegisterNuggets.Tantalite_Nugget
						: RegisterIngots.Tantalite_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableTantaliteCrops),
		TIN("tin_bush", RegisterIngots.Tin_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableTinCropNuggets
						? RegisterNuggets.Tin_Nugget
						: RegisterIngots.Tin_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableTinCrops),
		TRUESILVER("truesilver_bush", RegisterIngots.Truesilver_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableTruesilverCropNuggets
						? RegisterNuggets.Truesilver_Nugget
						: RegisterIngots.Truesilver_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableTruesilverCrops),
		UNOBTAINIUM("unobtainium_bush", RegisterIngots.Unobtainium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableUnobtainiumCropNuggets
						? RegisterNuggets.Unobtainium_Nugget
						: RegisterIngots.Unobtainium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableUnobtainiumCrops),
		UR("ur_bush", RegisterIngots.Ur_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableUrCropNuggets
						? RegisterNuggets.Ur_Nugget
						: RegisterIngots.Ur_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableUrCrops),
		ZINC("mmzinc_bush", RegisterIngots.Zinc_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicMetalsNuggetBalance.enableZincCropNuggets
						? RegisterNuggets.Zinc_Nugget
						: RegisterIngots.Zinc_Ingot),
				() -> SupernaturalCropsConfig.get().mythicMetalsEnabled.enableZincCrops);

		private final String path;
		private final Item ingot;
		private final Lazy<Item> harvestResult;
		private final Lazy<Boolean> enabled;
		private final Lazy<OreBushBlock> block;

		OreBushes(String path, Item ingot, Lazy<Item> harvestResult, Supplier<Boolean> enabled) {
			this.path = path;
			this.ingot = ingot;
			this.harvestResult = harvestResult;
			this.enabled = new Lazy<>(enabled);
			block = new Lazy<>(() -> new OreBushBlock(bushBlockSettings(), this));
		}

		@Override
		public boolean isEnabled() {
			return enabled.get();
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