
package com.fusionflux.supernaturalcrops.compatibility;

import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;

public class ModMenuIntegration implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> AutoConfig.getConfigScreen(SupernaturalCropsConfig.class, parent).get();
    }
}