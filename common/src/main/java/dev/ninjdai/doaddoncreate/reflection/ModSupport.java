package dev.ninjdai.doaddoncreate.reflection;

import dev.ninjdai.doaddoncreate.reflection.annotations.SupportsMod;

public interface ModSupport {
    default void registerFluids() {};
    default void registerFluidProperties() {}
    default void registerBlocks() {}

    static String supportedMod() {
        Class<?> currentClass = new Object(){}.getClass().getEnclosingClass();
        return currentClass.getAnnotation(SupportsMod.class).value();
    }
}
