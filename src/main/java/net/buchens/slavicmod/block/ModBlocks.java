package net.buchens.slavicmod.block;

import net.buchens.slavicmod.block.custom.BerbercanefruitCropBlock;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.buchens.slavicmod.SlavicMod;
import net.buchens.slavicmod.item.ModCreativeModeTab;
import net.buchens.slavicmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.function.Supplier;

public class ModBlocks {
    //MINERALY
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SlavicMod.MOD_ID);

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("nickel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SLAVICCRAFT_TAB);

    public static final RegistryObject<Block> NICKEL_ORE = registerBlock("nickel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> VANADIUM_BLOCK = registerBlock("vanadium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> VANADIUM_ORE = registerBlock("vanadium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> DEEPSLATE_VANADIUM_ORE = registerBlock("deepslate_vanadium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> CHROME_BLOCK = registerBlock("chrome_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> CHROME_ORE = registerBlock("chrome_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> DEEPSLATE_CHROME_ORE = registerBlock("deepslate_chrome_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> MANGANESE_BLOCK = registerBlock("manganese_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> MANGANESE_ORE = registerBlock("manganese_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> DEEPSLATE_MANGANESE_ORE = registerBlock("deepslate_manganese_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SLAVICCRAFT_TAB);

//KWIATY
    public static final RegistryObject<Block> CELANDINE = registerBlock("celandine",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.SLAVICCRAFT_TAB);

    public static final RegistryObject<Block> WHITE_MYRTLE  = registerBlock("white_myrtle",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.SLAVICCRAFT_TAB);
    public static final RegistryObject<Block> CORTINARIUS  = registerBlock("cortinarius",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.SLAVICCRAFT_TAB);

    public static final RegistryObject<Block> MOLEYARROW  = registerBlock("moleyarrow",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.SLAVICCRAFT_TAB);

    public static final RegistryObject<Block> ALLSPICE  = registerBlock("allspice",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.SLAVICCRAFT_TAB);

    public static final RegistryObject<Block> VERBENA  = registerBlock("verbena",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.SLAVICCRAFT_TAB);
//KWIATY DONICZKOWANE
    public static final RegistryObject<Block> POTTED_CELANDINE = BLOCKS.register("potted_celandine",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CELANDINE,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> POTTED_WHITE_MYRTLE = BLOCKS.register("potted_white_myrtle",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WHITE_MYRTLE,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> POTTED_CORTINARIUS = BLOCKS.register("potted_cortinarius",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CORTINARIUS,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_MOLEYARROW = BLOCKS.register("potted_moleyarrow",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.MOLEYARROW,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_ALLSPICE = BLOCKS.register("potted_allspice",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.ALLSPICE,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_VERBENA = BLOCKS.register("potted_verbena",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.VERBENA,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)));


    public static final RegistryObject<Block> BERBERCANEFRUIT_CROP = BLOCKS.register("berbercanefruit_crop",
            () -> new BerbercanefruitCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab).stacksTo(64)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}