package com.fusionflux.supernaturalcrops;

import com.fusionflux.supernaturalcrops.block.OreBushBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.fusionflux.supernaturalcrops.SupernaturalCrops.id;

public interface OreBush {
    String getPath();
    OreBushBlock getBlock();
    Item getIngot();
    Item getHarvestResult();
    boolean isEnabled();

    default Identifier getBlockId() {
        return id(getPath());
    }

    default Identifier getSeedsId() {
        return id(getPath() + "_seeds");
    }

    default BlockItem getSeeds() {
        Item item = Registry.ITEM.get(getSeedsId());
        if (item instanceof BlockItem)
            return (BlockItem) item;
        throw new IllegalStateException("Ore bush seed item \"" + getSeedsId() + "\" isn't a BlockItem!");
    }

    default Identifier getIngotId() {
        return Registry.ITEM.getId(getIngot());
    }

    default Identifier getHarvestResultId() {
        return Registry.ITEM.getId(getIngot());
    }
}
