package dev.ninjdai.doaddoncreate.reflection;

import dev.ninjdai.doaddoncreate.reflection.annotations.SupportsMod;

public interface ModSupport {
    default void registerFluids() {}
    default void registerFluidProperties() {}
    default void registerBlocks() {}

    default String supportedMod() {
        return this.getClass().getAnnotation(SupportsMod.class).value();
    }
}
