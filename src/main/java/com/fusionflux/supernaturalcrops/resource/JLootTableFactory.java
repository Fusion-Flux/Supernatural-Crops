package com.fusionflux.supernaturalcrops.resource;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.devtech.arrp.json.loot.JLootTable;
import net.minecraft.util.Identifier;

import static net.devtech.arrp.json.loot.JLootTable.*;

public class JLootTableFactory {
    public static JLootTable createSimpleBlock(Identifier itemId) {
        return JLootTable.loot("minecraft:block")
                .pool(pool()
                        .rolls(1)
                        .entry(entry()
                                .type("minecraft:item")
                                .name(itemId.toString()))
                    .condition(predicate("minecraft:survives_explosion")));
    }
    
    public static JLootTable createSilkTouchBlock(Identifier silkItemId, Identifier itemId) {
        JsonObject silkTouchLevels = new JsonObject();
        silkTouchLevels.addProperty("min", 1);

        JsonObject silkTouchEnchantment = new JsonObject();
        silkTouchEnchantment.addProperty("enchantment", "minecraft:silk_touch");
        silkTouchEnchantment.add("levels", silkTouchLevels);

        JsonArray enchantments = new JsonArray();
        enchantments.add(silkTouchEnchantment);

        return JLootTable.loot("minecraft:block")
                .pool(pool()
                        .rolls(1)
                        .entry(entry()
                                .type("minecraft:alternatives")
                                .child(entry()
                                        .type("minecraft:item")
                                        .condition(predicate("minecraft:match_tool")
                                                .parameter("predicate", enchantments))
                                        .name(silkItemId.toString()))
                                .child(entry()
                                        .type("minecraft:item")
                                        .name(itemId.toString()))
                        )
                );
    }

    public static JLootTable createPlantBlock(Identifier blockId, int matureAge, Identifier seedId, Identifier harvestResultId) {
        JsonObject properties = new JsonObject();
        properties.addProperty("age", matureAge);

        JsonObject blockStatePredicate = new JsonObject();
        blockStatePredicate.addProperty("block", blockId.toString());
        blockStatePredicate.add("properties", properties);

        return JLootTable.loot("minecraft:block")
                .pool(pool()
                        .rolls(1)
                        .entry(entry()
                                .type("minecraft:item")
                                .condition(predicate("minecraft:block_state_property")
                                        .set(blockStatePredicate))
                                .name(harvestResultId.toString())
                        ))
                .pool(pool()
                        .rolls(1)
                        .entry(entry()
                                .type("minecraft:item")
                                .name(seedId.toString())
                        ));
    }
}
