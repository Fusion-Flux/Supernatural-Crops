package com.fusionflux.supernaturalcrops.modsupport;

import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.fusionflux.supernaturalcrops.blocks.CustomBush;
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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nourl.mythicmetals.registry.RegisterIngots;
import nourl.mythicmetals.registry.RegisterNuggets;

public class MythicMetalsCropsBlocks {
    public static final CustomBush Adamantite_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Adamantite_CROP_NUGGETS.getValue() ? RegisterNuggets.Adamantite_Nugget : RegisterIngots.Adamantite_Ingot);
    public static final CustomBush Aetherium_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Aetherium_CROP_NUGGETS.getValue() ? RegisterNuggets.Aetherium_Nugget : RegisterIngots.Aetherium_Ingot);
    public static final CustomBush Aquarium_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Aquarium_CROP_NUGGETS.getValue() ? RegisterNuggets.Aquarium_Nugget : RegisterIngots.Aquarium_Ingot);
    public static final CustomBush Argonium_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Argonium_CROP_NUGGETS.getValue() ? RegisterNuggets.Argonium_Nugget : RegisterIngots.Argonium_Ingot);
    public static final CustomBush Banglum_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Banglum_CROP_NUGGETS.getValue() ? RegisterNuggets.Banglum_Nugget : RegisterIngots.Banglum_Ingot);
    public static final CustomBush Brass_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Brass_CROP_NUGGETS.getValue() ? RegisterNuggets.Brass_Nugget : RegisterIngots.Brass_Ingot);
    public static final CustomBush Bronze_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Bronze_CROP_NUGGETS.getValue() ? RegisterNuggets.Bronze_Nugget : RegisterIngots.Bronze_Ingot);
    public static final CustomBush Carmot_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Carmot_CROP_NUGGETS.getValue() ? RegisterNuggets.Carmot_Nugget : RegisterIngots.Carmot_Ingot);
    public static final CustomBush Celestium_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Celestium_CROP_NUGGETS.getValue() ? RegisterNuggets.Celestium_Nugget : RegisterIngots.Celestium_Ingot);
    public static final CustomBush Copper_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Copper_CROP_NUGGETS.getValue() ? RegisterNuggets.Copper_Nugget : RegisterIngots.Copper_Ingot);
    public static final CustomBush Discordium_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Discordium_CROP_NUGGETS.getValue() ? RegisterNuggets.Discordium_Nugget : RegisterIngots.Discordium_Ingot);
    public static final CustomBush Durasteel_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Durasteel_CROP_NUGGETS.getValue() ? RegisterNuggets.Durasteel_Nugget : RegisterIngots.Durasteel_Ingot);
    public static final CustomBush Electrum_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Electrum_CROP_NUGGETS.getValue() ? RegisterNuggets.Electrum_Nugget : RegisterIngots.Electrum_Ingot);
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
    public static final CustomBush Silver_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Silver_CROP_NUGGETS.getValue() ? RegisterNuggets.Silver_Nugget : RegisterIngots.Silver_Ingot);
    public static final CustomBush Slowsilver_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Slowsilver_CROP_NUGGETS.getValue() ? RegisterNuggets.Slowsilver_Nugget : RegisterIngots.Slowsilver_Ingot);
    public static final CustomBush Starrite_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Starrite_CROP_NUGGETS.getValue() ? RegisterNuggets.Starrite_Nugget : RegisterIngots.Starrite_Ingot);
    public static final CustomBush Steel_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Steel_CROP_NUGGETS.getValue() ? RegisterNuggets.Steel_Nugget : RegisterIngots.Steel_Ingot);
    public static final CustomBush Stormyx_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Stormyx_CROP_NUGGETS.getValue() ? RegisterNuggets.Stormyx_Nugget : RegisterIngots.Stormyx_Ingot);
    public static final CustomBush Tantalite_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Tantalite_CROP_NUGGETS.getValue() ? RegisterNuggets.Tantalite_Nugget : RegisterIngots.Tantalite_Ingot);
    public static final CustomBush Tin_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Tin_CROP_NUGGETS.getValue() ? RegisterNuggets.Tin_Nugget : RegisterIngots.Tin_Ingot);
    public static final CustomBush Truesilver_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Truesilver_CROP_NUGGETS.getValue() ? RegisterNuggets.Truesilver_Nugget : RegisterIngots.Truesilver_Ingot);
    public static final CustomBush Unobtanium_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Unobtainium_CROP_NUGGETS.getValue() ? RegisterNuggets.Unobtainium_Nugget : RegisterIngots.Unobtainium_Ingot);
    public static final CustomBush Ur_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Ur_CROP_NUGGETS.getValue() ? RegisterNuggets.Ur_Nugget : RegisterIngots.Ur_Ingot);
    public static final CustomBush Zinc_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.ENABLE_Zinc_CROP_NUGGETS.getValue() ? RegisterNuggets.Zinc_Nugget : RegisterIngots.Zinc_Ingot);

    public static void registerBlocks() {
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Adamantite_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "adamantite_bush"), MythicMetalsCropsBlocks.Adamantite_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "adamantite_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Adamantite_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Aetherium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "aetherium_bush"), MythicMetalsCropsBlocks.Aetherium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "aetherium_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Aetherium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Aquarium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "aquarium_bush"), MythicMetalsCropsBlocks.Aquarium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "aquarium_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Aquarium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Argonium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "argonium_bush"), MythicMetalsCropsBlocks.Argonium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "argonium_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Argonium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Banglum_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "banglum_bush"), MythicMetalsCropsBlocks.Banglum_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "banglum_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Banglum_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Brass_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "brass_bush"), MythicMetalsCropsBlocks.Brass_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "brass_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Brass_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Bronze_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "bronze_bush"), MythicMetalsCropsBlocks.Bronze_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "bronze_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Bronze_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Carmot_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "carmot_bush"), MythicMetalsCropsBlocks.Carmot_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "carmot_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Carmot_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Celestium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "celestium_bush"), MythicMetalsCropsBlocks.Celestium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "celestium_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Celestium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Copper_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "copper_bush"), MythicMetalsCropsBlocks.Copper_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "copper_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Copper_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Discordium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "discordium_bush"), MythicMetalsCropsBlocks.Discordium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "discordium_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Discordium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Durasteel_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "durasteel_bush"), MythicMetalsCropsBlocks.Durasteel_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "durasteel_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Durasteel_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Electrum_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "electrum_bush"), MythicMetalsCropsBlocks.Electrum_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "electrum_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Electrum_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Etherite_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "etherite_bush"), MythicMetalsCropsBlocks.Etherite_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "etherite_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Etherite_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Hallowed_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "hallowed_bush"), MythicMetalsCropsBlocks.Hallowed_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "hallowed_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Hallowed_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Kyber_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "kyber_bush"), MythicMetalsCropsBlocks.Kyber_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "kyber_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Kyber_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Manganese_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "manganese_bush"), MythicMetalsCropsBlocks.Maganese_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "manganese_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Maganese_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Metallurgium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "metallurgium_bush"), MythicMetalsCropsBlocks.Metallurgium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "metallurgium_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Metallurgium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Midas_Gold_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "midas_gold_bush"), MythicMetalsCropsBlocks.Midas_Gold_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "midas_gold_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Midas_Gold_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Mythril_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "mythril_bush"), MythicMetalsCropsBlocks.Mythril_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "mythril_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Mythril_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Orichalcum_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "orichalcum_bush"), MythicMetalsCropsBlocks.Orichalcum_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "orichalcum_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Orichalcum_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Osmium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "osmium_bush"), MythicMetalsCropsBlocks.Osmium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "osmium_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Osmium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Platinum_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "platinum_bush"), MythicMetalsCropsBlocks.Platinum_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "platinum_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Platinum_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Prometheum_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "prometheum_bush"), MythicMetalsCropsBlocks.Prometheum_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "prometheum_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Prometheum_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Quadrillum_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "quadrillum_bush"), MythicMetalsCropsBlocks.Quadrillum_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "quadrillum_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Quadrillum_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Quicksilver_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "quicksilver_bush"), MythicMetalsCropsBlocks.Quicksilver_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "quicksilver_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Quicksilver_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Runite_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "runite_bush"), MythicMetalsCropsBlocks.Runite_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "runite_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Runite_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Silver_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "silver_bush"), MythicMetalsCropsBlocks.Silver_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "silver_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Silver_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Slowsilver_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "slowsilver_bush"), MythicMetalsCropsBlocks.Slowsilver_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "slowsilver_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Slowsilver_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Starrite_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "starrite_bush"), MythicMetalsCropsBlocks.Starrite_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "starrite_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Starrite_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Steel_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "steel_bush"), MythicMetalsCropsBlocks.Steel_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "steel_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Steel_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Stormyx_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "stormyx_bush"), MythicMetalsCropsBlocks.Stormyx_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "stormyx_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Stormyx_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Tantalite_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "tantalite_bush"), MythicMetalsCropsBlocks.Tantalite_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "tantalite_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Tantalite_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Tin_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "tin_bush"), MythicMetalsCropsBlocks.Tin_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "tin_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Tin_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Truesilver_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "truesilver_bush"), MythicMetalsCropsBlocks.Truesilver_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "truesilver_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Truesilver_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Unobtainium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "unobtainium_bush"), MythicMetalsCropsBlocks.Unobtanium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "unobtainium_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Unobtanium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Ur_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "ur_bush"), MythicMetalsCropsBlocks.Ur_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "ur_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Ur_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Zinc_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "zinc_bush"), MythicMetalsCropsBlocks.Zinc_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "zinc_bush_seeds"), new BlockItem(MythicMetalsCropsBlocks.Zinc_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
    }
    @Environment(EnvType.CLIENT)
    public static void registerRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Adamantite_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Aetherium_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Aquarium_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Argonium_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Banglum_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Brass_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Bronze_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Carmot_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Celestium_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Copper_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Discordium_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Durasteel_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Electrum_BUSH, RenderLayer.getCutout());
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
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Silver_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Slowsilver_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Starrite_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Steel_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Stormyx_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Tantalite_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Tin_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Truesilver_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Unobtanium_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Ur_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MythicMetalsCropsBlocks.Zinc_BUSH, RenderLayer.getCutout());
    }
}