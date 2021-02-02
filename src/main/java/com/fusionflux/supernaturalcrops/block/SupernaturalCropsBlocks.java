package com.fusionflux.supernaturalcrops.block;

import com.fusionflux.supernaturalcrops.OreBush;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import com.fusionflux.supernaturalcrops.item.BushSeedItem;
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

import java.util.function.BooleanSupplier;
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
		IRON("iron_bush", Items.IRON_INGOT, () ->
				SupernaturalCropsConfig.get().nuggetBalance.enableIronCropNuggets
						? Items.IRON_NUGGET
						: Items.IRON_INGOT,
				() -> SupernaturalCropsConfig.get().enabled.enableIronCrops),
		GOLD("gold_bush", Items.GOLD_INGOT, () ->
				SupernaturalCropsConfig.get().nuggetBalance.enableGoldCropNuggets
						? Items.GOLD_NUGGET
						: Items.GOLD_INGOT,
				() -> SupernaturalCropsConfig.get().enabled.enableGoldCrops),
		DIAMOND("diamond_bush", Items.DIAMOND, () ->
				SupernaturalCropsConfig.get().nuggetBalance.enableDiamondCropNuggets
						? SupernaturalCropsItems.DIAMOND_SHARD
						: Items.DIAMOND,
				() -> SupernaturalCropsConfig.get().enabled.enableDiamondCrops),
		EMERALD("emerald_bush", Items.EMERALD, () ->
				SupernaturalCropsConfig.get().nuggetBalance.enableEmeraldCropNuggets
						? SupernaturalCropsItems.EMERALD_SHARD
						: Items.EMERALD,
				() -> SupernaturalCropsConfig.get().enabled.enableEmeraldCrops),
		NETHERITE("netherite_bush", Items.NETHERITE_INGOT, () ->
				SupernaturalCropsConfig.get().nuggetBalance.enableNetheriteCropNuggets
						? SupernaturalCropsItems.NETHERITE_FLAKE
						: Items.NETHERITE_SCRAP,
				() -> SupernaturalCropsConfig.get().enabled.enableNetheriteCrops),
		REDSTONE("redstone_bush", Items.REDSTONE,
				() -> SupernaturalCropsConfig.get().enabled.enableRedstoneCrops),
		LAPIS_LAZULI("lapis_lazuli_bush", Items.LAPIS_LAZULI,
				() -> SupernaturalCropsConfig.get().enabled.enableLapisLazuliCrops),
		QUARTZ("quartz_bush", Items.QUARTZ,
				() -> SupernaturalCropsConfig.get().enabled.enableQuartzCrops),
		SEED_OF_THE_ABYSS("seed_of_the_abyss_bush", SupernaturalCropsItems.SEED_OF_THE_ABYSS,
				() -> SupernaturalCropsConfig.get().enabled.enableSeedOfTheAbyssCrops);

		private final String path;
		private final Item ingot;
		private final Supplier<Item> harvestResult;
		private final BooleanSupplier enabled;
		private final Lazy<OreBushBlock> block;

		OreBushes(String path, Item ingot, Supplier<Item> harvestResult, BooleanSupplier enabled) {
			this.path = path;
			this.ingot = ingot;
			this.harvestResult = harvestResult;
			this.enabled = enabled;
			block = new Lazy<>(() -> new OreBushBlock(bushBlockSettings(), this));
		}

		OreBushes(String path, Item ingot, BooleanSupplier enabled) {
			this(path, ingot, () -> ingot, enabled);
		}

		@Override
		public boolean isEnabled() {
			return enabled.getAsBoolean();
		}

		@Override
		public String getPath() {
			return path;
		}

		@Override
		public OreBushBlock getBlock() {
			return block.get();
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

	public static final Block EMBEDDED_ABYSS = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.4F));
    public static final ScrapedStoneBlock SCRAPED_STONE = new ScrapedStoneBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5F).ticksRandomly());
	public static final Block BLOCK_OF_THE_ABYSS = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.5F).luminance(2));


    public static void register() {
		Registry.register(Registry.BLOCK, id("embedded_abyss"), EMBEDDED_ABYSS);
		Registry.register(Registry.ITEM, id("embedded_abyss"),
				new BlockItem(EMBEDDED_ABYSS, new Item.Settings().group(SupernaturalCropsItemGroups.GENERAL)));
		Registry.register(Registry.BLOCK, id("scraped_stone"), SCRAPED_STONE);
		Registry.register(Registry.ITEM, id("scraped_stone"),
				new BlockItem(SCRAPED_STONE, new Item.Settings().group(SupernaturalCropsItemGroups.GENERAL)));
		Registry.register(Registry.BLOCK, id("block_of_the_abyss"), BLOCK_OF_THE_ABYSS);
		Registry.register(Registry.ITEM, id("block_of_the_abyss"),
				new BlockItem(BLOCK_OF_THE_ABYSS, new Item.Settings().group(SupernaturalCropsItemGroups.GENERAL)));
		registerBushBlocksAndItems(OreBushes.values());
	}

	public static void registerBushBlocksAndItems(OreBush... bushes) {
    	for (OreBush bush : bushes) {
			Registry.register(Registry.BLOCK, bush.getBlockId(), bush.getBlock());
			Registry.register(Registry.ITEM, bush.getSeedsId(),
					new BushSeedItem(bush.getBlock()));
		}
	}

	@Environment(EnvType.CLIENT)
	public static void registerRenderLayers() {
		registerBushRenderLayers(OreBushes.values());
	}

	@Environment(EnvType.CLIENT)
	public static void registerBushRenderLayers(OreBush... bushes) {
    	for (OreBush bush : bushes)
    		BlockRenderLayerMap.INSTANCE.putBlock(bush.getBlock(), RenderLayer.getCutout());
	}
}

