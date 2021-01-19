
package com.fusionflux.supernaturalcrops.compatibility;

import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import com.oroarmor.config.ConfigItem;
import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.text.TranslatableText;

public class ModMenuIntegration implements ModMenuApi {

    private ConfigCategory createCategory(ConfigBuilder builder, String categoryName) {
        return builder.getOrCreateCategory(new TranslatableText(categoryName));
    }

    @SuppressWarnings("unchecked")
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return screen -> {
            ConfigBuilder builder = ConfigBuilder.create().setParentScreen(screen).setTitle(new TranslatableText("config.supernaturalcrops"));

            builder.setSavingRunnable(SupernaturalCrops.CONFIG::saveConfigToFile);

            ConfigEntryBuilder entryBuilder = ConfigEntryBuilder.create();

            ConfigCategory enabledFeatures = createCategory(builder, "config.supernaturalcrops.enabled");
            ConfigCategory nuggetBalance = createCategory(builder, "config.supernaturalcrops.nugget_balance");
            ConfigCategory betterNetherEnabledFeatures = createCategory(builder, "config.supernaturalcrops.better_nether_enabled");
            ConfigCategory betterNetherNuggetBalance = createCategory(builder, "config.supernaturalcrops.better_nether_nugget_balance");
            ConfigCategory betterEndEnabledFeatures = createCategory(builder, "config.supernaturalcrops.better_end_enabled");
            ConfigCategory betterEndNuggetBalance = createCategory(builder, "config.supernaturalcrops.better_end_nugget_balance");
            ConfigCategory mythicMetalsEnabledFeatures = createCategory(builder, "config.supernaturalcrops.mythic_metals_enabled");
            ConfigCategory mythicMetalsNuggetBalance = createCategory(builder, "config.supernaturalcrops.mythic_metals_nugget_balance");
            ConfigCategory lintEnabledFeatures = createCategory(builder, "config.supernaturalcrops.lint_enabled");
            ConfigCategory lintNuggetBalance = createCategory(builder, "config.supernaturalcrops.lint_nugget_balance");

            SupernaturalCropsConfig.ENABLED.OPTIONS.forEach(ci -> setupBooleanConfigItem((ConfigItem<Boolean>) ci, enabledFeatures, entryBuilder));
            SupernaturalCropsConfig.NUGGET_BALANCE.OPTIONS.forEach(ci -> setupBooleanConfigItem((ConfigItem<Boolean>) ci, nuggetBalance, entryBuilder));

            SupernaturalCropsConfig.BETTER_END_ENABLED.OPTIONS.forEach(ci -> setupBooleanConfigItem((ConfigItem<Boolean>) ci, betterEndEnabledFeatures, entryBuilder));
            SupernaturalCropsConfig.BETTER_END_NUGGET_BALANCE.OPTIONS.forEach(ci -> setupBooleanConfigItem((ConfigItem<Boolean>) ci, betterEndNuggetBalance, entryBuilder));

            SupernaturalCropsConfig.BETTER_NETHER_ENABLED.OPTIONS.forEach(ci -> setupBooleanConfigItem((ConfigItem<Boolean>) ci, betterNetherEnabledFeatures, entryBuilder));
            SupernaturalCropsConfig.BETTER_NETHER_NUGGET_BALANCE.OPTIONS.forEach(ci -> setupBooleanConfigItem((ConfigItem<Boolean>) ci, betterNetherNuggetBalance, entryBuilder));

            SupernaturalCropsConfig.MYTHICAL_METALS_ENABLED.OPTIONS.forEach(ci -> setupBooleanConfigItem((ConfigItem<Boolean>) ci, mythicMetalsEnabledFeatures, entryBuilder));
            SupernaturalCropsConfig.MYTHICAL_METALS_NUGGET_BALANCE.OPTIONS.forEach(ci -> setupBooleanConfigItem((ConfigItem<Boolean>) ci, mythicMetalsNuggetBalance, entryBuilder));

            SupernaturalCropsConfig.LINT_ENABLED.OPTIONS.forEach(ci -> setupBooleanConfigItem((ConfigItem<Boolean>) ci, lintEnabledFeatures, entryBuilder));
            SupernaturalCropsConfig.LINT_NUGGET_BALANCE.OPTIONS.forEach(ci -> setupBooleanConfigItem((ConfigItem<Boolean>) ci, lintNuggetBalance, entryBuilder));
            return builder.build();
        };
    }

    @Override
    public String getModId() {
        return "supernaturalcrops";
    }

    private void setupBooleanConfigItem(ConfigItem<Boolean> ci, ConfigCategory category, ConfigEntryBuilder entryBuilder) {
        category.addEntry(entryBuilder.startBooleanToggle(new TranslatableText(ci.getDetails()), ci.getValue()).setSaveConsumer(ci::setValue).setDefaultValue(ci::getDefaultValue).build());
    }

    private void setupDoubleConfigItem(ConfigItem<Double> ci, ConfigCategory category, ConfigEntryBuilder entryBuilder) {
        category.addEntry(entryBuilder.startDoubleField(new TranslatableText(ci.getDetails()), ci.getValue()).setSaveConsumer(ci::setValue).setDefaultValue(ci::getDefaultValue).build());
    }

    private void setupIntegerConfigItem(ConfigItem<Integer> ci, ConfigCategory category, ConfigEntryBuilder entryBuilder) {
        category.addEntry(entryBuilder.startIntField(new TranslatableText(ci.getDetails()), ci.getValue()).setSaveConsumer(ci::setValue).setDefaultValue(ci::getDefaultValue).build());
    }
}