package com.fusionflux.supernaturalcrops.blocks;

import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import com.fusionflux.supernaturalcrops.modsupport.BetterEndCropsBlocks;
import com.fusionflux.supernaturalcrops.modsupport.BetterNetherCropsBlocks;
import com.fusionflux.supernaturalcrops.modsupport.MythicMetalsCropsBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

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
    }
}

