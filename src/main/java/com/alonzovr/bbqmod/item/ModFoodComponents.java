package com.alonzovr.bbqmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent SAUCED_BEEF = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).meat().build();
    public static final FoodComponent COOKED_SAUCED_BEEF = new FoodComponent.Builder().hunger(10).saturationModifier(1.0f).meat().build();
    public static final FoodComponent SAUCED_MUTTON = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).meat().build();
    public static final FoodComponent COOKED_SAUCED_MUTTON = new FoodComponent.Builder().hunger(8).saturationModifier(1.0f).meat().build();
    public static final FoodComponent SAUCE_BOTTLE = new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build();
    public static final FoodComponent SAUCED_CHICKEN = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 400, 0), 0.2f).meat().build();
    public static final FoodComponent COOKED_SAUCED_CHICKEN = new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).meat().build();
    public static final FoodComponent SAUCED_RABBIT = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).meat().build();
    public static final FoodComponent COOKED_SAUCED_RABBIT = new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).meat().build();
}
