package com.fusionflux.supernaturalcrops.modsupport;

import com.fusionflux.supernaturalcrops.block.OreBushBlock;
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
	public static final OreBushBlock Adamantite_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Adamantite_CROP_NUGGETS.getValue() ? RegisterNuggets.Adamantite_Nugget : RegisterIngots.Adamantite_Ingot);
	public static final OreBushBlock Aetherium_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Aetherium_CROP_NUGGETS.getValue() ? RegisterNuggets.Aetherium_Nugget : RegisterIngots.Aetherium_Ingot);
	public static final OreBushBlock Aquarium_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Aquarium_CROP_NUGGETS.getValue() ? RegisterNuggets.Aquarium_Nugget : RegisterIngots.Aquarium_Ingot);
	public static final OreBushBlock Argonium_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Argonium_CROP_NUGGETS.getValue() ? RegisterNuggets.Argonium_Nugget : RegisterIngots.Argonium_Ingot);
	public static final OreBushBlock Banglum_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Banglum_CROP_NUGGETS.getValue() ? RegisterNuggets.Banglum_Nugget : RegisterIngots.Banglum_Ingot);
	public static final OreBushBlock MMBrass_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Brass_CROP_NUGGETS.getValue() ? RegisterNuggets.Brass_Nugget : RegisterIngots.Brass_Ingot);
	public static final OreBushBlock MMBronze_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Bronze_CROP_NUGGETS.getValue() ? RegisterNuggets.Bronze_Nugget : RegisterIngots.Bronze_Ingot);
	public static final OreBushBlock Carmot_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Carmot_CROP_NUGGETS.getValue() ? RegisterNuggets.Carmot_Nugget : RegisterIngots.Carmot_Ingot);
	public static final OreBushBlock Celestium_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Celestium_CROP_NUGGETS.getValue() ? RegisterNuggets.Celestium_Nugget : RegisterIngots.Celestium_Ingot);
	public static final OreBushBlock MMCopper_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Copper_CROP_NUGGETS.getValue() ? RegisterNuggets.Copper_Nugget : RegisterIngots.Copper_Ingot);
	public static final OreBushBlock Discordium_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Discordium_CROP_NUGGETS.getValue() ? RegisterNuggets.Discordium_Nugget : RegisterIngots.Discordium_Ingot);
	public static final OreBushBlock Durasteel_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Durasteel_CROP_NUGGETS.getValue() ? RegisterNuggets.Durasteel_Nugget : RegisterIngots.Durasteel_Ingot);
	public static final OreBushBlock MMElectrum_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Electrum_CROP_NUGGETS.getValue() ? RegisterNuggets.Electrum_Nugget : RegisterIngots.Electrum_Ingot);
	public static final OreBushBlock Etherite_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Etherite_CROP_NUGGETS.getValue() ? RegisterNuggets.Etherite_Nugget : RegisterIngots.Etherite_Ingot);
	public static final OreBushBlock Hallowed_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Hallowed_CROP_NUGGETS.getValue() ? RegisterNuggets.Hallowed_Nugget : RegisterIngots.Hallowed_Ingot);
	public static final OreBushBlock Kyber_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Kyber_CROP_NUGGETS.getValue() ? RegisterNuggets.Kyber_Nugget : RegisterIngots.Kyber_Ingot);
	public static final OreBushBlock Maganese_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Manganese_CROP_NUGGETS.getValue() ? RegisterNuggets.Manganese_Nugget : RegisterIngots.Manganese_Ingot);
	public static final OreBushBlock Metallurgium_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Metallurgium_CROP_NUGGETS.getValue() ? RegisterNuggets.Metallurgium_Nugget : RegisterIngots.Metallurgium_Ingot);
	public static final OreBushBlock Midas_Gold_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Midas_Gold_CROP_NUGGETS.getValue() ? RegisterNuggets.Midas_Gold_Nugget : RegisterIngots.Midas_Gold_Ingot);
	public static final OreBushBlock Mythril_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Mythril_CROP_NUGGETS.getValue() ? RegisterNuggets.Mythril_Nugget : RegisterIngots.Mythril_Ingot);
	public static final OreBushBlock Orichalcum_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Orichalcum_CROP_NUGGETS.getValue() ? RegisterNuggets.Orichalcum_Nugget : RegisterIngots.Orichalcum_Ingot);
	public static final OreBushBlock Osmium_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Osmium_CROP_NUGGETS.getValue() ? RegisterNuggets.Osmium_Nugget : RegisterIngots.Osmium_Ingot);
	public static final OreBushBlock Platinum_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Platinum_CROP_NUGGETS.getValue() ? RegisterNuggets.Platinum_Nugget : RegisterIngots.Platinum_Ingot);
	public static final OreBushBlock Prometheum_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Prometheum_CROP_NUGGETS.getValue() ? RegisterNuggets.Prometheum_Nugget : RegisterIngots.Prometheum_Ingot);
	public static final OreBushBlock Quadrillum_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Quadrillum_CROP_NUGGETS.getValue() ? RegisterNuggets.Quadrillum_Nugget : RegisterIngots.Quadrillum_Ingot);
	public static final OreBushBlock Quicksilver_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Quicksilver_CROP_NUGGETS.getValue() ? RegisterNuggets.Quicksilver_Nugget : RegisterIngots.Quicksilver_Ingot);
	public static final OreBushBlock Runite_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Runite_CROP_NUGGETS.getValue() ? RegisterNuggets.Runite_Nugget : RegisterIngots.Runite_Ingot);
	public static final OreBushBlock MMSilver_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Silver_CROP_NUGGETS.getValue() ? RegisterNuggets.Silver_Nugget : RegisterIngots.Silver_Ingot);
	public static final OreBushBlock Slowsilver_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Slowsilver_CROP_NUGGETS.getValue() ? RegisterNuggets.Slowsilver_Nugget : RegisterIngots.Slowsilver_Ingot);
	public static final OreBushBlock Starrite_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Starrite_CROP_NUGGETS.getValue() ? RegisterNuggets.Starrite_Nugget : RegisterIngots.Starrite_Ingot);
	public static final OreBushBlock MMSteel_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Steel_CROP_NUGGETS.getValue() ? RegisterNuggets.Steel_Nugget : RegisterIngots.Steel_Ingot);
	public static final OreBushBlock Stormyx_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Stormyx_CROP_NUGGETS.getValue() ? RegisterNuggets.Stormyx_Nugget : RegisterIngots.Stormyx_Ingot);
	public static final OreBushBlock Tantalite_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Tantalite_CROP_NUGGETS.getValue() ? RegisterNuggets.Tantalite_Nugget : RegisterIngots.Tantalite_Ingot);
	public static final OreBushBlock Tin_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Tin_CROP_NUGGETS.getValue() ? RegisterNuggets.Tin_Nugget : RegisterIngots.Tin_Ingot);
	public static final OreBushBlock Truesilver_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Truesilver_CROP_NUGGETS.getValue() ? RegisterNuggets.Truesilver_Nugget : RegisterIngots.Truesilver_Ingot);
	public static final OreBushBlock Unobtanium_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Unobtainium_CROP_NUGGETS.getValue() ? RegisterNuggets.Unobtainium_Nugget : RegisterIngots.Unobtainium_Ingot);
	public static final OreBushBlock Ur_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Ur_CROP_NUGGETS.getValue() ? RegisterNuggets.Ur_Nugget : RegisterIngots.Ur_Ingot);
	public static final OreBushBlock MMZinc_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Zinc_CROP_NUGGETS.getValue() ? RegisterNuggets.Zinc_Nugget : RegisterIngots.Zinc_Ingot);

	public static void registerBlocks() {
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Adamantite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Adamantite_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Aetherium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Aetherium_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Aquarium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Aquarium_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Argonium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Argonium_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Banglum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Banglum_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Brass_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.MMBrass_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Bronze_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.MMBronze_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Carmot_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Carmot_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Celestium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Celestium_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Copper_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.MMCopper_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Discordium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Discordium_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Durasteel_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Durasteel_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Electrum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.MMElectrum_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Etherite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Etherite_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Hallowed_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Hallowed_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Kyber_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Kyber_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Manganese_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Maganese_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Metallurgium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Metallurgium_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Midas_Gold_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Midas_Gold_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Mythril_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Mythril_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Orichalcum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Orichalcum_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Osmium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Osmium_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Platinum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Platinum_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Prometheum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Prometheum_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Quadrillum_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Quadrillum_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Quicksilver_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Quicksilver_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Runite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Runite_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Silver_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.MMSilver_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Slowsilver_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Slowsilver_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Starrite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Starrite_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Steel_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.MMSteel_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Stormyx_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Stormyx_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Tantalite_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Tantalite_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Tin_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Tin_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Truesilver_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Truesilver_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Unobtainium_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Unobtanium_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Ur_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.Ur_BUSH);
		}
		if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Zinc_CROPS.getValue()) {
			SupernaturalCropsBlocks.registerBush(MythicMetalsCropsBlocks.MMZinc_BUSH);
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