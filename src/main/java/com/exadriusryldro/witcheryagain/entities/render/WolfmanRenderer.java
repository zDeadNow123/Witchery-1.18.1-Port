package com.exadriusryldro.witcheryagain.entities.render;

import com.exadriusryldro.witcheryagain.entities.Wolfman;
import com.exadriusryldro.witcheryagain.entities.models.WolfmanModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;


public class WolfmanRenderer extends GeoEntityRenderer<Wolfman> {

    public WolfmanRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WolfmanModel());
        this.shadowRadius = 0.7F;
    }


}
