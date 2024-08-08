package dev.ninjdai.doaddoncreate.dependant;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import dev.ninjdai.doaddoncreate.reflection.ModSupport;
import dev.ninjdai.doaddoncreate.reflection.annotations.SupportsMod;
import dev.ninjdai.doaddoncreate.registry.DoAddonFluidProperties;
import dev.ninjdai.doaddoncreate.registry.DoAddonFluids;
import earth.terrarium.botarium.common.registry.fluid.BotariumLiquidBlock;
import earth.terrarium.botarium.common.registry.fluid.FluidData;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import static dev.ninjdai.doaddoncreate.registry.DoAddonBlocks.BLOCKS;
import static dev.ninjdai.doaddoncreate.registry.DoAddonFluidProperties.FLUID_PROPERTIES;

@SupportsMod("vinery")
public class Vinery implements ModSupport {

    // Fluids
    static DoAddonFluids.StateIndependantFluid RED_GRAPEJUICE;
    static DoAddonFluids.StateIndependantFluid WHITE_GRAPEJUICE;
    static DoAddonFluids.StateIndependantFluid JUNGLE_RED_GRAPEJUICE;
    static DoAddonFluids.StateIndependantFluid JUNGLE_WHITE_GRAPEJUICE;
    static DoAddonFluids.StateIndependantFluid SAVANNA_RED_GRAPEJUICE;
    static DoAddonFluids.StateIndependantFluid SAVANNA_WHITE_GRAPEJUICE;
    static DoAddonFluids.StateIndependantFluid TAIGA_RED_GRAPEJUICE;
    static DoAddonFluids.StateIndependantFluid TAIGA_WHITE_GRAPEJUICE;

    public void registerFluids() {
        RED_GRAPEJUICE = DoAddonFluids.registerDualStatesByName("red_grapejuice");
        WHITE_GRAPEJUICE = DoAddonFluids.registerDualStatesByName("white_grapejuice");
        JUNGLE_RED_GRAPEJUICE = DoAddonFluids.registerDualStatesByName("jungle_red_grapejuice");
        JUNGLE_WHITE_GRAPEJUICE = DoAddonFluids.registerDualStatesByName("jungle_white_grapejuice");
        SAVANNA_RED_GRAPEJUICE = DoAddonFluids.registerDualStatesByName("savanna_red_grapejuice");
        SAVANNA_WHITE_GRAPEJUICE = DoAddonFluids.registerDualStatesByName("savanna_white_grapejuice");
        TAIGA_RED_GRAPEJUICE = DoAddonFluids.registerDualStatesByName("taiga_red_grapejuice");
        TAIGA_WHITE_GRAPEJUICE = DoAddonFluids.registerDualStatesByName("taiga_white_grapejuice");
    }

    static FluidData RED_GRAPEJUICE_PROPS;
    static FluidData WHITE_GRAPEJUICE_PROPS;
    static FluidData JUNGLE_RED_GRAPEJUICE_PROPS;
    static FluidData JUNGLE_WHITE_GRAPEJUICE_PROPS;
    static FluidData SAVANNA_RED_GRAPEJUICE_PROPS;
    static FluidData SAVANNA_WHITE_GRAPEJUICE_PROPS;
    static FluidData TAIGA_RED_GRAPEJUICE_PROPS;
    static FluidData TAIGA_WHITE_GRAPEJUICE_PROPS;

