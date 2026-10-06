package com.fleece.fcstonefences.impl.common.registry;

import com.fleece.fcstonefences.FCStoneFences;
import com.fleece.fcstonefences.api.common.registry.StoneTypes;
import com.fleece.fcstonefences.api.common.registry.WoodTypes;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.BiConsumer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {

  public static final Map<Block, ResourceLocation> ID_BY_BLOCK = new LinkedHashMap<>();

  //if (Objects.equals(event.getForgeRegistry(), ForgeRegistries.BLOCKS))
  //      for (String stone : STONE_TYPES)
  //        for (String wood : WOOD_TYPES)
  //          event.register(ForgeRegistries.BLOCKS.getRegistryKey(), new ResourceLocation(MODID, stone + "_" + wood + "_fence"),
  //              () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.5f, 6f).requiresCorrectToolForDrops()));

  public static void register(BiConsumer<Block, ResourceLocation> consumer) {

    ID_BY_BLOCK.clear(); // just in case?

    for (StoneTypes stone : StoneTypes.values()) {
      for (WoodTypes wood : WoodTypes.values()) {

        ResourceLocation id = FCStoneFences.id(stone.name().toLowerCase() + "_" + wood.name().toLowerCase() + "_fence");
        Block fence = new FenceBlock(BlockBehaviour.Properties.of().strength(1.5f, 6f).requiresCorrectToolForDrops());
        ID_BY_BLOCK.put(fence, id);
        consumer.accept(fence, id);
      }
    }
  }
}
