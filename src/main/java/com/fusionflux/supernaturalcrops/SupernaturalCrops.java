package com.fusionflux.supernaturalcrops;

import com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import com.fusionflux.supernaturalcrops.datafixer.SupernaturalCropsDataFixer;
import com.fusionflux.supernaturalcrops.item.SupernaturalCropsItems;
import com.fusionflux.supernaturalcrops.modsupport.*;
import com.fusionflux.supernaturalcrops.resource.SupernaturalCropsResources;
import com.fusionflux.supernaturalcrops.world.feature.SupernaturalCropsFeatures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SupernaturalCrops implements ModInitializer {
	public static final String MOD_ID = "supernaturalcrops";

	public static final Logger LOGGER = LogManager.getLogger("Supernatural Crops");

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		SupernaturalCropsConfig.register();
		SupernaturalCropsItems.register();
		SupernaturalCropsBlocks.register();
		SupernaturalCropsFeatures.register();
		SupernaturalCropsResources.register();
		SupernaturalCropsDataFixer.register();

		if (FabricLoader.getInstance().isModLoaded("mythicmetals"))
			MythicMetalsCropsBlocks.registerBlocks();
		if (FabricLoader.getInstance().isModLoaded("betterend"))
			BetterEndCropsBlocks.registerBlocks();
		if (FabricLoader.getInstance().isModLoaded("betternether"))
			BetterNetherCropsBlocks.registerBlocks();
		if (FabricLoader.getInstance().isModLoaded("techreborn"))
			TechRebornCropsBlocks.registerBlocks();
		if (FabricLoader.getInstance().isModLoaded("lint"))
			LintCropsBlocks.registerBlocks();
		if (FabricLoader.getInstance().isModLoaded("appliedenergistics2"))
			AE2CropsBlocks.registerBlocks();
	}
}
