package com.fusionflux.supernaturalcrops.item;

import com.fusionflux.supernaturalcrops.block.OreBushBlock;
import net.minecraft.item.BlockItem;

public class BushSeedItem extends BlockItem {
    public BushSeedItem(OreBushBlock block) {
        super(block, SupernaturalCropsItems.bushSeedSettings());
    }

    @Override
    public String getTranslationKey() {
        // seeds have their own translation key
        return getOrCreateTranslationKey();
    }
}
