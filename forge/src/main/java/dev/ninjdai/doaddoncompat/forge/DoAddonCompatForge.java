package dev.ninjdai.doaddoncompat.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import dev.ninjdai.doaddoncompat.DoAddonCompat;

@Mod(DoAddonCompat.MOD_ID)
public final class DoAddonCompatForge {
    public DoAddonCompatForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(DoAddonCompat.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        DoAddonCompat.init();
    }
}
