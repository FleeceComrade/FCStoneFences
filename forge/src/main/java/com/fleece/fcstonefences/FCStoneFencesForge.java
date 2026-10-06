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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;

@Mod(Constants.MOD_ID)
public class FCStoneFencesForge {

  public static IEventBus EVENT_BUS;

  public FCStoneFencesForge(FMLJavaModLoadingContext context) {

    EVENT_BUS = context.getModEventBus();

    FCStoneFences.init();

    bind(Registries.BLOCK, ModBlocks::register);
    bind(Registries.ITEM, ModItems::register);
    bind(Registries.CREATIVE_MODE_TAB, ModTabs::register);
  }

  /// @deprecated but old versions don't know about the new constructor yet :))))
  @SuppressWarnings("removal")
  public FCStoneFencesForge() {
    this(FMLJavaModLoadingContext.get());
  }

  public <T> void bind(ResourceKey<Registry<T>> registryKey, Consumer<BiConsumer<T, ResourceLocation>> source) {

    EVENT_BUS.addListener((Consumer<RegisterEvent>) event -> {
      if (registryKey.equals(event.getRegistryKey())) {
        source.accept((t, rl) -> event.register(registryKey, rl, () -> t));
      }
    });
  }
}