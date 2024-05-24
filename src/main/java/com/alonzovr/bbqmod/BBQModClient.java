package com.alonzovr.bbqmod;

import com.alonzovr.bbqmod.block.ModBlocks;
import com.alonzovr.bbqmod.block.entity.renderer.GrillBlockEntityRenderer;
import com.alonzovr.bbqmod.block.entity.ModBlockEntities;
import com.alonzovr.bbqmod.screen.ModScreenHandlers;
import com.alonzovr.bbqmod.screen.SeasoningTableScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class BBQModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(ModBlockEntities.GRILL_BLOCK_ENTITY_BLOCK_ENTITY_TYPE, GrillBlockEntityRenderer::new);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRILL, RenderLayer.getCutout());
        HandledScreens.register(ModScreenHandlers.SEASONING_TABLE_SCREEN_HANDLER_SCREEN_HANDLER_TYPE, SeasoningTableScreen::new);
    }
}
