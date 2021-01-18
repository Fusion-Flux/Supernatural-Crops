package com.fusionflux.supernaturalcrops.block;

import com.fusionflux.supernaturalcrops.SupernaturalCrops;
import com.fusionflux.supernaturalcrops.config.SupernaturalCropsConfig;
import net.devtech.arrp.json.loot.JCondition;
import net.devtech.arrp.json.loot.JEntry;
import net.devtech.arrp.json.loot.JLootTable;
import net.devtech.arrp.json.loot.JRoll;
import net.devtech.arrp.json.recipe.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Arrays;
import java.util.List;

public class SupernaturalCropsBlocks {

	public static final Item DIAMOND_SHARD = registerShard(new Item(new FabricItemSettings().group(SupernaturalCrops.SUPERNATURALCROPS_GROUP).fireproof()), "diamond_shard", Items.DIAMOND, false);

	public static final Item EMERALD_SHARD = registerShard(new Item(new FabricItemSettings().group(SupernaturalCrops.SUPERNATURALCROPS_GROUP).fireproof()), "emerald_shard", Items.EMERALD, false);

	public static final Item NETHERITE_FLAKE = registerShard(new Item(new FabricItemSettings().group(SupernaturalCrops.SUPERNATURALCROPS_GROUP).fireproof()), "netherite_flake", Items.NETHERITE_SCRAP, true);

