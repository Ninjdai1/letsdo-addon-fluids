package dev.ninjdai.doaddonfluids.registry;


import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import dev.ninjdai.doaddonfluids.DoAddonFluids;
import earth.terrarium.botarium.common.registry.fluid.BotariumFlowingFluid;
import earth.terrarium.botarium.common.registry.fluid.BotariumSourceFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.Fluid;

public class DoAddonFluid {

    public static final ResourcefulRegistry<Fluid> FLUIDS = ResourcefulRegistries.create(BuiltInRegistries.FLUID, DoAddonFluids.MOD_ID);

    //public static final RegistryEntry<Fluid> YEAST = FLUIDS.register("yeast", () -> new BotariumSourceFluid(DoAddonFluidProperties.YEAST));
    //public static final RegistryEntry<Fluid> YEAST_FLOWING = FLUIDS.register("flowing_yeast", () -> new BotariumFlowingFluid(DoAddonFluidProperties.YEAST));

    //BREWERY
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

    //VINERY
    public static final RegistryEntry<Fluid> RED_GRAPEJUICE = FLUIDS.register("red_grapejuice", () -> new BotariumSourceFluid(DoAddonFluidProperties.RED_GRAPEJUICE));
    public static final RegistryEntry<Fluid> RED_GRAPEJUICE_FLOWING = FLUIDS.register("flowing_red_grapejuice", () -> new BotariumFlowingFluid(DoAddonFluidProperties.RED_GRAPEJUICE));
    public static final RegistryEntry<Fluid> WHITE_GRAPEJUICE = FLUIDS.register("white_grapejuice", () -> new BotariumSourceFluid(DoAddonFluidProperties.WHITE_GRAPEJUICE));
    public static final RegistryEntry<Fluid> WHITE_GRAPEJUICE_FLOWING = FLUIDS.register("flowing_white_grapejuice", () -> new BotariumFlowingFluid(DoAddonFluidProperties.WHITE_GRAPEJUICE));

    public static final RegistryEntry<Fluid> JUNGLE_RED_GRAPEJUICE = FLUIDS.register("jungle_red_grapejuice", () -> new BotariumSourceFluid(DoAddonFluidProperties.JUNGLE_RED_GRAPEJUICE));
    public static final RegistryEntry<Fluid> JUNGLE_RED_GRAPEJUICE_FLOWING = FLUIDS.register("flowing_jungle_red_grapejuice", () -> new BotariumFlowingFluid(DoAddonFluidProperties.JUNGLE_RED_GRAPEJUICE));
    public static final RegistryEntry<Fluid> JUNGLE_WHITE_GRAPEJUICE = FLUIDS.register("jungle_white_grapejuice", () -> new BotariumSourceFluid(DoAddonFluidProperties.JUNGLE_WHITE_GRAPEJUICE));
    public static final RegistryEntry<Fluid> JUNGLE_WHITE_GRAPEJUICE_FLOWING = FLUIDS.register("flowing_jungle_white_grapejuice", () -> new BotariumFlowingFluid(DoAddonFluidProperties.JUNGLE_WHITE_GRAPEJUICE));

    public static final RegistryEntry<Fluid> SAVANNA_RED_GRAPEJUICE = FLUIDS.register("savanna_red_grapejuice", () -> new BotariumSourceFluid(DoAddonFluidProperties.SAVANNA_RED_GRAPEJUICE));
    public static final RegistryEntry<Fluid> SAVANNA_RED_GRAPEJUICE_FLOWING = FLUIDS.register("flowing_savanna_red_grapejuice", () -> new BotariumFlowingFluid(DoAddonFluidProperties.SAVANNA_RED_GRAPEJUICE));
    public static final RegistryEntry<Fluid> SAVANNA_WHITE_GRAPEJUICE = FLUIDS.register("savanna_white_grapejuice", () -> new BotariumSourceFluid(DoAddonFluidProperties.SAVANNA_WHITE_GRAPEJUICE));
    public static final RegistryEntry<Fluid> SAVANNA_WHITE_GRAPEJUICE_FLOWING = FLUIDS.register("flowing_savanna_white_grapejuice", () -> new BotariumFlowingFluid(DoAddonFluidProperties.SAVANNA_WHITE_GRAPEJUICE));

