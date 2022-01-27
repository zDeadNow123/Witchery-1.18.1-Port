package com.exadriusryldro.witcheryagain;

import com.exadriusryldro.witcheryagain.entities.EntityManager;
import com.exadriusryldro.witcheryagain.events.GeneralEntityEvents;
import com.exadriusryldro.witcheryagain.events.GeneralRenderEvents;
import com.exadriusryldro.witcheryagain.items.ItemManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Este valor tem que ser identico ao do mods.toml no META-INF
@Mod(Main.MOD_ID)
public class Main {

    public Main() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        EntityManager.register(eventBus);
        ItemManager.register(eventBus);

        MinecraftForge.EVENT_BUS.register(new GeneralEntityEvents());
        MinecraftForge.EVENT_BUS.register(new GeneralRenderEvents());
        MinecraftForge.EVENT_BUS.register(this);
    }

    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "witcheryagain";
}
