package net.ponyglory.tarpo.mobs;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.ponyglory.tarpo.Tarpo;
import net.ponyglory.tarpo.mobs.custom.DarkEntity;


public class ModMobs {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES 
        = DeferredRegister.create(ForgeRegistries.ENTITIES, Tarpo.MOD_ID);


    public static final RegistryObject<EntityType<DarkEntity>> DARK =
            ENTITY_TYPES.register("dark",
                    () -> EntityType.Builder.of(DarkEntity::new,
                            EntityClassification.MONSTER).sized(1, 2)
                            .build(new ResourceLocation(Tarpo.MOD_ID, "dark").toString()));

    public static void register(IEventBus eventBus) { ENTITY_TYPES.register(eventBus);}
}
