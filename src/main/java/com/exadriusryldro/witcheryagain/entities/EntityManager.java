package com.exadriusryldro.witcheryagain.entities;

import com.exadriusryldro.witcheryagain.Main;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityManager {
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Main.MOD_ID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ENTITIES.register(bus);
    }

    public static final RegistryObject<EntityType<Wolfman>> WOLFMAN = ENTITIES.register(
            "wolfman",
            () -> EntityType.Builder.<Wolfman>of(Wolfman::new, MobCategory.MONSTER)
            .sized(.5f, 1.8f)
            .build(new ResourceLocation(Main.MOD_ID, "wolfman").toString()));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
