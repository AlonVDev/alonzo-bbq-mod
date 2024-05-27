package com.alonzovr.bbqmod.block.entity;

import com.alonzovr.bbqmod.BBQMod;
import com.alonzovr.bbqmod.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<GrillBlockEntity> GRILL_BLOCK_ENTITY_BLOCK_ENTITY_TYPE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(BBQMod.MOD_ID, "grill"),
                    FabricBlockEntityTypeBuilder.create(GrillBlockEntity::new, ModBlocks.GRILL).build());

    public static void registerBlockEntities() {

    }
}
