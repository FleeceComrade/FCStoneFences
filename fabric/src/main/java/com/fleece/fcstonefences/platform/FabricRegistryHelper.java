package com.fleece.fcstonefences.platform;

import com.fleece.fcstonefences.platform.services.IRegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.world.item.CreativeModeTab.Builder;

public class FabricRegistryHelper implements IRegistryHelper {

  @Override
  public Builder tabBuilder() {

    return FabricItemGroup.builder();
  }
}
