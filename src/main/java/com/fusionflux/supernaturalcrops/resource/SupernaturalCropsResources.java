package com.fusionflux.supernaturalcrops.resource;

import com.fusionflux.supernaturalcrops.OreBush;
import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks;
import com.fusionflux.supernaturalcrops.item.SupernaturalCropsItems;
import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;

import static com.fusionflux.supernaturalcrops.SupernaturalCrops.id;

public class SupernaturalCropsResources {
    private static final RuntimeResourcePack RESOURCE_PACK = RuntimeResourcePack.create(SupernaturalCrops.MOD_ID + ":runtime");

    public static void register() {
        registerLootTables();
        registerRecipes();
        registerBushResources(SupernaturalCropsBlocks.OreBushes.values());
        RRPCallback.EVENT.register(a -> a.add(RESOURCE_PACK));
    }

    public static void registerBushResources(OreBush... bushes) {
        for (OreBush bush : bushes) {
            registerBushLootTable(bush);
            registerBushRecipes(bush);
        }
    }

    private static void registerLootTables() {
        RESOURCE_PACK.addLootTable(id("blocks/embedded_abyss"), JLootTableFactory.createSimpleBlock(id("seeds_of_the_abyss")));
        RESOURCE_PACK.addLootTable(id("blocks/scraped_stone"),
                JLootTableFactory.createSimpleBlock(Registry.BLOCK.getId(Blocks.STONE)));
    }

    private static void registerBushLootTable(OreBush bush) {
        RESOURCE_PACK.addLootTable(id("blocks/" + bush.getPath()),
                JLootTableFactory.createPlantBlock(bush.getBlockId(), 3, bush.getSeedsId(), bush.getHarvestResultId()));
    }

    private static void registerRecipes() {
        RESOURCE_PACK.addRecipe(id("diamond_from_shards"), JRecipeFactory.create2x2(
                "SS",
                "SS",
                Items.DIAMOND,
                JRecipeFactory.key("S", SupernaturalCropsItems.DIAMOND_SHARD)));
        RESOURCE_PACK.addRecipe(id("emerald_from_shards"), JRecipeFactory.create2x2(
                "SS",
                "SS",
                Items.EMERALD,
                JRecipeFactory.key("S", SupernaturalCropsItems.EMERALD_SHARD)));
        RESOURCE_PACK.addRecipe(id("netherite_scrap_from_flakes"), JRecipeFactory.create3x3(
                "FFF",
                "FFF",
                "FFF",
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
        RESOURCE_PACK.addRecipe(id(bush.getIngotId().getPath() + "_from_seed"), JRecipeFactory.createSingle(
                bush.getSeeds(), bush.getIngot(), 8
        ));
    }

}