    @Override
    public void registerFluidProperties() {
        final int GRAPEJUICE_VISCOSITY = 2000;

        RED_GRAPEJUICE_PROPS = FLUID_PROPERTIES.register("red_grapejuice", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().namespacedTextures("vinery", "red_grapejuice").get().viscosity(GRAPEJUICE_VISCOSITY));
        WHITE_GRAPEJUICE_PROPS = FLUID_PROPERTIES.register("white_grapejuice", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().namespacedTextures("vinery", "white_grapejuice").get().viscosity(GRAPEJUICE_VISCOSITY));
        JUNGLE_RED_GRAPEJUICE_PROPS = FLUID_PROPERTIES.register("jungle_red_grapejuice", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().namespacedTextures("vinery", "jungle_red_grapejuice").get().viscosity(GRAPEJUICE_VISCOSITY));
        JUNGLE_WHITE_GRAPEJUICE_PROPS = FLUID_PROPERTIES.register("jungle_white_grapejuice", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().namespacedTextures("vinery", "jungle_white_grapejuice").get().viscosity(GRAPEJUICE_VISCOSITY));
        SAVANNA_RED_GRAPEJUICE_PROPS = FLUID_PROPERTIES.register("savanna_red_grapejuice", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().namespacedTextures("vinery", "savanna_red_grapejuice").get().viscosity(GRAPEJUICE_VISCOSITY));
        SAVANNA_WHITE_GRAPEJUICE_PROPS = FLUID_PROPERTIES.register("savanna_white_grapejuice", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().namespacedTextures("vinery", "savanna_white_grapejuice").get().viscosity(GRAPEJUICE_VISCOSITY));
        TAIGA_RED_GRAPEJUICE_PROPS = FLUID_PROPERTIES.register("taiga_red_grapejuice", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().namespacedTextures("vinery", "taiga_red_grapejuice").get().viscosity(GRAPEJUICE_VISCOSITY));
        TAIGA_WHITE_GRAPEJUICE_PROPS = FLUID_PROPERTIES.register("taiga_white_grapejuice", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().namespacedTextures("vinery", "taiga_white_grapejuice").get().viscosity(GRAPEJUICE_VISCOSITY));
    }

    static RegistryEntry<Block> RED_GRAPEJUICE_BLOCK;
    static RegistryEntry<Block> WHITE_GRAPEJUICE_BLOCK;
    static RegistryEntry<Block> JUNGLE_RED_GRAPEJUICE_BLOCK;
    static RegistryEntry<Block> JUNGLE_WHITE_GRAPEJUICE_BLOCK;
    static RegistryEntry<Block> SAVANNA_RED_GRAPEJUICE_BLOCK;
    static RegistryEntry<Block> SAVANNA_WHITE_GRAPEJUICE_BLOCK;
    static RegistryEntry<Block> TAIGA_RED_GRAPEJUICE_BLOCK;
    static RegistryEntry<Block> TAIGA_WHITE_GRAPEJUICE_BLOCK;

    @Override
    public void registerBlocks() {
        RED_GRAPEJUICE_BLOCK = BLOCKS.register("red_grapejuice", () -> new BotariumLiquidBlock(RED_GRAPEJUICE_PROPS, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_RED)));
        WHITE_GRAPEJUICE_BLOCK = BLOCKS.register("white_grapejuice", () -> new BotariumLiquidBlock(WHITE_GRAPEJUICE_PROPS, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_LIGHT_GREEN)));
        JUNGLE_RED_GRAPEJUICE_BLOCK = BLOCKS.register("jungle_red_grapejuice", () -> new BotariumLiquidBlock(JUNGLE_RED_GRAPEJUICE_PROPS, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_RED)));
        JUNGLE_WHITE_GRAPEJUICE_BLOCK = BLOCKS.register("jungle_white_grapejuice", () -> new BotariumLiquidBlock(JUNGLE_WHITE_GRAPEJUICE_PROPS, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_LIGHT_GREEN)));
        SAVANNA_RED_GRAPEJUICE_BLOCK = BLOCKS.register("savanna_red_grapejuice", () -> new BotariumLiquidBlock(SAVANNA_RED_GRAPEJUICE_PROPS, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_RED)));
        SAVANNA_WHITE_GRAPEJUICE_BLOCK = BLOCKS.register("savanna_white_grapejuice", () -> new BotariumLiquidBlock(SAVANNA_WHITE_GRAPEJUICE_PROPS, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_LIGHT_GREEN)));
        TAIGA_RED_GRAPEJUICE_BLOCK = BLOCKS.register("taiga_red_grapejuice", () -> new BotariumLiquidBlock(TAIGA_RED_GRAPEJUICE_PROPS, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_RED)));
        TAIGA_WHITE_GRAPEJUICE_BLOCK = BLOCKS.register("taiga_white_grapejuice", () -> new BotariumLiquidBlock(TAIGA_WHITE_GRAPEJUICE_PROPS, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    }
}
