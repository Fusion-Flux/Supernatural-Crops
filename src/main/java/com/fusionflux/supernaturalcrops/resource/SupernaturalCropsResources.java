package com.fusionflux.supernaturalcrops.resource;

import com.fusionflux.supernaturalcrops.OreBush;
import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import com.fusionflux.supernaturalcrops.item.SupernaturalCropsItems;
import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.fusionflux.supernaturalcrops.SupernaturalCrops.id;

public class SupernaturalCropsResources {
    private static final RuntimeResourcePack RESOURCE_PACK = RuntimeResourcePack.create(SupernaturalCrops.MOD_ID + ":runtime");

    public static void register() {
        RRPCallback.EVENT.register(a -> a.add(RESOURCE_PACK));
        registerLootTables();
        registerRecipes();
        registerBushResources(SupernaturalCropsBlocks.OreBushes.values());
    }

    public static void registerBushResources(OreBush... bushes) {
        for (OreBush bush : bushes) {
            registerBushLootTable(bush);
            registerBushRecipes(bush);
        }
    }

    public static Identifier getBlockLootTableId(Block block) {
        return id("blocks/" + Registry.BLOCK.getId(block).getPath());
    }

    private static void registerLootTables() {
        RESOURCE_PACK.addLootTable(getBlockLootTableId(SupernaturalCropsBlocks.EMBEDDED_ABYSS),
                JLootTableFactory.createSimpleBlock(Registry.ITEM.getId(SupernaturalCropsItems.SEED_OF_THE_ABYSS)));
        RESOURCE_PACK.addLootTable(getBlockLootTableId(SupernaturalCropsBlocks.SCRAPED_STONE),
                JLootTableFactory.createSimpleBlock(Registry.ITEM.getId(Items.STONE)));
    }

    private static void registerBushLootTable(OreBush bush) {
        RESOURCE_PACK.addLootTable(id("blocks/" + bush.getPath()),
                JLootTableFactory.createSimpleBlock(bush.getSeedsId()));
    }

    private static void registerRecipes() {
        RESOURCE_PACK.addRecipe(id("diamond_from_shards"), JRecipeFactory.create3x3(
                "SSS",
                "SSS",
                "SSS",
                Items.DIAMOND,
                JRecipeFactory.key("S", SupernaturalCropsItems.DIAMOND_SHARD)));
        RESOURCE_PACK.addRecipe(id("emerald_from_shards"), JRecipeFactory.create3x3(
                "SSS",
                "SSS",
                "SSS",
                Items.EMERALD,
                JRecipeFactory.key("S", SupernaturalCropsItems.EMERALD_SHARD)));
        RESOURCE_PACK.addRecipe(id("netherite_scrap_from_flakes"), JRecipeFactory.create2x2(
                "FF",
                "FF",
                Items.NETHERITE_SCRAP,
                JRecipeFactory.key("F", SupernaturalCropsItems.NETHERITE_FLAKE)));
    }

    private static void registerBushRecipes(OreBush bush) {
        if (bush.isEnabled()) {
            // craft seeds
            RESOURCE_PACK.addRecipe(bush.getSeedsId(), JRecipeFactory.create3x3(
                    "RRR",
                    "RSR",
                    "RRR",
                    bush.getSeeds(),
                    JRecipeFactory.key("S", SupernaturalCropsItems.SEED_OF_THE_ABYSS),
                    JRecipeFactory.key("R", bush.getIngot())
            ));
        }

        // uncraft seeds
        switch (SupernaturalCropsConfig.get().general.uncraftingRecipe) {
        case TO_SEED:
            RESOURCE_PACK.addRecipe(id(bush.getIngotId().getPath() + "_from_seed"), JRecipeFactory.createSingle(
                    bush.getSeeds(), SupernaturalCropsItems.SEED_OF_THE_ABYSS
            ));
            break;
        case TO_INGOTS_AND_SEED:
        case TO_INGOTS:
            RESOURCE_PACK.addRecipe(id(bush.getIngotId().getPath() + "_from_seed"), JRecipeFactory.createSingle(
                    bush.getSeeds(), bush.getIngot(), 8
            ));
        case OFF:
            break;
        }
    }

}
