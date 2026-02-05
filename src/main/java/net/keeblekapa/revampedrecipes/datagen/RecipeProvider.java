package net.keeblekapa.revampedrecipes.datagen;

import com.mojang.datafixers.types.templates.Tag;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.keeblekapa.revampedrecipes.RevampedRecipes;
import net.keeblekapa.revampedrecipes.util.Tags;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.recipe.RecipeGenerator.getItemPath;

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


                // Misc
                createShaped(RecipeCategory.MISC, Items.PAPER, 4)
                        .pattern("##")
                        .input('#', Items.OAK_LOG)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.OAK_LOG), conditionsFromItem(Items.OAK_LOG))
                        .offerTo(exporter, "paper_from_oak_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 4)
                        .pattern("##")
                        .input('#', Items.ACACIA_LOG)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.ACACIA_LOG), conditionsFromItem(Items.ACACIA_LOG))
                        .offerTo(exporter, "paper_from_acacia_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 4)
                        .pattern("##")
                        .input('#', Items.BIRCH_LOG)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.BIRCH_LOG), conditionsFromItem(Items.BIRCH_LOG))
                        .offerTo(exporter, "paper_from_birch_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 4)
                        .pattern("##")
                        .input('#', Items.CHERRY_LOG)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.CHERRY_LOG), conditionsFromItem(Items.CHERRY_LOG))
                        .offerTo(exporter, "paper_from_cherry_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 4)
                        .pattern("##")
                        .input('#', Items.JUNGLE_LOG)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.JUNGLE_LOG), conditionsFromItem(Items.JUNGLE_LOG))
                        .offerTo(exporter, "paper_from_jungle_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 4)
                        .pattern("##")
                        .input('#', Items.DARK_OAK_LOG)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.DARK_OAK_LOG), conditionsFromItem(Items.DARK_OAK_LOG))
                        .offerTo(exporter, "paper_from_dark_oak_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 4)
                        .pattern("##")
                        .input('#', Items.MANGROVE_LOG)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.MANGROVE_LOG), conditionsFromItem(Items.MANGROVE_LOG))
                        .offerTo(exporter, "paper_from_mangrove_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 4)
                        .pattern("##")
                        .input('#', Items.SPRUCE_LOG)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.SPRUCE_LOG), conditionsFromItem(Items.SPRUCE_LOG))
                        .offerTo(exporter, "paper_from_spruce_log");
                createShaped(RecipeCategory.MISC, Items.PAPER, 4)
                        .pattern("##")
                        .input('#', Items.PALE_OAK_LOG)
                        .group("paper_from_log")
                        .criterion(hasItem(Items.PALE_OAK_LOG), conditionsFromItem(Items.PALE_OAK_LOG))
                        .offerTo(exporter, "paper_from_pale_oak_log");

                createShaped(RecipeCategory.MISC, Items.PAPER, 6)
                        .pattern("##")
                        .input('#', Items.OAK_WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.OAK_WOOD), conditionsFromItem(Items.OAK_WOOD))
                        .offerTo(exporter, "paper_from_oak_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 6)
                        .pattern("##")
                        .input('#', Items.ACACIA_WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.ACACIA_WOOD), conditionsFromItem(Items.ACACIA_WOOD))
                        .offerTo(exporter, "paper_from_acacia_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 6)
                        .pattern("##")
                        .input('#', Items.BIRCH_WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.BIRCH_WOOD), conditionsFromItem(Items.BIRCH_WOOD))
                        .offerTo(exporter, "paper_from_birch_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 6)
                        .pattern("##")
                        .input('#', Items.CHERRY_WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.CHERRY_WOOD), conditionsFromItem(Items.CHERRY_WOOD))
                        .offerTo(exporter, "paper_from_cherry_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 6)
                        .pattern("##")
                        .input('#', Items.JUNGLE_WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.JUNGLE_WOOD), conditionsFromItem(Items.JUNGLE_WOOD))
                        .offerTo(exporter, "paper_from_jungle_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 6)
                        .pattern("##")
                        .input('#', Items.DARK_OAK_WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.DARK_OAK_WOOD), conditionsFromItem(Items.DARK_OAK_WOOD))
                        .offerTo(exporter, "paper_from_dark_oak_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 6)
                        .pattern("##")
                        .input('#', Items.MANGROVE_WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.MANGROVE_WOOD), conditionsFromItem(Items.MANGROVE_WOOD))
                        .offerTo(exporter, "paper_from_mangrove_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 6)
                        .pattern("##")
                        .input('#', Items.SPRUCE_WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.SPRUCE_WOOD), conditionsFromItem(Items.SPRUCE_WOOD))
                        .offerTo(exporter, "paper_from_spruce_wood");
                createShaped(RecipeCategory.MISC, Items.PAPER, 6)
                        .pattern("##")
                        .input('#', Items.PALE_OAK_WOOD)
                        .group("paper_from_wood")
                        .criterion(hasItem(Items.PALE_OAK_WOOD), conditionsFromItem(Items.PALE_OAK_WOOD))
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
