package com.fusionflux.supernaturalcrops.client;

import com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks;
import com.fusionflux.supernaturalcrops.modsupport.BetterEndCropsBlocks;
import com.fusionflux.supernaturalcrops.modsupport.BetterNetherCropsBlocks;
import com.fusionflux.supernaturalcrops.modsupport.MythicMetalsCropsBlocks;
import com.fusionflux.supernaturalcrops.modsupport.TechRebornCropsBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class SupernaturalCropsClientModInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        SupernaturalCropsBlocks.registerRenderLayers();
        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
            MythicMetalsCropsBlocks.registerRenderLayers();
        }
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            BetterEndCropsBlocks.registerRenderLayers();
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            BetterNetherCropsBlocks.registerRenderLayers();
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            TechRebornCropsBlocks.registerRenderLayers();
        }
    }
}

