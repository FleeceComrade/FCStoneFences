package com.fleece.fcstonefences;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

@Mod(FCStoneFences.MODID)
public class FCStoneFences {

    public static final String MODID = "fcstonefences";

    public static final CreativeModeTab STONE_FENCES_TAB = new CreativeModeTab("fc_stone_fences") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, "stone_brick_acacia_fence")));
        }
    };

    public FCStoneFences() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
