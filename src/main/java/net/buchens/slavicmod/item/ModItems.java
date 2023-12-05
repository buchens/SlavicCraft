package net.buchens.slavicmod.item;

import net.buchens.slavicmod.SlavicMod;
import net.buchens.slavicmod.base.ModArmorMaterial;
import net.buchens.slavicmod.block.ModBlocks;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;





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

    public static final RegistryObject<Item> ALCOHOL = ITEMS.register("alcohol",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB))) ;
    public static final RegistryObject<Item> DROWNER_BRAIN = ITEMS.register("drowner_brain",
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
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(2f).build() )) );
    public static final RegistryObject<SwordItem> BOAR_SWORD = ITEMS.register("boar_sword",
            () -> new SwordItem(Tiers.BOAR, 5, 3.5f, props() ) );
    public static final RegistryObject<PickaxeItem> BOAR_PICKAXE = ITEMS.register("boar_pickaxe",
            () -> new PickaxeItem(Tiers.BOAR, 4, 3.5f, props() ) );
    public static final RegistryObject<ShovelItem> BOAR_SHOVEL = ITEMS.register("boar_shovel",
            () -> new ShovelItem(Tiers.BOAR, 3, 3.5f, props() ) );
    public static final RegistryObject<AxeItem> BOAR_AXE = ITEMS.register("boar_axe",
            () -> new AxeItem(Tiers.BOAR, 7, 3.5f, props() ) );
    public static final RegistryObject<HoeItem> BOAR_HOE = ITEMS.register("boar_hoe",
            () -> new HoeItem(Tiers.BOAR, 1, 3.5f, props() ) );
    public static final RegistryObject<ArmorItem> REINFORCED_BOAR_HELMET = ITEMS.register("reinforced_boar_helmet",
            () -> new ArmorItem(ArmorTiers.REINFORCED_BOAR, EquipmentSlot.HEAD, props() ) );
    public static final RegistryObject<ArmorItem> REINFORCED_BOAR_CHESTPLATE = ITEMS.register("reinforced_boar_chestplate",
            () -> new ArmorItem(ArmorTiers.REINFORCED_BOAR, EquipmentSlot.CHEST, props() ) );
    public static final RegistryObject<ArmorItem> REINFORCED_BOAR_LEGGINGS = ITEMS.register("reinforced_boar_leggings",
            () -> new ArmorItem(ArmorTiers.REINFORCED_BOAR, EquipmentSlot.LEGS, props() ) );
    public static final RegistryObject<ArmorItem> REINFORCED_BOAR_BOOTS = ITEMS.register("reinforced_boar_boots",
            () -> new ArmorItem(ArmorTiers.REINFORCED_BOAR, EquipmentSlot.FEET, props() ) );

    private static Item.Properties props() {
        return new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);



    }
    public static class Tiers {
        public static final Tier BOAR = new ForgeTier(
                4,
                2000,
                8f,
                1f,
                0,
                null,
                () -> Ingredient.of(ModItems.BOAR_FUR.get()));
    }
    public static class ArmorTiers {
        public static final ArmorMaterial REINFORCED_BOAR = new ModArmorMaterial(
                "reinforced_boar",
                500,
                new int[]{3, 6, 8, 3},
                10,
                SoundEvents.ARMOR_EQUIP_CHAIN,
                0.0F,
                0.0F,
                () -> Ingredient.of(ModItems.BOAR_FUR.get())
        );


    }
}
