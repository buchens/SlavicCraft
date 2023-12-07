package net.buchens.slavicmod.effect;

import net.buchens.slavicmod.SlavicMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SlavicMod.MOD_ID);

    public static final RegistryObject<MobEffect> SWALLOW = MOB_EFFECTS.register("swallow",
            () -> new SwallowEffect(MobEffectCategory.HARMFUL, 0xFFA500));
    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
