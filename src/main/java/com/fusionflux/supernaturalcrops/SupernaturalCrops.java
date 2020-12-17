package com.fusionflux.supernaturalcrops;

import com.fusionflux.supernaturalcrops.blocks.SupernaturalCropsBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SupernaturalCrops implements ModInitializer {
	public static final String MOD_ID = "supernaturalcrops";
	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "iron_bush"), SupernaturalCropsBlocks.IRON_BUSH);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_bush"), new BlockItem(SupernaturalCropsBlocks.IRON_BUSH, new Item.Settings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "farmlandtest"), SupernaturalCropsBlocks.FARMLANDTEST);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "farmlandtest"), new BlockItem(SupernaturalCropsBlocks.FARMLANDTEST, new Item.Settings().group(ItemGroup.MISC)));
		BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.IRON_BUSH, RenderLayer.getCutout());
	}
}
