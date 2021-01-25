package com.fusionflux.supernaturalcrops.resource;

import com.fusionflux.supernaturalcrops.OreBush;
import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.fusionflux.supernaturalcrops.VanillaOreBushes;
import com.fusionflux.supernaturalcrops.item.SupernaturalCropsItems;
import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.devtech.arrp.json.loot.JLootTable;
import net.devtech.arrp.json.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.List;

import static com.fusionflux.supernaturalcrops.SupernaturalCrops.id;

public class SupernaturalCropsResources {
    private static final RuntimeResourcePack RESOURCE_PACK = RuntimeResourcePack.create(SupernaturalCrops.MOD_ID + ":runtime");

    public static void register() {
        registerLootTables();
        registerRecipes();
        RRPCallback.EVENT.register(a -> a.add(RESOURCE_PACK));
    }

    private static void registerLootTables() {
        RESOURCE_PACK.addLootTable(id("blocks/embedded_abyss"), createSimpleBlockLootTable(id("seeds_of_the_abyss")));
        for (OreBush bush : VanillaOreBushes.values())
            registerBushLootTable(bush);
    }

    public static JLootTable createSimpleBlockLootTable(Identifier itemId) {
        return JLootTable.loot("minecraft:block")
                .pool(JLootTable.pool()
                        .rolls(1)
                        .entry(JLootTable.entry()
                                .type("minecraft:item")
                                .name(itemId.toString()))
                    .condition(JLootTable.predicate("minecraft:survives_explosion")));
    }

    public static void registerBushLootTable(OreBush bush) {
        RESOURCE_PACK.addLootTable(id("blocks/" + bush.getPath()), createSimpleBlockLootTable(bush.getSeedsId()));
    }

    private static void registerRecipes() {
        for (OreBush bush : VanillaOreBushes.values())
            registerBushRecipe(bush);

        RESOURCE_PACK.addRecipe(id("diamond_from_shards"), createRecipe2x2(
                "SS",
                "SS",
                Items.DIAMOND,
                key("S", SupernaturalCropsItems.DIAMOND_SHARD)));
        RESOURCE_PACK.addRecipe(id("emerald_from_shards"), createRecipe2x2(
                "SS",
                "SS",
                Items.EMERALD,
                key("S", SupernaturalCropsItems.EMERALD_SHARD)));
        RESOURCE_PACK.addRecipe(id("netherite_scrap_from_flakes"), createRecipe3x3(
                "FFF",
                "FFF",
                "FFF",
                Items.NETHERITE_SCRAP,
                key("F", SupernaturalCropsItems.NETHERITE_FLAKE)));
    }

    public static void registerBushRecipe(OreBush bush) {
        if (bush.isEnabled()) {
            RESOURCE_PACK.addRecipe(bush.getSeedsId(), createRecipe3x3(
                    "RRR",
                    "RSR",
                    "RRR",
                    bush.getSeeds(),
                    key("S", SupernaturalCropsItems.SEED_OF_THE_ABYSS),
                    key("R", bush.getIngot())
            ));
        }
    }

    public static JKeys createRecipeKeys(KeyInfo... keys) {
        JKeys jKeys = JKeys.keys();
        for (KeyInfo key : keys) {
            JIngredient ingredient = JIngredient.ingredient();
            for (Item item : key.items)
                ingredient.item(item);
            jKeys.key(key.name, ingredient);
        }
        return jKeys;
    }

    public static JRecipe createRecipe2x2(String pat1, String pat2, Item result, KeyInfo... keys) {
        return JRecipe.shaped(JPattern.pattern(pat1, pat2), createRecipeKeys(keys), JResult.item(result));
    }

    public static JRecipe createRecipe3x3(String pat1, String pat2, String pat3, Item result, KeyInfo... keys) {
        return JRecipe.shaped(JPattern.pattern(pat1, pat2, pat3), createRecipeKeys(keys), JResult.item(result));
    }

    public static KeyInfo key(String name, Item... items) {
        return new KeyInfo(name, Arrays.asList(items));
    }

    public static final class KeyInfo {
        public final String name;
        public final List<Item> items;

        private KeyInfo(String name, List<Item> items) {
            this.name = name;
            this.items = items;
        }
    }
}
