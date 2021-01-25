package com.fusionflux.supernaturalcrops;

import com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import com.fusionflux.supernaturalcrops.item.SupernaturalCropsItems;
import com.fusionflux.supernaturalcrops.modsupport.*;
import com.fusionflux.supernaturalcrops.resource.SupernaturalCropsResources;
import com.fusionflux.supernaturalcrops.world.feature.SupernaturalCropsFeatures;
import com.oroarmor.config.ConfigItemGroup;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SupernaturalCrops implements ModInitializer {
	public static final String MOD_ID = "supernaturalcrops";

	public static final SupernaturalCropsConfig CONFIG = new SupernaturalCropsConfig();

	public static final Logger LOGGER = LogManager.getLogger("Supernatural Crops");

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		readConfig();
		SupernaturalCropsItems.register();
		SupernaturalCropsBlocks.register();
		SupernaturalCropsFeatures.register();
		SupernaturalCropsResources.register();

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
	}

	private void readConfig() {
		CONFIG.readConfigFromFile();

		if (SupernaturalCropsConfig.ENABLED.ENABLED_CONFIG_PRINT.getValue()) {
			CONFIG.getConfigs().stream().map(ConfigItemGroup::getConfigs)
					.forEach(l -> l.forEach(ci -> LOGGER.info(ci.toString())));
		}

		ServerLifecycleEvents.SERVER_STOPPED.register(l -> CONFIG.saveConfigToFile());
	}
}
