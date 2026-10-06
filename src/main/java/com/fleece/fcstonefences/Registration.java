package com.fleece.fcstonefences;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;
import java.util.Map;

import static com.fleece.fcstonefences.FCStoneFences.MODID;

public final class Registration {
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
        "bamboo"
    };

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    private static final Map<String, RegistryObject<Block>> FENCE_BLOCKS = new LinkedHashMap<>();
    private static final Map<String, RegistryObject<Item>> FENCE_ITEMS = new LinkedHashMap<>();

    static {
        for (String stone : STONE_TYPES) {
            for (String wood : WOOD_TYPES) {
                String name = stone + "_" + wood + "_fence";
                RegistryObject<Block> block = BLOCKS.register(name, () -> new FenceBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
                FENCE_BLOCKS.put(name, block);
                FENCE_ITEMS.put(name, ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties())));
            }
        }
    }

    public static final RegistryObject<CreativeModeTab> STONE_FENCES_TAB = CREATIVE_MODE_TABS.register("stone_fences_tab",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.fcstonefences"))
            .icon(() -> new ItemStack(FENCE_ITEMS.get("stone_brick_acacia_fence").get()))
            .displayItems((parameters, output) -> {
                FENCE_ITEMS.values().forEach(item -> output.accept(item.get()));
            })
            .build());
}
