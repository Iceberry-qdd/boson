package com.iceberry.boson;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class Boson {
    public Boson() {
        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        com.iceberry.boson.firstItem.ItemRegistry.ITEMS.register(eventBus);
        com.iceberry.boson.food.ItemRegistry.ITEMS.register(eventBus);
        com.iceberry.boson.melee_weapons.ItemRegistry.ITEMS.register(eventBus);
        com.iceberry.boson.tool.ItemRegistry.ITEMS.register(eventBus);
        com.iceberry.boson.armor.ItemRegistry.ITEMS.register(eventBus);
        com.iceberry.boson.firstBlock.ItemRegistry.ITEMS.register(eventBus);
        com.iceberry.boson.firstBlock.BlockRegister.BLOCKS.register(eventBus);
        com.iceberry.boson.blockstate.ItemRegistry.ITEMS.register(eventBus);
        com.iceberry.boson.blockstate.BlockRegistry.BLOCKS.register(eventBus);
    }
}
