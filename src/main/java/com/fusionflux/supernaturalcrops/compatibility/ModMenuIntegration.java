
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


            SupernaturalCropsConfig.ENABLED.OPTIONS.forEach(ci -> setupBooleanConfigItem((ConfigItem<Boolean>) ci, enabledFeatures, entryBuilder));

            SupernaturalCropsConfig.NUGGET_BALANCE.OPTIONS.forEach(ci -> setupBooleanConfigItem((ConfigItem<Boolean>) ci, nuggetBalance, entryBuilder));

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