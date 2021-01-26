package com.fusionflux.supernaturalcrops;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.fusionflux.supernaturalcrops.SupernaturalCrops.id;

public interface OreBush {
    String getPath();
    Item getIngot();
    Item getHarvestResult();
    boolean isEnabled();

    default Identifier getIngotId() {
        return Registry.ITEM.getId(getIngot());
    }

    default Identifier getHarvestResultId() {
        return Registry.ITEM.getId(getIngot());
    }

    default Identifier getBlockId() {
        return id(getPath());
    }

    default Identifier getSeedsId() {
        return id(getPath() + "_seeds");
    }

    default Block getBlock() {
        return Registry.BLOCK.get(getBlockId());
    }

    default Item getSeeds() {
        return Registry.ITEM.get(getSeedsId());
    }
}
