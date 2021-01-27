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
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableAdamantiteCropNuggets
						? RegisterNuggets.Adamantite_Nugget
						: RegisterIngots.Adamantite_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableAdamantiteCrops),
		AETHERIUM("aetherium_bush", RegisterIngots.Aetherium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableAetheriumCropNuggets
						? RegisterNuggets.Aetherium_Nugget
						: RegisterIngots.Aetherium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableAetheriumCrops),
		AQUARIUM("aquarium_bush", RegisterIngots.Aquarium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableAquariumCropNuggets
						? RegisterNuggets.Aquarium_Nugget
						: RegisterIngots.Aquarium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableAquariumCrops),
		ARGONIUM("argonium_bush", RegisterIngots.Argonium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableArgoniumCropNuggets
						? RegisterNuggets.Argonium_Nugget
						: RegisterIngots.Argonium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableArgoniumCrops),
		BANGLUM("banglum_bush", RegisterIngots.Banglum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableBanglumCropNuggets
						? RegisterNuggets.Banglum_Nugget
						: RegisterIngots.Banglum_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableBanglumCrops),
		BRASS("mmbrass_bush", RegisterIngots.Brass_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableBrassCropNuggets
						? RegisterNuggets.Brass_Nugget
						: RegisterIngots.Brass_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableBrassCrops),
		BRONZE("mmbronze_bush", RegisterIngots.Bronze_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableBronzeCropNuggets
						? RegisterNuggets.Bronze_Nugget
						: RegisterIngots.Bronze_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableBronzeCrops),
		CARMOT("carmot_bush", RegisterIngots.Carmot_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableCarmotCropNuggets
						? RegisterNuggets.Carmot_Nugget
						: RegisterIngots.Carmot_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableCarmotCrops),
		CELESTIUM("celestium_bush", RegisterIngots.Celestium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableCelestiumCropNuggets
						? RegisterNuggets.Celestium_Nugget
						: RegisterIngots.Celestium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableCelestiumCrops),
		COPPER("mmcopper_bush", RegisterIngots.Copper_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableCopperCropNuggets
						? RegisterNuggets.Copper_Nugget
						: RegisterIngots.Copper_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableCopperCrops),
		DISCORDIUM("discordium_bush", RegisterIngots.Discordium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableDiscordiumCropNuggets
						? RegisterNuggets.Discordium_Nugget
						: RegisterIngots.Discordium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableDiscordiumCrops),
		DURASTEEL("durasteel_bush", RegisterIngots.Durasteel_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableDurasteelCropNuggets
						? RegisterNuggets.Durasteel_Nugget
						: RegisterIngots.Durasteel_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableDurasteelCrops),
		ELECTRUM("mmelectrum_bush", RegisterIngots.Electrum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableElectrumCropNuggets
						? RegisterNuggets.Electrum_Nugget
						: RegisterIngots.Electrum_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableElectrumCrops),
		ETHERITE("etherite_bush", RegisterIngots.Etherite_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableEtheriteCropNuggets
						? RegisterNuggets.Etherite_Nugget
						: RegisterIngots.Etherite_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableEtheriteCrops),
		HALLOWED("hallowed_bush", RegisterIngots.Hallowed_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableHallowedCropNuggets
						? RegisterNuggets.Hallowed_Nugget
						: RegisterIngots.Hallowed_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableHallowedCrops),
		KYBER("kyber_bush", RegisterIngots.Kyber_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableKyberCropNuggets
						? RegisterNuggets.Kyber_Nugget
						: RegisterIngots.Kyber_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableKyberCrops),
		MANGANESE("manganese_bush", RegisterIngots.Manganese_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableManganeseCropNuggets
						? RegisterNuggets.Manganese_Nugget
						: RegisterIngots.Manganese_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableManganeseCrops),
		METALLURGIUM("metallurgium_bush", RegisterIngots.Metallurgium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableMetallurgiumCropNuggets
						? RegisterNuggets.Metallurgium_Nugget
						: RegisterIngots.Metallurgium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableMetallurgiumCrops),
		MIDAS_GOLD("midas_gold_bush", RegisterIngots.Midas_Gold_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableMidasGoldCropNuggets
						? RegisterNuggets.Midas_Gold_Nugget
						: RegisterIngots.Midas_Gold_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableMidasGoldCrops),
		MYTHRIL("mythril_bush", RegisterIngots.Mythril_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableMythrilCropNuggets
						? RegisterNuggets.Mythril_Nugget
						: RegisterIngots.Mythril_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableMythrilCrops),
		ORICHALCUM("orichalcum_bush", RegisterIngots.Orichalcum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableOrichalcumCropNuggets
						? RegisterNuggets.Orichalcum_Nugget
						: RegisterIngots.Orichalcum_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableOrichalcumCrops),
		OSMIUM("osmium_bush", RegisterIngots.Osmium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableOsmiumCropNuggets
						? RegisterNuggets.Osmium_Nugget
						: RegisterIngots.Osmium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableOsmiumCrops),
		PLATINUM("platinum_bush", RegisterIngots.Platinum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enablePlatinumCropNuggets
						? RegisterNuggets.Platinum_Nugget
						: RegisterIngots.Platinum_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enablePlatinumCrops),
		PROMETHEUM("prometheum_bush", RegisterIngots.Prometheum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enablePrometheumCropNuggets
						? RegisterNuggets.Prometheum_Nugget
						: RegisterIngots.Prometheum_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enablePrometheumCrops),
		QUADRILLUM("quadrillum_bush", RegisterIngots.Quadrillum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableQuadrillumCropNuggets
						? RegisterNuggets.Quadrillum_Nugget
						: RegisterIngots.Quadrillum_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableQuadrillumCrops),
		QUICKSILVER("quicksilver_bush", RegisterIngots.Quicksilver_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableQuicksilverCropNuggets
						? RegisterNuggets.Quicksilver_Nugget
						: RegisterIngots.Quicksilver_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableQuicksilverCrops),
		RUNITE("runite_bush", RegisterIngots.Runite_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableRuniteCropNuggets
						? RegisterNuggets.Runite_Nugget
						: RegisterIngots.Runite_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableRuniteCrops),
		SILVER("mmsilver_bush", RegisterIngots.Silver_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableSilverCropNuggets
						? RegisterNuggets.Silver_Nugget
						: RegisterIngots.Silver_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableSilverCrops),
		SLOWSILVER("slowsilver_bush", RegisterIngots.Slowsilver_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableSlowsilverCropNuggets
						? RegisterNuggets.Slowsilver_Nugget
						: RegisterIngots.Slowsilver_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableSlowsilverCrops),
		STARRITE("starrite_bush", RegisterIngots.Starrite_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableStarriteCropNuggets
						? RegisterNuggets.Starrite_Nugget
						: RegisterIngots.Starrite_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableStarriteCrops),
		STEEL("mmsteel_bush", RegisterIngots.Steel_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableSteelCropNuggets
						? RegisterNuggets.Steel_Nugget
						: RegisterIngots.Steel_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableSteelCrops),
		STORMYX("stormyx_bush", RegisterIngots.Stormyx_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableStormyxCropNuggets
						? RegisterNuggets.Stormyx_Nugget
						: RegisterIngots.Stormyx_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableStormyxCrops),
		TANTALITE("tantalite_bush", RegisterIngots.Tantalite_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableTantaliteCropNuggets
						? RegisterNuggets.Tantalite_Nugget
						: RegisterIngots.Tantalite_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableTantaliteCrops),
		TIN("tin_bush", RegisterIngots.Tin_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableTinCropNuggets
						? RegisterNuggets.Tin_Nugget
						: RegisterIngots.Tin_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableTinCrops),
		TRUESILVER("truesilver_bush", RegisterIngots.Truesilver_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableTruesilverCropNuggets
						? RegisterNuggets.Truesilver_Nugget
						: RegisterIngots.Truesilver_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableTruesilverCrops),
		UNOBTAINIUM("unobtainium_bush", RegisterIngots.Unobtainium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableUnobtainiumCropNuggets
						? RegisterNuggets.Unobtainium_Nugget
						: RegisterIngots.Unobtainium_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableUnobtainiumCrops),
		UR("ur_bush", RegisterIngots.Ur_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableUrCropNuggets
						? RegisterNuggets.Ur_Nugget
						: RegisterIngots.Ur_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableUrCrops),
		ZINC("mmzinc_bush", RegisterIngots.Zinc_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.get().mythicalMetalsNuggetBalance.enableZincCropNuggets
						? RegisterNuggets.Zinc_Nugget
						: RegisterIngots.Zinc_Ingot),
				() -> SupernaturalCropsConfig.get().mythicalMetalsEnabled.enableZincCrops);

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