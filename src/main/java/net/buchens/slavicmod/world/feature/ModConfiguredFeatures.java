package net.buchens.slavicmod.world.feature;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraftforge.registries.RegistryObject;
import com.google.common.base.Suppliers;
import net.buchens.slavicmod.SlavicMod;
import net.buchens.slavicmod.block.ModBlocks;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.core.Registry;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


import java.util.function.Supplier;
import java.util.List;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, SlavicMod.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_NICKEL_ORE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.NICKEL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_NICKEL_ORE.get().defaultBlockState())));


    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_Vanadium_Ore = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.VANADIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_VANADIUM_ORE.get().defaultBlockState())));



public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_Chrome_Ore = Suppliers.memoize(() -> List.of(
        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CHROME_ORE.get().defaultBlockState()),
        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CHROME_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_Manganese_Ore = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MANGANESE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MANGANESE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_Silver_Ore = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())));



    public static final RegistryObject<ConfiguredFeature<?,?>> NICKEL_ORE = CONFIGURED_FEATURES.register("nickel_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_NICKEL_ORE.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?,?>> Vanadium_Ore = CONFIGURED_FEATURES.register("vanadium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_Vanadium_Ore.get(), 10)));
    public static final RegistryObject<ConfiguredFeature<?,?>> Chorme_Ore = CONFIGURED_FEATURES.register("chrome_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_Chrome_Ore.get(), 10)));

    public static final RegistryObject<ConfiguredFeature<?,?>> Manganese_Ore = CONFIGURED_FEATURES.register("manganese_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_Manganese_Ore.get(), 8)));

    public static final RegistryObject<ConfiguredFeature<?,?>> Silver_Ore = CONFIGURED_FEATURES.register("silver_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_Silver_Ore.get(), 5)));

    public static final RegistryObject<ConfiguredFeature<?,?>> Celandine = CONFIGURED_FEATURES.register("celandine",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CELANDINE.get())) ))));


    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }
}
