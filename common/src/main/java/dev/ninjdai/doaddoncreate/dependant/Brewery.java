package dev.ninjdai.doaddoncreate.dependant;

import dev.ninjdai.doaddoncreate.reflection.ModSupport;
import dev.ninjdai.doaddoncreate.reflection.annotations.SupportsMod;
import dev.ninjdai.doaddoncreate.registry.DoAddonFluidProperties;
import dev.ninjdai.doaddoncreate.utils.DoAddonColors;
import earth.terrarium.botarium.common.registry.fluid.FluidData;

import static dev.ninjdai.doaddoncreate.registry.DoAddonFluidProperties.FLUID_PROPERTIES;

@SupportsMod("brewery")
public class Brewery implements ModSupport {

    // Fluids
    static FluidData WHEAT_BEER_PROPS;
    static FluidData BARLEY_BEER_PROPS;
    static FluidData HOPS_BEER_PROPS;
    static FluidData HALEY_BEER_PROPS;
    static FluidData JOJANNIK_WHISKEY_PROPS;
    static FluidData LILITUSINGLEMALT_WHISKEY_PROPS;
    static FluidData CRISTELWALKER_WHISKEY_PROPS;
    static FluidData MAGGOALLAN_WHISKEY_PROPS;
    static FluidData CARRASCONLABEL_WHISKEY_PROPS;


    @Override
    public void registerFluidProperties() {
        final int BEER_VISCOSITY = 1750;
        final int WHISKEY_VISCOSITY = 2000;

        WHEAT_BEER_PROPS = FLUID_PROPERTIES.register("beer_wheat", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().get()
                .tintColor(DoAddonColors.WHEAT_BEER.value)
                .viscosity(BEER_VISCOSITY)
                .density(1500)
        );
        BARLEY_BEER_PROPS = FLUID_PROPERTIES.register("beer_barley", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().get()
                .tintColor(DoAddonColors.BARLEY_BEER.value)
                .viscosity(BEER_VISCOSITY)
                .density(1500)
        );
        HOPS_BEER_PROPS = FLUID_PROPERTIES.register("beer_hops", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().get()
                .tintColor(DoAddonColors.HOPS_BEER.value)
                .viscosity(BEER_VISCOSITY)
                .density(1500)
        );
        HALEY_BEER_PROPS = FLUID_PROPERTIES.register("beer_haley", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().get()
                .tintColor(DoAddonColors.HALEY_BEER.value)
                .viscosity(BEER_VISCOSITY)
                .density(1500)
        );

        JOJANNIK_WHISKEY_PROPS = FLUID_PROPERTIES.register("whiskey_jojannik", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().get()
                .tintColor(DoAddonColors.JOJANNIK_WHISKEY.value)
                .viscosity(WHISKEY_VISCOSITY)
                .density(1500)
        );
        LILITUSINGLEMALT_WHISKEY_PROPS = FLUID_PROPERTIES.register("whiskey_lilitusinglemalt", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().get()
                .tintColor(DoAddonColors.LILITUSINGLEMALT_WHISKEY.value)
                .viscosity(WHISKEY_VISCOSITY)
                .density(1500)
        );
        CRISTELWALKER_WHISKEY_PROPS = FLUID_PROPERTIES.register("whiskey_cristelwalker", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().get()
                .tintColor(DoAddonColors.CRISTELWALKER_WHISKEY.value)
                .viscosity(WHISKEY_VISCOSITY)
                .density(1500)
        );
        MAGGOALLAN_WHISKEY_PROPS = FLUID_PROPERTIES.register("whiskey_maggoallan", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().get()
                .tintColor(DoAddonColors.MAGGOALLAN_WHISKEY.value)
                .viscosity(WHISKEY_VISCOSITY)
        );
        CARRASCONLABEL_WHISKEY_PROPS = FLUID_PROPERTIES.register("whiskey_carrasonlabel", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().get()
                .tintColor(DoAddonColors.CARRASCONLABEL_WHISKEY.value)
                .viscosity(WHISKEY_VISCOSITY)
        );
    }

