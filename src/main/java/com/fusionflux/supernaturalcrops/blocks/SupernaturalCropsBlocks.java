package com.fusionflux.supernaturalcrops.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.item.Items;

public class SupernaturalCropsBlocks {
    public static final CustomBush IRON_BUSH = new CustomBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly(),Items.IRON_INGOT);
    public static final CustomFarmland FARMLANDTEST = new CustomFarmland(FabricBlockSettings.of(Material.STONE).hardness(1).ticksRandomly());
}
