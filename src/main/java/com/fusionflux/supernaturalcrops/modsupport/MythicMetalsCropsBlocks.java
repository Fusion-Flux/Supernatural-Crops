package com.fusionflux.supernaturalcrops.modsupport;

import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.fusionflux.supernaturalcrops.blocks.CustomBush;
import com.fusionflux.supernaturalcrops.blocks.SupernaturalCropsBlocks;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nourl.mythicmetals.blocks.MythicMetalsBlocks;
import nourl.mythicmetals.registry.RegisterIngots;
import nourl.mythicmetals.registry.RegisterItems;
import nourl.mythicmetals.registry.RegisterNuggets;

public class MythicMetalsCropsBlocks {
	public static final CustomBush Adamantite_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Adamantite_CROP_NUGGETS.getValue() ? RegisterNuggets.Adamantite_Nugget : RegisterIngots.Adamantite_Ingot);
	public static final CustomBush Aetherium_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Aetherium_CROP_NUGGETS.getValue() ? RegisterNuggets.Aetherium_Nugget : RegisterIngots.Aetherium_Ingot);
	public static final CustomBush Aquarium_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Aquarium_CROP_NUGGETS.getValue() ? RegisterNuggets.Aquarium_Nugget : RegisterIngots.Aquarium_Ingot);
	public static final CustomBush Argonium_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Argonium_CROP_NUGGETS.getValue() ? RegisterNuggets.Argonium_Nugget : RegisterIngots.Argonium_Ingot);
	public static final CustomBush Banglum_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Banglum_CROP_NUGGETS.getValue() ? RegisterNuggets.Banglum_Nugget : RegisterIngots.Banglum_Ingot);
	public static final CustomBush MMBrass_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Brass_CROP_NUGGETS.getValue() ? RegisterNuggets.Brass_Nugget : RegisterIngots.Brass_Ingot);
	public static final CustomBush MMBronze_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Bronze_CROP_NUGGETS.getValue() ? RegisterNuggets.Bronze_Nugget : RegisterIngots.Bronze_Ingot);
	public static final CustomBush Carmot_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Carmot_CROP_NUGGETS.getValue() ? RegisterNuggets.Carmot_Nugget : RegisterIngots.Carmot_Ingot);
	public static final CustomBush Celestium_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Celestium_CROP_NUGGETS.getValue() ? RegisterNuggets.Celestium_Nugget : RegisterIngots.Celestium_Ingot);
	public static final CustomBush MMCopper_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Copper_CROP_NUGGETS.getValue() ? RegisterNuggets.Copper_Nugget : RegisterIngots.Copper_Ingot);
	public static final CustomBush Discordium_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Discordium_CROP_NUGGETS.getValue() ? RegisterNuggets.Discordium_Nugget : RegisterIngots.Discordium_Ingot);
	public static final CustomBush Durasteel_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Durasteel_CROP_NUGGETS.getValue() ? RegisterNuggets.Durasteel_Nugget : RegisterIngots.Durasteel_Ingot);
	public static final CustomBush MMElectrum_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Electrum_CROP_NUGGETS.getValue() ? RegisterNuggets.Electrum_Nugget : RegisterIngots.Electrum_Ingot);
	public static final CustomBush Etherite_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Etherite_CROP_NUGGETS.getValue() ? RegisterNuggets.Etherite_Nugget : RegisterIngots.Etherite_Ingot);
	public static final CustomBush Hallowed_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Hallowed_CROP_NUGGETS.getValue() ? RegisterNuggets.Hallowed_Nugget : RegisterIngots.Hallowed_Ingot);
	public static final CustomBush Kyber_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Kyber_CROP_NUGGETS.getValue() ? RegisterNuggets.Kyber_Nugget : RegisterIngots.Kyber_Ingot);
	public static final CustomBush Maganese_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Manganese_CROP_NUGGETS.getValue() ? RegisterNuggets.Manganese_Nugget : RegisterIngots.Manganese_Ingot);
	public static final CustomBush Metallurgium_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Metallurgium_CROP_NUGGETS.getValue() ? RegisterNuggets.Metallurgium_Nugget : RegisterIngots.Metallurgium_Ingot);
	public static final CustomBush Midas_Gold_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Midas_Gold_CROP_NUGGETS.getValue() ? RegisterNuggets.Midas_Gold_Nugget : RegisterIngots.Midas_Gold_Ingot);
	public static final CustomBush Mythril_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Mythril_CROP_NUGGETS.getValue() ? RegisterNuggets.Mythril_Nugget : RegisterIngots.Mythril_Ingot);
	public static final CustomBush Orichalcum_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Orichalcum_CROP_NUGGETS.getValue() ? RegisterNuggets.Orichalcum_Nugget : RegisterIngots.Orichalcum_Ingot);
	public static final CustomBush Osmium_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Osmium_CROP_NUGGETS.getValue() ? RegisterNuggets.Osmium_Nugget : RegisterIngots.Osmium_Ingot);
	public static final CustomBush Platinum_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Platinum_CROP_NUGGETS.getValue() ? RegisterNuggets.Platinum_Nugget : RegisterIngots.Platinum_Ingot);
	public static final CustomBush Prometheum_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Prometheum_CROP_NUGGETS.getValue() ? RegisterNuggets.Prometheum_Nugget : RegisterIngots.Prometheum_Ingot);
	public static final CustomBush Quadrillum_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Quadrillum_CROP_NUGGETS.getValue() ? RegisterNuggets.Quadrillum_Nugget : RegisterIngots.Quadrillum_Ingot);
	public static final CustomBush Quicksilver_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Quicksilver_CROP_NUGGETS.getValue() ? RegisterNuggets.Quicksilver_Nugget : RegisterIngots.Quicksilver_Ingot);
	public static final CustomBush Runite_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Runite_CROP_NUGGETS.getValue() ? RegisterNuggets.Runite_Nugget : RegisterIngots.Runite_Ingot);
	public static final CustomBush MMSilver_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Silver_CROP_NUGGETS.getValue() ? RegisterNuggets.Silver_Nugget : RegisterIngots.Silver_Ingot);
	public static final CustomBush Slowsilver_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Slowsilver_CROP_NUGGETS.getValue() ? RegisterNuggets.Slowsilver_Nugget : RegisterIngots.Slowsilver_Ingot);
	public static final CustomBush Starrite_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Starrite_CROP_NUGGETS.getValue() ? RegisterNuggets.Starrite_Nugget : RegisterIngots.Starrite_Ingot);
	public static final CustomBush MMSteel_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Steel_CROP_NUGGETS.getValue() ? RegisterNuggets.Steel_Nugget : RegisterIngots.Steel_Ingot);
	public static final CustomBush Stormyx_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Stormyx_CROP_NUGGETS.getValue() ? RegisterNuggets.Stormyx_Nugget : RegisterIngots.Stormyx_Ingot);
	public static final CustomBush Tantalite_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Tantalite_CROP_NUGGETS.getValue() ? RegisterNuggets.Tantalite_Nugget : RegisterIngots.Tantalite_Ingot);
	public static final CustomBush Tin_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Tin_CROP_NUGGETS.getValue() ? RegisterNuggets.Tin_Nugget : RegisterIngots.Tin_Ingot);
	public static final CustomBush Truesilver_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Truesilver_CROP_NUGGETS.getValue() ? RegisterNuggets.Truesilver_Nugget : RegisterIngots.Truesilver_Ingot);
	public static final CustomBush Unobtanium_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Unobtainium_CROP_NUGGETS.getValue() ? RegisterNuggets.Unobtainium_Nugget : RegisterIngots.Unobtainium_Ingot);
	public static final CustomBush Ur_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Ur_CROP_NUGGETS.getValue() ? RegisterNuggets.Ur_Nugget : RegisterIngots.Ur_Ingot);
	public static final CustomBush MMZinc_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Zinc_CROP_NUGGETS.getValue() ? RegisterNuggets.Zinc_Nugget : RegisterIngots.Zinc_Ingot);

	public static void registerBlocks() {
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Adamantite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("adamantite_bush", MythicMetalsCropsBlocks.Adamantite_BUSH, RegisterItems.Adamantite_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Aetherium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("aetherium_bush", MythicMetalsCropsBlocks.Aetherium_BUSH, RegisterItems.Aetherium_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Aquarium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("aquarium_bush", MythicMetalsCropsBlocks.Aquarium_BUSH, RegisterItems.Aquarium_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Argonium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("argonium_bush", MythicMetalsCropsBlocks.Argonium_BUSH, RegisterItems.Argonium_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Banglum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("banglum_bush", MythicMetalsCropsBlocks.Banglum_BUSH, RegisterItems.Banglum_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Brass_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mmbrass_bush", MythicMetalsCropsBlocks.MMBrass_BUSH, RegisterItems.Brass_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Bronze_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mmbronze_bush", MythicMetalsCropsBlocks.MMBronze_BUSH, RegisterItems.Bronze_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Carmot_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("carmot_bush", MythicMetalsCropsBlocks.Carmot_BUSH, RegisterItems.Carmot_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Celestium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("celestium_bush", MythicMetalsCropsBlocks.Celestium_BUSH, RegisterItems.Celestium_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Copper_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mmcopper_bush", MythicMetalsCropsBlocks.MMCopper_BUSH, RegisterItems.Copper_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Discordium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("discordium_bush", MythicMetalsCropsBlocks.Discordium_BUSH, RegisterItems.Discordium_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Durasteel_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("durasteel_bush", MythicMetalsCropsBlocks.Durasteel_BUSH, RegisterItems.Durasteel_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Electrum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mmelectrum_bush", MythicMetalsCropsBlocks.MMElectrum_BUSH, RegisterItems.Electrum_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Etherite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("etherite_bush", MythicMetalsCropsBlocks.Etherite_BUSH, RegisterItems.Etherite_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Hallowed_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("hallowed_bush", MythicMetalsCropsBlocks.Hallowed_BUSH, RegisterItems.Hallowed_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Kyber_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("kyber_bush", MythicMetalsCropsBlocks.Kyber_BUSH, RegisterItems.Kyber_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Manganese_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("manganese_bush", MythicMetalsCropsBlocks.Maganese_BUSH, RegisterItems.Manganese_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Metallurgium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("metallurgium_bush", MythicMetalsCropsBlocks.Metallurgium_BUSH, MythicMetalsBlocks.METALLURGIUM_BLOCK.asItem());
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Midas_Gold_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("midas_gold_bush", MythicMetalsCropsBlocks.Midas_Gold_BUSH, Items.BEDROCK);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Mythril_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mythril_bush", MythicMetalsCropsBlocks.Mythril_BUSH, RegisterItems.Mythril_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Orichalcum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("orichalcum_bush", MythicMetalsCropsBlocks.Orichalcum_BUSH, RegisterItems.Orichalcum_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Osmium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("osmium_bush", MythicMetalsCropsBlocks.Osmium_BUSH, RegisterItems.Osmium_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Platinum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("platinum_bush", MythicMetalsCropsBlocks.Platinum_BUSH, RegisterItems.Platinum_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Prometheum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("prometheum_bush", MythicMetalsCropsBlocks.Prometheum_BUSH, RegisterItems.Prometheum_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Quadrillum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("quadrillum_bush", MythicMetalsCropsBlocks.Quadrillum_BUSH, RegisterItems.Quadrillum_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Quicksilver_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("quicksilver_bush", MythicMetalsCropsBlocks.Quicksilver_BUSH, RegisterItems.Quicksilver_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Runite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("runite_bush", MythicMetalsCropsBlocks.Runite_BUSH, RegisterItems.Runite_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Silver_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mmsilver_bush", MythicMetalsCropsBlocks.MMSilver_BUSH, RegisterItems.Silver_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Slowsilver_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("slowsilver_bush", MythicMetalsCropsBlocks.Slowsilver_BUSH, RegisterItems.Slowsilver_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Starrite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("starrite_bush", MythicMetalsCropsBlocks.Starrite_BUSH, RegisterItems.Starrite_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Steel_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mmsteel_bush", MythicMetalsCropsBlocks.MMSteel_BUSH, RegisterItems.Steel_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Stormyx_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("stormyx_bush", MythicMetalsCropsBlocks.Stormyx_BUSH, RegisterItems.Stormyx_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Tantalite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("tantalite_bush", MythicMetalsCropsBlocks.Tantalite_BUSH, RegisterItems.Tantalite_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Tin_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("tin_bush", MythicMetalsCropsBlocks.Tin_BUSH, RegisterItems.Tin_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Truesilver_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("truesilver_bush", MythicMetalsCropsBlocks.Truesilver_BUSH, RegisterItems.Truesilver_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Unobtainium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("unobtainium_bush", MythicMetalsCropsBlocks.Unobtanium_BUSH, RegisterItems.Unobtainium_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Ur_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("ur_bush", MythicMetalsCropsBlocks.Ur_BUSH, RegisterItems.Ur_Dust);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Zinc_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush("mmzinc_bush", MythicMetalsCropsBlocks.MMZinc_BUSH, RegisterItems.Zinc_Dust);
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