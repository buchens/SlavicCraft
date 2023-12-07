package net.buchens.slavicmod.item.client;

import net.minecraft.resources.ResourceLocation;
import software.bernie.example.item.GeckoArmorItem;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ReinforcedBoarArmorModel extends AnimatedGeoModel<GeckoArmorItem> {
	@Override
	public ResourceLocation getModelResource(GeckoArmorItem object) {
		return new ResourceLocation(GeckoLib.ModID, "geo/reinforced_boar_armor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GeckoArmorItem object) {
		return new ResourceLocation(GeckoLib.ModID, "textures/item/reinforced_boar_armor.png");
	}

	@Override
	public ResourceLocation getAnimationResource(GeckoArmorItem animatable) {
		return new ResourceLocation(GeckoLib.ModID, "animations/reinforced_boar_armor.animation.json");
	}
}
