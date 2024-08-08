package dev.ninjdai.doaddoncreate;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class DoAddonExpectPlatform {

    @ExpectPlatform
    public static boolean isModLoaded(String modid) {
        return false;
    }
}