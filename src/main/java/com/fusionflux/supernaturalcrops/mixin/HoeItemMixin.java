package com.fusionflux.supernaturalcrops.mixin;

import com.fusionflux.supernaturalcrops.block.SupernaturalCropsBlocks;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.tool.attribute.v1.DynamicAttributeTool;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(HoeItem.class)
public abstract class HoeItemMixin extends ToolItem {
	// TODO allow custom scraped blocks via datapacks?
	@Unique private static final Map<Block, BlockState> SCRAPED_BLOCKS;

	public HoeItemMixin(ToolMaterial material, Settings settings) {
		super(material, settings);
	}

	@Inject(method = "useOnBlock", at = @At("TAIL"), cancellable = true)
	private void scrapeBlock(ItemUsageContext ctx, CallbackInfoReturnable<ActionResult> cir) {
		World world = ctx.getWorld();
		BlockPos blockPos = ctx.getBlockPos();
		BlockState blockState = world.getBlockState(blockPos);
		int miningLevel = getMaterial().getMiningLevel();
		if (this instanceof DynamicAttributeTool)
			miningLevel = ((DynamicAttributeTool) this).getMiningLevel(FabricToolTags.HOES,
					blockState, ctx.getStack(), ctx.getPlayer());
		if (miningLevel >= ToolMaterials.NETHERITE.getMiningLevel()) {
			if (ctx.getSide() != Direction.DOWN && world.getBlockState(blockPos.up()).isAir()) {
				BlockState resultState = SCRAPED_BLOCKS.get(blockState.getBlock());
				if (resultState != null) {
					PlayerEntity playerEntity = ctx.getPlayer();
					world.playSound(playerEntity, blockPos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
					if (!world.isClient()) {
						world.setBlockState(blockPos, blockState, 11);
						if (playerEntity != null) {
							ctx.getStack().damage(1, playerEntity, (p) -> p.sendToolBreakStatus(ctx.getHand()));
						}
					}
					cir.setReturnValue(ActionResult.success(world.isClient));
				}
			}
			cir.cancel();
		}
	}

	static {
		SCRAPED_BLOCKS = Maps.newHashMap(ImmutableMap.of(Blocks.STONE, SupernaturalCropsBlocks.SCRAPED_STONE.getDefaultState()));
	}
}
