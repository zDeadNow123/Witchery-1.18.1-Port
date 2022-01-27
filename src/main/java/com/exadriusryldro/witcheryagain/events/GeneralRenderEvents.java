package com.exadriusryldro.witcheryagain.events;


import com.exadriusryldro.witcheryagain.Main;
import com.exadriusryldro.witcheryagain.entities.EntityManager;
import com.exadriusryldro.witcheryagain.entities.models.WolfmanModel;
import com.exadriusryldro.witcheryagain.entities.render.WolfmanRenderer;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GeneralRenderEvents {

    @SubscribeEvent
    public static void bindRenderes(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityManager.WOLFMAN.get(), WolfmanRenderer::new);
    }

}
