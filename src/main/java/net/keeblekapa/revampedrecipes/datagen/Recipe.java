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


public class Recipe extends FabricRecipeProvider {
    public Recipe(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {


                // Blocks
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.BRICKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.BRICK_SLAB)
                        .criterion(hasItem(Items.BRICK_SLAB), conditionsFromItem(Items.BRICK_SLAB))
                        .offerTo(exporter, "bricks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.BRICKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.BRICK_STAIRS)
                        .criterion(hasItem(Items.BRICK_STAIRS), conditionsFromItem(Items.BRICK_STAIRS))
                        .offerTo(exporter, "bricks_from_stairs");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.BRICKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.BRICK_WALL)
                        .criterion(hasItem(Items.BRICK_WALL), conditionsFromItem(Items.BRICK_WALL))
                        .offerTo(exporter, "bricks_from_wall");

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

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.STONE, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.STONE_SLAB)
                        .criterion(hasItem(Items.STONE_SLAB), conditionsFromItem(Items.STONE_SLAB))
                        .offerTo(exporter, "stone_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.STONE, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.STONE_STAIRS)
                        .criterion(hasItem(Items.STONE_STAIRS), conditionsFromItem(Items.STONE_STAIRS))
                        .offerTo(exporter, "stone_from_stairs");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_STONE, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.SMOOTH_STONE_SLAB)
                        .criterion(hasItem(Items.SMOOTH_STONE_SLAB), conditionsFromItem(Items.SMOOTH_STONE_SLAB))
                        .offerTo(exporter, "smooth_stone_from_slab");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.COBBLED_DEEPSLATE, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.COBBLED_DEEPSLATE_SLAB)
                        .criterion(hasItem(Items.COBBLED_DEEPSLATE_SLAB), conditionsFromItem(Items.COBBLED_DEEPSLATE_SLAB))
                        .offerTo(exporter, "cobbled_deepslate_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.COBBLED_DEEPSLATE, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.COBBLED_DEEPSLATE_STAIRS)
                        .criterion(hasItem(Items.COBBLED_DEEPSLATE_STAIRS), conditionsFromItem(Items.COBBLED_DEEPSLATE_STAIRS))
                        .offerTo(exporter, "cobbled_deepslate_from_stairs");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.COBBLED_DEEPSLATE, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.COBBLED_DEEPSLATE_WALL)
                        .criterion(hasItem(Items.COBBLED_DEEPSLATE_WALL), conditionsFromItem(Items.COBBLED_DEEPSLATE_WALL))
                        .offerTo(exporter, "cobbled_deepslate_from_wall");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_DEEPSLATE, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.POLISHED_DEEPSLATE_SLAB)
                        .criterion(hasItem(Items.POLISHED_DEEPSLATE_SLAB), conditionsFromItem(Items.POLISHED_DEEPSLATE_SLAB))
                        .offerTo(exporter, "polished_deepslate_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_DEEPSLATE, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.POLISHED_DEEPSLATE_STAIRS)
                        .criterion(hasItem(Items.POLISHED_DEEPSLATE_STAIRS), conditionsFromItem(Items.POLISHED_DEEPSLATE_STAIRS))
                        .offerTo(exporter, "polished_deepslate_from_stairs");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_DEEPSLATE, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.POLISHED_DEEPSLATE_WALL)
                        .criterion(hasItem(Items.POLISHED_DEEPSLATE_WALL), conditionsFromItem(Items.POLISHED_DEEPSLATE_WALL))
                        .offerTo(exporter, "polished_deepslate_from_wall");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.DEEPSLATE_BRICKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.DEEPSLATE_BRICK_SLAB)
                        .criterion(hasItem(Items.DEEPSLATE_BRICK_SLAB), conditionsFromItem(Items.DEEPSLATE_BRICK_SLAB))
                        .offerTo(exporter, "deepslate_bricks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.DEEPSLATE_BRICKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.DEEPSLATE_BRICK_STAIRS)
                        .criterion(hasItem(Items.DEEPSLATE_BRICK_STAIRS), conditionsFromItem(Items.DEEPSLATE_BRICK_STAIRS))
                        .offerTo(exporter, "deepslate_bricks_from_stairs");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.DEEPSLATE_BRICKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.DEEPSLATE_BRICK_WALL)
                        .criterion(hasItem(Items.DEEPSLATE_BRICK_WALL), conditionsFromItem(Items.DEEPSLATE_BRICK_WALL))
                        .offerTo(exporter, "deepslate_bricks_from_wall");


                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.TUFF, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.TUFF_SLAB)
                        .criterion(hasItem(Items.TUFF_SLAB), conditionsFromItem(Items.TUFF_SLAB))
                        .offerTo(exporter, "tuff_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.TUFF, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.TUFF)
                        .criterion(hasItem(Items.TUFF_STAIRS), conditionsFromItem(Items.TUFF_STAIRS))
                        .offerTo(exporter, "tuff_from_stairs");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.TUFF, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.TUFF_WALL)
                        .criterion(hasItem(Items.TUFF_WALL), conditionsFromItem(Items.TUFF_WALL))
                        .offerTo(exporter, "tuff_from_wall");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_TUFF, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.POLISHED_TUFF_SLAB)
                        .criterion(hasItem(Items.POLISHED_TUFF_SLAB), conditionsFromItem(Items.POLISHED_TUFF_SLAB))
                        .offerTo(exporter, "polished_tuff_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_TUFF, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.POLISHED_TUFF_STAIRS)
                        .criterion(hasItem(Items.POLISHED_TUFF_STAIRS), conditionsFromItem(Items.POLISHED_TUFF_STAIRS))
                        .offerTo(exporter, "polished_tuff_from_stairs");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_TUFF, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.POLISHED_TUFF_WALL)
                        .criterion(hasItem(Items.POLISHED_TUFF_WALL), conditionsFromItem(Items.POLISHED_TUFF_WALL))
                        .offerTo(exporter, "polished_tuff_from_wall");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.TUFF_BRICKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.TUFF_BRICK_SLAB)
                        .criterion(hasItem(Items.TUFF_BRICK_SLAB), conditionsFromItem(Items.TUFF_BRICK_SLAB))
                        .offerTo(exporter, "tuff_bricks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.TUFF_BRICKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.TUFF_BRICK_STAIRS)
                        .criterion(hasItem(Items.TUFF_BRICK_STAIRS), conditionsFromItem(Items.TUFF_BRICK_STAIRS))
                        .offerTo(exporter, "tuff_bricks_from_stairs");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.TUFF_BRICKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.TUFF_BRICK_WALL)
                        .criterion(hasItem(Items.TUFF_BRICK_WALL), conditionsFromItem(Items.TUFF_BRICK_WALL))
                        .offerTo(exporter, "tuff_bricks_from_wall");


                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.BLACKSTONE, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.BLACKSTONE_SLAB)
                        .criterion(hasItem(Items.BLACKSTONE_SLAB), conditionsFromItem(Items.BLACKSTONE_SLAB))
                        .offerTo(exporter, "blackstone_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.BLACKSTONE, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.BLACKSTONE_STAIRS)
                        .criterion(hasItem(Items.BLACKSTONE_STAIRS), conditionsFromItem(Items.BLACKSTONE_STAIRS))
                        .offerTo(exporter, "blackstone_from_stairs");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.BLACKSTONE, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.BLACKSTONE_WALL)
                        .criterion(hasItem(Items.BLACKSTONE_WALL), conditionsFromItem(Items.BLACKSTONE_WALL))
                        .offerTo(exporter, "blackstone_from_wall");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_BLACKSTONE, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.POLISHED_BLACKSTONE_SLAB)
                        .criterion(hasItem(Items.POLISHED_BLACKSTONE_SLAB), conditionsFromItem(Items.POLISHED_BLACKSTONE_SLAB))
                        .offerTo(exporter, "polished_blackstone_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_BLACKSTONE, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.POLISHED_BLACKSTONE_STAIRS)
                        .criterion(hasItem(Items.POLISHED_BLACKSTONE_STAIRS), conditionsFromItem(Items.POLISHED_BLACKSTONE_STAIRS))
                        .offerTo(exporter, "polished_blackstone_from_stairs");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_BLACKSTONE, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.POLISHED_BLACKSTONE_WALL)
                        .criterion(hasItem(Items.POLISHED_BLACKSTONE_WALL), conditionsFromItem(Items.POLISHED_BLACKSTONE_WALL))
                        .offerTo(exporter, "polished_blackstone_from_wall");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_BLACKSTONE_BRICKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.POLISHED_BLACKSTONE_BRICK_SLAB)
                        .criterion(hasItem(Items.POLISHED_BLACKSTONE_BRICK_SLAB), conditionsFromItem(Items.POLISHED_BLACKSTONE_BRICK_SLAB))
                        .offerTo(exporter, "polished_blackstone_bricks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_BLACKSTONE_BRICKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.POLISHED_BLACKSTONE_BRICK_STAIRS)
                        .criterion(hasItem(Items.POLISHED_BLACKSTONE_BRICK_STAIRS), conditionsFromItem(Items.POLISHED_BLACKSTONE_BRICK_STAIRS))
                        .offerTo(exporter, "polished_blackstone_bricks_from_stairs");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_BLACKSTONE_BRICKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.POLISHED_BLACKSTONE_BRICK_WALL)
                        .criterion(hasItem(Items.POLISHED_BLACKSTONE_BRICK_WALL), conditionsFromItem(Items.POLISHED_BLACKSTONE_BRICK_WALL))
                        .offerTo(exporter, "polished_blackstone_bricks_from_wall");



                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_PLANKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.SPRUCE_SLAB)
                        .criterion(hasItem(Items.SPRUCE_SLAB), conditionsFromItem(Items.SPRUCE_SLAB))
                        .offerTo(exporter, "spruce_planks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.OAK_PLANKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.SPRUCE_STAIRS)
                        .criterion(hasItem(Items.SPRUCE_STAIRS), conditionsFromItem(Items.SPRUCE_STAIRS))
                        .offerTo(exporter, "spruce_planks_from_stairs");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.OAK_PLANKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.OAK_SLAB)
                        .criterion(hasItem(Items.OAK_SLAB), conditionsFromItem(Items.OAK_SLAB))
                        .offerTo(exporter, "oak_planks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.OAK_PLANKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.OAK_STAIRS)
                        .criterion(hasItem(Items.OAK_STAIRS), conditionsFromItem(Items.OAK_STAIRS))
                        .offerTo(exporter, "oak_planks_from_stairs");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_PLANKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.DARK_OAK_SLAB)
                        .criterion(hasItem(Items.DARK_OAK_SLAB), conditionsFromItem(Items.DARK_OAK_SLAB))
                        .offerTo(exporter, "dark_oak_planks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_PLANKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.DARK_OAK_STAIRS)
                        .criterion(hasItem(Items.DARK_OAK_STAIRS), conditionsFromItem(Items.DARK_OAK_STAIRS))
                        .offerTo(exporter, "dark_oak_planks_from_stairs");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_PLANKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.CHERRY_SLAB)
                        .criterion(hasItem(Items.CHERRY_SLAB), conditionsFromItem(Items.CHERRY_SLAB))
                        .offerTo(exporter, "cherry_planks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_PLANKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.CHERRY_STAIRS)
                        .criterion(hasItem(Items.CHERRY_STAIRS), conditionsFromItem(Items.CHERRY_STAIRS))
                        .offerTo(exporter, "cherry_planks_from_stairs");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_PLANKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.BIRCH_SLAB)
                        .criterion(hasItem(Items.BIRCH_SLAB), conditionsFromItem(Items.BIRCH_SLAB))
                        .offerTo(exporter, "birch_planks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_PLANKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.BIRCH_STAIRS)
                        .criterion(hasItem(Items.BIRCH_STAIRS), conditionsFromItem(Items.BIRCH_STAIRS))
                        .offerTo(exporter, "birch_planks_from_stairs");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_PLANKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.BAMBOO_SLAB)
                        .criterion(hasItem(Items.BAMBOO_SLAB), conditionsFromItem(Items.BAMBOO_SLAB))
                        .offerTo(exporter, "bamboo_planks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_PLANKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.BAMBOO_STAIRS)
                        .criterion(hasItem(Items.BAMBOO_STAIRS), conditionsFromItem(Items.BAMBOO_STAIRS))
                        .offerTo(exporter, "bamboo_planks_from_stairs");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_PLANKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.JUNGLE_SLAB)
                        .criterion(hasItem(Items.JUNGLE_SLAB), conditionsFromItem(Items.JUNGLE_SLAB))
                        .offerTo(exporter, "jungle_planks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_PLANKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.JUNGLE_STAIRS)
                        .criterion(hasItem(Items.JUNGLE_STAIRS), conditionsFromItem(Items.JUNGLE_STAIRS))
                        .offerTo(exporter, "jungle_planks_from_stairs");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_PLANKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.MANGROVE_SLAB)
                        .criterion(hasItem(Items.MANGROVE_SLAB), conditionsFromItem(Items.MANGROVE_SLAB))
                        .offerTo(exporter, "mangrove_planks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_PLANKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.MANGROVE_STAIRS)
                        .criterion(hasItem(Items.MANGROVE_STAIRS), conditionsFromItem(Items.MANGROVE_STAIRS))
                        .offerTo(exporter, "mangrove_planks_from_stairs");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.WARPED_PLANKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.WARPED_SLAB)
                        .criterion(hasItem(Items.WARPED_SLAB), conditionsFromItem(Items.WARPED_SLAB))
                        .offerTo(exporter, "warped_planks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.WARPED_PLANKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.WARPED_STAIRS)
                        .criterion(hasItem(Items.WARPED_STAIRS), conditionsFromItem(Items.WARPED_STAIRS))
                        .offerTo(exporter, "warped_planks_from_stairs");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_PLANKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.ACACIA_SLAB)
                        .criterion(hasItem(Items.ACACIA_SLAB), conditionsFromItem(Items.ACACIA_SLAB))
                        .offerTo(exporter, "acacia_planks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_PLANKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.ACACIA_STAIRS)
                        .criterion(hasItem(Items.ACACIA_STAIRS), conditionsFromItem(Items.ACACIA_STAIRS))
                        .offerTo(exporter, "acacia_planks_from_stairs");

                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_PLANKS, 1)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Items.CRIMSON_SLAB)
                        .criterion(hasItem(Items.CRIMSON_SLAB), conditionsFromItem(Items.CRIMSON_SLAB))
                        .offerTo(exporter, "crimson_planks_from_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_PLANKS, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Items.CRIMSON_STAIRS)
                        .criterion(hasItem(Items.CRIMSON_STAIRS), conditionsFromItem(Items.CRIMSON_STAIRS))
                        .offerTo(exporter, "crimson_planks_from_stairs");



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

                createShapeless(RecipeCategory.MISC, Items.MAGMA_CREAM, 4)
                        .input(Items.MAGMA_BLOCK)
                        .group("magma_cream")
                        .criterion(hasItem(Items.MAGMA_BLOCK), conditionsFromItem(Items.MAGMA_BLOCK))
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
