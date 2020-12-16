package com.fusionflux.supernaturalcrops.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import java.util.Set;

@Mixin(HoeItem.class)
public class HoeItemMixin extends MiningToolItem {

    protected HoeItemMixin(float attackDamage, float attackSpeed, ToolMaterial material, Set<Block> effectiveBlocks, Settings settings) {
        super(attackDamage, attackSpeed, material, effectiveBlocks, settings);
    }

@Inject(method = "useOnBlock", at = @At("RETURN"), cancellable = true)
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        if (context.getSide() != Direction.DOWN && world.getBlockState(blockPos.up()).isAir()) {
            BlockState blockState = (BlockState)TILLED_BLOCKS.get(world.getBlockState(blockPos).getBlock());
            if (blockState != null) {
                PlayerEntity playerEntity = context.getPlayer();
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                if (!world.isClient) {
                    world.setBlockState(blockPos, blockState, 11);
                    if (playerEntity != null) {
                        context.getStack().damage(1, playerEntity, (p) -> {
                            p.sendToolBreakStatus(context.getHand());
                        });
                    }
                }

                return ActionResult.success(world.isClient);
            }
        }

        return ActionResult.PASS;
    }
}
