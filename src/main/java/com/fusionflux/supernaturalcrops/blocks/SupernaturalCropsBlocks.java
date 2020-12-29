package com.fusionflux.supernaturalcrops.blocks;

import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
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

public class SupernaturalCropsBlocks {

    public static final Item DIAMOND_SHARD = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof());

    public static final Item EMERALD_SHARD = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof());

    public static final Item NETHERITE_FLAKE = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof());

    public static final CustomBush COAL_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH));

    public static final CustomBush IRON_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH));

    public static final CustomBush GOLD_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH));

    public static final CustomBush DIAMOND_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH));

    public static final CustomBush EMERALD_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH));

    public static final CustomBush NETHERITE_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH));

    public static final CustomBush REDSTONE_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH));

    public static final CustomBush LAPIS_LAZULI_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH));

    public static final CustomFarmland SCRAPED_STONE = new CustomFarmland(FabricBlockSettings.of(Material.STONE).hardness(1.5F).ticksRandomly());
    public static final Block EMBEDDED_ABYSS = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.4F));
    public static final Item SEED_OF_THE_ABYSS = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof());

    public static void registerBlocks() {
        if (SupernaturalCropsConfig.ENABLED.ENABLE_COAL_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "coal_bush"), SupernaturalCropsBlocks.COAL_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "coal_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.COAL_BUSH, new Item.Settings().group(ItemGroup.MISC)));
            BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.COAL_BUSH, RenderLayer.getCutout());
        }
        if (SupernaturalCropsConfig.ENABLED.ENABLE_IRON_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "iron_bush"), SupernaturalCropsBlocks.IRON_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "iron_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.IRON_BUSH, new Item.Settings().group(ItemGroup.MISC)));
            BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.IRON_BUSH, RenderLayer.getCutout());
        }
        if (SupernaturalCropsConfig.ENABLED.ENABLE_GOLD_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "gold_bush"), SupernaturalCropsBlocks.GOLD_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "gold_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.GOLD_BUSH, new Item.Settings().group(ItemGroup.MISC)));
            BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.GOLD_BUSH, RenderLayer.getCutout());
        }
        if (SupernaturalCropsConfig.ENABLED.ENABLE_DIAMOND_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "diamond_bush"), SupernaturalCropsBlocks.DIAMOND_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "diamond_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.DIAMOND_BUSH, new Item.Settings().group(ItemGroup.MISC)));
            BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.DIAMOND_BUSH, RenderLayer.getCutout());
        }
        if (SupernaturalCropsConfig.ENABLED.ENABLE_EMERALD_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "emerald_bush"), SupernaturalCropsBlocks.EMERALD_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "emerald_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.EMERALD_BUSH, new Item.Settings().group(ItemGroup.MISC)));
            BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.EMERALD_BUSH, RenderLayer.getCutout());
        }
        if (SupernaturalCropsConfig.ENABLED.ENABLE_NETHERITE_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "netherite_bush"), SupernaturalCropsBlocks.NETHERITE_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "netherite_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.NETHERITE_BUSH, new Item.Settings().group(ItemGroup.MISC)));
            BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.NETHERITE_BUSH, RenderLayer.getCutout());
        }
        if (SupernaturalCropsConfig.ENABLED.ENABLE_REDSTONE_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "redstone_bush"), SupernaturalCropsBlocks.REDSTONE_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "redstone_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.REDSTONE_BUSH, new Item.Settings().group(ItemGroup.MISC)));
            BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.REDSTONE_BUSH, RenderLayer.getCutout());
        }
        if (SupernaturalCropsConfig.ENABLED.ENABLE_LAPIS_LAZULI_CROPS.getValue()) {
            Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "lapis_lazuli_bush"), SupernaturalCropsBlocks.LAPIS_LAZULI_BUSH);
            Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "lapis_lazuli_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.LAPIS_LAZULI_BUSH, new Item.Settings().group(ItemGroup.MISC)));
            BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.LAPIS_LAZULI_BUSH, RenderLayer.getCutout());
        }
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "scraped_stone"), SupernaturalCropsBlocks.SCRAPED_STONE);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "scraped_stone"), new BlockItem(SupernaturalCropsBlocks.SCRAPED_STONE, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "embedded_abyss"), SupernaturalCropsBlocks.EMBEDDED_ABYSS);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "embedded_abyss"), new BlockItem(SupernaturalCropsBlocks.EMBEDDED_ABYSS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "seed_of_the_abyss"), SEED_OF_THE_ABYSS);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "diamond_shard"), DIAMOND_SHARD);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "emerald_shard"), EMERALD_SHARD);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "netherite_flake"), NETHERITE_FLAKE);
    }
}

