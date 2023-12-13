package net.buchens.slavicmod.entity.client;

import net.buchens.slavicmod.SlavicMod;
import net.buchens.slavicmod.entity.custom.WildHuntWarriorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WildHuntWarriorModel extends AnimatedGeoModel<WildHuntWarriorEntity> {
    @Override
    public ResourceLocation getModelResource(WildHuntWarriorEntity object) {
        return new ResourceLocation(SlavicMod.MOD_ID, "geo/wild_hunt_warrior.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WildHuntWarriorEntity object) {
        return new ResourceLocation(SlavicMod.MOD_ID, "textures/entity/wildhunt_warrior.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WildHuntWarriorEntity object) {
        return new ResourceLocation(SlavicMod.MOD_ID, "animations/wildhunt_warrior.animation.json");
    }
}
