package com.exadriusryldro.witcheryagain.items;

import com.exadriusryldro.witcheryagain.Main;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemManager {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    public static final RegistryObject<MoonCharm> MOONCHARM = ItemManager.ITEMS.register("mooncharm", MoonCharm::new);
    public static final RegistryObject<WolfToken> WOLFTOKEN = ItemManager.ITEMS.register("wolftoken", WolfToken::new);
    public static final RegistryObject<Boline> BOLINE = ItemManager.ITEMS.register("boline", Boline::new);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

