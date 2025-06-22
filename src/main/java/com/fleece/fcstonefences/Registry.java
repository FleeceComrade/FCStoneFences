package com.fleece.fcstonefences;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import java.util.Objects;

import static com.fleece.fcstonefences.FCStoneFences.MODID;
import static com.fleece.fcstonefences.FCStoneFences.STONE_FENCES_TAB;

@SuppressWarnings({"DataFlowIssue", "unused"})
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = MODID)
public class Registry {
    private static final String[] STONE_TYPES = {
            "fooble",
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
            "deepslate_tile"
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
            "warped"
    };

    @SubscribeEvent
    public static void onRegistration(RegisterEvent event) {
        if (Objects.equals(event.getForgeRegistry(), ForgeRegistries.BLOCKS))
            for (String stone : STONE_TYPES)
                for (String wood : WOOD_TYPES)
                    event.register(ForgeRegistries.BLOCKS.getRegistryKey(), new ResourceLocation(MODID, stone + "_" + wood + "_fence"),
                            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
        if (event.getRegistryKey().equals(ForgeRegistries.ITEMS.getRegistryKey()))
            for (String stone : STONE_TYPES)
                for (String wood : WOOD_TYPES)
                    event.register(ForgeRegistries.ITEMS.getRegistryKey(), new ResourceLocation(MODID, stone + "_" + wood + "_fence"),
                            () -> new BlockItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, stone + "_" + wood + "_fence")), new Item.Properties().tab(STONE_FENCES_TAB)));
    }
}
