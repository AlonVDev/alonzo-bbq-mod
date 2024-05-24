package com.alonzovr.bbqmod.screen;

import com.alonzovr.bbqmod.BBQMod;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<SeasoningTableScreenHandler> SEASONING_TABLE_SCREEN_HANDLER_SCREEN_HANDLER_TYPE =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(BBQMod.MOD_ID, "seasoning_table"),
                    new ExtendedScreenHandlerType<>(SeasoningTableScreenHandler::new));

    public static void registerScreenHandlers() {

    }
}
