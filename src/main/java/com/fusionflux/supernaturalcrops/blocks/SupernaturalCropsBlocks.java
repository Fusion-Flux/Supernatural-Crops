package com.fusionflux.supernaturalcrops.blocks;

import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nourl.mythicmetals.MythicMetals;
import nourl.mythicmetals.blocks.MythicMetalsAnvils;
import nourl.mythicmetals.blocks.MythicMetalsBlocks;
import nourl.mythicmetals.ores.MythicMetalsOres;
import nourl.mythicmetals.registry.RegisterIngots;
import nourl.mythicmetals.registry.RegisterNuggets;
import nourl.mythicmetals.tools.MythicMetalsToolMaterials;

public class SupernaturalCropsBlocks {

    public static final Item DIAMOND_SHARD = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof());

    public static final Item EMERALD_SHARD = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof());

    public static final Item NETHERITE_FLAKE = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof());

    public static final CustomBush COAL_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), Items.COAL);

    public static final CustomBush IRON_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_IRON_CROP_NUGGETS.getValue() ? Items.IRON_NUGGET : Items.IRON_INGOT);

    public static final CustomBush GOLD_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_GOLD_CROP_NUGGETS.getValue() ? Items.GOLD_NUGGET : Items.GOLD_INGOT);

    public static final CustomBush DIAMOND_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_DIAMOND_CROP_NUGGETS.getValue() ? SupernaturalCropsBlocks.DIAMOND_SHARD : Items.DIAMOND);

    public static final CustomBush EMERALD_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_EMERALD_CROP_NUGGETS.getValue() ? SupernaturalCropsBlocks.EMERALD_SHARD : Items.EMERALD);

    public static final CustomBush NETHERITE_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_NETHERITE_CROP_NUGGETS.getValue() ? SupernaturalCropsBlocks.NETHERITE_FLAKE : Items.NETHERITE_SCRAP);

    public static final CustomBush REDSTONE_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),Items.REDSTONE);

    public static final CustomBush LAPIS_LAZULI_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),Items.LAPIS_LAZULI);

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
    public static final Block EMBEDDED_ABYSS = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.4F));
    public static final Item SEED_OF_THE_ABYSS = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof());

    public static void registerBlocks() {
        if (SupernaturalCropsConfig.ENABLED.ENABLE_COAL_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "coal_bush"), SupernaturalCropsBlocks.COAL_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "coal_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.COAL_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.ENABLED.ENABLE_IRON_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "iron_bush"), SupernaturalCropsBlocks.IRON_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "iron_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.IRON_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.ENABLED.ENABLE_GOLD_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "gold_bush"), SupernaturalCropsBlocks.GOLD_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "gold_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.GOLD_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.ENABLED.ENABLE_DIAMOND_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "diamond_bush"), SupernaturalCropsBlocks.DIAMOND_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "diamond_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.DIAMOND_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.ENABLED.ENABLE_EMERALD_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "emerald_bush"), SupernaturalCropsBlocks.EMERALD_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "emerald_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.EMERALD_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.ENABLED.ENABLE_NETHERITE_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "netherite_bush"), SupernaturalCropsBlocks.NETHERITE_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "netherite_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.NETHERITE_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.ENABLED.ENABLE_REDSTONE_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "redstone_bush"), SupernaturalCropsBlocks.REDSTONE_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "redstone_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.REDSTONE_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.ENABLED.ENABLE_LAPIS_LAZULI_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "lapis_lazuli_bush"), SupernaturalCropsBlocks.LAPIS_LAZULI_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "lapis_lazuli_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.LAPIS_LAZULI_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Adamantite_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "adamantite_bush"), SupernaturalCropsBlocks.Adamantite_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "adamantite_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Adamantite_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Aetherium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "aetherium_bush"), SupernaturalCropsBlocks.Aetherium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "aetherium_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Aetherium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Aquarium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "aquarium_bush"), SupernaturalCropsBlocks.Aquarium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "aquarium_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Aquarium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Argonium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "argonium_bush"), SupernaturalCropsBlocks.Argonium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "argonium_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Argonium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Banglum_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "banglum_bush"), SupernaturalCropsBlocks.Banglum_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "banglum_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Banglum_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Brass_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "brass_bush"), SupernaturalCropsBlocks.Brass_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "brass_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Brass_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Bronze_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "bronze_bush"), SupernaturalCropsBlocks.Bronze_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "bronze_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Bronze_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Carmot_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "carmot_bush"), SupernaturalCropsBlocks.Carmot_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "carmot_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Carmot_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Celestium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "celestium_bush"), SupernaturalCropsBlocks.Celestium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "celestium_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Celestium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Copper_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "copper_bush"), SupernaturalCropsBlocks.Copper_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "copper_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Copper_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Discordium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "discordium_bush"), SupernaturalCropsBlocks.Discordium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "discordium_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Discordium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Durasteel_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "durasteel_bush"), SupernaturalCropsBlocks.Durasteel_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "durasteel_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Durasteel_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Electrum_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "electrum_bush"), SupernaturalCropsBlocks.Electrum_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "electrum_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Electrum_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Etherite_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "etherite_bush"), SupernaturalCropsBlocks.Etherite_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "etherite_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Etherite_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Hallowed_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "hallowed_bush"), SupernaturalCropsBlocks.Hallowed_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "hallowed_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Hallowed_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Kyber_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "kyber_bush"), SupernaturalCropsBlocks.Kyber_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "kyber_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Kyber_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Manganese_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "manganese_bush"), SupernaturalCropsBlocks.Maganese_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "manganese_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Maganese_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Metallurgium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "metallurgium_bush"), SupernaturalCropsBlocks.Metallurgium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "metallurgium_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Metallurgium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Midas_Gold_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "midas_gold_bush"), SupernaturalCropsBlocks.Midas_Gold_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "midas_gold_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Midas_Gold_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Mythril_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "mythril_bush"), SupernaturalCropsBlocks.Mythril_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "mythril_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Mythril_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Orichalcum_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "orichalcum_bush"), SupernaturalCropsBlocks.Orichalcum_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "orichalcum_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Orichalcum_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Osmium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "osmium_bush"), SupernaturalCropsBlocks.Osmium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "osmium_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Osmium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Platinum_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "platinum_bush"), SupernaturalCropsBlocks.Platinum_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "platinum_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Platinum_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Prometheum_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "prometheum_bush"), SupernaturalCropsBlocks.Prometheum_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "prometheum_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Prometheum_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Quadrillum_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "quadrillum_bush"), SupernaturalCropsBlocks.Quadrillum_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "quadrillum_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Quadrillum_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Quicksilver_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "quicksilver_bush"), SupernaturalCropsBlocks.Quicksilver_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "quicksilver_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Quicksilver_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Runite_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "runite_bush"), SupernaturalCropsBlocks.Runite_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "runite_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Runite_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Silver_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "silver_bush"), SupernaturalCropsBlocks.Silver_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "silver_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Silver_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Slowsilver_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "slowsilver_bush"), SupernaturalCropsBlocks.Slowsilver_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "slowsilver_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Slowsilver_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Starrite_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "starrite_bush"), SupernaturalCropsBlocks.Starrite_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "starrite_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Starrite_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Steel_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "steel_bush"), SupernaturalCropsBlocks.Steel_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "steel_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Steel_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Stormyx_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "stormyx_bush"), SupernaturalCropsBlocks.Stormyx_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "stormyx_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Stormyx_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Tantalite_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "tantalite_bush"), SupernaturalCropsBlocks.Tantalite_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "tantalite_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Tantalite_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Tin_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "tin_bush"), SupernaturalCropsBlocks.Tin_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "tin_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Tin_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Truesilver_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "truesilver_bush"), SupernaturalCropsBlocks.Truesilver_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "truesilver_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Truesilver_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Unobtainium_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "unobtainium_bush"), SupernaturalCropsBlocks.Unobtanium_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "unobtainium_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Unobtanium_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Ur_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "ur_bush"), SupernaturalCropsBlocks.Ur_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "ur_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Ur_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }
        if (SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.ENABLE_Zinc_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "zinc_bush"), SupernaturalCropsBlocks.Zinc_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "zinc_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.Zinc_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        }

        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "embedded_abyss"), SupernaturalCropsBlocks.EMBEDDED_ABYSS);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "embedded_abyss"), new BlockItem(SupernaturalCropsBlocks.EMBEDDED_ABYSS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "seed_of_the_abyss"), SEED_OF_THE_ABYSS);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "diamond_shard"), DIAMOND_SHARD);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "emerald_shard"), EMERALD_SHARD);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "netherite_flake"), NETHERITE_FLAKE);
    }

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.LAPIS_LAZULI_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.REDSTONE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.NETHERITE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.EMERALD_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.DIAMOND_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.GOLD_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.IRON_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.COAL_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Adamantite_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Aetherium_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Aquarium_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Argonium_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Banglum_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Brass_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Bronze_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Carmot_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Celestium_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Copper_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Discordium_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Durasteel_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Electrum_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Etherite_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Hallowed_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Kyber_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Maganese_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Metallurgium_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Midas_Gold_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Mythril_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Orichalcum_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Osmium_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Platinum_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Prometheum_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Quadrillum_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Quicksilver_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Runite_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Silver_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Slowsilver_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Starrite_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Steel_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Stormyx_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Tantalite_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Tin_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Truesilver_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Unobtanium_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Ur_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.Zinc_BUSH, RenderLayer.getCutout());
    }
}