    /*public static final RegistryEntry<Fluid> WHEAT_BEER = FLUIDS.register("beer_wheat", () -> new BotariumSourceFluid(DoAddonFluidProperties.WHEAT_BEER));
    public static final RegistryEntry<Fluid> WHEAT_BEER_FLOWING = FLUIDS.register("flowing_beer_wheat", () -> new BotariumFlowingFluid(DoAddonFluidProperties.WHEAT_BEER));
    public static final RegistryEntry<Fluid> BARLEY_BEER = FLUIDS.register("beer_barley", () -> new BotariumSourceFluid(DoAddonFluidProperties.BARLEY_BEER));
    public static final RegistryEntry<Fluid> BARLEY_BEER_FLOWING = FLUIDS.register("flowing_beer_barley", () -> new BotariumFlowingFluid(DoAddonFluidProperties.BARLEY_BEER));
    public static final RegistryEntry<Fluid> HOPS_BEER = FLUIDS.register("beer_hops", () -> new BotariumSourceFluid(DoAddonFluidProperties.HOPS_BEER));
    public static final RegistryEntry<Fluid> HOPS_BEER_FLOWING = FLUIDS.register("flowing_beer_hope", () -> new BotariumFlowingFluid(DoAddonFluidProperties.HOPS_BEER));
    public static final RegistryEntry<Fluid> HALEY_BEER = FLUIDS.register("beer_haley", () -> new BotariumSourceFluid(DoAddonFluidProperties.HALEY_BEER));
    public static final RegistryEntry<Fluid> HALEY_BEER_FLOWING = FLUIDS.register("flowing_beer_haley", () -> new BotariumFlowingFluid(DoAddonFluidProperties.HALEY_BEER));

    public static final RegistryEntry<Fluid> JOJANNIK_WHISKEY = FLUIDS.register("whiskey_jojannik", () -> new BotariumSourceFluid(DoAddonFluidProperties.JOJANNIK_WHISKEY));
    public static final RegistryEntry<Fluid> JOJANNIK_WHISKEY_FLOWING = FLUIDS.register("flowing_whiskey_jojannik", () -> new BotariumFlowingFluid(DoAddonFluidProperties.JOJANNIK_WHISKEY));
    public static final RegistryEntry<Fluid> LILITUSINGLEMALT_WHISKEY = FLUIDS.register("whiskey_lilitusinglemalt", () -> new BotariumSourceFluid(DoAddonFluidProperties.LILITUSINGLEMALT_WHISKEY));
    public static final RegistryEntry<Fluid> LILITUSINGLEMALT_WHISKEY_FLOWING = FLUIDS.register("flowing_whiskey_lilitusinglemalt", () -> new BotariumFlowingFluid(DoAddonFluidProperties.LILITUSINGLEMALT_WHISKEY));
    public static final RegistryEntry<Fluid> CRISTELWALKER_WHISKEY = FLUIDS.register("whiskey_cristelwalker", () -> new BotariumSourceFluid(DoAddonFluidProperties.CRISTELWALKER_WHISKEY));
    public static final RegistryEntry<Fluid> CRISTELWALKER_WHISKEY_FLOWING = FLUIDS.register("flowing_whiskey_cristelwalker", () -> new BotariumFlowingFluid(DoAddonFluidProperties.CRISTELWALKER_WHISKEY));
    public static final RegistryEntry<Fluid> MAGGOALLAN_WHISKEY = FLUIDS.register("whiskey_maggoallan", () -> new BotariumSourceFluid(DoAddonFluidProperties.MAGGOALLAN_WHISKEY));
    public static final RegistryEntry<Fluid> MAGGOALLAN_WHISKEY_FLOWING = FLUIDS.register("flowing_whiskey_maggoallan", () -> new BotariumFlowingFluid(DoAddonFluidProperties.MAGGOALLAN_WHISKEY));
    public static final RegistryEntry<Fluid> CARRASCONLABEL_WHISKEY = FLUIDS.register("whiskey_carrasconlabel", () -> new BotariumSourceFluid(DoAddonFluidProperties.CARRASCONLABEL_WHISKEY));
    public static final RegistryEntry<Fluid> CARRASCONLABEL_WHISKEY_FLOWING = FLUIDS.register("flowing_whiskey_carrasconlabel", () -> new BotariumFlowingFluid(DoAddonFluidProperties.CARRASCONLABEL_WHISKEY));
    */
}
