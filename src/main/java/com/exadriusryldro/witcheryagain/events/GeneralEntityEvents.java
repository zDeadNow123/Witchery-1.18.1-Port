package com.exadriusryldro.witcheryagain.events;

import com.exadriusryldro.witcheryagain.Main;
import com.exadriusryldro.witcheryagain.entities.EntityManager;
import com.exadriusryldro.witcheryagain.entities.Wolfman;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GeneralEntityEvents {

    // Cria os atributos na entidade definida

    @SubscribeEvent
    public static void addEntryAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityManager.WOLFMAN.get(), Wolfman.createAttributes().build());
    }

}
