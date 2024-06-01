package dev.ninjdai.doaddonfluids;

import dev.ninjdai.doaddonfluids.registry.DoAddonBlocks;
import dev.ninjdai.doaddonfluids.registry.DoAddonFluidProperties;
import dev.ninjdai.doaddonfluids.registry.DoAddonFluid;
import dev.ninjdai.doaddonfluids.registry.DoAddonItems;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class DoAddonFluids {
    public static final String MOD_ID = "doaddonfluids";

    public static final Logger LOGGER = LoggerFactory.getLogger("[Let's Do Addon] Fluids");

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static void init() {
        DoAddonFluid.registerModDependentFluids();
        DoAddonFluid.FLUIDS.init();
        DoAddonBlocks.registerModDependentBlocks();
        DoAddonBlocks.BLOCKS.init();
        DoAddonItems.ITEMS.init();
        DoAddonFluidProperties.FLUID_PROPERTIES.initialize();

        LOGGER.info("[Let's Do Addon] Fluids initialized !");
    }
}
