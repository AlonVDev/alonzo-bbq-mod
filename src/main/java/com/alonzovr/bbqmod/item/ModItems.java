package com.alonzovr.bbqmod.item;

import com.alonzovr.bbqmod.BBQMod;
import com.alonzovr.bbqmod.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Sauces
    public static final Item KETCHUP_BOTTLE = registerItem("ketchup_bottle", new SauceBottleItem(new Item.Settings().recipeRemainder(Items.GLASS_BOTTLE).food(ModFoodComponents.SAUCE_BOTTLE).maxCount(16)));
    public static final Item BARBECUE_BOTTLE = registerItem("barbecue_bottle", new SauceBottleItem(new Item.Settings().recipeRemainder(Items.GLASS_BOTTLE).food(ModFoodComponents.SAUCE_BOTTLE).maxCount(16)));

    // Foods
    public static final Item KETCHUP_BEEF = registerItem("ketchup_beef", new Item(new FabricItemSettings().food(ModFoodComponents.SAUCED_BEEF)));
    public static final Item BARBECUE_BEEF = registerItem("barbecue_beef", new Item(new FabricItemSettings().food(ModFoodComponents.SAUCED_BEEF)));
    public static final Item COOKED_KETCHUP_BEEF = registerItem("cooked_ketchup_beef", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SAUCED_BEEF)));
    public static final Item COOKED_BARBECUE_BEEF = registerItem("cooked_barbecue_beef", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SAUCED_BEEF)));

    public static final Item KETCHUP_PORKCHOP = registerItem("ketchup_porkchop", new Item(new FabricItemSettings().food(ModFoodComponents.SAUCED_PORKCHOP)));
    public static final Item BARBECUE_PORKCHOP = registerItem("barbecue_porkchop", new Item(new FabricItemSettings().food(ModFoodComponents.SAUCED_PORKCHOP)));
    public static final Item COOKED_KETCHUP_PORKCHOP = registerItem("cooked_ketchup_porkchop", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SAUCED_PORKCHOP)));
    public static final Item COOKED_BARBECUE_PORKCHOP = registerItem("cooked_barbecue_porkchop", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SAUCED_PORKCHOP)));

    public static final Item KETCHUP_MUTTON = registerItem("ketchup_mutton", new Item(new FabricItemSettings().food(ModFoodComponents.SAUCED_MUTTON)));
    public static final Item BARBECUE_MUTTON = registerItem("barbecue_mutton", new Item(new FabricItemSettings().food(ModFoodComponents.SAUCED_MUTTON)));
    public static final Item COOKED_KETCHUP_MUTTON = registerItem("cooked_ketchup_mutton", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SAUCED_MUTTON)));
    public static final Item COOKED_BARBECUE_MUTTON = registerItem("cooked_barbecue_mutton", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SAUCED_MUTTON)));

    public static final Item KETCHUP_CHICKEN = registerItem("ketchup_chicken", new Item(new FabricItemSettings().food(ModFoodComponents.SAUCED_CHICKEN)));
    public static final Item BARBECUE_CHICKEN = registerItem("barbecue_chicken", new Item(new FabricItemSettings().food(ModFoodComponents.SAUCED_CHICKEN)));
    public static final Item COOKED_KETCHUP_CHICKEN = registerItem("cooked_ketchup_chicken", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SAUCED_CHICKEN)));
    public static final Item COOKED_BARBECUE_CHICKEN = registerItem("cooked_barbecue_chicken", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SAUCED_CHICKEN)));

    public static final Item KETCHUP_RABBIT = registerItem("ketchup_rabbit", new Item(new FabricItemSettings().food(ModFoodComponents.SAUCED_RABBIT)));
    public static final Item BARBECUE_RABBIT = registerItem("barbecue_rabbit", new Item(new FabricItemSettings().food(ModFoodComponents.SAUCED_RABBIT)));
    public static final Item COOKED_KETCHUP_RABBIT = registerItem("cooked_ketchup_rabbit", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SAUCED_RABBIT)));
    public static final Item COOKED_BARBECUE_RABBIT = registerItem("cooked_barbecue_rabbit", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SAUCED_RABBIT)));

    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds", new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    // Skewers
    public static final Item BEEF_SKEWER = registerItem("beef_skewer", new SkewerItem(new FabricItemSettings().food(ModFoodComponents.SAUCED_BEEF)));
    public static final Item COOKED_BEEF_SKEWER = registerItem("cooked_beef_skewer", new SkewerItem(new FabricItemSettings().food(ModFoodComponents.COOKED_SAUCED_BEEF)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BBQMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.addAfter(Items.HONEY_BOTTLE, KETCHUP_BOTTLE);
            entries.addAfter(KETCHUP_BOTTLE, BARBECUE_BOTTLE);
            entries.addAfter(Items.BEETROOT, TOMATO);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.addAfter(Items.BEETROOT_SEEDS, TOMATO_SEEDS);
        });
    }
}
