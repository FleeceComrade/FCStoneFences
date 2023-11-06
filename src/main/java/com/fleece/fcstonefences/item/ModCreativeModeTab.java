package com.fleece.fcstonefences.item;

import com.fleece.fcstonefences.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab STONE_FENCES_TAB = new CreativeModeTab("stone_fences") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.Stone_Brick_Acacia_Fence.get());
        }
    };
}