package net.keeblekapa.revampedrecipes.util;

import net.keeblekapa.revampedrecipes.RevampedRecipes;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class Tags {

    public static class Blocks {

        public static final TagKey<Block> STONES = createTag("stones");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(RevampedRecipes.MOD_ID, name));
        }

    }

    public static class Items {

        public static final TagKey<Item> STONES = createTag("stones");
        public static final TagKey<Item> STONE_SLABS = createTag("stone_slabs");
        public static final TagKey<Item> LOGS_AND_WOOD = createTag("logs_and_wood");
        public static final TagKey<Item> WOOD = createTag("wood");
        public static final TagKey<Item> LOG = createTag("log");
        public static final TagKey<Item> IRON_COPPER_INTERCHANGE = createTag("iron_copper_interchange");
        public static final TagKey<Item> CONTAINERS = createTag("containers");
        public static final TagKey<Item> RANGE_WEAPONS = createTag("range_weapons");
        public static final TagKey<Item> LIGHT_BLOCKS = createTag("light_blocks");
        public static final TagKey<Item> OBSIDIAN_BLOCKS = createTag("obsidian_blocks");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(RevampedRecipes.MOD_ID, name));
        }
    }

}
