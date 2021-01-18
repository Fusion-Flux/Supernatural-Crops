package com.fusionflux.supernaturalcrops.item.group;

import com.fusionflux.supernaturalcrops.item.SupernaturalCropsItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroups {
	public static final ItemGroup SUPERNATURAL_CROPS = FabricItemGroupBuilder.build(
			new Identifier("supernaturalcrops", "general"),
			() -> new ItemStack(SupernaturalCropsItems.SEED_OF_THE_ABYSS));
}
