package net.buchens.slavicmod.entity.client;

import net.buchens.slavicmod.SlavicMod;
import net.buchens.slavicmod.entity.custom.DrownerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DrownerModel extends AnimatedGeoModel<DrownerEntity> {
    @Override
    public ResourceLocation getModelResource(DrownerEntity object) {
        return new ResourceLocation(SlavicMod.MOD_ID, "geo/drowner.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DrownerEntity object) {
        return new ResourceLocation(SlavicMod.MOD_ID, "textures/entity/drownerr.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DrownerEntity animatable) {
        return new ResourceLocation(SlavicMod.MOD_ID, "animations/drowner.animation.json");
    }
}
