package com.fusionflux.supernaturalcrops.blocks;

import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
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
    public static final CustomBush COAL_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),Items.COAL);
    public static final CustomBush IRON_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),Items.IRON_ORE);
    public static final CustomBush GOLD_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),Items.GOLD_ORE);
    public static final CustomBush DIAMOND_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),Items.DIAMOND);
    public static final CustomBush EMERALD_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),Items.EMERALD_ORE);
    public static final CustomBush NETHERITE_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),Items.NETHERITE_SCRAP);
    public static final CustomBush REDSTONE_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),Items.REDSTONE_ORE);
    public static final CustomBush LAPIS_LAZULI_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),Items.LAPIS_ORE);
    public static final CustomFarmland SCRAPED_STONE = new CustomFarmland(FabricBlockSettings.of(Material.STONE).hardness(1).ticksRandomly());

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "coal_bush"), SupernaturalCropsBlocks.COAL_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "coal_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.COAL_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.COAL_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "iron_bush"), SupernaturalCropsBlocks.IRON_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "iron_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.IRON_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.IRON_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "gold_bush"), SupernaturalCropsBlocks.GOLD_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "gold_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.GOLD_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.GOLD_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "diamond_bush"), SupernaturalCropsBlocks.DIAMOND_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "diamond_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.DIAMOND_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.DIAMOND_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "emerald_bush"), SupernaturalCropsBlocks.EMERALD_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "emerald_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.EMERALD_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.EMERALD_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "netherite_bush"), SupernaturalCropsBlocks.NETHERITE_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "netherite_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.NETHERITE_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.NETHERITE_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "redstone_bush"), SupernaturalCropsBlocks.REDSTONE_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "redstone_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.REDSTONE_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.REDSTONE_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "lapis_lazuli_bush"), SupernaturalCropsBlocks.LAPIS_LAZULI_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "lapis_lazuli_bush_seeds"), new BlockItem(SupernaturalCropsBlocks.LAPIS_LAZULI_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.LAPIS_LAZULI_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "scraped_stone"), SupernaturalCropsBlocks.SCRAPED_STONE);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "scraped_stone"), new BlockItem(SupernaturalCropsBlocks.SCRAPED_STONE, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }
}

