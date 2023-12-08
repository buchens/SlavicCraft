package net.buchens.slavicmod;

import com.mojang.logging.LogUtils;
import net.buchens.slavicmod.block.ModBlocks;
import net.buchens.slavicmod.effect.ModEffects;
import net.buchens.slavicmod.entity.ModEntityTypes;
import net.buchens.slavicmod.entity.client.DrownerRenderer;
import net.buchens.slavicmod.item.ModItems;
import net.buchens.slavicmod.loot.ModLootModifiers;
import net.buchens.slavicmod.potion.ModPotions;
import net.buchens.slavicmod.util.BetterBrewingRecipe;
import net.buchens.slavicmod.world.feature.ModConfiguredFeatures;
import net.buchens.slavicmod.world.feature.ModPlacedFeatures;


import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(SlavicMod.MOD_ID)
public class SlavicMod {

    public static final String MOD_ID = "slavicmod";
    private static final Logger LOGGER = LogUtils.getLogger();
//comment
    public SlavicMod(){

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        GeckoLib.initialize();
        MinecraftForge.EVENT_BUS.register(this);
        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);
        ModEffects.register(modEventBus);
        ModPotions.register(modEventBus);
        ModEntityTypes.register(modEventBus);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SpawnPlacements.register(ModEntityTypes.DROWNER.get(),
                    SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkAnyLightMonsterSpawnRules);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CELANDINE.getId(), ModBlocks.POTTED_CELANDINE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_MYRTLE.getId(), ModBlocks.POTTED_WHITE_MYRTLE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CORTINARIUS.getId(), ModBlocks.POTTED_CORTINARIUS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MOLEYARROW.getId(), ModBlocks.POTTED_MOLEYARROW);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ALLSPICE.getId(), ModBlocks.POTTED_ALLSPICE);


            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    ModItems.SWALLOW_BASE.get(),  ModPotions.SWALLOW_POTION.get()));
        });
    }



    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntityTypes.DROWNER.get(), DrownerRenderer::new);

        }
    }
}
