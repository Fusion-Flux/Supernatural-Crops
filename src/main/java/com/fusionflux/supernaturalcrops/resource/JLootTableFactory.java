package com.fusionflux.supernaturalcrops.resource;

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

    public static JLootTable createPlantBlock(Identifier blockId, int matureAge, Identifier seedsId, Identifier harvestResultId) {
        JsonObject props = new JsonObject();
        props.addProperty("age", matureAge);
        JsonObject condParams = new JsonObject();
        condParams.addProperty("block", blockId.toString());
        condParams.add("properties", props);
        return JLootTable.loot("minecraft:block")
                .pool(JLootTable.pool()
                        .rolls(1)
                        .entry(JLootTable.entry()
                                .type("minecraft:item")
                                .name(seedsId.toString())))
                .pool(JLootTable.pool()
                        .rolls(1)
                        .entry(JLootTable.entry()
                                .type("minecraft:item")
                                .condition(JLootTable.predicate("minecraft:block_state_property")
                                        .set(condParams))
                                .name(harvestResultId.toString())));
    }
}
