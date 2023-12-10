package net.buchens.slavicmod.item.custom;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;
import net.minecraft.core.particles.ParticleTypes;

public class MightyHammerOfVeles extends SwordItem {

    public static final int MAX_DISTANCE = 10;

    public MightyHammerOfVeles(Tier tier, int i, float v, Properties properties) {
        super(tier, i, v, properties);
    }



        private static final int USE_DURATION = 1;



        @Override
        public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
            super.finishUsingItem(stack, level, entity);

            Player player = entity instanceof Player ? (Player) entity : null;

            if (entity instanceof ServerPlayer serverplayer && !level.isClientSide()) {






            }

            if (player != null) {
                player.awardStat(Stats.ITEM_USED.get(this));
                if (!player.getAbilities().instabuild) {
                    stack.shrink(1);
                }
            }

            entity.gameEvent(GameEvent.EAT);
            return stack;
        }

        @Override
        public int getUseDuration(ItemStack stack) {
            return USE_DURATION;
        }

        @Override
        public UseAnim getUseAnimation(ItemStack stack) {
            return UseAnim.BOW;
        }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        player.level.playSound(null, player, SoundEvents.DRAGON_FIREBALL_EXPLODE, SoundSource.PLAYERS, 1f, 1.7f);
        player.level.playSound(null, player, SoundEvents.FIREWORK_ROCKET_TWINKLE, SoundSource.PLAYERS, 1f, 1f);
        player.level.playSound(null, player, SoundEvents.BELL_RESONATE, SoundSource.PLAYERS, 1f, 2f);

        if (!level.isClientSide()) {
            Vec3 start = player.getEyePosition(1.0F);
            Vec3 end = start.add(player.getLookAngle().scale(MAX_DISTANCE));

            for (Entity entity : level.getEntities(player, player.getBoundingBox().expandTowards(player.getLookAngle().scale(MAX_DISTANCE)).inflate(1.0D, 1.0D, 1.0D))) {
                if (entity instanceof LivingEntity) {
                    // Apply damage to the entity
                    LivingEntity livingEntity = (LivingEntity) entity;
                    livingEntity.hurt(DamageSource.playerAttack(player), 10.0F);

                    // Apply negative effects
                    livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 200));
                    livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON, 200));
                    livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 200));
                }
            }

            // Spawn particles
            for (int i = 0; i < 10; i++) {
                double t = i / 9.0; // Calculate a value between 0 and 1 to represent the progress along the line
                double x = start.x + (end.x - start.x) * t;
                double y = start.y + (end.y - start.y) * t;
                double z = start.z + (end.z - start.z) * t;

                level.addParticle(ParticleTypes.BUBBLE, x, y, z, 0, 0, 0);
            }


            }


        return ItemUtils.startUsingInstantly(level, player, hand);
    }}