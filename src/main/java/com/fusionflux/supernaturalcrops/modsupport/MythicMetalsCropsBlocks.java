package com.fusionflux.supernaturalcrops.modsupport;

import com.fusionflux.supernaturalcrops.OreBush;
import com.fusionflux.supernaturalcrops.block.OreBushBlock;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
import net.minecraft.util.Lazy;
import nourl.mythicmetals.registry.RegisterIngots;
import nourl.mythicmetals.registry.RegisterNuggets;

import java.util.function.Supplier;

import static com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks.bushBlockSettings;
import static com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks.registerBush;
import static com.fusionflux.supernaturalcrops.resource.SupernaturalCropsResources.registerBushResources;

public class MythicMetalsCropsBlocks {
	public enum OreBushes implements OreBush {
		ADAMANTITE("adamantite_bush", RegisterIngots.Adamantite_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_ADAMANTITE_CROP_NUGGETS.getValue()
						? RegisterNuggets.Adamantite_Nugget
						: RegisterIngots.Adamantite_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_ADAMANTITE_CROPS::getValue),
		AETHERIUM("aetherium_bush", RegisterIngots.Aetherium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_AETHERIUM_CROP_NUGGETS.getValue()
						? RegisterNuggets.Aetherium_Nugget
						: RegisterIngots.Aetherium_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_AETHERIUM_CROPS::getValue),
		AQUARIUM("aquarium_bush", RegisterIngots.Aquarium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_AQUARIUM_CROP_NUGGETS.getValue()
						? RegisterNuggets.Aquarium_Nugget
						: RegisterIngots.Aquarium_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_AQUARIUM_CROPS::getValue),
		ARGONIUM("argonium_bush", RegisterIngots.Argonium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_ARGONIUM_CROP_NUGGETS.getValue()
						? RegisterNuggets.Argonium_Nugget
						: RegisterIngots.Argonium_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_ARGONIUM_CROPS::getValue),
		BANGLUM("banglum_bush", RegisterIngots.Banglum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_BANGLUM_CROP_NUGGETS.getValue()
						? RegisterNuggets.Banglum_Nugget
						: RegisterIngots.Banglum_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_BANGLUM_CROPS::getValue),
		BRASS("mmbrass_bush", RegisterIngots.Brass_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_BRASS_CROP_NUGGETS.getValue()
						? RegisterNuggets.Brass_Nugget
						: RegisterIngots.Brass_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_BRASS_CROPS::getValue),
		BRONZE("mmbronze_bush", RegisterIngots.Bronze_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_BRONZE_CROP_NUGGETS.getValue()
						? RegisterNuggets.Bronze_Nugget
						: RegisterIngots.Bronze_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_BRONZE_CROPS::getValue),
		CARMOT("carmot_bush", RegisterIngots.Carmot_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_CARMOT_CROP_NUGGETS.getValue()
						? RegisterNuggets.Carmot_Nugget
						: RegisterIngots.Carmot_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_CARMOT_CROPS::getValue),
		CELESTIUM("celestium_bush", RegisterIngots.Celestium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_CELESTIUM_CROP_NUGGETS.getValue()
						? RegisterNuggets.Celestium_Nugget
						: RegisterIngots.Celestium_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_CELESTIUM_CROPS::getValue),
		COPPER("mmcopper_bush", RegisterIngots.Copper_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_COPPER_CROP_NUGGETS.getValue()
						? RegisterNuggets.Copper_Nugget
						: RegisterIngots.Copper_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_COPPER_CROPS::getValue),
		DISCORDIUM("discordium_bush", RegisterIngots.Discordium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_DISCORDIUM_CROP_NUGGETS.getValue()
						? RegisterNuggets.Discordium_Nugget
						: RegisterIngots.Discordium_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_DISCORDIUM_CROPS::getValue),
		DURASTEEL("durasteel_bush", RegisterIngots.Durasteel_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_DURASTEEL_CROP_NUGGETS.getValue()
						? RegisterNuggets.Durasteel_Nugget
						: RegisterIngots.Durasteel_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_DURASTEEL_CROPS::getValue),
		ELECTRUM("mmelectrum_bush", RegisterIngots.Electrum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_ELECTRUM_CROP_NUGGETS.getValue()
						? RegisterNuggets.Electrum_Nugget
						: RegisterIngots.Electrum_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_ELECTRUM_CROPS::getValue),
		ETHERITE("etherite_bush", RegisterIngots.Etherite_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_ETHERITE_CROP_NUGGETS.getValue()
						? RegisterNuggets.Etherite_Nugget
						: RegisterIngots.Etherite_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_ETHERITE_CROPS::getValue),
		HALLOWED("hallowed_bush", RegisterIngots.Hallowed_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_HALLOWED_CROP_NUGGETS.getValue()
						? RegisterNuggets.Hallowed_Nugget
						: RegisterIngots.Hallowed_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_HALLOWED_CROPS::getValue),
		KYBER("kyber_bush", RegisterIngots.Kyber_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_KYBER_CROP_NUGGETS.getValue()
						? RegisterNuggets.Kyber_Nugget
						: RegisterIngots.Kyber_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_KYBER_CROPS::getValue),
		MANGANESE("manganese_bush", RegisterIngots.Manganese_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_MANGANESE_CROP_NUGGETS.getValue()
						? RegisterNuggets.Manganese_Nugget
						: RegisterIngots.Manganese_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_MANGANESE_CROPS::getValue),
		METALLURGIUM("metallurgium_bush", RegisterIngots.Metallurgium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_METALLURGIUM_CROP_NUGGETS.getValue()
						? RegisterNuggets.Metallurgium_Nugget
						: RegisterIngots.Metallurgium_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_METALLURGIUM_CROPS::getValue),
		MIDAS_GOLD("midas_gold_bush", RegisterIngots.Midas_Gold_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_MIDAS_GOLD_CROP_NUGGETS.getValue()
						? RegisterNuggets.Midas_Gold_Nugget
						: RegisterIngots.Midas_Gold_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_MIDAS_GOLD_CROPS::getValue),
		MYTHRIL("mythril_bush", RegisterIngots.Mythril_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_MYTHRIL_CROP_NUGGETS.getValue()
						? RegisterNuggets.Mythril_Nugget
						: RegisterIngots.Mythril_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_MYTHRIL_CROPS::getValue),
		ORICHALCUM("orichalcum_bush", RegisterIngots.Orichalcum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_ORICHALCUM_CROP_NUGGETS.getValue()
						? RegisterNuggets.Orichalcum_Nugget
						: RegisterIngots.Orichalcum_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_ORICHALCUM_CROPS::getValue),
		OSMIUM("osmium_bush", RegisterIngots.Osmium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_OSMIUM_CROP_NUGGETS.getValue()
						? RegisterNuggets.Osmium_Nugget
						: RegisterIngots.Osmium_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_OSMIUM_CROPS::getValue),
		PLATINUM("platinum_bush", RegisterIngots.Platinum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_PLATINUM_CROP_NUGGETS.getValue()
						? RegisterNuggets.Platinum_Nugget
						: RegisterIngots.Platinum_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_PLATINUM_CROPS::getValue),
		PROMETHEUM("prometheum_bush", RegisterIngots.Prometheum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_PROMETHEUM_CROP_NUGGETS.getValue()
						? RegisterNuggets.Prometheum_Nugget
						: RegisterIngots.Prometheum_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_PROMETHEUM_CROPS::getValue),
		QUADRILLUM("quadrillum_bush", RegisterIngots.Quadrillum_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_QUADRILLUM_CROP_NUGGETS.getValue()
						? RegisterNuggets.Quadrillum_Nugget
						: RegisterIngots.Quadrillum_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_QUADRILLUM_CROPS::getValue),
		QUICKSILVER("quicksilver_bush", RegisterIngots.Quicksilver_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_QUICKSILVER_CROP_NUGGETS.getValue()
						? RegisterNuggets.Quicksilver_Nugget
						: RegisterIngots.Quicksilver_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_QUICKSILVER_CROPS::getValue),
		RUNITE("runite_bush", RegisterIngots.Runite_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_RUNITE_CROP_NUGGETS.getValue()
						? RegisterNuggets.Runite_Nugget
						: RegisterIngots.Runite_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_RUNITE_CROPS::getValue),
		SILVER("mmsilver_bush", RegisterIngots.Silver_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_SILVER_CROP_NUGGETS.getValue()
						? RegisterNuggets.Silver_Nugget
						: RegisterIngots.Silver_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_SILVER_CROPS::getValue),
		SLOWSILVER("slowsilver_bush", RegisterIngots.Slowsilver_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_SLOWSILVER_CROP_NUGGETS.getValue()
						? RegisterNuggets.Slowsilver_Nugget
						: RegisterIngots.Slowsilver_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_SLOWSILVER_CROPS::getValue),
		STARRITE("starrite_bush", RegisterIngots.Starrite_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_STARRITE_CROP_NUGGETS.getValue()
						? RegisterNuggets.Starrite_Nugget
						: RegisterIngots.Starrite_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_STARRITE_CROPS::getValue),
		STEEL("mmsteel_bush", RegisterIngots.Steel_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_STEEL_CROP_NUGGETS.getValue()
						? RegisterNuggets.Steel_Nugget
						: RegisterIngots.Steel_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_STEEL_CROPS::getValue),
		STORMYX("stormyx_bush", RegisterIngots.Stormyx_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_STORMYX_CROP_NUGGETS.getValue()
						? RegisterNuggets.Stormyx_Nugget
						: RegisterIngots.Stormyx_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_STORMYX_CROPS::getValue),
		TANTALITE("tantalite_bush", RegisterIngots.Tantalite_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_TANTALITE_CROP_NUGGETS.getValue()
						? RegisterNuggets.Tantalite_Nugget
						: RegisterIngots.Tantalite_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_TANTALITE_CROPS::getValue),
		TIN("tin_bush", RegisterIngots.Tin_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_TIN_CROP_NUGGETS.getValue()
						? RegisterNuggets.Tin_Nugget
						: RegisterIngots.Tin_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_TIN_CROPS::getValue),
		TRUESILVER("truesilver_bush", RegisterIngots.Truesilver_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_TRUESILVER_CROP_NUGGETS.getValue()
						? RegisterNuggets.Truesilver_Nugget
						: RegisterIngots.Truesilver_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_TRUESILVER_CROPS::getValue),
		UNOBTAINIUM("unobtainium_bush", RegisterIngots.Unobtainium_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_UNOBTAINIUM_CROP_NUGGETS.getValue()
						? RegisterNuggets.Unobtainium_Nugget
						: RegisterIngots.Unobtainium_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_UNOBTAINIUM_CROPS::getValue),
		UR("ur_bush", RegisterIngots.Ur_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_UR_CROP_NUGGETS.getValue()
						? RegisterNuggets.Ur_Nugget
						: RegisterIngots.Ur_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_UR_CROPS::getValue),
		ZINC("mmzinc_bush", RegisterIngots.Zinc_Ingot, new Lazy<>(() ->
				SupernaturalCropsConfig.MythicalMetalsNuggetBalance.ENABLE_ZINC_CROP_NUGGETS.getValue()
						? RegisterNuggets.Zinc_Nugget
						: RegisterIngots.Zinc_Ingot),
				SupernaturalCropsConfig.MythicalMetalsEnabled.ENABLE_ZINC_CROPS::getValue);

