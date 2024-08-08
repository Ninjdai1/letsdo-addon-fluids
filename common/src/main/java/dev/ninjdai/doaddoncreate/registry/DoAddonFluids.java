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

    static StateIndependantFluid registerDualStatesByName(String name, FluidData properties) {
        RegistryEntry<Fluid> source = FLUIDS.register(name, () -> new BotariumSourceFluid(properties));
        RegistryEntry<Fluid> flowing = FLUIDS.register("flowing_" + name, () -> new BotariumFlowingFluid(properties));
        return new StateIndependantFluid(source, flowing);
    }

    record StateIndependantFluid(RegistryEntry<Fluid> source, RegistryEntry<Fluid> flowing) {}

}