package dev.ninjdai.doaddoncompat.registry.items;

import earth.terrarium.botarium.common.registry.fluid.FluidBucketItem;
import earth.terrarium.botarium.common.registry.fluid.FluidData;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.satisfyu.meadow.registry.ObjectRegistry;
import org.jetbrains.annotations.NotNull;

public class DrinkablePlaceableFluidBucketItem extends FluidBucketItem {

    public DrinkablePlaceableFluidBucketItem(FluidData data, Properties properties) {
        super(data, properties);
    }

    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity) {
        if (livingEntity instanceof ServerPlayer serverPlayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, itemStack);
            serverPlayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (livingEntity instanceof Player && !((Player)livingEntity).getAbilities().instabuild) {
            itemStack.shrink(1);
        }

        if (!level.isClientSide) {
            livingEntity.removeAllEffects();
        }

        return itemStack.isEmpty() ? new ItemStack(ObjectRegistry.WOODEN_BUCKET.get()) : itemStack;
    }

    public int getUseDuration(ItemStack itemStack) {
        return 32;
    }

    public UseAnim getUseAnimation(ItemStack itemStack) {
        return UseAnim.DRINK;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(@NotNull Level level, Player player, @NotNull InteractionHand interactionHand) {
        if (!player.isCrouching() && getData().getInformation().canPlace()) {
            return super.use(level, player, interactionHand);
        }
        return ItemUtils.startUsingInstantly(level, player, interactionHand);
    }
}
