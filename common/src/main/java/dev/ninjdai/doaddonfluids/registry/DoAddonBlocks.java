package dev.ninjdai.doaddonfluids.registry;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import dev.ninjdai.doaddonfluids.DoAddonFluids;
import dev.ninjdai.doaddonfluids.registry.blocks.fluids.LavaLikeLiquidBlock;
import earth.terrarium.botarium.common.registry.fluid.BotariumLiquidBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class DoAddonBlocks {
    public static final ResourcefulRegistry<Block> BLOCKS = ResourcefulRegistries.create(BuiltInRegistries.BLOCK, DoAddonFluids.MOD_ID);
    public static final ResourcefulRegistry<Block> TRANSPARENT_BLOCKS = ResourcefulRegistries.create(BLOCKS);

    //public static final RegistryEntry<Block> YEAST_BLOCK = BLOCKS.register("yeast", () -> new LavaLikeLiquidBlock(DoAddonFluidProperties.YEAST, BlockBehaviour.Properties.copy(Blocks.LAVA).mapColor(MapColor.COLOR_BROWN)));
    /*public static final RegistryEntry<Block> BUFFALO_MILK_BLOCK = BLOCKS.register("buffalo_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.BUFFALO_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final RegistryEntry<Block> AMETHYST_MILK_BLOCK = BLOCKS.register("amethyst_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.AMETHYST_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final RegistryEntry<Block> SHEEP_MILK_BLOCK = BLOCKS.register("sheep_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.SHEEP_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final RegistryEntry<Block> GRAIN_MILK_BLOCK = BLOCKS.register("grain_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.GRAIN_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_BROWN)));
    public static final RegistryEntry<Block> GOAT_MILK_BLOCK = BLOCKS.register("goat_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.GOAT_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final RegistryEntry<Block> WARPED_MILK_BLOCK = BLOCKS.register("warped_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.WARPED_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.WARPED_WART_BLOCK)));*/

    public static final RegistryEntry<Block> RED_GRAPEJUICE_BLOCK = BLOCKS.register("red_grapejuice", () -> new BotariumLiquidBlock(DoAddonFluidProperties.RED_GRAPEJUICE, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_RED)));
    public static final RegistryEntry<Block> WHITE_GRAPEJUICE_BLOCK = BLOCKS.register("white_grapejuice", () -> new BotariumLiquidBlock(DoAddonFluidProperties.WHITE_GRAPEJUICE, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryEntry<Block> JUNGLE_RED_GRAPEJUICE_BLOCK = BLOCKS.register("jungle_red_grapejuice", () -> new BotariumLiquidBlock(DoAddonFluidProperties.JUNGLE_RED_GRAPEJUICE, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_RED)));
    public static final RegistryEntry<Block> JUNGLE_WHITE_GRAPEJUICE_BLOCK = BLOCKS.register("jungle_white_grapejuice", () -> new BotariumLiquidBlock(DoAddonFluidProperties.JUNGLE_WHITE_GRAPEJUICE, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryEntry<Block> SAVANNA_RED_GRAPEJUICE_BLOCK = BLOCKS.register("savanna_red_grapejuice", () -> new BotariumLiquidBlock(DoAddonFluidProperties.SAVANNA_RED_GRAPEJUICE, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_RED)));
    public static final RegistryEntry<Block> SAVANNA_WHITE_GRAPEJUICE_BLOCK = BLOCKS.register("savanna_white_grapejuice", () -> new BotariumLiquidBlock(DoAddonFluidProperties.SAVANNA_WHITE_GRAPEJUICE, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryEntry<Block> TAIGA_RED_GRAPEJUICE_BLOCK = BLOCKS.register("taiga_red_grapejuice", () -> new BotariumLiquidBlock(DoAddonFluidProperties.RED_GRAPEJUICE, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_RED)));
    public static final RegistryEntry<Block> TAIGA_WHITE_GRAPEJUICE_BLOCK = BLOCKS.register("taiga_white_grapejuice", () -> new BotariumLiquidBlock(DoAddonFluidProperties.WHITE_GRAPEJUICE, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryEntry<Block> CRIMSON_GRAPEJUICE_BLOCK = BLOCKS.register("crimson_grapejuice", () -> new BotariumLiquidBlock(DoAddonFluidProperties.CRIMSON_GRAPEJUICE, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.CRIMSON_HYPHAE)));
    public static final RegistryEntry<Block> WARPED_GRAPEJUICE_BLOCK = BLOCKS.register("warped_grapejuice", () -> new BotariumLiquidBlock(DoAddonFluidProperties.WARPED_GRAPEJUICE, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.WARPED_HYPHAE)));

    public static void registerExtraProperties() {}
}