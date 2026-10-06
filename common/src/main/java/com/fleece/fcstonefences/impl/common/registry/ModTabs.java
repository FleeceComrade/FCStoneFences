package com.fleece.fcstonefences.impl.common.registry;

import com.fleece.fcstonefences.Constants;
import com.fleece.fcstonefences.FCStoneFences;
import com.fleece.fcstonefences.platform.Services;
import java.util.function.BiConsumer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

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

  public static CreativeModeTab FC_STONE_FENCES;

  public static void register(BiConsumer<CreativeModeTab, ResourceLocation> consumer) {

    FC_STONE_FENCES = Services.registry().tabBuilder()
        .icon(() -> new ItemStack(ModBlocks.ID_BY_BLOCK.keySet().stream().findFirst().get())) // should resolve to cobblestone_acacia_fence still ?
        .title(Component.translatable("itemGroup.fc_stone_fences"))
        .displayItems((itemDisplayParameters, output) -> {

          ModBlocks.ID_BY_BLOCK.keySet().forEach(output::accept);
        })
        .build();

    consumer.accept(FC_STONE_FENCES, FCStoneFences.id(Constants.MOD_ID));
  }
}
