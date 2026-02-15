package com.fleece.fcstonefences;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

import static com.fleece.fcstonefences.FCStoneFences.MODID;

@SuppressWarnings({"DataFlowIssue", "unused"})
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = MODID)
public class Registration {
    private static final String[] STONE_TYPES = {
      "cobblestone",
      "stone_brick",
      "mossy_cobblestone",
      "mossy_stone_brick",
      "stone",
      "calcite",
      "andesite",
      "granite",
      "diorite",
      "brick",
      "prismarine",
      "red_sandstone",
      "mud_brick",
      "sandstone",
      "nether_brick",
      "red_nether_brick",
      "end_stone",
      "blackstone",
      "polished_blackstone",
      "polished_blackstone_brick",
      "cobbled_deepslate",
      "polished_deepslate",
      "deepslate_brick",
      "deepslate_tile",

      "tuff",
      "polished_tuff",
      "tuff_brick",
      "resin_brick",
      "end_stone_brick"
    };

    private static final String[] WOOD_TYPES = {
      "acacia",
      "birch",
      "crimson",
      "dark_oak",
      "jungle",
      "mangrove",
      "oak",
      "spruce",
      "warped",

      "bamboo",
      "pale_oak"
    };

    @SubscribeEvent
    public static void onRegistration(RegisterEvent event) {
        if (Objects.equals(event.getForgeRegistry(), ForgeRegistries.BLOCKS))
            for (String stone : STONE_TYPES)
                for (String wood : WOOD_TYPES) {
                    String fenceName = stone + "_" + wood + "_fence";
                    ResourceKey<Registry<Block>> registryKey = ForgeRegistries.BLOCKS.getRegistryKey();
                    event.register(registryKey, resourceLocation(MODID, fenceName),
                      () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()
                        .setId(ResourceKey.create(registryKey, resourceLocation(MODID, fenceName)))));
                }
        if (event.getRegistryKey().equals(ForgeRegistries.ITEMS.getRegistryKey()))
            for (String stone : STONE_TYPES)
                for (String wood : WOOD_TYPES) {
                    String fenceName = stone + "_" + wood + "_fence";
                    ResourceKey<Registry<Item>> registryKey = ForgeRegistries.ITEMS.getRegistryKey();
                    event.register(registryKey, resourceLocation(MODID, fenceName),
                      () -> new BlockItem(ForgeRegistries.BLOCKS.getValue(resourceLocation(MODID, fenceName)), new Item.Properties()
                        .setId(ResourceKey.create(registryKey, resourceLocation(MODID, fenceName)))));
                }
    }

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> STONE_FENCES_TAB = CREATIVE_MODE_TABS.register("stone_fences_tab", () -> CreativeModeTab.builder()
      .title(Component.translatable("itemGroup.fcStoneFences"))
      .icon(() -> new ItemStack(ForgeRegistries.ITEMS.getValue(Identifier.fromNamespaceAndPath(MODID, "stone_brick_acacia_fence"))))
      .displayItems((params, output) -> ForgeRegistries.ITEMS.getEntries().forEach((entry) -> {
          if (entry.getKey().identifier().getNamespace().equals(MODID)) {
              output.accept(new ItemStack(entry.getValue()));
          }
      }))
      .build());

    public static Identifier resourceLocation(String namespace, String path) {
        return Identifier.fromNamespaceAndPath(namespace, path);
    }
}
