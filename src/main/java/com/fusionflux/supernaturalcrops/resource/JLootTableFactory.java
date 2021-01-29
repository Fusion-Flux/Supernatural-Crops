package com.fusionflux.supernaturalcrops.resource;

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
}
