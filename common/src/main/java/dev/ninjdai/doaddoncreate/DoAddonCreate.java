package dev.ninjdai.doaddoncreate;

import dev.ninjdai.doaddoncreate.reflection.ModSupport;
import dev.ninjdai.doaddoncreate.reflection.SupportLoader;
import dev.ninjdai.doaddoncreate.registry.DoAddonBlocks;
import dev.ninjdai.doaddoncreate.registry.DoAddonFluidProperties;
import dev.ninjdai.doaddoncreate.registry.DoAddonFluids;
import dev.ninjdai.doaddoncreate.registry.DoAddonItems;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public final class DoAddonCreate {
    public static final String MOD_ID = "doaddoncreate";

    public static final Logger LOGGER = LoggerFactory.getLogger("[Let's Do Addon] Create");

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static void init() {
        SupportLoader.loadAllSupports();
        LOGGER.info("Loaded supports: {}", Arrays.toString(SupportLoader.classList()));
        SupportLoader.forAllLoadedDo(ModSupport::registerFluidProperties);
        DoAddonFluidProperties.FLUID_PROPERTIES.initialize();
        SupportLoader.forAllLoadedDo(ModSupport::registerFluids);
        DoAddonFluids.FLUIDS.init();
        SupportLoader.forAllLoadedDo(ModSupport::registerBlocks);
        DoAddonBlocks.BLOCKS.init();
        DoAddonItems.ITEMS.init();

        LOGGER.info("[Let's Do Addon] Create initialized !");
    }
}
