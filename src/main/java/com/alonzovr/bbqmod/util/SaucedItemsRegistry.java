package com.alonzovr.bbqmod.util;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import com.alonzovr.bbqmod.item.ModItems;

import java.util.HashMap;
import java.util.Map;

public class SaucedItemsRegistry {
    private static final Map<Item, Map<Item, Item>> SAUCED_ITEM_MAP = new HashMap<>();

    static {
        Map<Item, Item> sauceAMap = new HashMap<>();
        sauceAMap.put(Items.BEEF, ModItems.KETCHUP_BEEF);
        //sauceAMap.put(Items.COOKED_CHICKEN, ModItems.SAUCED_CHICKEN_A);

        Map<Item, Item> sauceBMap = new HashMap<>();
        sauceBMap.put(Items.BEEF, ModItems.BARBECUE_BEEF);
        //sauceBMap.put(Items.COOKED_CHICKEN, ModItems.SAUCED_CHICKEN_B);

        SAUCED_ITEM_MAP.put(ModItems.KETCHUP_BOTTLE, sauceAMap);
        SAUCED_ITEM_MAP.put(ModItems.BARBECUE_BOTTLE, sauceBMap);
    }

    public static Item getSaucedItem(Item sauce, Item normalItem) {
        return SAUCED_ITEM_MAP.getOrDefault(sauce, new HashMap<>()).getOrDefault(normalItem, normalItem);
    }
}
