package dev.ninjdai.doaddoncreate.dependant;

import dev.ninjdai.doaddoncreate.reflection.ModSupport;
import dev.ninjdai.doaddoncreate.reflection.annotations.SupportsMod;
import dev.ninjdai.doaddoncreate.registry.DoAddonFluidProperties;
import dev.ninjdai.doaddoncreate.registry.DoAddonFluids;
import earth.terrarium.botarium.common.registry.fluid.FluidData;

import static dev.ninjdai.doaddoncreate.registry.DoAddonFluidProperties.FLUID_PROPERTIES;

@SupportsMod("bakery")
public class Bakery implements ModSupport {

    // Fluids
    static FluidData STRAWBERRY_JAM_PROPS;
    static FluidData GLOWBERRY_JAM_PROPS;
    static FluidData SWEETBERRY_JAM_PROPS;
    static FluidData APPLE_JAM_PROPS;

    @Override
    public void registerFluidProperties() {
        final int JAM_VISCOSITY = 2000;
        STRAWBERRY_JAM_PROPS = FLUID_PROPERTIES.register("strawberry_jam", new DoAddonFluidProperties.BetterBuilder().setJam().simpleTextures("strawberry_jam").get().viscosity(JAM_VISCOSITY));
        GLOWBERRY_JAM_PROPS = FLUID_PROPERTIES.register("glowberry_jam", new DoAddonFluidProperties.BetterBuilder().setJam().simpleTextures("glowberry_jam").get()
                .canConvertToSource(false)
                .lightLevel(7)
                .canDrown(true)
                .canExtinguish(true)
                .canHydrate(true)
                .canPushEntity(true)
                .canSwim(true)
                .viscosity(JAM_VISCOSITY)
        );
        SWEETBERRY_JAM_PROPS = FLUID_PROPERTIES.register("sweetberry_jam", new DoAddonFluidProperties.BetterBuilder().setJam().simpleTextures("sweetberry_jam").get().viscosity(JAM_VISCOSITY));
        APPLE_JAM_PROPS = FLUID_PROPERTIES.register("apple_jam", new DoAddonFluidProperties.BetterBuilder().setJam().simpleTextures("apple_jam").get().viscosity(JAM_VISCOSITY));
    }

    static DoAddonFluids.StateIndependantFluid STRAWBERRY_JAM;
    static DoAddonFluids.StateIndependantFluid GLOWBERRY_JAM;
    static DoAddonFluids.StateIndependantFluid SWEETBERRY_JAM;
    static DoAddonFluids.StateIndependantFluid APPLE_JAM;

    public void registerFluids() {
        STRAWBERRY_JAM = DoAddonFluids.registerDualStatesByName("strawberry_jam", STRAWBERRY_JAM_PROPS);
        GLOWBERRY_JAM = DoAddonFluids.registerDualStatesByName("glowberry_jam", GLOWBERRY_JAM_PROPS);
        SWEETBERRY_JAM = DoAddonFluids.registerDualStatesByName("sweetberry_jam", SWEETBERRY_JAM_PROPS);
        APPLE_JAM = DoAddonFluids.registerDualStatesByName("apple_jam", APPLE_JAM_PROPS);
    }
}
