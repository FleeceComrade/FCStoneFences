package com.fleece.fcstonefences.block;

import com.fleece.fcstonefences.FCStoneFences;
import com.fleece.fcstonefences.item.ModCreativeModeTab;
import com.fleece.fcstonefences.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FCStoneFences.MODID);

//.......................Blocks...........................

    //..............Stone Brick Posts...................
    public static final RegistryObject<Block> Stone_Brick_Acacia_Fence = registerBlock("stone_brick_acacia_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
            strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Stone_Brick_Dark_Oak_Fence = registerBlock("stone_brick_dark_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Stone_Brick_Jungle_Fence = registerBlock("stone_brick_jungle_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Stone_Brick_Oak_Fence = registerBlock("stone_brick_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Stone_Brick_Birch_Fence = registerBlock("stone_brick_birch_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Stone_Brick_Spruce_Fence = registerBlock("stone_brick_spruce_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Stone_Brick_Mangrove_Fence = registerBlock("stone_brick_mangrove_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Stone_Brick_Crimson_Fence = registerBlock("stone_brick_crimson_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Stone_Brick_Warped_Fence = registerBlock("stone_brick_warped_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);

    //............Mossy Stone Brick Posts.................
    public static final RegistryObject<Block> Mossy_Stone_Brick_Acacia_Fence = registerBlock("mossy_stone_brick_acacia_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Stone_Brick_Dark_Oak_Fence = registerBlock("mossy_stone_brick_dark_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Stone_Brick_Jungle_Fence = registerBlock("mossy_stone_brick_jungle_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Stone_Brick_Oak_Fence = registerBlock("mossy_stone_brick_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Stone_Brick_Birch_Fence = registerBlock("mossy_stone_brick_birch_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Stone_Brick_Spruce_Fence = registerBlock("mossy_stone_brick_spruce_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Stone_Brick_Mangrove_Fence = registerBlock("mossy_stone_brick_mangrove_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Stone_Brick_Crimson_Fence = registerBlock("mossy_stone_brick_crimson_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Stone_Brick_Warped_Fence = registerBlock("mossy_stone_brick_warped_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);


    //..............Cobblestone Posts...................
    public static final RegistryObject<Block> Cobblestone_Acacia_Fence = registerBlock("cobblestone_acacia_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Cobblestone_Dark_Oak_Fence = registerBlock("cobblestone_dark_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Cobblestone_Jungle_Fence = registerBlock("cobblestone_jungle_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Cobblestone_Oak_Fence = registerBlock("cobblestone_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Cobblestone_Birch_Fence = registerBlock("cobblestone_birch_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Cobblestone_Spruce_Fence = registerBlock("cobblestone_spruce_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Cobblestone_Mangrove_Fence = registerBlock("cobblestone_mangrove_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Cobblestone_Crimson_Fence = registerBlock("cobblestone_crimson_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Cobblestone_Warped_Fence = registerBlock("cobblestone_warped_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);

    //............Mossy Cobblestone Posts.................
    public static final RegistryObject<Block> Mossy_Cobblestone_Acacia_Fence = registerBlock("mossy_cobblestone_acacia_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Cobblestone_Dark_Oak_Fence = registerBlock("mossy_cobblestone_dark_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Cobblestone_Jungle_Fence = registerBlock("mossy_cobblestone_jungle_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Cobblestone_Oak_Fence = registerBlock("mossy_cobblestone_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Cobblestone_Birch_Fence = registerBlock("mossy_cobblestone_birch_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Cobblestone_Spruce_Fence = registerBlock("mossy_cobblestone_spruce_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Cobblestone_Mangrove_Fence = registerBlock("mossy_cobblestone_mangrove_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Cobblestone_Crimson_Fence = registerBlock("mossy_cobblestone_crimson_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);
    public static final RegistryObject<Block> Mossy_Cobblestone_Warped_Fence = registerBlock("mossy_cobblestone_warped_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STONE_FENCES_TAB);



    private static<T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static<T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
