package net.buchens.slavicmod.item.client;

import net.buchens.slavicmod.SlavicMod;
import net.buchens.slavicmod.item.custom.ReinforcedBoarArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ReinforcedBoarArmorModel extends AnimatedGeoModel<ReinforcedBoarArmorItem> {

	@Override
	public ResourceLocation getModelResource(ReinforcedBoarArmorItem object) {
		return new ResourceLocation(SlavicMod.MOD_ID, "geo/reinforced_boar_armor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ReinforcedBoarArmorItem object) {
		return new ResourceLocation(SlavicMod.MOD_ID, "textures/armor/reinforced_boar_armor.png");
	}

	@Override
	public ResourceLocation getAnimationResource(ReinforcedBoarArmorItem animatable) {
		return new ResourceLocation(SlavicMod.MOD_ID, "animations/reinforced_boar_armor.animation.json");
	}
}
