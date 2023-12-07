package net.buchens.slavicmod.potion;

import net.buchens.slavicmod.SlavicMod;
import net.buchens.slavicmod.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
    = DeferredRegister.create(ForgeRegistries.POTIONS, SlavicMod.MOD_ID);

    public static final RegistryObject<Potion> SWALLOW_POTION = POTIONS.register("swallow_potion",
            ()-> new Potion(new MobEffectInstance(ModEffects.SWALLOW.get(), 200, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
