package dev.ninjdai.doaddoncreate.registry;


import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import dev.ninjdai.doaddoncreate.DoAddonCreate;
import earth.terrarium.botarium.common.registry.fluid.BotariumFlowingFluid;
import earth.terrarium.botarium.common.registry.fluid.BotariumSourceFluid;
import earth.terrarium.botarium.common.registry.fluid.FluidData;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.Fluid;

public interface DoAddonFluids {

    ResourcefulRegistry<Fluid> FLUIDS = ResourcefulRegistries.create(BuiltInRegistries.FLUID, DoAddonCreate.MOD_ID);

    static StateIndependantFluid registerDualStatesByName(String name) {
        try {
            FluidData fluid = (FluidData) DoAddonFluidProperties.class.getField(name.toUpperCase()).get(null);
            RegistryEntry<Fluid> source = FLUIDS.register(name, () -> new BotariumSourceFluid(fluid));
            RegistryEntry<Fluid> flowing = FLUIDS.register("flowing_" + name, () -> new BotariumFlowingFluid(fluid));
            return new StateIndependantFluid(source, flowing);
        } catch (Exception e) {
            DoAddonCreate.LOGGER.error("FluidData not found for {}", name); return null;
        }
    }

    record StateIndependantFluid(RegistryEntry<Fluid> source, RegistryEntry<Fluid> flowing) {}

}