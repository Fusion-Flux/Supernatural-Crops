package com.fusionflux.supernaturalcrops.resource;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.devtech.arrp.json.loot.JLootTable;
import net.minecraft.util.Identifier;

public class JLootTableFactory {
    public static JLootTable createSimpleBlock(Identifier itemId) {
        return JLootTable.loot("minecraft:block")
                .pool(JLootTable.pool()
                        .rolls(1)
                        .entry(JLootTable.entry()
                                .type("minecraft:item")
                                .name(itemId.toString()))
                    .condition(JLootTable.predicate("minecraft:survives_explosion")));
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
                .pool(JLootTable.pool()
                        .rolls(1)
                        .entry(JLootTable.entry()
                                .type("minecraft:alternatives")
                                .child(JLootTable.entry()
                                        .type("minecraft:item")
                                        .condition(JLootTable.predicate("minecraft:match_tool")
                                                .parameter("predicate", enchantments))
                                        .name(silkItemId.toString()))
                                .child(JLootTable.entry()
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
                .pool(JLootTable.pool()
                        .rolls(1)
                        .entry(JLootTable.entry()
                                .type("minecraft:item")
                                .condition(JLootTable.predicate("minecraft:block_state_property")
                                        .set(blockStatePredicate))
                                .name(harvestResultId.toString())
                        )
                        .entry(JLootTable.entry()
                            .type("minecraft:item")
                            .name(seedId.toString()))
                );
    }
}
