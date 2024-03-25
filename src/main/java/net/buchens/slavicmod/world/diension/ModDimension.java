package net.buchens.slavicmod.world.diension;

import net.buchens.slavicmod.SlavicMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModDimension {
    public static final ResourceKey<Level> BKDIM_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(SlavicMod.MOD_ID, "bkdim"));
    public static final ResourceKey<DimensionType> BKDIM_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation(SlavicMod.MOD_ID, "bkdim_type"));

    public static void register(IEventBus modEventBus) {
        System.out.println("Registering ModDimensions for " + SlavicMod.MOD_ID);
    }
}
