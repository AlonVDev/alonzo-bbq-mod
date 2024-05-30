package com.alonzovr.bbqmod.item;

import com.alonzovr.bbqmod.BBQMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item KETCHUP_BOTTLE = registerItem("ketchup_bottle", new SauceBottleItem(new Item.Settings().recipeRemainder(Items.GLASS_BOTTLE).food(ModFoodComponents.SAUCE_BOTTLE).maxCount(16)));
    public static final Item BARBECUE_BOTTLE = registerItem("barbecue_bottle", new SauceBottleItem(new Item.Settings().recipeRemainder(Items.GLASS_BOTTLE).food(ModFoodComponents.SAUCE_BOTTLE).maxCount(16)));
    public static final Item MUSTARD_BOTTLE = registerItem("mustard_bottle", new SauceBottleItem(new Item.Settings().recipeRemainder(Items.GLASS_BOTTLE).food(ModFoodComponents.SAUCE_BOTTLE).maxCount(16)));
    public static final Item KETCHUP_SAUCED_BEEF = registerItem("ketchup_sauced_beef", new Item(new FabricItemSettings().food(ModFoodComponents.SAUCED_BEEF)));
    public static final Item BARBECUE_SAUCED_BEEF = registerItem("barbecue_sauced_beef", new Item(new FabricItemSettings().food(ModFoodComponents.SAUCED_BEEF)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BBQMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.addAfter(Items.HONEY_BOTTLE, KETCHUP_BOTTLE);
            entries.addAfter(Items.HONEY_BOTTLE, BARBECUE_BOTTLE);
            //entries.addAfter(Items.HONEY_BOTTLE, MUSTARD_BOTTLE);
        });
    }
}
