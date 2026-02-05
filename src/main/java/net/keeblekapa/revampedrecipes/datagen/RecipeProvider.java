package net.keeblekapa.revampedrecipes.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.keeblekapa.revampedrecipes.util.Tags;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;


public class RecipeProvider extends FabricRecipeProvider {
    public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {


                // Blocks
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.COBBLESTONE_SLAB)
                        .criterion(hasItem(Items.COBBLESTONE_SLAB), conditionsFromItem(Items.COBBLESTONE_SLAB))
                        .offerTo(exporter, "cobblestone_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.COBBLESTONE_STAIRS)
                        .criterion(hasItem(Items.COBBLESTONE_STAIRS), conditionsFromItem(Items.COBBLESTONE_STAIRS))
                        .offerTo(exporter, "cobblestone_from_stairs");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.COBBLESTONE_WALL)
                        .criterion(hasItem(Items.COBBLESTONE_WALL), conditionsFromItem(Items.COBBLESTONE_WALL))
                        .offerTo(exporter, "cobblestone_from_wall");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.MOSSY_COBBLESTONE, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.MOSSY_COBBLESTONE_SLAB)
                        .criterion(hasItem(Items.MOSSY_COBBLESTONE_SLAB), conditionsFromItem(Items.MOSSY_COBBLESTONE_SLAB))
                        .offerTo(exporter, "mossy_cobblestone_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.MOSSY_COBBLESTONE, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.MOSSY_COBBLESTONE_STAIRS)
                        .criterion(hasItem(Items.MOSSY_COBBLESTONE_STAIRS), conditionsFromItem(Items.MOSSY_COBBLESTONE_STAIRS))
                        .offerTo(exporter, "mossy_cobblestone_from_stairs");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.MOSSY_COBBLESTONE, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.MOSSY_COBBLESTONE_WALL)
                        .criterion(hasItem(Items.MOSSY_COBBLESTONE_WALL), conditionsFromItem(Items.MOSSY_COBBLESTONE_WALL))
                        .offerTo(exporter, "mossy_cobblestone_from_wall");

                offerSmelting(List.of(Items.MOSSY_COBBLESTONE), RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE, 0.05f, 200, "cobblestone_from_mossy_cobblestone_smelting");
                offerBlasting(List.of(Items.MOSSY_COBBLESTONE), RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE, 0.05f, 100, "cobblestone_from_mossy_cobblestone_blasting");
                offerSmelting(List.of(Items.MOSSY_COBBLESTONE_WALL), RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE_WALL, 0.05f, 200, "cobblestone_wall_from_mossy_cobblestone_wall_smelting");
                offerBlasting(List.of(Items.MOSSY_COBBLESTONE_WALL), RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE_WALL, 0.05f, 100, "cobblestone_wall_from_mossy_cobblestone_wall_blasting");
                offerSmelting(List.of(Items.MOSSY_COBBLESTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE_STAIRS, 0.05f, 200, "cobblestone_stairs_from_mossy_cobblestone_stairs_smelting");
                offerBlasting(List.of(Items.MOSSY_COBBLESTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE_STAIRS, 0.05f, 100, "cobblestone_stairs_from_mossy_cobblestone_stairs_blasting");
                offerSmelting(List.of(Items.MOSSY_COBBLESTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE_SLAB, 0.05f, 200, "cobblestone_slab_from_mossy_cobblestone_slab_smelting");
                offerBlasting(List.of(Items.MOSSY_COBBLESTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE_SLAB, 0.05f, 100, "cobblestone_slab_from_mossy_cobblestone_slab_blasting");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE, Items.MOSSY_COBBLESTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE_STAIRS, Items.MOSSY_COBBLESTONE_STAIRS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE_SLAB, Items.MOSSY_COBBLESTONE_SLAB, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE_WALL, Items.MOSSY_COBBLESTONE_WALL, 1);

                offerSmelting(List.of(Items.MOSSY_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, Items.STONE_BRICKS, 0.05f, 200, "stone_bricks_from_mossy_stone_bricks_smelting");
                offerBlasting(List.of(Items.MOSSY_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, Items.STONE_BRICKS, 0.05f, 100, "stone_bricks_from_mossy_stone_bricks_blasting");
                offerSmelting(List.of(Items.MOSSY_STONE_BRICK_WALL), RecipeCategory.BUILDING_BLOCKS, Items.STONE_BRICK_WALL, 0.05f, 200, "stone_brick_wall_from_mossy_stone_brick_wall_smelting");
                offerBlasting(List.of(Items.MOSSY_STONE_BRICK_WALL), RecipeCategory.BUILDING_BLOCKS, Items.STONE_BRICK_WALL, 0.05f, 100, "stone_brick_wall_from_mossy_stone_brick_wall_blasting");
                offerSmelting(List.of(Items.MOSSY_STONE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.STONE_BRICK_STAIRS, 0.05f, 200, "stone_brick_stairs_from_mossy_stone_brick_stairs_smelting");
                offerBlasting(List.of(Items.MOSSY_STONE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.STONE_BRICK_STAIRS, 0.05f, 100, "stone_brick_stairs_from_mossy_stone_brick_stairs_blasting");
                offerSmelting(List.of(Items.MOSSY_STONE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.STONE_BRICK_SLAB, 0.05f, 200, "stone_brick_slab_from_mossy_stone_brick_slab_smelting");
                offerBlasting(List.of(Items.MOSSY_STONE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.STONE_BRICK_SLAB, 0.05f, 100, "stone_brick_slab_from_mossy_stone_brick_slab_blasting");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.STONE_BRICKS, Items.MOSSY_STONE_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.STONE_BRICK_STAIRS, Items.MOSSY_STONE_BRICK_STAIRS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.STONE_BRICK_SLAB, Items.MOSSY_STONE_BRICK_SLAB, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.STONE_BRICK_WALL, Items.MOSSY_STONE_BRICK_WALL, 1);

                // Misc
                createShaped(RecipeCategory.MISC, Items.PAPER, 8)
                        .pattern("##")
                        .input('#', Tags.Items.LOG)
                        .group("paper")
                        .criterion(getRecipeName(Items.PAPER), conditionsFromTag(Tags.Items.LOG))
                        .offerTo(exporter, "paper_from_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 12)
                        .pattern("##")
                        .input('#', Tags.Items.WOOD)
                        .group("paper")
                        .criterion(getRecipeName(Items.PAPER), conditionsFromTag(Tags.Items.WOOD))
                        .offerTo(exporter, "paper_from_wood");
                createShapeless(RecipeCategory.MISC, Items.PAPER, 10)
                        .input(Tags.Items.LOG)
                        .input(Tags.Items.WOOD)
                        .group("paper")
                        .criterion(getRecipeName(Items.PAPER), conditionsFromTag(Tags.Items.LOG))
                        .offerTo(exporter, "paper_from_log_and_wood");
                createShapeless(RecipeCategory.MISC, Items.PAPER, 2)
                        .input(Items.BOOK)
                        .group("paper")
                        .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                        .offerTo(exporter, "paper_from_book");

                createShapeless(RecipeCategory.MISC, Items.STRING, 4)
                        .input(ItemTags.WOOL)
                        .criterion(hasItem(Items.WHITE_WOOL), conditionsFromItem(Items.WHITE_WOOL))
                        .offerTo(exporter);

                offerSmelting(List.of(Items.COPPER_PICKAXE, Items.COPPER_AXE, Items.COPPER_HOE,
                        Items.COPPER_SWORD, Items.COPPER_SPEAR, Items.COPPER_HELMET, Items.COPPER_CHESTPLATE,
                        Items.COPPER_LEGGINGS, Items.COPPER_BOOTS, Items.COPPER_HORSE_ARMOR, Items.COPPER_NAUTILUS_ARMOR),
                        RecipeCategory.MISC, Items.COPPER_INGOT, 0.1f, 200, "copper_ingot");

                offerSmelting(List.of(Items.IRON_PICKAXE, Items.IRON_AXE, Items.IRON_HOE,
                        Items.IRON_SWORD, Items.IRON_SPEAR, Items.IRON_HELMET, Items.IRON_CHESTPLATE,
                        Items.IRON_LEGGINGS, Items.IRON_BOOTS, Items.IRON_HORSE_ARMOR, Items.IRON_NAUTILUS_ARMOR),
                        RecipeCategory.MISC, Items.IRON_INGOT, 0.1f, 200, "iron_ingot");

                offerSmelting(List.of(Items.GOLDEN_PICKAXE, Items.GOLDEN_AXE, Items.GOLDEN_HOE,
                        Items.GOLDEN_SWORD, Items.GOLDEN_SPEAR, Items.GOLDEN_HELMET, Items.GOLDEN_CHESTPLATE,
                        Items.GOLDEN_LEGGINGS, Items.GOLDEN_BOOTS, Items.GOLDEN_HORSE_ARMOR, Items.GOLDEN_NAUTILUS_ARMOR),
                        RecipeCategory.MISC, Items.GOLD_INGOT, 0.1f, 200, "gold_ingot");

                offerSmelting(List.of(Items.DIAMOND_PICKAXE, Items.DIAMOND_AXE, Items.DIAMOND_HOE,
                        Items.DIAMOND_SWORD, Items.DIAMOND_SPEAR, Items.DIAMOND_HELMET, Items.DIAMOND_CHESTPLATE,
                        Items.DIAMOND_LEGGINGS, Items.DIAMOND_BOOTS, Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND_NAUTILUS_ARMOR),
                        RecipeCategory.MISC, Items.DIAMOND, 0.1f, 200, "diamond");

                offerSmelting(List.of(Items.NETHERITE_PICKAXE, Items.NETHERITE_SHOVEL, Items.NETHERITE_AXE, Items.NETHERITE_HOE,
                        Items.NETHERITE_SWORD, Items.NETHERITE_SPEAR, Items.NETHERITE_HELMET, Items.NETHERITE_CHESTPLATE,
                        Items.NETHERITE_LEGGINGS, Items.NETHERITE_BOOTS, Items.NETHERITE_HORSE_ARMOR, Items.NETHERITE_NAUTILUS_ARMOR),
                        RecipeCategory.MISC, Items.NETHERITE_INGOT, 0.1f, 200, "netherite_ingot");

                offerBlasting(List.of(Items.COPPER_PICKAXE, Items.COPPER_AXE, Items.COPPER_HOE,
                        Items.COPPER_SWORD, Items.COPPER_SPEAR, Items.COPPER_HELMET, Items.COPPER_CHESTPLATE,
                        Items.COPPER_LEGGINGS, Items.COPPER_BOOTS, Items.COPPER_HORSE_ARMOR, Items.COPPER_NAUTILUS_ARMOR),
                        RecipeCategory.MISC, Items.COPPER_INGOT, 0.1f, 100, "copper_ingot");

                offerBlasting(List.of(Items.IRON_PICKAXE, Items.IRON_AXE, Items.IRON_HOE,
                        Items.IRON_SWORD, Items.IRON_SPEAR, Items.IRON_HELMET, Items.IRON_CHESTPLATE,
                        Items.IRON_LEGGINGS, Items.IRON_BOOTS, Items.IRON_HORSE_ARMOR, Items.IRON_NAUTILUS_ARMOR),
                        RecipeCategory.MISC, Items.IRON_INGOT, 0.1f, 100, "iron_ingot");

                offerBlasting(List.of(Items.GOLDEN_PICKAXE, Items.GOLDEN_AXE, Items.GOLDEN_HOE,
                        Items.GOLDEN_SWORD, Items.GOLDEN_SPEAR, Items.GOLDEN_HELMET, Items.GOLDEN_CHESTPLATE,
                        Items.GOLDEN_LEGGINGS, Items.GOLDEN_BOOTS, Items.GOLDEN_HORSE_ARMOR, Items.GOLDEN_NAUTILUS_ARMOR),
                        RecipeCategory.MISC, Items.GOLD_INGOT, 0.1f, 100, "gold_ingot");

                offerBlasting(List.of(Items.DIAMOND_PICKAXE, Items.DIAMOND_AXE, Items.DIAMOND_HOE,
                        Items.DIAMOND_SWORD, Items.DIAMOND_SPEAR, Items.DIAMOND_HELMET, Items.DIAMOND_CHESTPLATE,
                        Items.DIAMOND_LEGGINGS, Items.DIAMOND_BOOTS, Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND_NAUTILUS_ARMOR),
                        RecipeCategory.MISC, Items.DIAMOND, 0.1f, 100, "diamond");

                offerBlasting(List.of(Items.NETHERITE_PICKAXE, Items.NETHERITE_SHOVEL, Items.NETHERITE_AXE, Items.NETHERITE_HOE,
                        Items.NETHERITE_SWORD, Items.NETHERITE_SPEAR, Items.NETHERITE_HELMET, Items.NETHERITE_CHESTPLATE,
                        Items.NETHERITE_LEGGINGS, Items.NETHERITE_BOOTS, Items.NETHERITE_HORSE_ARMOR, Items.NETHERITE_NAUTILUS_ARMOR),
                        RecipeCategory.MISC, Items.NETHERITE_INGOT, 0.1f, 100, "netherite_ingot");

                createShapeless(RecipeCategory.MISC, Items.AMETHYST_SHARD, 4)
                        .input(Items.AMETHYST_BLOCK)
                        .criterion(hasItem(Items.AMETHYST_BLOCK), conditionsFromItem(Items.AMETHYST_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Items.NETHER_WART, 9)
                        .input(Items.NETHER_WART_BLOCK)
                        .criterion(hasItem(Items.NETHER_WART_BLOCK), conditionsFromItem(Items.NETHER_WART_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Items.WARPED_WART_BLOCK, 1)
                        .input(Items.NETHER_WART_BLOCK)
                        .input(Items.ENDER_PEARL)
                        .criterion(hasItem(Items.NETHER_WART_BLOCK), conditionsFromItem(Items.NETHER_WART_BLOCK))
                        .criterion(hasItem(Items.ENDER_PEARL), conditionsFromItem(Items.ENDER_PEARL))
                        .offerTo(exporter);

                // Farming
                createShapeless(RecipeCategory.FOOD, Items.WHEAT_SEEDS, 2)
                        .input(Items.WHEAT)
                        .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.FOOD, Items.BEETROOT_SEEDS, 2)
                        .input(Items.BEETROOT)
                        .criterion(hasItem(Items.BEETROOT), conditionsFromItem(Items.BEETROOT))
                        .offerTo(exporter);



            }
        };
    }

    @Override
    public String getName() {
        return "Recipe Provider";
    }
}