    public static final RegistryEntry<Fluid> TAIGA_RED_GRAPEJUICE = FLUIDS.register("taiga_red_grapejuice", () -> new BotariumSourceFluid(DoAddonFluidProperties.TAIGA_RED_GRAPEJUICE));
    public static final RegistryEntry<Fluid> TAIGA_RED_GRAPEJUICE_FLOWING = FLUIDS.register("flowing_taiga_red_grapejuice", () -> new BotariumFlowingFluid(DoAddonFluidProperties.TAIGA_RED_GRAPEJUICE));
    public static final RegistryEntry<Fluid> TAIGA_WHITE_GRAPEJUICE = FLUIDS.register("taiga_white_grapejuice", () -> new BotariumSourceFluid(DoAddonFluidProperties.TAIGA_WHITE_GRAPEJUICE));
    public static final RegistryEntry<Fluid> TAIGA_WHITE_GRAPEJUICE_FLOWING = FLUIDS.register("flowing_taiga_white_grapejuice", () -> new BotariumFlowingFluid(DoAddonFluidProperties.TAIGA_WHITE_GRAPEJUICE));

    //NETHERVINERY
    public static final RegistryEntry<Fluid> CRIMSON_GRAPEJUICE = FLUIDS.register("crimson_grapejuice", () -> new BotariumSourceFluid(DoAddonFluidProperties.CRIMSON_GRAPEJUICE));
    public static final RegistryEntry<Fluid> CRIMSON_GRAPEJUICE_FLOWING = FLUIDS.register("flowing_crimson_grapejuice", () -> new BotariumFlowingFluid(DoAddonFluidProperties.CRIMSON_GRAPEJUICE));
    public static final RegistryEntry<Fluid> WARPED_GRAPEJUICE = FLUIDS.register("warped_grapejuice", () -> new BotariumSourceFluid(DoAddonFluidProperties.WARPED_GRAPEJUICE));
    public static final RegistryEntry<Fluid> WARPED_GRAPEJUICE_FLOWING = FLUIDS.register("flowing_warped_grapejuice", () -> new BotariumFlowingFluid(DoAddonFluidProperties.WARPED_GRAPEJUICE));

    //MEADOW
    public static final RegistryEntry<Fluid> BUFFALO_MILK = FLUIDS.register("buffalo_milk", () -> new BotariumSourceFluid(DoAddonFluidProperties.BUFFALO_MILK));
    public static final RegistryEntry<Fluid> BUFFALO_MILK_FLOWING = FLUIDS.register("flowing_buffalo_milk", () -> new BotariumFlowingFluid(DoAddonFluidProperties.BUFFALO_MILK));

    public static final RegistryEntry<Fluid> AMETHYST_MILK = FLUIDS.register("amethyst_milk", () -> new BotariumSourceFluid(DoAddonFluidProperties.AMETHYST_MILK));
    public static final RegistryEntry<Fluid> AMETHYST_MILK_FLOWING = FLUIDS.register("flowing_amethyst_milk", () -> new BotariumFlowingFluid(DoAddonFluidProperties.AMETHYST_MILK));

    public static final RegistryEntry<Fluid> GOAT_MILK = FLUIDS.register("goat_milk", () -> new BotariumSourceFluid(DoAddonFluidProperties.GOAT_MILK));
    public static final RegistryEntry<Fluid> GOAT_MILK_FLOWING = FLUIDS.register("flowing_goat_milk", () -> new BotariumFlowingFluid(DoAddonFluidProperties.GOAT_MILK));

    public static final RegistryEntry<Fluid> GRAIN_MILK = FLUIDS.register("grain_milk", () -> new BotariumSourceFluid(DoAddonFluidProperties.GRAIN_MILK));
    public static final RegistryEntry<Fluid> GRAIN_MILK_FLOWING = FLUIDS.register("flowing_grain_milk", () -> new BotariumFlowingFluid(DoAddonFluidProperties.GRAIN_MILK));

    public static final RegistryEntry<Fluid> SHEEP_MILK = FLUIDS.register("sheep_milk", () -> new BotariumSourceFluid(DoAddonFluidProperties.SHEEP_MILK));
    public static final RegistryEntry<Fluid> SHEEP_MILK_FLOWING = FLUIDS.register("flowing_sheep_milk", () -> new BotariumFlowingFluid(DoAddonFluidProperties.SHEEP_MILK));

