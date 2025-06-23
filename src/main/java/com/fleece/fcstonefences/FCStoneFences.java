package com.fleece.fcstonefences;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(FCStoneFences.MODID)
public class FCStoneFences {

    public static final String MODID = "fcstonefences";

    public FCStoneFences() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
