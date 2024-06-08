package com.alonzovr.bbqmod.datagen;

import com.alonzovr.bbqmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.RecipeSerializer;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // Campfire/Grill
        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 600, ModItems.BARBECUE_BEEF, ModItems.COOKED_BARBECUE_BEEF, 0.35f);
        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 600, ModItems.KETCHUP_BEEF, ModItems.COOKED_KETCHUP_BEEF, 0.35f);

        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 600, ModItems.BARBECUE_PORKCHOP, ModItems.COOKED_BARBECUE_PORKCHOP, 0.35f);
        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 600, ModItems.KETCHUP_PORKCHOP, ModItems.COOKED_KETCHUP_PORKCHOP, 0.35f);

        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 600, ModItems.BARBECUE_MUTTON, ModItems.COOKED_BARBECUE_MUTTON, 0.35f);
        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 600, ModItems.KETCHUP_MUTTON, ModItems.COOKED_KETCHUP_MUTTON, 0.35f);

        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 600, ModItems.BARBECUE_CHICKEN, ModItems.COOKED_BARBECUE_CHICKEN, 0.35f);
        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 600, ModItems.KETCHUP_CHICKEN, ModItems.COOKED_KETCHUP_CHICKEN, 0.35f);

        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 600, ModItems.BARBECUE_RABBIT, ModItems.COOKED_BARBECUE_RABBIT, 0.35f);
        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 600, ModItems.KETCHUP_RABBIT, ModItems.COOKED_KETCHUP_RABBIT, 0.35f);

        // Smelting
        offerFoodCookingRecipe(exporter, "smelting", RecipeSerializer.SMELTING, 200, ModItems.BARBECUE_BEEF, ModItems.COOKED_BARBECUE_BEEF, 0.35f);
        offerFoodCookingRecipe(exporter, "smelting", RecipeSerializer.SMELTING, 200, ModItems.KETCHUP_BEEF, ModItems.COOKED_KETCHUP_BEEF, 0.35f);

        offerFoodCookingRecipe(exporter, "smelting", RecipeSerializer.SMELTING, 200, ModItems.BARBECUE_PORKCHOP, ModItems.COOKED_BARBECUE_PORKCHOP, 0.35f);
        offerFoodCookingRecipe(exporter, "smelting", RecipeSerializer.SMELTING, 200, ModItems.KETCHUP_PORKCHOP, ModItems.COOKED_KETCHUP_PORKCHOP, 0.35f);

        offerFoodCookingRecipe(exporter, "smelting", RecipeSerializer.SMELTING, 200, ModItems.BARBECUE_MUTTON, ModItems.COOKED_BARBECUE_MUTTON, 0.35f);
        offerFoodCookingRecipe(exporter, "smelting", RecipeSerializer.SMELTING, 200, ModItems.KETCHUP_MUTTON, ModItems.COOKED_KETCHUP_MUTTON, 0.35f);

        offerFoodCookingRecipe(exporter, "smelting", RecipeSerializer.SMELTING, 200, ModItems.BARBECUE_CHICKEN, ModItems.COOKED_BARBECUE_CHICKEN, 0.35f);
        offerFoodCookingRecipe(exporter, "smelting", RecipeSerializer.SMELTING, 200, ModItems.KETCHUP_CHICKEN, ModItems.COOKED_KETCHUP_CHICKEN, 0.35f);

        offerFoodCookingRecipe(exporter, "smelting", RecipeSerializer.SMELTING, 200, ModItems.BARBECUE_RABBIT, ModItems.COOKED_BARBECUE_RABBIT, 0.35f);
        offerFoodCookingRecipe(exporter, "smelting", RecipeSerializer.SMELTING, 200, ModItems.KETCHUP_RABBIT, ModItems.COOKED_KETCHUP_RABBIT, 0.35f);

        // Smoking
        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING, 100, ModItems.BARBECUE_BEEF, ModItems.COOKED_BARBECUE_BEEF, 0.35f);
        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING, 100, ModItems.KETCHUP_BEEF, ModItems.COOKED_KETCHUP_BEEF, 0.35f);

        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING, 100, ModItems.BARBECUE_PORKCHOP, ModItems.COOKED_BARBECUE_PORKCHOP, 0.35f);
        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING, 100, ModItems.KETCHUP_PORKCHOP, ModItems.COOKED_KETCHUP_PORKCHOP, 0.35f);

        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING, 100, ModItems.BARBECUE_MUTTON, ModItems.COOKED_BARBECUE_MUTTON, 0.35f);
        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING, 100, ModItems.KETCHUP_MUTTON, ModItems.COOKED_KETCHUP_MUTTON, 0.35f);

        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING, 100, ModItems.BARBECUE_CHICKEN, ModItems.COOKED_BARBECUE_CHICKEN, 0.35f);
        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING, 100, ModItems.KETCHUP_CHICKEN, ModItems.COOKED_KETCHUP_CHICKEN, 0.35f);

        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING, 100, ModItems.BARBECUE_RABBIT, ModItems.COOKED_BARBECUE_RABBIT, 0.35f);
        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING, 100, ModItems.KETCHUP_RABBIT, ModItems.COOKED_KETCHUP_RABBIT, 0.35f);
    }
}