	public static final OreBush COAL_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), Items.COAL);

	public static final OreBush IRON_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_IRON_CROP_NUGGETS.getValue() ? Items.IRON_NUGGET : Items.IRON_INGOT);

	public static final OreBush GOLD_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_GOLD_CROP_NUGGETS.getValue() ? Items.GOLD_NUGGET : Items.GOLD_INGOT);

	public static final OreBush DIAMOND_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_DIAMOND_CROP_NUGGETS.getValue() ? SupernaturalCropsBlocks.DIAMOND_SHARD : Items.DIAMOND);

	public static final OreBush EMERALD_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_EMERALD_CROP_NUGGETS.getValue() ? SupernaturalCropsBlocks.EMERALD_SHARD : Items.EMERALD);

	public static final OreBush NETHERITE_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), SupernaturalCropsConfig.NUGGET_BALANCE.ENABLE_NETHERITE_CROP_NUGGETS.getValue() ? SupernaturalCropsBlocks.NETHERITE_FLAKE : Items.NETHERITE_SCRAP);

	public static final OreBush REDSTONE_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), Items.REDSTONE);

	public static final OreBush LAPIS_LAZULI_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), Items.LAPIS_LAZULI);

	public static final OreBush QUARTZ_BUSH = new OreBush(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH), Items.QUARTZ);


	public static final Block EMBEDDED_ABYSS = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.4F));
	public static final Item SEED_OF_THE_ABYSS = new Item(new FabricItemSettings().group(SupernaturalCrops.SUPERNATURALCROPS_GROUP).fireproof());

	public static void registerBlocks() {
		Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "seed_of_the_abyss"), SEED_OF_THE_ABYSS);
		Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, "embedded_abyss"), SupernaturalCropsBlocks.EMBEDDED_ABYSS);
		Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, "embedded_abyss"), new BlockItem(SupernaturalCropsBlocks.EMBEDDED_ABYSS, new Item.Settings().group(SupernaturalCrops.SUPERNATURALCROPS_GROUP)));



		if (SupernaturalCropsConfig.ENABLED.ENABLE_COAL_CROPS.getValue()) {
			registerBush("coal_bush", SupernaturalCropsBlocks.COAL_BUSH, Items.COAL);
		}
		if (SupernaturalCropsConfig.ENABLED.ENABLE_IRON_CROPS.getValue()) {
			registerBush("iron_bush", SupernaturalCropsBlocks.IRON_BUSH, Items.IRON_INGOT);
		}
		if (SupernaturalCropsConfig.ENABLED.ENABLE_GOLD_CROPS.getValue()) {
			registerBush("gold_bush", SupernaturalCropsBlocks.GOLD_BUSH, Items.GOLD_INGOT);
		}
		if (SupernaturalCropsConfig.ENABLED.ENABLE_DIAMOND_CROPS.getValue()) {
			registerBush("diamond_bush", SupernaturalCropsBlocks.DIAMOND_BUSH, Items.DIAMOND);
		}
		if (SupernaturalCropsConfig.ENABLED.ENABLE_EMERALD_CROPS.getValue()) {
			registerBush("emerald_bush", SupernaturalCropsBlocks.EMERALD_BUSH, Items.EMERALD);
		}
		if (SupernaturalCropsConfig.ENABLED.ENABLE_NETHERITE_CROPS.getValue()) {
			registerBush("netherite_bush", SupernaturalCropsBlocks.NETHERITE_BUSH, Items.NETHERITE_SCRAP);
		}
		if (SupernaturalCropsConfig.ENABLED.ENABLE_REDSTONE_CROPS.getValue()) {
			registerBush("redstone_bush", SupernaturalCropsBlocks.REDSTONE_BUSH, Items.REDSTONE);
		}
		if (SupernaturalCropsConfig.ENABLED.ENABLE_LAPIS_LAZULI_CROPS.getValue()) {
			registerBush("lapis_lazuli_bush", SupernaturalCropsBlocks.LAPIS_LAZULI_BUSH, Items.LAPIS_LAZULI);
		}
		if (SupernaturalCropsConfig.ENABLED.ENABLE_QUARTZ_CROPS.getValue()) {
			registerBush("quartz_bush", SupernaturalCropsBlocks.QUARTZ_BUSH, Items.QUARTZ);
		}
	}

	public static Item registerShard(Item shardItem, String shardPath, Item output, boolean isSpecialSnowflake) {
		Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, shardPath), shardItem);
		createRecipe(shardPath,
				isSpecialSnowflake ? "AA " : "AAA",
				isSpecialSnowflake ? "AA " : "AAA",
				isSpecialSnowflake ? "   " : "AAA",
				output,
				createKey("A", shardItem));
		return shardItem;
	}

	public static void registerBush(String path, Block block, Item ingot) {
		Registry.register(Registry.BLOCK, new Identifier(SupernaturalCrops.MOD_ID, path), block);
		Registry.register(Registry.ITEM, new Identifier(SupernaturalCrops.MOD_ID, path + "_seeds"), new BlockItem(block, new Item.Settings().group(SupernaturalCrops.SUPERNATURALCROPS_GROUP)));
		createRecipe(path + "_seeds",
				"AAA",
				"ABA",
				"AAA",
				block.asItem(),
				createKey("A", ingot),
				createKey("B", SEED_OF_THE_ABYSS));
		SupernaturalCrops.RESOURCE_PACK.addLootTable(new Identifier(SupernaturalCrops.MOD_ID, path), JLootTable
				.loot("minecraft:block")
				.pool(JLootTable.pool()
				.rolls(new JRoll(1, 1))
				.entry(new JEntry()
						.type("minecraft:item")
						.name("supernaturalcrops:" + path + "_seeds"))
				.condition(new JCondition("minecraft:survives_explosion")))
		);
	}

	@Environment(EnvType.CLIENT)
	public static void registerRenderLayers() {
		BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.QUARTZ_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.LAPIS_LAZULI_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.REDSTONE_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.NETHERITE_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.EMERALD_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.DIAMOND_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.GOLD_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.IRON_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(SupernaturalCropsBlocks.COAL_BUSH, RenderLayer.getCutout());
	}

	private static KeyInformation createKey(String name, Item... items) {
		return new KeyInformation(name, Arrays.asList(items));
	}

	private static void createRecipe(String name, String pattern1, String pattern2, String pattern3, Item result, KeyInformation... keys) {
		JKeys jKeys = JKeys.keys();
		for (KeyInformation key : keys) {
			JIngredient ingredients = JIngredient.ingredient();
			for (Item item : key.items) {
				ingredients.item(item);
			}
			jKeys.key(key.name, ingredients);
		}

		SupernaturalCrops.RESOURCE_PACK.addRecipe(new Identifier(SupernaturalCrops.MOD_ID, name), JRecipe.shaped(
				JPattern.pattern(
						pattern1,
						pattern2,
						pattern3
				),
				jKeys,
				JResult.item(result)
		));
	}

	private static class KeyInformation {
		public String name;
		public List<Item> items;

		public KeyInformation(String name, List<Item> items) {
			this.name = name;
			this.items = items;
		}
	}
}

