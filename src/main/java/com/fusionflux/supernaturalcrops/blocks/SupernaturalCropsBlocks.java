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
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SupernaturalCropsBlocks {
    public static final CustomBush COAL_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly(),Items.COAL);
    public static final CustomBush IRON_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly(),Items.IRON_INGOT);
    public static final CustomBush GOLD_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly(),Items.GOLD_INGOT);
    public static final CustomBush DIAMOND_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly(),Items.DIAMOND);
    public static final CustomBush NETHERITE_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly(),Items.NETHERITE_INGOT);
    public static final CustomBush REDSTONE_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly(),Items.REDSTONE);
    public static final CustomBush LAPIS_LAZULI_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly(),Items.LAPIS_LAZULI);
    public static final CustomFarmland FARMLANDTEST = new CustomFarmland(FabricBlockSettings.of(Material.STONE).hardness(1).ticksRandomly());

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "coal_bush"), SupernaturalCropsBlocks.COAL_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "coal_bush"), new BlockItem(SupernaturalCropsBlocks.COAL_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.COAL_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "iron_bush"), SupernaturalCropsBlocks.IRON_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "iron_bush"), new BlockItem(SupernaturalCropsBlocks.IRON_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.IRON_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "gold_bush"), SupernaturalCropsBlocks.GOLD_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "gold_bush"), new BlockItem(SupernaturalCropsBlocks.GOLD_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.GOLD_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "diamond_bush"), SupernaturalCropsBlocks.DIAMOND_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "diamond_bush"), new BlockItem(SupernaturalCropsBlocks.DIAMOND_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.DIAMOND_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "netherite_bush"), SupernaturalCropsBlocks.NETHERITE_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "netherite_bush"), new BlockItem(SupernaturalCropsBlocks.NETHERITE_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.NETHERITE_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "redstone_bush"), SupernaturalCropsBlocks.REDSTONE_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "redstone_bush"), new BlockItem(SupernaturalCropsBlocks.REDSTONE_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.REDSTONE_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "lapis_lazuli_bush"), SupernaturalCropsBlocks.LAPIS_LAZULI_BUSH);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "lapis_lazuli_bush"), new BlockItem(SupernaturalCropsBlocks.LAPIS_LAZULI_BUSH, new Item.Settings().group(ItemGroup.MISC)));
        BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.LAPIS_LAZULI_BUSH, RenderLayer.getCutout());
        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "farmlandtest"), SupernaturalCropsBlocks.FARMLANDTEST);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "farmlandtest"), new BlockItem(SupernaturalCropsBlocks.FARMLANDTEST, new Item.Settings().group(ItemGroup.MISC)));
    }
}

