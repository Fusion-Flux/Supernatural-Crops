package com.fusionflux.supernaturalcrops.block;

import com.fusionflux.supernaturalcrops.OreBush;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import com.fusionflux.supernaturalcrops.item.SupernaturalCropsItems;
import com.fusionflux.supernaturalcrops.item.group.SupernaturalCropsItemGroups;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Lazy;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

import static com.fusionflux.supernaturalcrops.SupernaturalCrops.id;

public class SupernaturalCropsBlocks {
	public static FabricBlockSettings bushBlockSettings() {
		return FabricBlockSettings.of(Material.PLANT)
				.noCollision()
				.breakInstantly()
				.sounds(BlockSoundGroup.SWEET_BERRY_BUSH);
	}

	public enum OreBushes implements OreBush {
		COAL("coal_bush", Items.COAL,
				() -> SupernaturalCropsConfig.get().enabled.enableCoalCrops),
		IRON("iron_bush", Items.IRON_INGOT, new Lazy<>(() ->
				SupernaturalCropsConfig.get().nuggetBalance.enableIronCropNuggets
						? Items.IRON_NUGGET
						: Items.IRON_INGOT),
				() -> SupernaturalCropsConfig.get().enabled.enableIronCrops),
		GOLD("gold_bush", Items.GOLD_INGOT, new Lazy<>(() ->
				SupernaturalCropsConfig.get().nuggetBalance.enableGoldCropNuggets
						? Items.GOLD_NUGGET
						: Items.GOLD_INGOT),
				() -> SupernaturalCropsConfig.get().enabled.enableGoldCrops),
		DIAMOND("diamond_bush", Items.DIAMOND, new Lazy<>(() ->
				SupernaturalCropsConfig.get().nuggetBalance.enableDiamondCropNuggets
						? SupernaturalCropsItems.DIAMOND_SHARD
						: Items.DIAMOND),
				() -> SupernaturalCropsConfig.get().enabled.enableDiamondCrops),
		EMERALD("emerald_bush", Items.EMERALD, new Lazy<>(() ->
				SupernaturalCropsConfig.get().nuggetBalance.enableEmeraldCropNuggets
						? SupernaturalCropsItems.EMERALD_SHARD
						: Items.EMERALD),
				() -> SupernaturalCropsConfig.get().enabled.enableEmeraldCrops),
		NETHERITE("netherite_bush", Items.NETHERITE_INGOT, new Lazy<>(() ->
				SupernaturalCropsConfig.get().nuggetBalance.enableNetheriteCropNuggets
						? SupernaturalCropsItems.NETHERITE_FLAKE
						: Items.NETHERITE_SCRAP),
				() -> SupernaturalCropsConfig.get().enabled.enableNetheriteCrops),
		REDSTONE("redstone_bush", Items.REDSTONE,
				() -> SupernaturalCropsConfig.get().enabled.enableRedstoneCrops),
		LAPIS_LAZULI("lapis_lazuli_bush", Items.LAPIS_LAZULI,
				() -> SupernaturalCropsConfig.get().enabled.enableLapisLazuliCrops),
		QUARTZ("quartz_bush", Items.QUARTZ,
				() -> SupernaturalCropsConfig.get().enabled.enableQuartzCrops);

		private final String path;
		private final Item ingot;
		private final Lazy<Item> harvestResult;
		private final Lazy<Boolean> enabled;

		OreBushes(String path, Item ingot, Lazy<Item> harvestResult, Supplier<Boolean> enabled) {
			this.path = path;
			this.ingot = ingot;
			this.harvestResult = harvestResult;
			this.enabled = new Lazy<>(enabled);
		}

		OreBushes(String path, Item ingot, Supplier<Boolean> enabled) {
			this(path, ingot, new Lazy<>(() -> ingot), enabled);
		}

		@Override
		public boolean isEnabled() {
			return enabled.get();
		}

		@Override
		public String getPath() {
			return path;
		}

		@Override
		public Item getIngot() {
			return ingot;
		}

		@Override
		public Item getHarvestResult() {
			return harvestResult.get();
		}
	}

	public static final OreBushBlock COAL_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.COAL);
	public static final OreBushBlock IRON_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.IRON);
	public static final OreBushBlock GOLD_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.GOLD);
	public static final OreBushBlock DIAMOND_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.DIAMOND);
	public static final OreBushBlock EMERALD_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.EMERALD);
	public static final OreBushBlock NETHERITE_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.NETHERITE);
	public static final OreBushBlock REDSTONE_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.REDSTONE);
	public static final OreBushBlock LAPIS_LAZULI_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.LAPIS_LAZULI);
	public static final OreBushBlock QUARTZ_BUSH = new OreBushBlock(bushBlockSettings(), OreBushes.QUARTZ);

	public static final Block EMBEDDED_ABYSS = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.4F));
    public static final ScrapedStoneBlock SCRAPED_STONE = new ScrapedStoneBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5F).ticksRandomly());

    public static void register() {
		Registry.register(Registry.BLOCK, id("embedded_abyss"), EMBEDDED_ABYSS);
		Registry.register(Registry.ITEM, id("embedded_abyss"),
				new BlockItem(EMBEDDED_ABYSS, new Item.Settings().group(SupernaturalCropsItemGroups.GENERAL)));
		Registry.register(Registry.BLOCK, id("scraped_stone"), SCRAPED_STONE);
		Registry.register(Registry.ITEM, id("scraped_stone"),
				new BlockItem(SCRAPED_STONE, new Item.Settings().group(SupernaturalCropsItemGroups.GENERAL)));

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
				new BlockItem(bushBlock, SupernaturalCropsItems.bushSeedSettings()));
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

