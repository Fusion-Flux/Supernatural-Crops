package com.fusionflux.supernaturalcrops.resource;

import net.devtech.arrp.json.recipe.*;
import net.minecraft.item.Item;

import java.util.Arrays;
import java.util.List;

import static net.devtech.arrp.json.recipe.JIngredient.*;
import static net.devtech.arrp.json.recipe.JIngredients.*;
import static net.devtech.arrp.json.recipe.JPattern.*;
import static net.devtech.arrp.json.recipe.JRecipe.*;
import static net.devtech.arrp.json.recipe.JResult.*;

public class JRecipeFactory {
    public static JKeys createRecipeKeys(KeyInfo... keys) {
        JKeys jKeys = JKeys.keys();
        for (KeyInfo key : keys) {
            JIngredient ingredient = ingredient();
            for (Item item : key.items)
                ingredient.item(item);
            jKeys.key(key.name, ingredient);
        }
        return jKeys;
    }

    public static JIngredients createIngredients(Item... items) {
        JIngredients ingredients = ingredients();
        JIngredient ingredient = ingredient();
        for (Item item : items)
            ingredient.item(item);
        ingredients.add(ingredient);
        return ingredients;
    }

    public static JRecipe createSingle(Item input, Item result, int resultCount) {
        return shapeless(createIngredients(input), itemStack(result, resultCount));
    }

    public static JRecipe createSingle(Item input, Item result) {
        return shapeless(createIngredients(input), item(result));
    }

    public static JRecipe create2x2(String pat1, String pat2, Item result, int resultCount, KeyInfo... keys) {
        return shaped(pattern(pat1, pat2), createRecipeKeys(keys), itemStack(result, resultCount));
    }

    public static JRecipe create2x2(String pat1, String pat2, Item result, KeyInfo... keys) {
        return shaped(pattern(pat1, pat2), createRecipeKeys(keys), item(result));
    }

    public static JRecipe create3x3(String pat1, String pat2, String pat3, Item result, int resultCount, KeyInfo... keys) {
        return shaped(pattern(pat1, pat2, pat3), createRecipeKeys(keys), itemStack(result, resultCount));
    }

    public static JRecipe create3x3(String pat1, String pat2, String pat3, Item result, KeyInfo... keys) {
        return shaped(pattern(pat1, pat2, pat3), createRecipeKeys(keys), item(result));
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
