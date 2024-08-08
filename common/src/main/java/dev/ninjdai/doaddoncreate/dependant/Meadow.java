package dev.ninjdai.doaddoncreate.dependant;

import dev.ninjdai.doaddoncreate.DoAddonCreate;
import dev.ninjdai.doaddoncreate.reflection.ModSupport;
import dev.ninjdai.doaddoncreate.reflection.annotations.SupportsMod;
import dev.ninjdai.doaddoncreate.registry.DoAddonFluids;
import dev.ninjdai.doaddoncreate.registry.DoAddonFluidProperties;
import dev.ninjdai.doaddoncreate.utils.DoAddonColors;
import earth.terrarium.botarium.common.registry.fluid.FluidData;
import earth.terrarium.botarium.common.registry.fluid.FluidProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.pathfinder.BlockPathTypes;

import static dev.ninjdai.doaddoncreate.registry.DoAddonFluidProperties.FLUID_PROPERTIES;

@SupportsMod("meadow")
public class Meadow implements ModSupport {

    // Fluids
    static DoAddonFluids.StateIndependantFluid RENNET;
    static DoAddonFluids.StateIndependantFluid BUFFALO_MILK;
    static DoAddonFluids.StateIndependantFluid AMETHYST_MILK;
    static DoAddonFluids.StateIndependantFluid GOAT_MILK;
    static DoAddonFluids.StateIndependantFluid GRAIN_MILK;
    static DoAddonFluids.StateIndependantFluid SHEEP_MILK;
    static DoAddonFluids.StateIndependantFluid WARPED_MILK;

    public void registerFluids() {
        RENNET = DoAddonFluids.registerDualStatesByName("rennet");
        BUFFALO_MILK = DoAddonFluids.registerDualStatesByName("buffalo_milk");
        AMETHYST_MILK = DoAddonFluids.registerDualStatesByName("amethyst_milk");
        GOAT_MILK = DoAddonFluids.registerDualStatesByName("goat_milk");
        GRAIN_MILK = DoAddonFluids.registerDualStatesByName("grain_milk");
        SHEEP_MILK = DoAddonFluids.registerDualStatesByName("sheep_milk");
        WARPED_MILK = DoAddonFluids.registerDualStatesByName("warped_milk");
    }

    static FluidData BUFFALO_PROPS;
    static FluidData AMETHYST_PROPS;
    static FluidData GOAT_PROPS;
    static FluidData GRAIN_PROPS;
    static FluidData SHEEP_PROPS;
    static FluidData WARPED_PROPS;
    static FluidData YEAST_PROPS;
    static FluidData RENNET_PROPS;

    @Override
    public void registerFluidProperties() {
        BUFFALO_PROPS = FLUID_PROPERTIES.register("buffalo_milk", new DoAddonFluidProperties.BetterBuilder().setMilk().get().tintColor(DoAddonColors.BUFFALO_MILK.value));
        AMETHYST_PROPS = FLUID_PROPERTIES.register("amethyst_milk", new DoAddonFluidProperties.BetterBuilder().setMilk().get().tintColor(DoAddonColors.AMETHYST_MILK.value));
        GOAT_PROPS = FLUID_PROPERTIES.register("goat_milk", new DoAddonFluidProperties.BetterBuilder().setMilk().get().tintColor(DoAddonColors.GOAT_MILK.value));
        GRAIN_PROPS = FLUID_PROPERTIES.register("grain_milk", new DoAddonFluidProperties.BetterBuilder().setMilk().get().tintColor(DoAddonColors.GRAIN_MILK.value));
        SHEEP_PROPS = FLUID_PROPERTIES.register("sheep_milk", new DoAddonFluidProperties.BetterBuilder().setMilk().get().tintColor(DoAddonColors.SHEEP_MILK.value));
        WARPED_PROPS = FLUID_PROPERTIES.register("warped_milk", new DoAddonFluidProperties.BetterBuilder().setMilk().get().tintColor(DoAddonColors.WARPED_MILK.value));
        // Lava-like
        YEAST_PROPS = FLUID_PROPERTIES.register("yeast", FluidProperties.create()
                .still(DoAddonCreate.id("block/blank_lava/blank_lava_still"))
                .flowing(DoAddonCreate.id("block/blank_lava/blank_lava_flow"))
                .overlay(DoAddonCreate.id("block/blank_lava/blank_lava_flow"))
                .screenOverlay(new ResourceLocation("minecraft", "textures/misc/underwater.png"))
                .tintColor(DoAddonColors.YEAST.value)
                .canConvertToSource(false)
                .canDrown(false)
                .canExtinguish(false)
                .canHydrate(false)
                .canPushEntity(true)
                .canSwim(false)
                .lightLevel(0)
                .motionScale(0.004)
                .pathType(BlockPathTypes.LAVA)
                .tickRate(10)
                .viscosity(1500)
                .density(1500)
        );

        RENNET_PROPS = FLUID_PROPERTIES.register("rennet", FluidProperties.create()
                .tintColor(DoAddonColors.RENNET.value)
                .canConvertToSource(false)
                .canDrown(true)
                .canExtinguish(true)
                .canHydrate(false)
                .canPushEntity(true)
                .canSwim(true)
                .viscosity(2500)
                .density(2000)
        );
    }

    @Override
    public void registerBlocks() {
        //public static final RegistryEntry<Block> YEAST_BLOCK = BLOCKS.register("yeast", () -> new LavaLikeLiquidBlock(DoAddonFluidProperties.YEAST, BlockBehaviour.Properties.copy(Blocks.LAVA).mapColor(MapColor.COLOR_BROWN)));
    /*public static final RegistryEntry<Block> BUFFALO_MILK_BLOCK = BLOCKS.register("buffalo_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.BUFFALO_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final RegistryEntry<Block> AMETHYST_MILK_BLOCK = BLOCKS.register("amethyst_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.AMETHYST_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final RegistryEntry<Block> SHEEP_MILK_BLOCK = BLOCKS.register("sheep_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.SHEEP_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final RegistryEntry<Block> GRAIN_MILK_BLOCK = BLOCKS.register("grain_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.GRAIN_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_BROWN)));
    public static final RegistryEntry<Block> GOAT_MILK_BLOCK = BLOCKS.register("goat_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.GOAT_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final RegistryEntry<Block> WARPED_MILK_BLOCK = BLOCKS.register("warped_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.WARPED_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.WARPED_WART_BLOCK)));*/
    }
}
