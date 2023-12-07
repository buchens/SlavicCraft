/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package net.buchens.slavicmod;

import net.buchens.slavicmod.item.client.ReinforcedBoarArmorRenderer;
import net.buchens.slavicmod.item.custom.ReinforcedBoarArmorItem;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.example.GeckoLibMod;
import software.bernie.example.client.renderer.armor.GeckoArmorRenderer;
import software.bernie.example.client.renderer.entity.*;
import software.bernie.example.client.renderer.tile.FertilizerTileRenderer;
import software.bernie.example.client.renderer.tile.HabitatTileRenderer;
import software.bernie.example.item.GeckoArmorItem;
import software.bernie.example.registry.BlockRegistry;
import software.bernie.example.registry.EntityRegistry;
import software.bernie.example.registry.TileRegistry;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = SlavicMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientListener {

	@SubscribeEvent
	public static void registerRenderers(final EntityRenderersEvent.AddLayers event) {
		ReinforcedBoarArmorRenderer.registerArmorRenderer(ReinforcedBoarArmorItem.class, ReinforcedBoarArmorRenderer::new);
	}

}
