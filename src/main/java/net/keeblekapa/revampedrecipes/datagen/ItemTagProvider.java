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
    }
}
