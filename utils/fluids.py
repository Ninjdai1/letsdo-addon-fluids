#!/bin/python
import pyperclip

print("Fluid Generator for lazy people")

while True:
    fluid = {}
    fluid["id"] = input("Fluid ID: ").lower().replace(" ", "_")
    print("FluidProperties: ")
    fluidproperties = f"""
    public static final FluidData {fluid['id'].upper()} = FLUID_PROPERTIES.register("{fluid['id']}", FluidProperties.create()
            .still(new ResourceLocation("minecraft", "block/water_still"))
            .flowing(new ResourceLocation("minecraft", "block/water_flow"))
            .overlay(new ResourceLocation("minecraft", "block/water_flow"))
            .screenOverlay(new ResourceLocation("minecraft", "textures/misc/underwater.png"))
            .tintColor(DoAddonColors.{fluid['id'].upper()}.value)
            .canConvertToSource(false)
            .canDrown(true)
            .canExtinguish(true)
            .canHydrate(true)
            .canPushEntity(true)
            .canSwim(true)
            .viscosity(1500)
            .density(1500)
    );
    """
    pyperclip.copy(fluidproperties)

    c = input("Fluid Color (HEX): ")
    fluid["color"] = tuple(int(c.upper().replace("#", "")[i:i+2], 16) for i in (0, 2, 4))
    fluidcolor = f"{fluid['id'].upper()}{fluid['color']},"
    pyperclip.copy(fluidcolor)

    input()
    fluidbucket = f"public static final RegistryEntry<Item> {fluid['id'].upper()}_BUCKET = BUCKETS.register(\"{fluid['id']}_bucket\", () -> new FluidBucketItem(DoAddonFluidProperties.{fluid['id'].upper()}, bucketProperties()));"
    pyperclip.copy(fluidbucket)


