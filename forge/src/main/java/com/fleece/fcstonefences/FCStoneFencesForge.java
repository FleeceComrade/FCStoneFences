package com.fleece.fcstonefences;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class FCStoneFencesForge {

  public FCStoneFencesForge(FMLJavaModLoadingContext context) {

    FCStoneFences.init();
  }

  /// @deprecated but old versions don't know about the new constructor yet :))))
  @SuppressWarnings("removal")
  public FCStoneFencesForge() {
    this(FMLJavaModLoadingContext.get());
  }
}