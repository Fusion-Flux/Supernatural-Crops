package com.fusionflux.supernaturalcrops.item.group;

import com.fusionflux.supernaturalcrops.item.SupernaturalCropsItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import static com.fusionflux.supernaturalcrops.SupernaturalCrops.id;

public class SupernaturalCropsItemGroups {
	public static final ItemGroup GENERAL = FabricItemGroupBuilder.build(id("general"),
			() -> new ItemStack(SupernaturalCropsItems.SEED_OF_THE_ABYSS));
}
