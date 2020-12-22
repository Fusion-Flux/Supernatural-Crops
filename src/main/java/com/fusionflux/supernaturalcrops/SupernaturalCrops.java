package com.fusionflux.supernaturalcrops;

import com.fusionflux.supernaturalcrops.blocks.SupernaturalCropsBlocks;
import net.fabricmc.api.ModInitializer;

public class SupernaturalCrops implements ModInitializer {
	public static final String MOD_ID = "supernaturalcrops";



	@Override
	public void onInitialize() {
		SupernaturalCropsBlocks.registerBlocks();
	}
}
