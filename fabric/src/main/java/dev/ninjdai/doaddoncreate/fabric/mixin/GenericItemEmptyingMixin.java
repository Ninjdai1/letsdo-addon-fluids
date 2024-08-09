package dev.ninjdai.doaddoncreate.fabric.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.simibubi.create.content.fluids.transfer.EmptyingRecipe;
import com.simibubi.create.content.fluids.transfer.GenericItemEmptying;
import dev.ninjdai.doaddoncreate.dependant.vinery.Vinery;
import dev.ninjdai.doaddoncreate.reflection.annotations.SupportsMod;
import io.github.fabricators_of_create.porting_lib.fluids.FluidStack;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.Objects;

@Mixin(GenericItemEmptying.class)
@SupportsMod("vinery")
public class GenericItemEmptyingMixin {

    @WrapOperation(
            method = "emptyItem",
            at = @At(
                    value = "INVOKE",
                    target = "Lcom/simibubi/create/content/fluids/transfer/EmptyingRecipe;getResultingFluid()Lio/github/fabricators_of_create/porting_lib/fluids/FluidStack;",
                    ordinal = 0
            )
    )
    private static FluidStack wrapEmptyItem(EmptyingRecipe instance, Operation<FluidStack> original, @Local(argsOnly = true) ItemStack inputStack) {
        FluidStack fl = instance.getResultingFluid();
        if (inputStack.is(TagKey.create(Registries.ITEM, new ResourceLocation(new Vinery().supportedMod(), "wine")))) {
            CompoundTag additionalData = Objects.requireNonNullElse(fl.getTag(), new CompoundTag());
            additionalData.putString(new Vinery().supportedMod() + ":production_year", "red");
            fl.setTag(additionalData);
        }
        return fl;
    }

}