		private final String path;
		private final Item ingot;
		private final Lazy<Item> harvestResult;
		private final Lazy<Boolean> enabled;

		OreBushes(String path, Item ingot, Lazy<Item> harvestResult, Supplier<Boolean> enabled) {
			this.path = path;
			this.ingot = ingot;
			this.harvestResult = harvestResult;
			this.enabled = new Lazy<>(enabled);
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
		public Item getIngot() {
			return ingot;
		}

		@Override
		public Item getHarvestResult() {
			return harvestResult.get();
		}
	}

	public static final OreBushBlock ADAMANTITE_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.ADAMANTITE);
	public static final OreBushBlock AETHERIUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.AETHERIUM);
	public static final OreBushBlock AQUARIUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.AQUARIUM);
	public static final OreBushBlock ARGONIUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.ARGONIUM);
	public static final OreBushBlock BANGLUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.BANGLUM);
	public static final OreBushBlock BRASS_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.BRASS);
	public static final OreBushBlock BRONZE_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.BRONZE);
	public static final OreBushBlock CARMOT_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.CARMOT);
	public static final OreBushBlock CELESTIUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.CELESTIUM);
	public static final OreBushBlock COPPER_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.COPPER);
	public static final OreBushBlock DISCORDIUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.DISCORDIUM);
	public static final OreBushBlock DURASTEEL_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.DURASTEEL);
	public static final OreBushBlock ELECTRUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.ELECTRUM);
	public static final OreBushBlock ETHERITE_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.ETHERITE);
	public static final OreBushBlock HALLOWED_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.HALLOWED);
	public static final OreBushBlock KYBER_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.KYBER);
	public static final OreBushBlock MANGANESE_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.MANGANESE);
	public static final OreBushBlock METALLURGIUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.METALLURGIUM);
	public static final OreBushBlock MIDAS_GOLD_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.MIDAS_GOLD);
	public static final OreBushBlock MYTHRIL_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.MYTHRIL);
	public static final OreBushBlock ORICHALCUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.ORICHALCUM);
	public static final OreBushBlock OSMIUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.OSMIUM);
	public static final OreBushBlock PLATINUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.PLATINUM);
	public static final OreBushBlock PROMETHEUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.PROMETHEUM);
	public static final OreBushBlock QUADRILLUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.QUADRILLUM);
	public static final OreBushBlock QUICKSILVER_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.QUICKSILVER);
	public static final OreBushBlock RUNITE_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.RUNITE);
	public static final OreBushBlock SILVER_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.SILVER);
	public static final OreBushBlock SLOWSILVER_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.SLOWSILVER);
	public static final OreBushBlock STARRITE_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.STARRITE);
	public static final OreBushBlock STEEL_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.STEEL);
	public static final OreBushBlock STORMYX_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.STORMYX);
	public static final OreBushBlock TANTALITE_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.TANTALITE);
	public static final OreBushBlock TIN_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.TIN);
	public static final OreBushBlock TRUESILVER_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.TRUESILVER);
	public static final OreBushBlock UNOBTAINIUM_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.UNOBTAINIUM);
	public static final OreBushBlock UR_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.UR);
	public static final OreBushBlock ZINC_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.ZINC);

	public static void registerBlocks() {
		registerBush(ADAMANTITE_BUSH);
		registerBush(AETHERIUM_BUSH);
		registerBush(AQUARIUM_BUSH);
		registerBush(ARGONIUM_BUSH);
		registerBush(BANGLUM_BUSH);
		registerBush(BRASS_BUSH);
		registerBush(BRONZE_BUSH);
		registerBush(CARMOT_BUSH);
		registerBush(CELESTIUM_BUSH);
		registerBush(COPPER_BUSH);
		registerBush(DISCORDIUM_BUSH);
		registerBush(DURASTEEL_BUSH);
		registerBush(ELECTRUM_BUSH);
		registerBush(ETHERITE_BUSH);
		registerBush(HALLOWED_BUSH);
		registerBush(KYBER_BUSH);
		registerBush(MANGANESE_BUSH);
		registerBush(METALLURGIUM_BUSH);
		registerBush(MIDAS_GOLD_BUSH);
		registerBush(MYTHRIL_BUSH);
		registerBush(ORICHALCUM_BUSH);
		registerBush(OSMIUM_BUSH);
		registerBush(PLATINUM_BUSH);
		registerBush(PROMETHEUM_BUSH);
		registerBush(QUADRILLUM_BUSH);
		registerBush(QUICKSILVER_BUSH);
		registerBush(RUNITE_BUSH);
		registerBush(SILVER_BUSH);
		registerBush(SLOWSILVER_BUSH);
		registerBush(STARRITE_BUSH);
		registerBush(STEEL_BUSH);
		registerBush(STORMYX_BUSH);
		registerBush(TANTALITE_BUSH);
		registerBush(TIN_BUSH);
		registerBush(TRUESILVER_BUSH);
		registerBush(UNOBTAINIUM_BUSH);
		registerBush(UR_BUSH);
		registerBush(ZINC_BUSH);
		registerBushResources(OreBushes.values());
	}

	@Environment(EnvType.CLIENT)
	public static void registerRenderLayers() {
		BlockRenderLayerMap.INSTANCE.putBlock(ADAMANTITE_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(AETHERIUM_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(AQUARIUM_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ARGONIUM_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BANGLUM_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BRASS_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BRONZE_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CARMOT_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CELESTIUM_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(COPPER_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DISCORDIUM_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DURASTEEL_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ELECTRUM_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ETHERITE_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(HALLOWED_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(KYBER_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MANGANESE_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(METALLURGIUM_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MIDAS_GOLD_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MYTHRIL_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ORICHALCUM_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(OSMIUM_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(PLATINUM_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(PROMETHEUM_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(QUADRILLUM_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(QUICKSILVER_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(RUNITE_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(SILVER_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(SLOWSILVER_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(STARRITE_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(STEEL_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(STORMYX_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(TANTALITE_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(TIN_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(TRUESILVER_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(UNOBTAINIUM_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(UR_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ZINC_BUSH, RenderLayer.getCutout());
	}
}