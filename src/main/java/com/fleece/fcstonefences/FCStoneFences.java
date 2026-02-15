package com.fleece.fcstonefences;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FCStoneFences.MODID)
public class FCStoneFences {
    public static final String MODID = "fcstonefences";
    public FCStoneFences(FMLJavaModLoadingContext context) {
        Registration.CREATIVE_MODE_TABS.register(context.getModBusGroup());
    }
}
