package dev.ninjdai.doaddonfluids.datagen.translations;

import dev.ninjdai.doaddonfluids.registry.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class DoAddonTranslations extends FabricLanguageProvider{
    public DoAddonTranslations(FabricDataOutput output) {
        super(output, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder tb) {
        //Fluids
        String[] keys = { "fluid_type", "block" };
        for (String key: keys) {
            tb.add(key + "." + DoAddonFluid.RED_GRAPEJUICE.getId().toLanguageKey(), "Red Grapejuice");
            tb.add(key + "." + DoAddonFluid.WHITE_GRAPEJUICE.getId().toLanguageKey(), "White Grapejuice");
            tb.add(key + "." + DoAddonFluid.JUNGLE_RED_GRAPEJUICE.getId().toLanguageKey(), "Red Jungle Grapejuice");
            tb.add(key + "." + DoAddonFluid.JUNGLE_WHITE_GRAPEJUICE.getId().toLanguageKey(), "White Jungle Grapejuice");
            tb.add(key + "." + DoAddonFluid.SAVANNA_RED_GRAPEJUICE.getId().toLanguageKey(), "Red Savanna Grapejuice");
            tb.add(key + "." + DoAddonFluid.SAVANNA_WHITE_GRAPEJUICE.getId().toLanguageKey(), "White Savanna Grapejuice");
            tb.add(key + "." + DoAddonFluid.TAIGA_RED_GRAPEJUICE.getId().toLanguageKey(), "Red Taiga Grapejuice");
            tb.add(key + "." + DoAddonFluid.TAIGA_WHITE_GRAPEJUICE.getId().toLanguageKey(), "White Taiga Grapejuice");
            tb.add(key + "." + DoAddonFluid.CRIMSON_GRAPEJUICE.getId().toLanguageKey(), "Crimson Grapejuice");
            tb.add(key + "." + DoAddonFluid.WARPED_GRAPEJUICE.getId().toLanguageKey(), "Warped Grapejuice");

            tb.add(key + "." + DoAddonFluid.GREEN_TEA.getId().toLanguageKey(), "Green Tea");
            tb.add(key + "." + DoAddonFluid.BLACK_TEA.getId().toLanguageKey(), "Black Tea");
            tb.add(key + "." + DoAddonFluid.HIBISCUS_TEA.getId().toLanguageKey(), "Hibiscus Tea");
            tb.add(key + "." + DoAddonFluid.LAVENDER_TEA.getId().toLanguageKey(), "Lavender Tea");
            tb.add(key + "." + DoAddonFluid.YERBA_MATE_TEA.getId().toLanguageKey(), "Yerba Mate Tea");
            tb.add(key + "." + DoAddonFluid.ROOIBOS_TEA.getId().toLanguageKey(), "Rooibos Tea");
            tb.add(key + "." + DoAddonFluid.OOLONG_TEA.getId().toLanguageKey(), "Oolong Tea");
        }
    }
}
