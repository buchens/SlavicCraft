package net.buchens.slavicmod.item.custom;

import net.buchens.slavicmod.item.ModCreativeModeTab;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import software.bernie.example.registry.ItemRegistry;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReinforcedBoarArmorItem extends GeoArmorItem implements IAnimatable {
	private AnimationFactory factory = new AnimationFactory(this);

	public ReinforcedBoarArmorItem(ArmorMaterial materialIn, EquipmentSlot slot, Properties builder) {
		super(materialIn, slot, builder.tab(ModCreativeModeTab.SLAVICCRAFT_TAB));
	}


	private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
		// This is all the extradata this event carries. The livingentity is the entity
		// that's wearing the armor. The itemstack and equipmentslottype are self
		// explanatory.
		List<EquipmentSlot> slotData = event.getExtraDataOfType(EquipmentSlot.class);
		List<ItemStack> stackData = event.getExtraDataOfType(ItemStack.class);
		LivingEntity livingEntity = event.getExtraDataOfType(LivingEntity.class).get(0);

		// Always loop the animation but later on in this method we'll decide whether or
		// not to actually play it
		event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.potato_armor.new", true));

		// If the living entity is an armorstand just play the animation nonstop
		if (livingEntity instanceof ArmorStand) {
			return PlayState.CONTINUE;
		}

		List<Item> armorList = new ArrayList<>(4);
		for (EquipmentSlot slot : EquipmentSlot.values()) {
			if (slot.getType() == EquipmentSlot.Type.ARMOR) {
				if (livingEntity.getItemBySlot(slot) != null) {
					armorList.add(livingEntity.getItemBySlot(slot).getItem());
				}
			}
		}

		// Make sure the player is wearing all the armor. If they are, continue playing
		// the animation, otherwise stop
		boolean isWearingAll = armorList.containsAll(Arrays.asList(ItemRegistry.GECKOARMOR_BOOTS.get(),
				ItemRegistry.GECKOARMOR_LEGGINGS.get(), ItemRegistry.GECKOARMOR_CHEST.get(), ItemRegistry.GECKOARMOR_HEAD.get()));
		return isWearingAll ? PlayState.CONTINUE : PlayState.STOP;
	}

	@Override
	public void registerControllers(AnimationData data) {
		data.addAnimationController(new AnimationController(this, "controller", 20, this::predicate));
	}

	@Override
	public AnimationFactory getFactory() {
		return factory;
	}
}
