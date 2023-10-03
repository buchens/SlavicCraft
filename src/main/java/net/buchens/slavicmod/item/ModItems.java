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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);



    }
}
