package dev.ninjdai.doaddonfluids.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class DoAddonExpectPlatformImpl {
    public static boolean isModLoaded(String modid) {
        return FabricLoader.getInstance().isModLoaded(modid);
    }
}