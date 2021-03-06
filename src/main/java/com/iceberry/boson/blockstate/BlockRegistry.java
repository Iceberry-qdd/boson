package com.iceberry.boson.blockstate;

import com.iceberry.boson.Utils;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> obsidianRubikCube = BLOCKS.register("obsidian_rubik_cube", ObsidianRubikCube::new);
}
