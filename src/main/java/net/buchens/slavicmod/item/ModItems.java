package net.buchens.slavicmod.item;

import net.buchens.slavicmod.SlavicMod;
import net.buchens.slavicmod.block.ModBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SlavicMod.MOD_ID);

    public static final RegistryObject<Item> CHAINMAILBRAID = ITEMS.register("chainmailbraid",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> WOLF_FUR = ITEMS.register("wolf_fur",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> WOLF_HELMET_COMPONENT = ITEMS.register("wolf_helmet_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> WOLF_CHESTPLATE_COMPONENT = ITEMS.register("wolf_chestplate_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> WOLF_LEGGINS_COMPONENT = ITEMS.register("wolf_leggins_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> WOLF_BOOTS_COMPONENT = ITEMS.register("wolf_boots_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BEAR_FUR = ITEMS.register("bear_fur",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BEAR_BOOTS_COMPONENT = ITEMS.register("bear_boots_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BEAR_LEGGINS_COMPONENT = ITEMS.register("bear_leggins_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BEAR_CHESTPLATE_COMPONENT = ITEMS.register("bear_chestplate_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BEAR_HELMET_COMPONENT = ITEMS.register("bear_helmet_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BOAR_FUR = ITEMS.register("boar_fur",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BOAR_HELMET_COMPONENT = ITEMS.register("boar_helmet_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BOAR_CHESTPLATE_COMPONENT = ITEMS.register("boar_chestplate_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BOAR_LEGGINS_COMPONENT = ITEMS.register("boar_leggins_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BOAR_BOOTS_COMPONENT = ITEMS.register("boar_boots_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> STEEL_WIRE = ITEMS.register("steel_wire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> CHROME_INGOT = ITEMS.register("chrome_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> RAW_CHROME = ITEMS.register("raw_chrome",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> MANGANESE_INGOT = ITEMS.register("manganese_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> RAW_MANGANESE = ITEMS.register("raw_manganese",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> RAW_STEEL = ITEMS.register("raw_steel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> RAW_VANADIUM = ITEMS.register("raw_vanadium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> VANADIUM_INGOT = ITEMS.register("vanadium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );

    public static final RegistryObject<Item> BERBERCANEFRUIT_SEED = ITEMS.register("berbercanefruit_seed",
            () -> new ItemNameBlockItem(ModBlocks.BERBERCANEFRUIT_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );

    public static final RegistryObject<Item> BERBERCANEFRUIT = ITEMS.register("berbercanefruit",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build() )) );



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);



    }
}
