package net.buchens.slavicmod.item.custom;

import net.buchens.slavicmod.item.ModCreativeModeTab;
import net.buchens.slavicmod.item.ModItems;
import net.minecraft.world.entity.EquipmentSlot;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import software.bernie.example.GeckoLibMod;
import software.bernie.example.registry.ItemRegistry;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;
import net.buchens.slavicmod.SlavicMod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReinforcedBoarArmorItem extends GeoArmorItem implements IAnimatable {
	private AnimationFactory factory = new AnimationFactory(this);

	public ReinforcedBoarArmorItem(ArmorMaterial materialIn, EquipmentSlot slot, Properties builder) {
		super(materialIn, slot, builder.tab(ModCreativeModeTab.SLAVICCRAFT_TAB));
	}

	@Override
	public void registerControllers(AnimationData data) {

	}

	@Override
	public AnimationFactory getFactory() {
		return null;
	}





}
