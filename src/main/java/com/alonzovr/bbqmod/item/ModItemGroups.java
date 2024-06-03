package com.alonzovr.bbqmod.item;

import com.alonzovr.bbqmod.BBQMod;
import com.alonzovr.bbqmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BBQ = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BBQMod.MOD_ID, "bbq"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bbq"))
                        .icon(() -> new ItemStack(ModItems.BARBECUE_BOTTLE)).entries((displayContext, entries) -> {
                            entries.add(ModBlocks.GRILL);
                            entries.add(Items.HONEY_BOTTLE);
                            entries.add(ModItems.KETCHUP_BOTTLE);
                            entries.add(ModItems.BARBECUE_BOTTLE);
                            entries.add(ModItems.MUSTARD_BOTTLE);
                            entries.add(ModItems.KETCHUP_BEEF);
                            entries.add(ModItems.COOKED_KETCHUP_BEEF);
                            entries.add(ModItems.BARBECUE_BEEF);
                            entries.add(ModItems.COOKED_BARBECUE_BEEF);
                            entries.add(ModItems.KETCHUP_PORKCHOP);
                            entries.add(ModItems.COOKED_KETCHUP_PORKCHOP);
                            entries.add(ModItems.BARBECUE_PORKCHOP);
                            entries.add(ModItems.COOKED_BARBECUE_PORKCHOP);
                            entries.add(ModItems.KETCHUP_MUTTON);
                            entries.add(ModItems.COOKED_KETCHUP_MUTTON);
                            entries.add(ModItems.BARBECUE_MUTTON);
                            entries.add(ModItems.COOKED_BARBECUE_MUTTON);
                            entries.add(ModItems.KETCHUP_CHICKEN);
                            entries.add(ModItems.COOKED_KETCHUP_CHICKEN);
                            entries.add(ModItems.BARBECUE_CHICKEN);
                            entries.add(ModItems.COOKED_BARBECUE_CHICKEN);
                        }).build());

    public static void registerItemGroups() {

    }
}
