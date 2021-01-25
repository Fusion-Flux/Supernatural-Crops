package com.fusionflux.supernaturalcrops.item;

import com.fusionflux.supernaturalcrops.item.group.ItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static com.fusionflux.supernaturalcrops.SupernaturalCrops.id;

public class SupernaturalCropsItems {
	public static final Item DIAMOND_SHARD = new Item(new FabricItemSettings().group(ItemGroups.SUPERNATURAL_CROPS).fireproof());
	public static final Item EMERALD_SHARD = new Item(new FabricItemSettings().group(ItemGroups.SUPERNATURAL_CROPS).fireproof());
	public static final Item NETHERITE_FLAKE = new Item(new FabricItemSettings().group(ItemGroups.SUPERNATURAL_CROPS).fireproof());
	public static final Item SEED_OF_THE_ABYSS = new Item(new FabricItemSettings().group(ItemGroups.SUPERNATURAL_CROPS).fireproof());

	public static void register(){
		Registry.register(Registry.ITEM, id("diamond_shard"), DIAMOND_SHARD);
		Registry.register(Registry.ITEM, id("emerald_shard"), EMERALD_SHARD);
		Registry.register(Registry.ITEM, id("netherite_flake"), NETHERITE_FLAKE);
		Registry.register(Registry.ITEM, id("seed_of_the_abyss"), SEED_OF_THE_ABYSS);
	}
}
