package com.fleece.fcstonefences.impl.common.registry;

import java.util.function.BiConsumer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public class ModTabs {

  //if (Objects.equals(event.getVanillaRegistry(), BuiltInRegistries.CREATIVE_MODE_TAB)) {
  //      event.register(BuiltInRegistries.CREATIVE_MODE_TAB.key(), new ResourceLocation(MODID, "fc_stone_fences_tab"), () -> CreativeModeTab.builder()
  //          .icon(() -> new ItemStack(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, "cobblestone_acacia_fence"))))
  //          .title(Component.translatable("itemGroup.fc_stone_fences"))
  //          .displayItems((context, output) -> {
  //            for (String stone : STONE_TYPES)
  //              for (String wood : WOOD_TYPES)
  //                output.accept(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, stone + "_" + wood + "_fence")));
  //          })
  //          .build());
  
  public static void register(BiConsumer<CreativeModeTab, ResourceLocation> consumer) {

  }
}
