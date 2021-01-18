package com.fusionflux.supernaturalcrops.item;

import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks;
import com.fusionflux.supernaturalcrops.item.group.ItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SupernaturalCropsItems {

	public static final Item DIAMOND_SHARD = registerShard(new Item(new FabricItemSettings().group(ItemGroups.SUPERNATURAL_CROPS).fireproof()), "diamond_shard", Items.DIAMOND, false);
	public static final Item EMERALD_SHARD = registerShard(new Item(new FabricItemSettings().group(ItemGroups.SUPERNATURAL_CROPS).fireproof()), "emerald_shard", Items.EMERALD, false);
	public static final Item NETHERITE_FLAKE = registerShard(new Item(new FabricItemSettings().group(ItemGroups.SUPERNATURAL_CROPS).fireproof()), "netherite_flake", Items.NETHERITE_SCRAP, true);

	public static final Item SEED_OF_THE_ABYSS = new Item(new FabricItemSettings().group(ItemGroups.SUPERNATURAL_CROPS).fireproof());

	public static void register(){
		Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "seed_of_the_abyss"), SEED_OF_THE_ABYSS);
	}

	public static Item registerShard(Item shardItem, String shardPath, Item output, boolean isSpecialSnowflake) {
		Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, shardPath), shardItem);
		SupernaturalCropsBlocks.createRecipe(shardPath,
				isSpecialSnowflake ? "AA " : "AAA",
				isSpecialSnowflake ? "AA " : "AAA",
				isSpecialSnowflake ? "   " : "AAA",
				output,
				SupernaturalCropsBlocks.createKey("A", shardItem));
		return shardItem;
	}
}
