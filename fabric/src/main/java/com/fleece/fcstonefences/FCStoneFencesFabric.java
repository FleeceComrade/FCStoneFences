package com.fleece.fcstonefences;

import com.fleece.fcstonefences.impl.common.registry.ModBlocks;
import com.fleece.fcstonefences.impl.common.registry.ModItems;
import com.fleece.fcstonefences.impl.common.registry.ModTabs;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class FCStoneFencesFabric implements ModInitializer {

  @Override
  public void onInitialize() {

    FCStoneFences.init();

    bind(BuiltInRegistries.BLOCK, ModBlocks::register);
    bind(BuiltInRegistries.ITEM, ModItems::register);
    bind(BuiltInRegistries.CREATIVE_MODE_TAB, ModTabs::register);
  }

  public <T> void bind(Registry<T> registry, Consumer<BiConsumer<T, ResourceLocation>> source) {

    source.accept((t, rl) -> Registry.register(registry, rl, t));
  }
}
