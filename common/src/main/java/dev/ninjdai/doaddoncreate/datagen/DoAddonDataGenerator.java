package dev.ninjdai.doaddoncreate.datagen;

import dev.ninjdai.doaddoncreate.datagen.translations.DoAddonTranslations;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DoAddonDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(DoAddonTranslations::new);
    }
}
