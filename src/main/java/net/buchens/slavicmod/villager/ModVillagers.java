package net.buchens.slavicmod.villager;

import com.google.common.collect.ImmutableSet;
import net.buchens.slavicmod.SlavicMod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, SlavicMod.MOD_ID);
    public  static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, SlavicMod.MOD_ID);

    public static final RegistryObject<PoiType> CAULDRON = POI_TYPES.register("cauldron",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.CAULDRON.getStateDefinition().getPossibleStates()), 1, 1));

    public static final RegistryObject<VillagerProfession> HERBALIST = VILLAGER_PROFESSIONS.register("herbalist",
            () -> new VillagerProfession("herbalist", x -> x.get() == CAULDRON.get(),
                    x -> x.get() == CAULDRON.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_FARMER));



    public static void registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, CAULDRON);
        } catch (InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }




    public static void register(IEventBus eventBus) {

        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);

    }




}
