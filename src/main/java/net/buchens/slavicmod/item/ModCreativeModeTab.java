package net.buchens.slavicmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SLAVICCRAFT_TAB = new CreativeModeTab("slaviccrafttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DROWNER_BRAIN.get());
        }
    };
}
