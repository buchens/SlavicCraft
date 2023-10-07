package net.buchens.slavicmod.item;

import net.buchens.slavicmod.SlavicMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SlavicMod.MOD_ID);

    public static final RegistryObject<Item> CHAINMAILBRAID = ITEMS.register("chainmailbraid",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> CHROME_INGOT = ITEMS.register("chrome_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> MANGANESE_INGOT = ITEMS.register("manganese_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> VANADIUM_INGOT = ITEMS.register("vanadium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);



    }
}
