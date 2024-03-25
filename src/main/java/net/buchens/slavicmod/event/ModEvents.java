package net.buchens.slavicmod.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.buchens.slavicmod.SlavicMod;
import net.buchens.slavicmod.block.ModBlocks;
import net.buchens.slavicmod.entity.ModEntityTypes;
import net.buchens.slavicmod.entity.custom.DrownerEntity;
import net.buchens.slavicmod.entity.custom.WildHuntWarriorEntity;
import net.buchens.slavicmod.item.ModItems;
import net.buchens.slavicmod.villager.ModVillagers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
@Mod.EventBusSubscriber(modid = SlavicMod.MOD_ID)
public class ModEvents { @SubscribeEvent
public static void addCustomTrades(VillagerTradesEvent event) {
    if (event.getType() == ModVillagers.HERBALIST.get()) {
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
        ItemStack stack = new ItemStack(ModItems.SILVER_COIN.get(), 1);
        int villagerLevel = 1;

        trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModBlocks.CELANDINE.get(), 15),
                stack, 10, 8, 0.02F));
    }
    if (event.getType() == ModVillagers.HERBALIST.get()) {
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
        ItemStack stack = new ItemStack(ModItems.SILVER_COIN.get(), 1);
        int villagerLevel = 1;

        trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModBlocks.WHITE_MYRTLE.get(), 15),
                stack, 10, 8, 0.02F));
    }
    if (event.getType() == ModVillagers.HERBALIST.get()) {
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
        ItemStack stack = new ItemStack(ModItems.SILVER_COIN.get(), 1);
        int villagerLevel = 1;

        trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModBlocks.CORTINARIUS.get(), 15),
                stack, 10, 8, 0.02F));
    }
    if (event.getType() == ModVillagers.HERBALIST.get()) {
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
        ItemStack stack = new ItemStack(ModItems.SILVER_COIN.get(), 1);
        int villagerLevel = 1;

        trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModBlocks.MOLEYARROW.get(), 15),
                stack, 10, 8, 0.02F));
    }
    if (event.getType() == ModVillagers.HERBALIST.get()) {
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
        ItemStack stack = new ItemStack(ModItems.SILVER_COIN.get(), 1);
        int villagerLevel = 1;

        trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModBlocks.ALLSPICE.get(), 15),
                stack, 10, 8, 0.02F));
    }
    if (event.getType() == ModVillagers.HERBALIST.get()) {
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
        ItemStack stack = new ItemStack(ModItems.SILVER_COIN.get(), 1);
        int villagerLevel = 1;

        trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModBlocks.VERBENA.get(), 15),
                stack, 10, 8, 0.02F));
    }
}


    @Mod.EventBusSubscriber(modid = SlavicMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.DROWNER.get(), DrownerEntity.setAttributes());
            event.put(ModEntityTypes.WILDHUNTWARRIOR.get(), WildHuntWarriorEntity.setAttributes());

        }
      }}