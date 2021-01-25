package com.fusionflux.supernaturalcrops.block;

import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.fusionflux.supernaturalcrops.item.group.ItemGroups;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ScrapedStoneBlock {
    public static final ScrapedStone SCRAPED_STONE = new ScrapedStone(FabricBlockSettings.of(Material.STONE).hardness(1.5F).ticksRandomly());

    public static void register() {

        Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "scraped_stone"), SCRAPED_STONE);
        Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "scraped_stone"), new BlockItem(SCRAPED_STONE, new Item.Settings().group(ItemGroups.SUPERNATURAL_CROPS)));
    }
}
