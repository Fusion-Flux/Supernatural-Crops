package com.fusionflux.supernaturalcrops.datafixer;

import adudecalledleo.dfubuddy.api.ModDataFixes;
import adudecalledleo.dfubuddy.api.SimpleFixes;
import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.schemas.Schema;
import it.unimi.dsi.fastutil.objects.Object2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import net.minecraft.datafixer.schema.IdentifierNormalizingSchema;
import net.minecraft.util.Util;

public final class SupernaturalCropsDataFixer {
    private SupernaturalCropsDataFixer() { }

    public static final int DATA_VERSION = 1;
    // LIST DATA VERSION UPDATES HERE:
    // 01/29/21 - updated to 1, due to changing mod support bush IDs

    public static void register() {
        DataFixerBuilder builder = new DataFixerBuilder(DATA_VERSION);
        builder.addSchema(0, ModDataFixes.MOD_SCHEMA);
        Schema schemaV1 = builder.addSchema(1, IdentifierNormalizingSchema::new);
        SchemaV1Data.initialize(builder, schemaV1);
        DataFixer fixer = builder.build(Util.getBootstrapExecutor());
        ModDataFixes.registerFixer(SupernaturalCrops.MOD_ID, DATA_VERSION, fixer);
    }

    private static final class SchemaV1Data {
        public static final Object2ReferenceOpenHashMap<String, String> RENAMES =
                Util.make(new Object2ReferenceOpenHashMap<>(), map -> {
                    // Mythic Metals
                    map.put("adamantite_bush", "mythicmetals_adamantite_bush");
                    map.put("aetherium_bush", "mythicmetals_aetherium_bush");
                    map.put("aquarium_bush", "mythicmetals_aquarium_bush");
                    map.put("argonium_bush", "mythicmetals_argonium_bush");
                    map.put("banglum_bush", "mythicmetals_banglum_bush");
                    map.put("mmbrass_bush", "mythicmetals_brass_bush");
                    map.put("mmbronze_bush", "mythicmetals_bronze_bush");
                    map.put("carmot_bush", "mythicmetals_carmot_bush");
                    map.put("celestium_bush", "mythicmetals_celestium_bush");
                    map.put("mmcopper_bush", "mythicmetals_copper_bush");
                    map.put("discordium_bush", "mythicmetals_discordium_bush");
                    map.put("durasteel_bush", "mythicmetals_durasteel_bush");
                    map.put("mmelectrum_bush", "mythicmetals_electrum_bush");
                    map.put("etherite_bush", "mythicmetals_etherite_bush");
                    map.put("kyber_bush", "mythicmetals_kyber_bush");
                    map.put("manganese_bush", "mythicmetals_manganese_bush");
                    map.put("metallurgium_bush", "mythicmetals_metallurgium_bush");
                    map.put("midas_gold_bush", "mythicmetals_midas_gold_bush");
                    map.put("mythril_bush", "mythicmetals_mythril_bush");
                    map.put("orichalcum_bush", "mythicmetals_orichalcum_bush");
                    map.put("osmium_bush", "mythicmetals_osmium_bush");
                    map.put("platinum_bush", "mythicmetals_platinum_bush");
                    map.put("prometheum_bush", "mythicmetals_prometheum_bush");
                    map.put("quadrillum_bush", "mythicmetals_quadrillum_bush");
                    map.put("quicksilver_bush", "mythicmetals_quicksilver_bush");
                    map.put("runite_bush", "mythicmetals_runite_bush");
                    map.put("mmsilver_bush", "mythicmetals_silver_bush");
                    map.put("slowsilver_bush", "mythicmetals_slowsilver_bush");
                    map.put("starrite_bush", "mythicmetals_starrite_bush");
                    map.put("mmsteel_bush", "mythicmetals_steel_bush");
                    map.put("stormyx_bush", "mythicmetals_stormyx_bush");
                    map.put("tantalite_bush", "mythicmetals_tantalite_bush");
                    map.put("tin_bush", "mythicmetals_tin_bush");
                    map.put("truesilver_bush", "mythicmetals_truesilver_bush");
                    map.put("unobtainium_bush", "mythicmetals_unobtainium_bush");
                    map.put("ur_bush", "mythicmetals_ur_bush");
                    map.put("mmzinc_bush", "mythicmetals_zinc_bush");
                    // BetterEnd
                    map.put("terminite_bush", "betterend_terminite_bush");
                    map.put("amber_bush", "betterend_amber_bush");
                    // BetterNether
                    map.put("cincinnasite_bush", "betternether_cincinnasite_bush");
                    map.put("nether_ruby_bush", "betternether_nether_ruby_bush");
                    // Tech Reborn
                    map.put("trcopper_bush", "techreborn_copper_bush");
                    map.put("traluminum_bush", "techreborn_aluminum_bush");
                    map.put("trbrass_bush", "techreborn_brass_bush");
                    map.put("trbronze_bush", "techreborn_bronze_bush");
                    map.put("trelectrum_bush", "techreborn_electrum_bush");
                    map.put("trinvar_bush", "techreborn_invar_bush");
                    map.put("triridium_bush", "techreborn_iridium_bush");
                    map.put("trlead_bush", "techreborn_lead_bush");
                    map.put("trnickel_bush", "techreborn_nickel_bush");
                    map.put("trplatinum_bush", "techreborn_platinum_bush");
                    map.put("trsilver_bush", "techreborn_silver_bush");
                    map.put("trsteel_bush", "techreborn_steel_bush");
                    map.put("trtin_bush", "techreborn_tin_bush");
                    map.put("titanium_bush", "techreborn_titanium_bush");
                    map.put("trtungsten_bush", "techreborn_tungsten_bush");
                    map.put("trzinc_bush", "techreborn_zinc_bush");
                    map.put("trrefined_iron_bush", "techreborn_refined_iron_bush");
                    map.put("trchrome_bush", "techreborn_chrome_bush");
                    map.put("trtungstensteel_bush", "techreborn_tungstensteel_bush");
                    // Lint
                    map.put("jurel_bush", "lint_jurel_bush");
                    map.put("sicieron_bush", "lint_sicieron_bush");
                    map.put("tarscan_bush", "lint_tarscan_bush");
                });

        public static void initialize(DataFixerBuilder builder, Schema targetSchema) {
            for (Object2ReferenceMap.Entry<String, String> entry : RENAMES.object2ReferenceEntrySet()) {
                String oldBushId = SupernaturalCrops.MOD_ID + ":" + entry.getKey();
                String newBushId = SupernaturalCrops.MOD_ID + ":" + entry.getValue();

                SimpleFixes.addBlockRenameFix(builder, "Rename " + entry.getKey() + " to " + entry.getValue(),
                        oldBushId, newBushId, targetSchema);
                SimpleFixes.addItemRenameFix(builder, "Rename " + entry.getKey() + " seeds to " + entry.getValue() + " seeds",
                        oldBushId + "_seeds", newBushId + "_seeds", targetSchema);
            }
        }
    }
}
