package com.fleece.fcstonefences.impl.common.registry;

import java.util.function.BiConsumer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class ModBlocks {

  //if (Objects.equals(event.getForgeRegistry(), ForgeRegistries.BLOCKS))
  //      for (String stone : STONE_TYPES)
  //        for (String wood : WOOD_TYPES)
  //          event.register(ForgeRegistries.BLOCKS.getRegistryKey(), new ResourceLocation(MODID, stone + "_" + wood + "_fence"),
  //              () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.5f, 6f).requiresCorrectToolForDrops()));

  public static void register(BiConsumer<Block, ResourceLocation> consumer) {

  }
}
