package net.ponyglory.tarpo.events;

import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.ponyglory.tarpo.Tarpo;
import net.ponyglory.tarpo.item.custom.SpawnEggs;
import net.ponyglory.tarpo.mobs.ModMobs;
import net.ponyglory.tarpo.mobs.custom.DarkEntity;

@Mod.EventBusSubscriber(modid = Tarpo.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModMobs.DARK.get(), DarkEntity.createMutableAttribute().build());
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        SpawnEggs.DarkEggs.initSpawnEggs();
    }
}
