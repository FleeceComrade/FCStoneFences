package com.fleece.fcstonefences.platform;

import com.fleece.fcstonefences.platform.services.IRegistryHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.Builder;

public class ForgeRegistryHelper implements IRegistryHelper {

  @Override
  public Builder tabBuilder() {

    return CreativeModeTab.builder();
  }
}
