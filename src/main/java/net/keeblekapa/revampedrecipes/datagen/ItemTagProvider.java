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
                .add(Items.POLISHED_DEEPSLATE)
                .add(Items.GRANITE)
                .add(Items.POLISHED_GRANITE)
                .add(Items.DIORITE)
                .add(Items.POLISHED_DIORITE)
                .add(Items.ANDESITE)
                .add(Items.POLISHED_ANDESITE)
                .add(Items.BLACKSTONE)
                .add(Items.POLISHED_BLACKSTONE)
                .add(Items.CHISELED_POLISHED_BLACKSTONE)
                .add(Items.END_STONE);

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
                .add(Items.WAXED_OXIDIZED_COPPER_CHEST)
        ;
    }
}
