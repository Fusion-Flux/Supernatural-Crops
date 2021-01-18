package com.fusionflux.supernaturalcrops.modsupport;

import com.fusionflux.supernaturalcrops.block.OreBush;
import com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;
import nourl.mythicmetals.registry.RegisterIngots;
import nourl.mythicmetals.registry.RegisterNuggets;

public class MythicMetalsCropsBlocks {
	public static final OreBush Adamantite_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Adamantite_CROP_NUGGETS.getValue() ? RegisterNuggets.Adamantite_Nugget : RegisterIngots.Adamantite_Ingot);
	public static final OreBush Aetherium_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Aetherium_CROP_NUGGETS.getValue() ? RegisterNuggets.Aetherium_Nugget : RegisterIngots.Aetherium_Ingot);
	public static final OreBush Aquarium_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Aquarium_CROP_NUGGETS.getValue() ? RegisterNuggets.Aquarium_Nugget : RegisterIngots.Aquarium_Ingot);
	public static final OreBush Argonium_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Argonium_CROP_NUGGETS.getValue() ? RegisterNuggets.Argonium_Nugget : RegisterIngots.Argonium_Ingot);
	public static final OreBush Banglum_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Banglum_CROP_NUGGETS.getValue() ? RegisterNuggets.Banglum_Nugget : RegisterIngots.Banglum_Ingot);
	public static final OreBush MMBrass_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Brass_CROP_NUGGETS.getValue() ? RegisterNuggets.Brass_Nugget : RegisterIngots.Brass_Ingot);
	public static final OreBush MMBronze_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Bronze_CROP_NUGGETS.getValue() ? RegisterNuggets.Bronze_Nugget : RegisterIngots.Bronze_Ingot);
	public static final OreBush Carmot_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Carmot_CROP_NUGGETS.getValue() ? RegisterNuggets.Carmot_Nugget : RegisterIngots.Carmot_Ingot);
	public static final OreBush Celestium_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Celestium_CROP_NUGGETS.getValue() ? RegisterNuggets.Celestium_Nugget : RegisterIngots.Celestium_Ingot);
	public static final OreBush MMCopper_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Copper_CROP_NUGGETS.getValue() ? RegisterNuggets.Copper_Nugget : RegisterIngots.Copper_Ingot);
	public static final OreBush Discordium_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Discordium_CROP_NUGGETS.getValue() ? RegisterNuggets.Discordium_Nugget : RegisterIngots.Discordium_Ingot);
	public static final OreBush Durasteel_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Durasteel_CROP_NUGGETS.getValue() ? RegisterNuggets.Durasteel_Nugget : RegisterIngots.Durasteel_Ingot);
	public static final OreBush MMElectrum_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Electrum_CROP_NUGGETS.getValue() ? RegisterNuggets.Electrum_Nugget : RegisterIngots.Electrum_Ingot);
	public static final OreBush Etherite_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Etherite_CROP_NUGGETS.getValue() ? RegisterNuggets.Etherite_Nugget : RegisterIngots.Etherite_Ingot);
	public static final OreBush Hallowed_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Hallowed_CROP_NUGGETS.getValue() ? RegisterNuggets.Hallowed_Nugget : RegisterIngots.Hallowed_Ingot);
	public static final OreBush Kyber_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Kyber_CROP_NUGGETS.getValue() ? RegisterNuggets.Kyber_Nugget : RegisterIngots.Kyber_Ingot);
	public static final OreBush Maganese_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Manganese_CROP_NUGGETS.getValue() ? RegisterNuggets.Manganese_Nugget : RegisterIngots.Manganese_Ingot);
	public static final OreBush Metallurgium_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Metallurgium_CROP_NUGGETS.getValue() ? RegisterNuggets.Metallurgium_Nugget : RegisterIngots.Metallurgium_Ingot);
	public static final OreBush Midas_Gold_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Midas_Gold_CROP_NUGGETS.getValue() ? RegisterNuggets.Midas_Gold_Nugget : RegisterIngots.Midas_Gold_Ingot);
	public static final OreBush Mythril_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Mythril_CROP_NUGGETS.getValue() ? RegisterNuggets.Mythril_Nugget : RegisterIngots.Mythril_Ingot);
	public static final OreBush Orichalcum_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Orichalcum_CROP_NUGGETS.getValue() ? RegisterNuggets.Orichalcum_Nugget : RegisterIngots.Orichalcum_Ingot);
	public static final OreBush Osmium_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Osmium_CROP_NUGGETS.getValue() ? RegisterNuggets.Osmium_Nugget : RegisterIngots.Osmium_Ingot);
	public static final OreBush Platinum_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Platinum_CROP_NUGGETS.getValue() ? RegisterNuggets.Platinum_Nugget : RegisterIngots.Platinum_Ingot);
	public static final OreBush Prometheum_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Prometheum_CROP_NUGGETS.getValue() ? RegisterNuggets.Prometheum_Nugget : RegisterIngots.Prometheum_Ingot);
	public static final OreBush Quadrillum_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Quadrillum_CROP_NUGGETS.getValue() ? RegisterNuggets.Quadrillum_Nugget : RegisterIngots.Quadrillum_Ingot);
	public static final OreBush Quicksilver_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Quicksilver_CROP_NUGGETS.getValue() ? RegisterNuggets.Quicksilver_Nugget : RegisterIngots.Quicksilver_Ingot);
	public static final OreBush Runite_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Runite_CROP_NUGGETS.getValue() ? RegisterNuggets.Runite_Nugget : RegisterIngots.Runite_Ingot);
	public static final OreBush MMSilver_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Silver_CROP_NUGGETS.getValue() ? RegisterNuggets.Silver_Nugget : RegisterIngots.Silver_Ingot);
	public static final OreBush Slowsilver_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Slowsilver_CROP_NUGGETS.getValue() ? RegisterNuggets.Slowsilver_Nugget : RegisterIngots.Slowsilver_Ingot);
	public static final OreBush Starrite_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Starrite_CROP_NUGGETS.getValue() ? RegisterNuggets.Starrite_Nugget : RegisterIngots.Starrite_Ingot);
	public static final OreBush MMSteel_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Steel_CROP_NUGGETS.getValue() ? RegisterNuggets.Steel_Nugget : RegisterIngots.Steel_Ingot);
	public static final OreBush Stormyx_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Stormyx_CROP_NUGGETS.getValue() ? RegisterNuggets.Stormyx_Nugget : RegisterIngots.Stormyx_Ingot);
	public static final OreBush Tantalite_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Tantalite_CROP_NUGGETS.getValue() ? RegisterNuggets.Tantalite_Nugget : RegisterIngots.Tantalite_Ingot);
	public static final OreBush Tin_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Tin_CROP_NUGGETS.getValue() ? RegisterNuggets.Tin_Nugget : RegisterIngots.Tin_Ingot);
	public static final OreBush Truesilver_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Truesilver_CROP_NUGGETS.getValue() ? RegisterNuggets.Truesilver_Nugget : RegisterIngots.Truesilver_Ingot);
	public static final OreBush Unobtanium_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Unobtainium_CROP_NUGGETS.getValue() ? RegisterNuggets.Unobtainium_Nugget : RegisterIngots.Unobtainium_Ingot);
	public static final OreBush Ur_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Ur_CROP_NUGGETS.getValue() ? RegisterNuggets.Ur_Nugget : RegisterIngots.Ur_Ingot);
	public static final OreBush MMZinc_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Zinc_CROP_NUGGETS.getValue() ? RegisterNuggets.Zinc_Nugget : RegisterIngots.Zinc_Ingot);

	public static void registerBlocks() {
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Adamantite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("adamantite_bush", MythicMetalsCropsBlocks.Adamantite_BUSH, RegisterIngots.Adamantite_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Aetherium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("aetherium_bush", MythicMetalsCropsBlocks.Aetherium_BUSH, RegisterIngots.Aetherium_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Aquarium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("aquarium_bush", MythicMetalsCropsBlocks.Aquarium_BUSH, RegisterIngots.Aquarium_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Argonium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("argonium_bush", MythicMetalsCropsBlocks.Argonium_BUSH, RegisterIngots.Argonium_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Banglum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("banglum_bush", MythicMetalsCropsBlocks.Banglum_BUSH, RegisterIngots.Banglum_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Brass_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mmbrass_bush", MythicMetalsCropsBlocks.MMBrass_BUSH, RegisterIngots.Brass_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Bronze_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mmbronze_bush", MythicMetalsCropsBlocks.MMBronze_BUSH, RegisterIngots.Bronze_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Carmot_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("carmot_bush", MythicMetalsCropsBlocks.Carmot_BUSH, RegisterIngots.Carmot_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Celestium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("celestium_bush", MythicMetalsCropsBlocks.Celestium_BUSH, RegisterIngots.Celestium_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Copper_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mmcopper_bush", MythicMetalsCropsBlocks.MMCopper_BUSH, RegisterIngots.Copper_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Discordium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("discordium_bush", MythicMetalsCropsBlocks.Discordium_BUSH, RegisterIngots.Discordium_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Durasteel_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("durasteel_bush", MythicMetalsCropsBlocks.Durasteel_BUSH, RegisterIngots.Durasteel_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Electrum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mmelectrum_bush", MythicMetalsCropsBlocks.MMElectrum_BUSH, RegisterIngots.Electrum_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Etherite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("etherite_bush", MythicMetalsCropsBlocks.Etherite_BUSH, RegisterIngots.Etherite_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Hallowed_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("hallowed_bush", MythicMetalsCropsBlocks.Hallowed_BUSH, RegisterIngots.Hallowed_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Kyber_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("kyber_bush", MythicMetalsCropsBlocks.Kyber_BUSH, RegisterIngots.Kyber_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Manganese_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("manganese_bush", MythicMetalsCropsBlocks.Maganese_BUSH, RegisterIngots.Manganese_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Metallurgium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("metallurgium_bush", MythicMetalsCropsBlocks.Metallurgium_BUSH, RegisterIngots.Metallurgium_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Midas_Gold_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("midas_gold_bush", MythicMetalsCropsBlocks.Midas_Gold_BUSH, RegisterIngots.Midas_Gold_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Mythril_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mythril_bush", MythicMetalsCropsBlocks.Mythril_BUSH, RegisterIngots.Mythril_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Orichalcum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("orichalcum_bush", MythicMetalsCropsBlocks.Orichalcum_BUSH, RegisterIngots.Orichalcum_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Osmium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("osmium_bush", MythicMetalsCropsBlocks.Osmium_BUSH, RegisterIngots.Osmium_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Platinum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("platinum_bush", MythicMetalsCropsBlocks.Platinum_BUSH, RegisterIngots.Platinum_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Prometheum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("prometheum_bush", MythicMetalsCropsBlocks.Prometheum_BUSH, RegisterIngots.Prometheum_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Quadrillum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("quadrillum_bush", MythicMetalsCropsBlocks.Quadrillum_BUSH, RegisterIngots.Quadrillum_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Quicksilver_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("quicksilver_bush", MythicMetalsCropsBlocks.Quicksilver_BUSH, RegisterIngots.Quicksilver_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Runite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("runite_bush", MythicMetalsCropsBlocks.Runite_BUSH, RegisterIngots.Runite_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Silver_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mmsilver_bush", MythicMetalsCropsBlocks.MMSilver_BUSH, RegisterIngots.Silver_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Slowsilver_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("slowsilver_bush", MythicMetalsCropsBlocks.Slowsilver_BUSH, RegisterIngots.Slowsilver_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Starrite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("starrite_bush", MythicMetalsCropsBlocks.Starrite_BUSH, RegisterIngots.Starrite_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Steel_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mmsteel_bush", MythicMetalsCropsBlocks.MMSteel_BUSH, RegisterIngots.Steel_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Stormyx_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("stormyx_bush", MythicMetalsCropsBlocks.Stormyx_BUSH, RegisterIngots.Stormyx_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Tantalite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("tantalite_bush", MythicMetalsCropsBlocks.Tantalite_BUSH, RegisterIngots.Tantalite_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Tin_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("tin_bush", MythicMetalsCropsBlocks.Tin_BUSH, RegisterIngots.Tin_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Truesilver_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("truesilver_bush", MythicMetalsCropsBlocks.Truesilver_BUSH, RegisterIngots.Truesilver_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Unobtainium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("unobtainium_bush", MythicMetalsCropsBlocks.Unobtanium_BUSH, RegisterIngots.Unobtainium_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Ur_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("ur_bush", MythicMetalsCropsBlocks.Ur_BUSH, RegisterIngots.Ur_Ingot);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Zinc_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mmzinc_bush", MythicMetalsCropsBlocks.MMZinc_BUSH, RegisterIngots.Zinc_Ingot);
		}
	}

	@Environment(EnvType.CLIENT)
	public static void registerRenderLayers() {
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Adamantite_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Aetherium_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Aquarium_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Argonium_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Banglum_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.MMBrass_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.MMBronze_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Carmot_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Celestium_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.MMCopper_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Discordium_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Durasteel_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.MMElectrum_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Etherite_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Hallowed_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Kyber_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Maganese_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Metallurgium_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Midas_Gold_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Mythril_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Orichalcum_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Osmium_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Platinum_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Prometheum_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Quadrillum_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Quicksilver_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Runite_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.MMSilver_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Slowsilver_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Starrite_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.MMSteel_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Stormyx_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Tantalite_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Tin_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Truesilver_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Unobtanium_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Ur_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.MMZinc_BUSH, RenderLayer.getCutout());
	}
}