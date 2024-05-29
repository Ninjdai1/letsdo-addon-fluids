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
    YEAST(232, 212, 171),

    //HERBALBREWS
    GREEN_TEA(165, 214, 35),
    BLACK_TEA(62, 10, 18),
    HIBISCUS_TEA(162, 24, 38),
    LAVENDER_TEA(65, 33, 108),
    YERBA_MATE_TEA(66, 79, 42),
    ROOIBOS_TEA(251, 68, 46),
    OOLONG_TEA(199, 105, 24),

    COFFEE(55, 35, 34),
    MILK_COFFEE(110, 66, 52),

    //BAKERY
    STRAWBERRY_JAM(210, 59, 59),
    ;

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