package com.alonzovr.bbqmod.util;

import com.alonzovr.bbqmod.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 1, factories -> {
            factories.add((entity , random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.BARBECUE_BOTTLE, 2),
                    4, 5, 0.05f
            ));
            factories.add((entity , random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.KETCHUP_BOTTLE, 2),
                    4, 5, 0.05f
            ));
        });
    }
}
