package com.iceberry.boson.blockstate;

import com.iceberry.boson.Utils;
import com.iceberry.boson.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> obsidianRubikCube = ITEMS.register("obsidian_rubik_cube", () -> new BlockItem(BlockRegistry.obsidianRubikCube.get(), new Item.Properties().tab(ModGroup.itemGroup)));
}
