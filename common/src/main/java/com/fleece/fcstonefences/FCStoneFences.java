package com.fleece.fcstonefences;

import net.minecraft.resources.ResourceLocation;

public class FCStoneFences {

  public static void init() {
  }

  public static ResourceLocation id(String path) {

    return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, path);
  }
}