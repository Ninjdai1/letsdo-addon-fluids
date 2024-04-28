package dev.ninjdai.doaddoncompat.registry;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import dev.ninjdai.doaddoncompat.DoAddonCompat;
import dev.ninjdai.doaddoncompat.registry.blocks.fluids.LavaLikeLiquidBlock;
import earth.terrarium.botarium.common.registry.fluid.BotariumLiquidBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class DoAddonBlocks {
    public static final ResourcefulRegistry<Block> BLOCKS = ResourcefulRegistries.create(BuiltInRegistries.BLOCK, DoAddonCompat.MOD_ID);
    public static final ResourcefulRegistry<Block> TRANSPARENT_BLOCKS = ResourcefulRegistries.create(BLOCKS);

    public static final RegistryEntry<Block> YEAST_BLOCK = BLOCKS.register("yeast", () -> new LavaLikeLiquidBlock(DoAddonFluidProperties.YEAST, BlockBehaviour.Properties.copy(Blocks.LAVA).mapColor(MapColor.COLOR_BROWN)));
    public static final RegistryEntry<Block> BUFFALO_MILK_BLOCK = BLOCKS.register("buffalo_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.BUFFALO_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final RegistryEntry<Block> AMETHYST_MILK_BLOCK = BLOCKS.register("amethyst_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.AMETHYST_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final RegistryEntry<Block> SHEEP_MILK_BLOCK = BLOCKS.register("sheep_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.SHEEP_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final RegistryEntry<Block> GRAIN_MILK_BLOCK = BLOCKS.register("grain_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.GRAIN_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.COLOR_BROWN)));
    public static final RegistryEntry<Block> GOAT_MILK_BLOCK = BLOCKS.register("goat_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.GOAT_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final RegistryEntry<Block> WARPED_MILK_BLOCK = BLOCKS.register("warped_milk", () -> new BotariumLiquidBlock(DoAddonFluidProperties.WARPED_MILK, BlockBehaviour.Properties.copy(Blocks.WATER).mapColor(MapColor.WARPED_WART_BLOCK)));


    public static void registerExtraProperties() {}
}