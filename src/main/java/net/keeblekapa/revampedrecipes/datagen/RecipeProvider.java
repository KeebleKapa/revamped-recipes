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





                // Utility Blocks
                createShaped(RecipeCategory.MISC, Items.FURNACE,1)
                        .pattern("###")
                        .pattern("# #")
                        .pattern("###")
                        .input('#', Tags.Items.STONES)
                        .group("furnace")
                        .criterion(getRecipeName(Items.FURNACE), conditionsFromTag(Tags.Items.STONES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, Items.BLAST_FURNACE,1)
                        .pattern("###")
                        .pattern("#@#")
                        .pattern("$$$")
                        .input('#', Items.IRON_INGOT)
                        .input('@', Items.FURNACE)
                        .input('$', Tags.Items.STONES)
                        .group("blast_furnace")
                        .criterion(getRecipeName(Items.BLAST_FURNACE), conditionsFromTag(Tags.Items.STONES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, Items.STONECUTTER,1)
                        .pattern(" @ ")
                        .pattern("###")
                        .input('#', Tags.Items.STONES)
                        .input('@', Items.IRON_INGOT)
                        .group("stonecutter")
                        .criterion(getRecipeName(Items.STONECUTTER), conditionsFromTag(Tags.Items.STONES))
                        .offerTo(exporter);


                // Redstone Components
                createShaped(RecipeCategory.REDSTONE, Items.REPEATER, 1)
                        .pattern("TRT")
                        .pattern("SSS")
                        .input('T', Items.REDSTONE_TORCH)
                        .input('R', Items.REDSTONE)
                        .input('S', Tags.Items.STONES)
                        .group("repeater")
                        .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                        .criterion(hasItem(Items.REDSTONE_TORCH), conditionsFromItem(Items.REDSTONE_TORCH))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, Items.COMPARATOR, 1)
                        .pattern(" T ")
                        .pattern("TQT")
                        .pattern("SSS")
                        .input('T', Items.REDSTONE_TORCH)
                        .input('Q', Items.QUARTZ)
                        .input('S', Tags.Items.STONES)
                        .group("comparator")
                        .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                        .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, Items.PISTON, 1)
                        .pattern("PPP")
                        .pattern("SCS")
                        .pattern("SRS")
                        .input('P', ItemTags.PLANKS)
                        .input('S', Tags.Items.STONES)
                        .input('C', Tags.Items.IRON_COPPER_INTERCHANGE)
                        .input('R', Items.REDSTONE)
                        .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, Items.HOPPER, 1)
                        .pattern("P P")
                        .pattern("PCP")
                        .pattern(" P ")
                        .input('P', Tags.Items.IRON_COPPER_INTERCHANGE)
                        .input('C', Tags.Items.CONTAINERS)
                        .criterion(hasItem(Items.CHEST), conditionsFromTag(Tags.Items.CONTAINERS))
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromTag(Tags.Items.IRON_COPPER_INTERCHANGE))
                        .offerTo(exporter);


                // Misc
                createShaped(RecipeCategory.MISC, Items.PAPER, 8)
                        .pattern("##")
                        .input('#', ItemTags.LOGS)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.OAK_LOG), conditionsFromTag(ItemTags.LOGS))
                        .offerTo(exporter, "paper_from_oak_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 8)
                        .pattern("##")
                        .input('#', ItemTags.LOGS)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.ACACIA_LOG), conditionsFromTag(ItemTags.LOGS))
                        .offerTo(exporter, "paper_from_acacia_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 8)
                        .pattern("##")
                        .input('#', ItemTags.LOGS)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.BIRCH_LOG), conditionsFromTag(ItemTags.LOGS))
                        .offerTo(exporter, "paper_from_birch_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 8)
                        .pattern("##")
                        .input('#', ItemTags.LOGS)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.CHERRY_LOG), conditionsFromTag(ItemTags.LOGS))
                        .offerTo(exporter, "paper_from_cherry_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 8)
                        .pattern("##")
                        .input('#', ItemTags.LOGS)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.JUNGLE_LOG), conditionsFromTag(ItemTags.LOGS))
                        .offerTo(exporter, "paper_from_jungle_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 8)
                        .pattern("##")
                        .input('#', ItemTags.LOGS)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.DARK_OAK_LOG), conditionsFromTag(ItemTags.LOGS))
                        .offerTo(exporter, "paper_from_dark_oak_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 8)
                        .pattern("##")
                        .input('#', ItemTags.LOGS)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.MANGROVE_LOG), conditionsFromTag(ItemTags.LOGS))
                        .offerTo(exporter, "paper_from_mangrove_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 8)
                        .pattern("##")
                        .input('#', ItemTags.LOGS)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.SPRUCE_LOG), conditionsFromTag(ItemTags.LOGS))
                        .offerTo(exporter, "paper_from_spruce_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 8)
                        .pattern("##")
                        .input('#', ItemTags.LOGS)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.PALE_OAK_LOG), conditionsFromTag(ItemTags.LOGS))
                        .offerTo(exporter, "paper_from_pale_oak_log");

                createShaped(RecipeCategory.MISC, Items.PAPER, 12)
                        .pattern("##")
                        .input('#', Tags.Items.WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.OAK_WOOD), conditionsFromTag(Tags.Items.WOOD))
                        .offerTo(exporter, "paper_from_oak_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 12)
                        .pattern("##")
                        .input('#', Tags.Items.WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.ACACIA_WOOD), conditionsFromTag(Tags.Items.WOOD))
                        .offerTo(exporter, "paper_from_acacia_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 12)
                        .pattern("##")
                        .input('#', Tags.Items.WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.BIRCH_WOOD), conditionsFromTag(Tags.Items.WOOD))
                        .offerTo(exporter, "paper_from_birch_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 12)
                        .pattern("##")
                        .input('#', Tags.Items.WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.CHERRY_WOOD), conditionsFromTag(Tags.Items.WOOD))
                        .offerTo(exporter, "paper_from_cherry_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 12)
                        .pattern("##")
                        .input('#', Tags.Items.WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.JUNGLE_WOOD), conditionsFromTag(Tags.Items.WOOD))
                        .offerTo(exporter, "paper_from_jungle_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 12)
                        .pattern("##")
                        .input('#', Tags.Items.WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.DARK_OAK_WOOD), conditionsFromTag(Tags.Items.WOOD))
                        .offerTo(exporter, "paper_from_dark_oak_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 12)
                        .pattern("##")
                        .input('#', Tags.Items.WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.MANGROVE_WOOD), conditionsFromTag(Tags.Items.WOOD))
                        .offerTo(exporter, "paper_from_mangrove_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 12)
                        .pattern("##")
                        .input('#', Tags.Items.WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.SPRUCE_WOOD), conditionsFromTag(Tags.Items.WOOD))
                        .offerTo(exporter, "paper_from_spruce_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 12)
                        .pattern("##")
                        .input('#', Tags.Items.WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.PALE_OAK_WOOD), conditionsFromTag(Tags.Items.WOOD))
                        .offerTo(exporter, "paper_from_pale_oak_wood");

                createShapeless(RecipeCategory.MISC, Items.PAPER, 2)
                        .input(Items.BOOK)
                        .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                        .offerTo(exporter, "paper_from_book");

                createShapeless(RecipeCategory.MISC, Items.STRING, 4)
                        .input(ItemTags.WOOL)
                        .criterion(hasItem(Items.WHITE_WOOL), conditionsFromItem(Items.WHITE_WOOL))
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
