package com.fusionflux.supernaturalcrops.block;

import com.fusionflux.supernaturalcrops.VanillaOreBushes;
import com.fusionflux.supernaturalcrops.item.group.ItemGroups;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;

import static com.fusionflux.supernaturalcrops.SupernaturalCrops.id;

public class SupernaturalCropsBlocks {
	public static final OreBushBlock COAL_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),
			VanillaOreBushes.COAL);
	public static final OreBushBlock IRON_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),
			VanillaOreBushes.IRON);
	public static final OreBushBlock GOLD_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),
			VanillaOreBushes.GOLD);
	public static final OreBushBlock DIAMOND_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),
			VanillaOreBushes.DIAMOND);
	public static final OreBushBlock EMERALD_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),
			VanillaOreBushes.EMERALD);
	public static final OreBushBlock NETHERITE_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),
			VanillaOreBushes.NETHERITE);
	public static final OreBushBlock REDSTONE_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),
			VanillaOreBushes.REDSTONE);
	public static final OreBushBlock LAPIS_LAZULI_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),
			VanillaOreBushes.LAPIS_LAZULI);
	public static final OreBushBlock QUARTZ_BUSH = new OreBushBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH),
			VanillaOreBushes.QUARTZ);

	public static final Block EMBEDDED_ABYSS = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.4F));
    public static final ScrapedStoneBlock SCRAPED_STONE = new ScrapedStoneBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5F).ticksRandomly());

    public static void register() {
		Registry.register(Registry.BLOCK, id("embedded_abyss"), EMBEDDED_ABYSS);
		Registry.register(Registry.ITEM, id("embedded_abyss"),
				new BlockItem(EMBEDDED_ABYSS, new Item.Settings().group(ItemGroups.SUPERNATURAL_CROPS)));
		Registry.register(Registry.BLOCK, id("scraped_stone"), SCRAPED_STONE);
		Registry.register(Registry.ITEM, id("scraped_stone"),
				new BlockItem(SCRAPED_STONE, new Item.Settings().group(ItemGroups.SUPERNATURAL_CROPS)));

		registerBush(COAL_BUSH);
		registerBush(IRON_BUSH);
		registerBush(GOLD_BUSH);
		registerBush(DIAMOND_BUSH);
		registerBush(EMERALD_BUSH);
		registerBush(NETHERITE_BUSH);
		registerBush(REDSTONE_BUSH);
		registerBush(LAPIS_LAZULI_BUSH);
		registerBush(QUARTZ_BUSH);
	}

	public static void registerBush(OreBushBlock bushBlock) {
		Registry.register(Registry.BLOCK, bushBlock.getBush().getBlockId(), bushBlock);
		Registry.register(Registry.ITEM, bushBlock.getBush().getSeedsId(),
				new BlockItem(bushBlock, new Item.Settings().group(ItemGroups.SUPERNATURAL_CROPS)));
	}

	@Environment(EnvType.CLIENT)
	public static void registerRenderLayers() {
		BlockRenderLayerMap.INSTANCE.putBlock(QUARTZ_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(LAPIS_LAZULI_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(REDSTONE_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(NETHERITE_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(EMERALD_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DIAMOND_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GOLD_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(IRON_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(COAL_BUSH, RenderLayer.getCutout());
	}
}

