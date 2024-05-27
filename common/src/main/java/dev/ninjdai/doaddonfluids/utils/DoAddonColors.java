package dev.ninjdai.doaddonfluids.utils;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import dev.ninjdai.doaddonfluids.registry.DoAddonFluidProperties;
import earth.terrarium.botarium.common.registry.fluid.BotariumFlowingFluid;
import earth.terrarium.botarium.common.registry.fluid.BotariumSourceFluid;
import net.minecraft.world.level.material.Fluid;

import java.awt.*;

public enum DoAddonColors {
    //BREWERY
    WHEAT_BEER(255, 227, 134),
    BARLEY_BEER(255, 225, 165),
    HOPS_BEER(247, 240, 233),
    HALEY_BEER(137, 46, 53),

    JOJANNIK_WHISKEY(201, 120, 76),
    LILITUSINGLEMALT_WHISKEY(240, 139, 8),
    CRISTELWALKER_WHISKEY(255, 184, 95),
    MAGGOALLAN_WHISKEY(255, 210, 57),
    CARRASCONLABEL_WHISKEY(144, 44, 19),

    //VINERY
    RED_GRAPEJUICE(40, 21, 43),
    WHITE_GRAPEJUICE(70, 79, 67),
    JUNGLE_RED_GRAPEJUICE(71, 20, 75),
    JUNGLE_WHITE_GRAPEJUICE(9, 39, 27),
    SAVANNA_RED_GRAPEJUICE(30, 13, 42),
    SAVANNA_WHITE_GRAPEJUICE(17, 22, 14),
    TAIGA_RED_GRAPEJUICE(13, 7, 14),
    TAIGA_WHITE_GRAPEJUICE(70, 79, 67),

    CRIMSON_GRAPEJUICE(191, 6, 70),
    WARPED_GRAPEJUICE(32, 140, 136),

    //MEADOW
    WARPED_MILK(22, 126, 134),
    SHEEP_MILK(254, 254, 254),
    GRAIN_MILK(223, 189, 157),
    GOAT_MILK(236, 218, 201),
    AMETHYST_MILK(210, 134, 206),
    BUFFALO_MILK(243, 230, 229),
    YEAST(232, 212, 171);

    private final Color color;
    public final int value;

    DoAddonColors(int r, int g, int b) {
        this.color = new Color(r, g, b);
        this.value = color.getRGB();
    }

    public Color getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }
}