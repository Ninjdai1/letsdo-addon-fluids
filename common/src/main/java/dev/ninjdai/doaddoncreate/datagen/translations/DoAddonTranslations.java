package dev.ninjdai.doaddoncreate.datagen.translations;

import dev.ninjdai.doaddoncreate.DoAddonCreate;
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

            // Vinery
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "red_grapejuice", "Red Grapejuice");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "white_grapejuice", "White Grapejuice");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "jungle_red_grapejuice", "Red Jungle Grapejuice");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "jungle_white_grapejuice", "White Jungle Grapejuice");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "savanna_red_grapejuice", "Red Savanna Grapejuice");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "savanna_white_grapejuice", "White Savanna Grapejuice");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "taiga_red_grapejuice", "Red Taiga Grapejuice");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "taiga_white_grapejuice", "White Taiga Grapejuice");

            // Nether Vinery
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "crimson_grapejuice", "Crimson Grapejuice");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "warped_grapejuice", "Warped Grapejuice");

            // Meadow
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "rennet", "Rennet");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "buffalo_milk", "Buffalo Milk");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "amethyst_milk", "Amethyst Milk ?");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "goat_milk", "Goat Milk");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "grain_milk", "Grain Milk");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "sheep_milk", "Sheep Milk");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "warped_milk", "Warped Milk");

            // HerbalBrews
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "green_tea", "Green Tea");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "black_tea", "Black Tea");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "hibiscus_tea", "Hibiscus Tea");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "lavender_tea", "Lavender Tea");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "yerba_mate_tea", "Yerba Mate Tea");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "rooibos_tea", "Rooibos Tea");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "oolong_tea", "Oolong Tea");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "coffee", "Coffee");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "milk_coffee", "Milk Coffee");

            // Bakery
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "strawberry_jam", "Strawberry Jam");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "glowberry_jam", "Glowberry Jam");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "sweetberry_jam", "Sweetberry Jam");
            tb.add(key + "." + DoAddonCreate.MOD_ID + "." + "apple_jam", "Apple Jam");
        }
    }
}
