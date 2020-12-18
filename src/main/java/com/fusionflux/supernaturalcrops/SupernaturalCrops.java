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
		SupernaturalCropsBlocks.registerBlocks();
	}
}
