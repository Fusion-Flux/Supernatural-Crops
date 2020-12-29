package com.fusionflux.supernaturalcrops.blocks;

import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SupernaturalCropsScrapedStone {


    public static final CustomFarmland SCRAPED_STONE = new CustomFarmland(FabricBlockSettings.of(Material.STONE).hardness(1.5F).ticksRandomly());


    public static void registerScrapedStone() {

        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "scraped_stone"), SupernaturalCropsScrapedStone.SCRAPED_STONE);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "scraped_stone"), new BlockItem(SupernaturalCropsScrapedStone.SCRAPED_STONE, new Item.Settings().group(ItemGroup.DECORATIONS)));

    }
}

