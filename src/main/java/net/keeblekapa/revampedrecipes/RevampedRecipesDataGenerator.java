package net.keeblekapa.revampedrecipes;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.keeblekapa.revampedrecipes.datagen.BlockTagProvider;
import net.keeblekapa.revampedrecipes.datagen.ItemTagProvider;
import net.keeblekapa.revampedrecipes.datagen.RecipeProvider;

public class RevampedRecipesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(BlockTagProvider::new);
        pack.addProvider(ItemTagProvider::new);
        pack.addProvider(RecipeProvider::new);

	}
}
