package dev.ninjdai.doaddoncreate.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import dev.ninjdai.doaddoncreate.DoAddonCreate;

@Mod(DoAddonCreate.MOD_ID)
public final class DoAddonCreateForge {
    public DoAddonCreateForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(DoAddonCreate.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        DoAddonCreate.init();
    }
}
