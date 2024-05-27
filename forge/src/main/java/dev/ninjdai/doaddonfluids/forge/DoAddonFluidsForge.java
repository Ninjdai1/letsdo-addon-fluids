package dev.ninjdai.doaddonfluids.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import dev.ninjdai.doaddonfluids.DoAddonFluids;

@Mod(DoAddonFluids.MOD_ID)
public final class DoAddonFluidsForge {
    public DoAddonFluidsForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(DoAddonFluids.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        DoAddonFluids.init();
    }
}
