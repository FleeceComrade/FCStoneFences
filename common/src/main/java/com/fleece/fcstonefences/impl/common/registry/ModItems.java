package com.fleece.fcstonefences.impl.common.registry;

import java.util.function.BiConsumer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItems {

  //if (event.getRegistryKey().equals(ForgeRegistries.ITEMS.getRegistryKey()))
  //      for (String stone : STONE_TYPES)
  //        for (String wood : WOOD_TYPES)
  //          event.register(ForgeRegistries.ITEMS.getRegistryKey(), new ResourceLocation(MODID, stone + "_" + wood + "_fence"),
  //              () -> new BlockItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, stone + "_" + wood + "_fence")), new Item.Properties()));

  public static void register(BiConsumer<Item, ResourceLocation> consumer) {

  }
}
