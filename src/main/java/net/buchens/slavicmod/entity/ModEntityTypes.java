package net.buchens.slavicmod.entity;

import net.buchens.slavicmod.SlavicMod;
import net.buchens.slavicmod.entity.custom.DrownerEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SlavicMod.MOD_ID);

    public static final RegistryObject<EntityType<DrownerEntity>> DROWNER =
            ENTITY_TYPES.register("drowner",
            () -> EntityType.Builder.of(DrownerEntity::new, MobCategory.MONSTER)
            .sized(1.0f, 1.0f)
            .build(new ResourceLocation(SlavicMod.MOD_ID, "drowner").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
