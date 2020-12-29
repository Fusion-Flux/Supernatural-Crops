package com.fusionflux.supernaturalcrops.blocks;

import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import net.minecraft.block.*;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.*;

import java.util.Iterator;
import java.util.Random;

public class CustomFarmland extends Block {
    public static final IntProperty MAGMATED;
    protected static final VoxelShape SHAPE;

    protected CustomFarmland(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(MAGMATED, 0));
    }
@Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        if (direction == Direction.UP && !state.canPlaceAt(world, pos)) {
            world.getBlockTickScheduler().schedule(pos, this, 1);
        }

        return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.up());
        return !blockState.getMaterial().isSolid() || blockState.getBlock() instanceof FenceGateBlock || blockState.getBlock() instanceof PistonExtensionBlock;
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return !this.getDefaultState().canPlaceAt(ctx.getWorld(), ctx.getBlockPos()) ? Blocks.STONE.getDefaultState() : super.getPlacementState(ctx);
    }
    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }


    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            setToStone(state, world, pos);
        }

    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int i = state.get(MAGMATED);
        if (!isLavaNearby(world, pos)) {
            if (i > 0) {
                world.setBlockState(pos, state.with(MAGMATED, i - 1), 2);
            } else if (!hasCrop(world, pos)) {
                setToStone(state, world, pos);
            }
        } else if (i < 1) {
            world.setBlockState(pos, state.with(MAGMATED, 1), 2);
        }else if (i < 2) {
            world.setBlockState(pos, state.with(MAGMATED, 2), 2);
        }else if (i < 3) {
            world.setBlockState(pos, state.with(MAGMATED, 3), 2);
        }else if (i < 4) {
            world.setBlockState(pos, state.with(MAGMATED, 4), 2);
        }else if (i < 5) {
            world.setBlockState(pos, state.with(MAGMATED, 5), 2);
        }else if (i < 6) {
            world.setBlockState(pos, state.with(MAGMATED, 6), 2);
        }else if (i < 7) {
            world.setBlockState(pos, state.with(MAGMATED, 7), 2);
        }else if (i < 8) {
            world.setBlockState(pos, state.with(MAGMATED, 8), 2);
        }
    }

public void onLandedUpon(World world, BlockPos pos, Entity entity, float distance) {
    entity.handleFallDamage(distance, 1.0F);
}

    public static void setToStone(BlockState state, World world, BlockPos pos) {
        world.setBlockState(pos, pushEntitiesUpBeforeBlockChange(state, Blocks.STONE.getDefaultState(), world, pos));
    }

    private static boolean hasCrop(BlockView world, BlockPos pos) {
        Block block = world.getBlockState(pos.up()).getBlock();
        return block instanceof CropBlock || block instanceof StemBlock || block instanceof AttachedStemBlock;
    }

    private static boolean isLavaNearby(WorldView world, BlockPos pos) {
        Iterator var2 = BlockPos.iterate(pos.add(-4, 0, -4), pos.add(4, 1, 4)).iterator();

        BlockPos blockPos;
        do {
            if (!var2.hasNext()) {
                return false;
            }

            blockPos = (BlockPos)var2.next();
        } while(!world.getFluidState(blockPos).isIn(FluidTags.LAVA));

        return true;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(MAGMATED);
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    public void onSteppedOn(World world, BlockPos pos, Entity entity) {
        if (SupernaturalCropsConfig.ENABLED.ENABLE_SCRAPED_STONE_MAGMATED_DAMAGE.getValue()) {
            if(world.getBlockState(pos).get(MAGMATED)>7){
            if (!entity.isFireImmune() && entity instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity) entity)) {
                entity.damage(DamageSource.HOT_FLOOR, 1.0F);
            }
        }
    }
        super.onSteppedOn(world, pos, entity);
    }

    static {
        MAGMATED = IntProperty.of("magmated", 0, 8);
        SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);
    }
}
