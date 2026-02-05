package net.keeblekapa.revampedrecipes.datagen;

import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.keeblekapa.revampedrecipes.RevampedRecipes;
import net.keeblekapa.revampedrecipes.util.Tags;
import net.minecraft.data.DataOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.nio.file.Path;
import java.util.ArrayList;
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


                // Armor


                // Tools



            }
        };
    }

    @Override
    public CompletableFuture<?> run(DataWriter writer) {
        List<CompletableFuture<?>> futures = new ArrayList<>();

        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_iron_helmet"),
                "minecraft:smelting",
                "minecraft:iron_helmet",
                "minecraft:iron_ingot",
                3,
                0.15f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_iron_helmet"),
                "minecraft:blasting",
                "minecraft:iron_helmet",
                "minecraft:iron_ingot",
                3,
                0.15f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_iron_chestplate"),
                "minecraft:smelting",
                "minecraft:iron_chestplate",
                "minecraft:iron_ingot",
                6,
                0.25f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_iron_chestplate"),
                "minecraft:blasting",
                "minecraft:iron_chestplate",
                "minecraft:iron_ingot",
                6,
                0.25f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_iron_leggings"),
                "minecraft:smelting",
                "minecraft:iron_leggings",
                "minecraft:iron_ingot",
                5,
                0.2f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_iron_leggings"),
                "minecraft:blasting",
                "minecraft:iron_leggings",
                "minecraft:iron_ingot",
                5,
                0.2f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_iron_boots"),
                "minecraft:smelting",
                "minecraft:iron_boots",
                "minecraft:iron_ingot",
                2,
                0.1f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_iron_boots"),
                "minecraft:blasting",
                "minecraft:iron_boots",
                "minecraft:iron_ingot",
                2,
                0.1f,
                100
        ));

        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_gold_helmet"),
                "minecraft:smelting",
                "minecraft:gold_helmet",
                "minecraft:gold_ingot",
                3,
                0.15f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_gold_helmet"),
                "minecraft:blasting",
                "minecraft:gold_helmet",
                "minecraft:gold_ingot",
                3,
                0.15f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_gold_chestplate"),
                "minecraft:smelting",
                "minecraft:gold_chestplate",
                "minecraft:gold_ingot",
                6,
                0.25f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_gold_chestplate"),
                "minecraft:blasting",
                "minecraft:gold_chestplate",
                "minecraft:gold_ingot",
                6,
                0.25f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_gold_leggings"),
                "minecraft:smelting",
                "minecraft:gold_leggings",
                "minecraft:gold_ingot",
                5,
                0.2f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_gold_leggings"),
                "minecraft:blasting",
                "minecraft:gold_leggings",
                "minecraft:gold_ingot",
                5,
                0.2f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_gold_boots"),
                "minecraft:smelting",
                "minecraft:gold_boots",
                "minecraft:gold_ingot",
                2,
                0.1f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_gold_boots"),
                "minecraft:blasting",
                "minecraft:gold_boots",
                "minecraft:gold_ingot",
                2,
                0.1f,
                100
        ));

        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_diamond_helmet"),
                "minecraft:smelting",
                "minecraft:diamond_helmet",
                "minecraft:diamond",
                3,
                0.15f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_diamond_helmet"),
                "minecraft:blasting",
                "minecraft:diamond_helmet",
                "minecraft:diamond",
                3,
                0.15f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_diamond_chestplate"),
                "minecraft:smelting",
                "minecraft:diamond_chestplate",
                "minecraft:diamond",
                6,
                0.25f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_diamond_chestplate"),
                "minecraft:blasting",
                "minecraft:diamond_chestplate",
                "minecraft:diamond",
                6,
                0.25f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_diamond_leggings"),
                "minecraft:smelting",
                "minecraft:diamond_leggings",
                "minecraft:diamond",
                5,
                0.2f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_diamond_leggings"),
                "minecraft:blasting",
                "minecraft:diamond_leggings",
                "minecraft:diamond",
                5,
                0.2f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_diamond_boots"),
                "minecraft:smelting",
                "minecraft:diamond_boots",
                "minecraft:diamond",
                2,
                0.1f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_diamond_boots"),
                "minecraft:blasting",
                "minecraft:diamond_boots",
                "minecraft:diamond",
                2,
                0.1f,
                100
        ));



        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_iron_sword"),
                "minecraft:smelting",
                "minecraft:iron_sword",
                "minecraft:iron_ingot",
                1,
                0.1f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_iron_sword"),
                "minecraft:blasting",
                "minecraft:iron_sword",
                "minecraft:iron_ingot",
                1,
                0.1f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_iron_pickaxe"),
                "minecraft:smelting",
                "minecraft:iron_pickaxe",
                "minecraft:iron_ingot",
                2,
                0.2f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_iron_pickaxe"),
                "minecraft:blasting",
                "minecraft:iron_pickaxe",
                "minecraft:iron_ingot",
                2,
                0.2f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_iron_axe"),
                "minecraft:smelting",
                "minecraft:iron_axe",
                "minecraft:iron_ingot",
                2,
                0.2f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_iron_axe"),
                "minecraft:blasting",
                "minecraft:iron_axe",
                "minecraft:iron_ingot",
                2,
                0.2f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_iron_shovel"),
                "minecraft:smelting",
                "minecraft:iron_shovel",
                "minecraft:iron_nugget",
                6,
                0.05f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_iron_shovel"),
                "minecraft:blasting",
                "minecraft:iron_shovel",
                "minecraft:iron_nugget",
                6,
                0.05f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_iron_hoe"),
                "minecraft:smelting",
                "minecraft:iron_hoe",
                "minecraft:iron_ingot",
                1,
                0.1f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_iron_hoe"),
                "minecraft:blasting",
                "minecraft:iron_hoe",
                "minecraft:iron_ingot",
                1,
                0.1f,
                100
        ));

        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_gold_sword"),
                "minecraft:smelting",
                "minecraft:gold_sword",
                "minecraft:gold_ingot",
                1,
                0.1f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_gold_sword"),
                "minecraft:blasting",
                "minecraft:gold_sword",
                "minecraft:gold_ingot",
                1,
                0.1f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_gold_pickaxe"),
                "minecraft:smelting",
                "minecraft:gold_pickaxe",
                "minecraft:gold_ingot",
                2,
                0.2f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_gold_pickaxe"),
                "minecraft:blasting",
                "minecraft:gold_pickaxe",
                "minecraft:gold_ingot",
                2,
                0.2f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_gold_axe"),
                "minecraft:smelting",
                "minecraft:gold_axe",
                "minecraft:gold_ingot",
                2,
                0.2f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_gold_axe"),
                "minecraft:blasting",
                "minecraft:gold_axe",
                "minecraft:gold_ingot",
                2,
                0.2f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_gold_shovel"),
                "minecraft:smelting",
                "minecraft:gold_shovel",
                "minecraft:gold_nugget",
                6,
                0.05f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_gold_shovel"),
                "minecraft:blasting",
                "minecraft:gold_shovel",
                "minecraft:gold_nugget",
                6,
                0.05f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_gold_hoe"),
                "minecraft:smelting",
                "minecraft:gold_hoe",
                "minecraft:gold_ingot",
                1,
                0.1f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_gold_hoe"),
                "minecraft:blasting",
                "minecraft:gold_hoe",
                "minecraft:gold_ingot",
                1,
                0.1f,
                100
        ));

        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_diamond_sword"),
                "minecraft:smelting",
                "minecraft:diamond_sword",
                "minecraft:diamond",
                1,
                0.1f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_diamond_sword"),
                "minecraft:blasting",
                "minecraft:diamond_sword",
                "minecraft:diamond",
                1,
                0.1f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_diamond_pickaxe"),
                "minecraft:smelting",
                "minecraft:diamond_pickaxe",
                "minecraft:diamond",
                2,
                0.2f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_diamond_pickaxe"),
                "minecraft:blasting",
                "minecraft:diamond_pickaxe",
                "minecraft:diamond",
                2,
                0.2f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_diamond_axe"),
                "minecraft:smelting",
                "minecraft:diamond_axe",
                "minecraft:diamond",
                2,
                0.2f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_diamond_axe"),
                "minecraft:blasting",
                "minecraft:diamond_axe",
                "minecraft:diamond",
                2,
                0.2f,
                100
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "smelt_diamond_hoe"),
                "minecraft:smelting",
                "minecraft:diamond_hoe",
                "minecraft:diamond",
                1,
                0.1f,
                200
        ));
        futures.add(writeCookingRecipe(
                writer,
                Identifier.of(RevampedRecipes.MOD_ID, "blast_diamond_hoe"),
                "minecraft:blasting",
                "minecraft:diamond_hoe",
                "minecraft:diamond",
                1,
                0.1f,
                100
        ));


        return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
    }

    private CompletableFuture<?> writeCookingRecipe(
            DataWriter writer,
            Identifier id,
            String type,
            String ingredientItemId,
            String resultItemId,
            int count,
            float exp,
            int cookTime
    ) {
        JsonObject root = new JsonObject();
        root.addProperty("type", type);

        JsonObject ingredient = new JsonObject();
        ingredient.addProperty("item", ingredientItemId);
        root.add("ingredient", ingredient);

        JsonObject result = new JsonObject();
        result.addProperty("id", resultItemId);
        result.addProperty("count", count);
        root.add("result", result);

        root.addProperty("experience", exp);
        root.addProperty("cookingtime", cookTime);

        Path path = output.getResolver(DataOutput.OutputType.DATA_PACK, "recipes").resolveJson(id);

        // This is the key: write JSON via vanilla datagen
        return DataProvider.writeToPath(writer, root, path);
    }

    @Override
    public String getName() {
        return "Recipe Provider";
    }
}