    public static final RegistryEntry<Fluid> WARPED_MILK = FLUIDS.register("warped_milk", () -> new BotariumSourceFluid(DoAddonFluidProperties.WARPED_MILK));
    public static final RegistryEntry<Fluid> WARPED_MILK_FLOWING = FLUIDS.register("flowing_warped_milk", () -> new BotariumFlowingFluid(DoAddonFluidProperties.WARPED_MILK));

    //HERBALBREWS
    public static final RegistryEntry<Fluid> GREEN_TEA = FLUIDS.register("green_tea", () -> new BotariumSourceFluid(DoAddonFluidProperties.GREEN_TEA));
    public static final RegistryEntry<Fluid> GREEN_TEA_FLOWING = FLUIDS.register("flowing_green_tea", () -> new BotariumFlowingFluid(DoAddonFluidProperties.GREEN_TEA));

    public static final RegistryEntry<Fluid> BLACK_TEA = FLUIDS.register("black_tea", () -> new BotariumSourceFluid(DoAddonFluidProperties.BLACK_TEA));
    public static final RegistryEntry<Fluid> BLACK_TEA_FLOWING = FLUIDS.register("flowing_black_tea", () -> new BotariumFlowingFluid(DoAddonFluidProperties.BLACK_TEA));

    public static final RegistryEntry<Fluid> HIBISCUS_TEA = FLUIDS.register("hibiscus_tea", () -> new BotariumSourceFluid(DoAddonFluidProperties.HIBISCUS_TEA));
    public static final RegistryEntry<Fluid> HIBISCUS_TEA_FLOWING = FLUIDS.register("flowing_hibiscus_tea", () -> new BotariumFlowingFluid(DoAddonFluidProperties.HIBISCUS_TEA));

    public static final RegistryEntry<Fluid> LAVENDER_TEA = FLUIDS.register("lavender_tea", () -> new BotariumSourceFluid(DoAddonFluidProperties.LAVENDER_TEA));
    public static final RegistryEntry<Fluid> LAVENDER_TEA_FLOWING = FLUIDS.register("flowing_lavender_tea", () -> new BotariumFlowingFluid(DoAddonFluidProperties.LAVENDER_TEA));

    public static final RegistryEntry<Fluid> YERBA_MATE_TEA = FLUIDS.register("yerba_mate_tea", () -> new BotariumSourceFluid(DoAddonFluidProperties.YERBA_MATE_TEA));
    public static final RegistryEntry<Fluid> YERBA_MATE_TEA_FLOWING = FLUIDS.register("flowing_yerba_mate_tea", () -> new BotariumFlowingFluid(DoAddonFluidProperties.YERBA_MATE_TEA));

    public static final RegistryEntry<Fluid> ROOIBOS_TEA = FLUIDS.register("rooibos_tea", () -> new BotariumSourceFluid(DoAddonFluidProperties.ROOIBOS_TEA));
    public static final RegistryEntry<Fluid> ROOIBOS_TEA_FLOWING = FLUIDS.register("flowing_rooibos_tea", () -> new BotariumFlowingFluid(DoAddonFluidProperties.ROOIBOS_TEA));

    public static final RegistryEntry<Fluid> OOLONG_TEA = FLUIDS.register("oolong_tea", () -> new BotariumSourceFluid(DoAddonFluidProperties.OOLONG_TEA));
    public static final RegistryEntry<Fluid> OOLONG_TEA_FLOWING = FLUIDS.register("flowing_oolong_tea", () -> new BotariumFlowingFluid(DoAddonFluidProperties.OOLONG_TEA));

    public static final RegistryEntry<Fluid> COFFEE = FLUIDS.register("coffee", () -> new BotariumSourceFluid(DoAddonFluidProperties.COFFEE));
    public static final RegistryEntry<Fluid> COFFEE_FLOWING = FLUIDS.register("flowing_coffee", () -> new BotariumFlowingFluid(DoAddonFluidProperties.COFFEE));

    public static final RegistryEntry<Fluid> MILK_COFFEE = FLUIDS.register("milk_coffee", () -> new BotariumSourceFluid(DoAddonFluidProperties.MILK_COFFEE));
    public static final RegistryEntry<Fluid> MILK_COFFEE_FLOWING = FLUIDS.register("flowing_milk_coffee", () -> new BotariumFlowingFluid(DoAddonFluidProperties.MILK_COFFEE));
}