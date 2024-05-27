package dev.ninjdai.doaddonfluids.registry.items;

import earth.terrarium.botarium.common.registry.fluid.FluidBucketItem;
import earth.terrarium.botarium.common.registry.fluid.FluidData;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.satisfyu.meadow.registry.ObjectRegistry;
import org.jetbrains.annotations.NotNull;

public class DrinkablePlaceableFluidBucketItem extends FluidBucketItem {

    private final boolean isWooden;

    public DrinkablePlaceableFluidBucketItem(FluidData data, Properties properties, boolean isWooden) {
        super(data, properties);
        this.isWooden = isWooden;
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
        if ((!player.isCrouching()) && getData().getInformation().canPlace()) {
            ItemStack itemStack = player.getItemInHand(interactionHand);
            BlockHitResult blockHitResult = getPlayerPOVHitResult(level, player, net.minecraft.world.level.ClipContext.Fluid.NONE);
            if (blockHitResult.getType() == HitResult.Type.MISS) {
                return ItemUtils.startUsingInstantly(level, player, interactionHand);
            } else if (blockHitResult.getType() != HitResult.Type.BLOCK) {
                return InteractionResultHolder.pass(itemStack);
            } else {
                BlockPos blockPos = blockHitResult.getBlockPos();
                Direction direction = blockHitResult.getDirection();
                BlockPos blockPos2 = blockPos.relative(direction);
                if (level.mayInteract(player, blockPos) && player.mayUseItemAt(blockPos2, direction, itemStack)) {
                    BlockState blockState;
                    blockState = level.getBlockState(blockPos);
                    BlockPos blockPos3 = blockState.getBlock() instanceof LiquidBlockContainer ? blockPos : blockPos2;
                    if (this.emptyContents(player, level, blockPos3, blockHitResult)) {
                        this.checkExtraContent(player, level, itemStack, blockPos3);
                        if (player instanceof ServerPlayer) {
                            CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer)player, blockPos3, itemStack);
                        }

                        player.awardStat(Stats.ITEM_USED.get(this));
                        return InteractionResultHolder.sidedSuccess(!player.getAbilities().instabuild ? getBucket() : itemStack, level.isClientSide());
                    } else {
                        return InteractionResultHolder.fail(itemStack);
                    }
                } else {
                    return InteractionResultHolder.fail(itemStack);
                }
            }
        }
        return ItemUtils.startUsingInstantly(level, player, interactionHand);
    }

    public ItemStack getBucket(){
        if(this.isWooden)
            return new ItemStack(ObjectRegistry.WOODEN_BUCKET.get());
        else
            return new ItemStack(Items.BUCKET);
    }
}
