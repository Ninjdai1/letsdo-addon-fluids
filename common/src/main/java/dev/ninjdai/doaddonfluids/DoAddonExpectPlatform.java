package dev.ninjdai.doaddonfluids;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.entity.Entity;

public class DoAddonExpectPlatform {

    @ExpectPlatform
    public static boolean isModLoaded(String modid) {
        throw new AssertionError();
    }
}