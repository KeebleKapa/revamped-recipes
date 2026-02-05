package net.keeblekapa.revampedrecipes.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.keeblekapa.revampedrecipes.util.Tags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(Tags.Items.STONES)
                .add(Items.STONE)
                .add(Items.COBBLESTONE)
                .add(Items.MOSSY_COBBLESTONE)
                .add(Items.SMOOTH_STONE)
                .add(Items.DEEPSLATE)
                .add(Items.COBBLED_DEEPSLATE)
                .add(Items.GRANITE)
                .add(Items.DIORITE)
                .add(Items.ANDESITE)
                .add(Items.BLACKSTONE)
                .add(Items.END_STONE);
        valueLookupBuilder(Tags.Items.CHISELED_STONES)
                .add(Items.CHISELED_STONE_BRICKS)
                .add(Items.CHISELED_DEEPSLATE)
                .add(Items.CHISELED_POLISHED_BLACKSTONE)
                .add(Items.CHISELED_NETHER_BRICKS);
        valueLookupBuilder(Tags.Items.STONE_SLABS)
                .add(Items.STONE_SLAB)
                .add(Items.COBBLESTONE_SLAB)
                .add(Items.MOSSY_COBBLESTONE_SLAB)
                .add(Items.SMOOTH_STONE_SLAB)
                .add(Items.COBBLED_DEEPSLATE_SLAB)
                .add(Items.GRANITE_SLAB)
                .add(Items.DIORITE_SLAB)
                .add(Items.ANDESITE_SLAB)
                .add(Items.BLACKSTONE_SLAB);

        valueLookupBuilder(Tags.Items.LOGS_AND_WOOD)
                .add(Items.OAK_WOOD)
                .add(Items.SPRUCE_WOOD)
                .add(Items.BIRCH_WOOD)
                .add(Items.JUNGLE_WOOD)
                .add(Items.ACACIA_WOOD)
                .add(Items.DARK_OAK_WOOD)
                .add(Items.MANGROVE_WOOD)
                .add(Items.CHERRY_WOOD)
                .add(Items.PALE_OAK_WOOD)
                .add(Items.OAK_LOG)
                .add(Items.SPRUCE_LOG)
                .add(Items.BIRCH_LOG)
                .add(Items.JUNGLE_LOG)
                .add(Items.ACACIA_LOG)
                .add(Items.DARK_OAK_LOG)
                .add(Items.MANGROVE_LOG)
                .add(Items.CHERRY_LOG)
                .add(Items.PALE_OAK_LOG);

        valueLookupBuilder(Tags.Items.WOOD)
                .add(Items.OAK_WOOD)
                .add(Items.SPRUCE_WOOD)
                .add(Items.BIRCH_WOOD)
                .add(Items.JUNGLE_WOOD)
                .add(Items.ACACIA_WOOD)
                .add(Items.DARK_OAK_WOOD)
                .add(Items.MANGROVE_WOOD)
                .add(Items.CHERRY_WOOD)
                .add(Items.PALE_OAK_WOOD);

        valueLookupBuilder(Tags.Items.LOG)
                .add(Items.OAK_LOG)
                .add(Items.SPRUCE_LOG)
                .add(Items.BIRCH_LOG)
                .add(Items.JUNGLE_LOG)
                .add(Items.ACACIA_LOG)
                .add(Items.DARK_OAK_LOG)
                .add(Items.MANGROVE_LOG)
                .add(Items.CHERRY_LOG)
                .add(Items.PALE_OAK_LOG);

        valueLookupBuilder(Tags.Items.IRON_COPPER_INTERCHANGE)
                .add(Items.IRON_INGOT)
                .add(Items.COPPER_INGOT);

        valueLookupBuilder(Tags.Items.CONTAINERS)
                .add(Items.CHEST)
                .add(Items.TRAPPED_CHEST)
                .add(Items.BARREL)
                .add(Items.SHULKER_BOX)
                .add(Items.COPPER_CHEST)
                .add(Items.WAXED_COPPER_CHEST)
                .add(Items.EXPOSED_COPPER_CHEST)
                .add(Items.WEATHERED_COPPER_CHEST)
                .add(Items.OXIDIZED_COPPER_CHEST)
                .add(Items.WAXED_EXPOSED_COPPER_CHEST)
                .add(Items.WAXED_WEATHERED_COPPER_CHEST)
                .add(Items.WAXED_OXIDIZED_COPPER_CHEST);

        valueLookupBuilder(Tags.Items.RANGE_WEAPONS)
                .add(Items.BOW)
                .add(Items.CROSSBOW);

        valueLookupBuilder(Tags.Items.LIGHT_BLOCKS)
                .add(Items.GLOWSTONE)
                .add(Items.SHROOMLIGHT)
                .add(Items.SEA_LANTERN)
                .add(Items.OCHRE_FROGLIGHT)
                .add(Items.VERDANT_FROGLIGHT)
                .add(Items.PEARLESCENT_FROGLIGHT);

        valueLookupBuilder(Tags.Items.OBSIDIAN_BLOCKS)
                .add(Items.OBSIDIAN)
                .add(Items.CRYING_OBSIDIAN);
    }
}
