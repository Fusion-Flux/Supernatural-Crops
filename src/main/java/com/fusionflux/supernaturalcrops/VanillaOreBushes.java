package com.fusionflux.supernaturalcrops;

import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import com.fusionflux.supernaturalcrops.item.SupernaturalCropsItems;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum VanillaOreBushes implements OreBush {
    COAL("coal_bush", Items.COAL,
            SupernaturalCropsConfig.ENABLED.ENABLE_COAL_CROPS::getValue),
    IRON("iron_bush", Items.IRON_INGOT, new Lazy<>(() ->
        SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_IRON_CROP_NUGGETS.getValue()
                ? Items.IRON_NUGGET
                : Items.IRON_INGOT),
            SupernaturalCropsConfig.ENABLED.ENABLE_IRON_CROPS::getValue),
    GOLD("gold_bush", Items.GOLD_INGOT, new Lazy<>(() ->
        SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_GOLD_CROP_NUGGETS.getValue()
                ? Items.GOLD_NUGGET
                : Items.GOLD_INGOT),
            SupernaturalCropsConfig.ENABLED.ENABLE_GOLD_CROPS::getValue),
    DIAMOND("diamond_bush", Items.DIAMOND, new Lazy<>(() ->
        SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_DIAMOND_CROP_NUGGETS.getValue()
                ? SupernaturalCropsItems.DIAMOND_SHARD
                : Items.DIAMOND),
            SupernaturalCropsConfig.ENABLED.ENABLE_DIAMOND_CROPS::getValue),
    EMERALD("emerald_bush", Items.EMERALD, new Lazy<>(() ->
        SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_EMERALD_CROP_NUGGETS.getValue()
                ? SupernaturalCropsItems.EMERALD_SHARD
                : Items.EMERALD),
            SupernaturalCropsConfig.ENABLED.ENABLE_EMERALD_CROPS::getValue),
    NETHERITE("netherite_bush", Items.NETHERITE_INGOT, new Lazy<>(() ->
            SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_NETHERITE_CROP_NUGGETS.getValue()
                    ? SupernaturalCropsItems.NETHERITE_FLAKE
                    : Items.NETHERITE_SCRAP),
            SupernaturalCropsConfig.ENABLED.ENABLE_NETHERITE_CROPS::getValue),
    REDSTONE("redstone_bush", Items.REDSTONE,
            SupernaturalCropsConfig.ENABLED.ENABLE_REDSTONE_CROPS::getValue),
    LAPIS_LAZULI("lapis_lazuli_bush", Items.LAPIS_LAZULI,
            SupernaturalCropsConfig.ENABLED.ENABLE_LAPIS_LAZULI_CROPS::getValue),
    QUARTZ("quartz_bush", Items.QUARTZ,
            SupernaturalCropsConfig.ENABLED.ENABLE_QUARTZ_CROPS::getValue);

    private final String path;
    private final Item ingot;
    private final Lazy<Item> harvestResult;
    private final Lazy<Boolean> enabled;

    VanillaOreBushes(String path, Item ingot, Lazy<Item> harvestResult, Supplier<Boolean> enabled) {
        this.path = path;
        this.ingot = ingot;
        this.harvestResult = harvestResult;
        this.enabled = new Lazy<>(enabled);
    }

    VanillaOreBushes(String path, Item ingot, Supplier<Boolean> enabled) {
        this(path, ingot, new Lazy<>(() -> ingot), enabled);
    }

    @Override
    public boolean isEnabled() {
        return enabled.get();
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public Item getIngot() {
        return ingot;
    }

    @Override
    public Item getHarvestResult() {
        return harvestResult.get();
    }
}
