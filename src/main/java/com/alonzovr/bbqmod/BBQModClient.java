package com.alonzovr.bbqmod;

import com.alonzovr.bbqmod.block.ModBlocks;
import com.alonzovr.bbqmod.block.entity.renderer.GrillBlockEntityRenderer;
import com.alonzovr.bbqmod.block.entity.ModBlockEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class BBQModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(ModBlockEntities.GRILL_BLOCK_ENTITY_BLOCK_ENTITY_TYPE, GrillBlockEntityRenderer::new);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRILL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TOMATO_CROP, RenderLayer.getCutout());
    }
}
