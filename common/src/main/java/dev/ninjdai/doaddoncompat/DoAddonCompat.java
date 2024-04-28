package dev.ninjdai.doaddoncompat;

import dev.ninjdai.doaddoncompat.registry.DoAddonBlocks;
import dev.ninjdai.doaddoncompat.registry.DoAddonFluidProperties;
import dev.ninjdai.doaddoncompat.registry.DoAddonFluids;
import dev.ninjdai.doaddoncompat.registry.DoAddonItems;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class DoAddonCompat {
    public static final String MOD_ID = "doaddoncompat";

    public static final Logger LOGGER = LoggerFactory.getLogger("[Let's Do Addon] Compat");

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static void init() {
        DoAddonFluids.FLUIDS.init();
        DoAddonBlocks.BLOCKS.init();
        DoAddonItems.ITEMS.init();
        if(DoAddonExpectPlatform.isModLoaded("meadow")) {
            DoAddonItems.registerMeadowBuckets().init();
        }

        DoAddonFluidProperties.FLUID_PROPERTIES.initialize();

        LOGGER.info("[Let's Do Addon] Compat initialized !");
    }
}
