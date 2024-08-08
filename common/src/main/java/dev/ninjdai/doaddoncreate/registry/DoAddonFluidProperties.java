package dev.ninjdai.doaddoncreate.registry;

import dev.ninjdai.doaddoncreate.DoAddonCreate;
import dev.ninjdai.doaddoncreate.utils.DoAddonColors;
import earth.terrarium.botarium.common.registry.fluid.FluidData;
import earth.terrarium.botarium.common.registry.fluid.FluidProperties;
import earth.terrarium.botarium.common.registry.fluid.FluidRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.pathfinder.BlockPathTypes;

public class DoAddonFluidProperties {

    public static final FluidRegistry FLUID_PROPERTIES = new FluidRegistry(DoAddonCreate.MOD_ID);

    public static class BetterBuilder {
        private FluidProperties.Builder internal = FluidProperties.create();

        public BetterBuilder() {
            waterTextures();
        }

        public BetterBuilder waterTextures() {
            internal.still(new ResourceLocation("minecraft", "block/water_still"))
                    .flowing(new ResourceLocation("minecraft", "block/water_flow"))
                    .overlay(new ResourceLocation("minecraft", "block/water_flow"))
                    .screenOverlay(new ResourceLocation("minecraft", "textures/misc/underwater.png"));
            return this;
        }

        public BetterBuilder simpleTextures(String block) {
            internal.still(new ResourceLocation(DoAddonCreate.MOD_ID, "block/" + block))
                    .flowing(new ResourceLocation(DoAddonCreate.MOD_ID, "block/" + block))
                    .overlay(new ResourceLocation(DoAddonCreate.MOD_ID, "block/" + block))
                    .screenOverlay(new ResourceLocation("minecraft", "textures/misc/underwater.png"));
            return this;
        }

        public BetterBuilder namespacedTextures(String namespace, String block) {
            internal.still(new ResourceLocation(namespace, "block/" + block))
                    .flowing(new ResourceLocation(namespace, "block/" + block))
                    .overlay(new ResourceLocation(namespace, "block/" + block))
                    .screenOverlay(new ResourceLocation("minecraft", "textures/misc/underwater.png"));
            return this;
        }

        public BetterBuilder setTea() {
            internal.canConvertToSource(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .canHydrate(true)
                    .canPushEntity(true)
                    .canSwim(true)
                    .viscosity(1500);

            return this;
        }

        public BetterBuilder setMilk() {
            internal.canConvertToSource(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .canHydrate(true)
                    .canPushEntity(true)
                    .canSwim(true)
                    .viscosity(1500);
            return this;
        }

        public BetterBuilder setWhiskyBeerGrapeJuice() {
            internal.canConvertToSource(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .canHydrate(true)
                    .canPushEntity(true)
                    .canSwim(true)
                    .viscosity(1500);
            return this;
        }

        public BetterBuilder setJam() {
            internal.density(1500);
            return this;
        }

        public FluidProperties.Builder get() {
            return this.internal;
        }

    }
}