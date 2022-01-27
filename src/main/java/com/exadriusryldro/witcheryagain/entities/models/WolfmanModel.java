package com.exadriusryldro.witcheryagain.entities.models;

import com.exadriusryldro.witcheryagain.Main;
import com.exadriusryldro.witcheryagain.entities.Wolfman;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WolfmanModel extends AnimatedGeoModel<Wolfman> {

	@Override
	public ResourceLocation getModelLocation(Wolfman object)
	{
		return new ResourceLocation(Main.MOD_ID, "geo/entity/wolfman.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Wolfman object)
	{
		return new ResourceLocation(Main.MOD_ID, "textures/entity/wolfman.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(Wolfman object)
	{
		return new ResourceLocation(Main.MOD_ID, "animations/wolfman.json");
	}
}