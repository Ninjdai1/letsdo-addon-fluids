package dev.ninjdai.doaddoncreate.dependant;

import dev.ninjdai.doaddoncreate.reflection.ModSupport;
import dev.ninjdai.doaddoncreate.reflection.annotations.SupportsMod;
import dev.ninjdai.doaddoncreate.registry.DoAddonFluidProperties;
import dev.ninjdai.doaddoncreate.registry.DoAddonFluids;
import dev.ninjdai.doaddoncreate.utils.DoAddonColors;
import earth.terrarium.botarium.common.registry.fluid.FluidData;

import static dev.ninjdai.doaddoncreate.registry.DoAddonFluidProperties.FLUID_PROPERTIES;

@SupportsMod("herbalbrews")
public class HerbalBrews implements ModSupport {

    // Fluids
    static DoAddonFluids.StateIndependantFluid GREEN_TEA;
    static DoAddonFluids.StateIndependantFluid BLACK_TEA;
    static DoAddonFluids.StateIndependantFluid HIBISCUS_TEA;
    static DoAddonFluids.StateIndependantFluid LAVENDER_TEA;
    static DoAddonFluids.StateIndependantFluid YERBA_MATE_TEA;
    static DoAddonFluids.StateIndependantFluid ROOIBOS_TEA;
    static DoAddonFluids.StateIndependantFluid OOLONG_TEA;
    static DoAddonFluids.StateIndependantFluid COFFEE;
    static DoAddonFluids.StateIndependantFluid MILK_COFFEE;

    public void registerFluids() {
        GREEN_TEA = DoAddonFluids.registerDualStatesByName("green_tea");
        BLACK_TEA = DoAddonFluids.registerDualStatesByName("black_tea");
        HIBISCUS_TEA = DoAddonFluids.registerDualStatesByName("hibiscus_tea");
        LAVENDER_TEA = DoAddonFluids.registerDualStatesByName("lavender_tea");
        YERBA_MATE_TEA = DoAddonFluids.registerDualStatesByName("yerba_mate_tea");
        ROOIBOS_TEA = DoAddonFluids.registerDualStatesByName("rooibos_tea");
        OOLONG_TEA = DoAddonFluids.registerDualStatesByName("oolong_tea");
        COFFEE = DoAddonFluids.registerDualStatesByName("coffee");
        MILK_COFFEE = DoAddonFluids.registerDualStatesByName("milk_coffee");
    }
    
    static FluidData GREEN_TEA_PROPS;
    static FluidData BLACK_TEA_PROPS;
    static FluidData HIBISCUS_TEA_PROPS;
    static FluidData LAVENDER_TEA_PROPS;
    static FluidData YERBA_MATE_TEA_PROPS;
    static FluidData ROOIBOS_TEA_PROPS;
    static FluidData OOLONG_TEA_PROPS;
    static FluidData COFFEE_PROPS;
    static FluidData MILK_COFFEE_PROPS;

    @Override
    public void registerFluidProperties() {
        GREEN_TEA_PROPS = FLUID_PROPERTIES.register("green_tea", new DoAddonFluidProperties.BetterBuilder().setTea().get()
                .tintColor(DoAddonColors.GREEN_TEA.value)
        );
        BLACK_TEA_PROPS = FLUID_PROPERTIES.register("black_tea", new DoAddonFluidProperties.BetterBuilder().setTea().get()
                .tintColor(DoAddonColors.BLACK_TEA.value)
        );
        HIBISCUS_TEA_PROPS = FLUID_PROPERTIES.register("hibiscus_tea", new DoAddonFluidProperties.BetterBuilder().setTea().get()
                .tintColor(DoAddonColors.HIBISCUS_TEA.value)
        );
        LAVENDER_TEA_PROPS = FLUID_PROPERTIES.register("lavender_tea", new DoAddonFluidProperties.BetterBuilder().setTea().get()
                .tintColor(DoAddonColors.LAVENDER_TEA.value)
        );
        YERBA_MATE_TEA_PROPS = FLUID_PROPERTIES.register("yerba_mate_tea", new DoAddonFluidProperties.BetterBuilder().setTea().get()
                .tintColor(DoAddonColors.YERBA_MATE_TEA.value)
        );
        ROOIBOS_TEA_PROPS = FLUID_PROPERTIES.register("rooibos_tea", new DoAddonFluidProperties.BetterBuilder().setTea().get()
                .tintColor(DoAddonColors.ROOIBOS_TEA.value)
        );
        OOLONG_TEA_PROPS = FLUID_PROPERTIES.register("oolong_tea", new DoAddonFluidProperties.BetterBuilder().setTea().get()
                .tintColor(DoAddonColors.OOLONG_TEA.value)
        );

        COFFEE_PROPS = FLUID_PROPERTIES.register("coffee", new DoAddonFluidProperties.BetterBuilder().setTea().get()
                .tintColor(DoAddonColors.COFFEE.value)
        );
        MILK_COFFEE_PROPS = FLUID_PROPERTIES.register("milk_coffee", new DoAddonFluidProperties.BetterBuilder().setTea().get()
                .tintColor(DoAddonColors.MILK_COFFEE.value)
        );
    }
}
