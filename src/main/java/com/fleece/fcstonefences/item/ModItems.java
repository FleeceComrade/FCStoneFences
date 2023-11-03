package com.fleece.fcstonefences.item;

import com.fleece.fcstonefences.FCStoneFences;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FCStoneFences.MODID);


    //********    MISC ITEMS    *********

    /*public static final RegistryObject<Item> RawAlloy = ITEMS.register("raw_alloy",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    */

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
