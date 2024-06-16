package com.alonzovr.bbqmod.datagen;

import com.alonzovr.bbqmod.block.ModBlocks;
import com.alonzovr.bbqmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

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

        // Other
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GRILL, 1)
                .pattern("IBI")
                .pattern("ICI")
                .pattern("I I")
                .input('I', Items.IRON_INGOT)
                .input('B', Items.IRON_BARS)
                .input('C', Items.COAL_BLOCK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                .criterion(hasItem(Items.COAL_BLOCK), conditionsFromItem(Items.COAL_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRILL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.KETCHUP_BOTTLE)
                .input(Items.GLASS_BOTTLE)
                .input(Items.SUGAR)
                .input(ModItems.TOMATO)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(Items.GLASS_BOTTLE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(ModItems.TOMATO), conditionsFromItem(ModItems.TOMATO))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.KETCHUP_BOTTLE)));
    }
}
