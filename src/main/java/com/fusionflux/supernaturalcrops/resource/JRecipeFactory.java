package com.fusionflux.supernaturalcrops.resource;

import net.devtech.arrp.json.recipe.*;
import net.minecraft.item.Item;

import java.util.Arrays;
import java.util.List;

public class JRecipeFactory {
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

    public static JIngredients createIngredients(Item... items) {
        JIngredients ingredients = JIngredients.ingredients();
        JIngredient ingredient = JIngredient.ingredient();
        for (Item item : items)
            ingredient.item(item);
        ingredients.add(ingredient);
        return ingredients;
    }

    public static JRecipe createSingle(Item input, Item result, int resultCount) {
        return JRecipe.shapeless(createIngredients(input), JResult.itemStack(result, resultCount));
    }

    public static JRecipe createSingle(Item input, Item result) {
        return JRecipe.shapeless(createIngredients(input), JResult.item(result));
    }

    public static JRecipe create2x2(String pat1, String pat2, Item result, int resultCount, KeyInfo... keys) {
        return JRecipe.shaped(JPattern.pattern(pat1, pat2), createRecipeKeys(keys), JResult.itemStack(result, resultCount));
    }

    public static JRecipe create2x2(String pat1, String pat2, Item result, KeyInfo... keys) {
        return JRecipe.shaped(JPattern.pattern(pat1, pat2), createRecipeKeys(keys), JResult.item(result));
    }

    public static JRecipe create3x3(String pat1, String pat2, String pat3, Item result, int resultCount, KeyInfo... keys) {
        return JRecipe.shaped(JPattern.pattern(pat1, pat2, pat3), createRecipeKeys(keys), JResult.itemStack(result, resultCount));
    }

    public static JRecipe create3x3(String pat1, String pat2, String pat3, Item result, KeyInfo... keys) {
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
