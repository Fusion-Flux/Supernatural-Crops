package com.fusionflux.supernaturalcrops.client;

import com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import com.fusionflux.supernaturalcrops.modsupport.*;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.TranslatableText;

import java.util.Collections;

import static me.sargunvohra.mcmods.autoconfig1u.util.Utils.getUnsafely;
import static me.sargunvohra.mcmods.autoconfig1u.util.Utils.setUnsafely;

public class SupernaturalCropsClient implements ClientModInitializer {
    private static final ConfigEntryBuilder ENTRY_BUILDER = ConfigEntryBuilder.create();

    @Override
    public void onInitializeClient() {
        AutoConfig.getGuiRegistry(SupernaturalCropsConfig.class).registerTypeProvider((i13n, field, config, defaults, registry) ->
                Collections.singletonList(
                    ENTRY_BUILDER.startSelector(
                            new TranslatableText(i13n),
                            SupernaturalCropsConfig.UncraftingRecipeOption.values(),
                            getUnsafely(field, config, getUnsafely(field, defaults))
                    )
                            .setDefaultValue(() -> getUnsafely(field, defaults))
                            .setSaveConsumer(newValue -> setUnsafely(field, config, newValue))
                            .setNameProvider(SupernaturalCropsConfig.UncraftingRecipeOption::toText)
                            .build()
        ), SupernaturalCropsConfig.UncraftingRecipeOption.class);

        SupernaturalCropsBlocks.registerRenderLayers();
        if (FabricLoader.getInstance().isModLoaded("mythicmetals"))
            MythicMetalsCropsBlocks.registerRenderLayers();
        if (FabricLoader.getInstance().isModLoaded("betterend"))
            BetterEndCropsBlocks.registerRenderLayers();
        if (FabricLoader.getInstance().isModLoaded("betternether"))
            BetterNetherCropsBlocks.registerRenderLayers();
        if (FabricLoader.getInstance().isModLoaded("techreborn"))
            TechRebornCropsBlocks.registerRenderLayers();
        if (FabricLoader.getInstance().isModLoaded("lint"))
            LintCropsBlocks.registerRenderLayers();
        if (FabricLoader.getInstance().isModLoaded("appliedenergistics2"))
        AE2CropsBlocks.registerRenderLayers();
    }
}

