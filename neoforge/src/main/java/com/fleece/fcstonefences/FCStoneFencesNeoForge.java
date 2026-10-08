package com.fleece.fcstonefences;

import com.fleece.fcstonefences.impl.common.registry.ModBlocks;
import com.fleece.fcstonefences.impl.common.registry.ModItems;
import com.fleece.fcstonefences.impl.common.registry.ModTabs;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(Constants.MOD_ID)
public class FCStoneFencesNeoForge {

  public static IEventBus EVENT_BUS;

  public FCStoneFencesNeoForge(IEventBus modEventBus) {

    EVENT_BUS = modEventBus;

    FCStoneFences.init();

    bind(Registries.BLOCK, ModBlocks::register);
    bind(Registries.ITEM, ModItems::register);
    bind(Registries.CREATIVE_MODE_TAB, ModTabs::register);
  }

  public <T> void bind(ResourceKey<Registry<T>> registryKey, Consumer<BiConsumer<T, ResourceLocation>> source) {

    EVENT_BUS.addListener((Consumer<RegisterEvent>) event -> {
      if (registryKey.equals(event.getRegistryKey())) {
        source.accept((t, rl) -> event.register(registryKey, rl, () -> t));
      }
    });
  }
}