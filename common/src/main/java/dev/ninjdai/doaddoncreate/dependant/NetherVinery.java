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

@SupportsMod("nethervinery")
public class NetherVinery implements ModSupport {

    // Fluids
    static FluidData CRIMSON_GRAPEJUICE_PROPS;
    static FluidData WARPED_GRAPEJUICE_PROPS;

    @Override
    public void registerFluidProperties() {
        final int GRAPEJUICE_VISCOSITY = 2000;

        CRIMSON_GRAPEJUICE_PROPS = FLUID_PROPERTIES.register("crimson_grapejuice", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().namespacedTextures("nethervinery", "crimson_grapejuice").get().viscosity(GRAPEJUICE_VISCOSITY));
        WARPED_GRAPEJUICE_PROPS = FLUID_PROPERTIES.register("warped_grapejuice", new DoAddonFluidProperties.BetterBuilder().setWhiskyBeerGrapeJuice().namespacedTextures("nethervinery", "warped_grapejuice").get().viscosity(GRAPEJUICE_VISCOSITY));
    }

    static DoAddonFluids.StateIndependantFluid CRIMSON_GRAPEJUICE;
    static DoAddonFluids.StateIndependantFluid WARPED_GRAPEJUICE;

    public void registerFluids() {
        CRIMSON_GRAPEJUICE = DoAddonFluids.registerDualStatesByName("crimson_grapejuice", CRIMSON_GRAPEJUICE_PROPS);
        WARPED_GRAPEJUICE = DoAddonFluids.registerDualStatesByName("warped_grapejuice", WARPED_GRAPEJUICE_PROPS);
    }

    static RegistryEntry<Block> CRIMSON_GRAPEJUICE_BLOCK;
    static RegistryEntry<Block> WARPED_GRAPEJUICE_BLOCK;

    @Override
    public void registerBlocks() {
        CRIMSON_GRAPEJUICE_BLOCK = BLOCKS.register("crimson_grapejuice", () -> new BotariumLiquidBlock(CRIMSON_GRAPEJUICE_PROPS, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.CRIMSON_HYPHAE)));
        WARPED_GRAPEJUICE_BLOCK = BLOCKS.register("warped_grapejuice", () -> new BotariumLiquidBlock(WARPED_GRAPEJUICE_PROPS, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.WARPED_HYPHAE)));
    }
}
