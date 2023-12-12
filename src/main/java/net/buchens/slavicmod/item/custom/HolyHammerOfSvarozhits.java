package net.buchens.slavicmod.item.custom;

import net.buchens.slavicmod.item.ModItems;
import net.minecraft.core.BlockPos;
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
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Fireball;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.core.particles.ParticleTypes;

import java.util.List;

public class HolyHammerOfSvarozhits extends SwordItem {

    public static final int MAX_DISTANCE = 10;

    public HolyHammerOfSvarozhits(Tier tier, int i, float v, Properties properties) {
        super(tier, i, v, properties);

    }


    @Override
    public int getUseDuration(ItemStack stack) {
        return USE_DURATION;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.BOW;
    }
    private static final int USE_DURATION = 1;
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        player.level.playSound(null, player, SoundEvents.FIRECHARGE_USE, SoundSource.PLAYERS, 1f, 1f);


        if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            Vec3 start = player.getEyePosition(1.0F);
            Vec3 end = start.add(player.getLookAngle().scale(MAX_DISTANCE));

            for (Entity entity : level.getEntities(player, player.getBoundingBox().expandTowards(player.getLookAngle().scale(MAX_DISTANCE)).inflate(1.0D, 1.0D, 1.0D))) {
                if (entity instanceof LivingEntity) {
                    // Apply damage to the entity
                    LivingEntity livingEntity = (LivingEntity) entity;
                    livingEntity.hurt(DamageSource.playerAttack(player), 10.0F);
                    MobEffectInstance fireEffect = new MobEffectInstance(MobEffects.CONFUSION, 10 * 20);  // 10 sekund * 20 ticków na sekundę
                    livingEntity.addEffect(fireEffect);



                }
            }

        }


        return ItemUtils.startUsingInstantly(level, player, hand);
    }

    @Override
    public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {
        if (entity.level.isClientSide) {
            return false;
        }

        double radius = 2;
        int lightDuration = 20 * 30; // 30 seconds
        int damageDuration = 20 * 10; // 10 seconds

        List<Entity> nearbyEntities = entity.level.getEntities(entity, new AABB(entity.blockPosition()).inflate(radius));
        nearbyEntities.forEach(e -> {
            if (e instanceof LivingEntity) {
                // Spawn lightning with a 20% chance
                if (entity.level.random.nextInt(5) == 0) {
                    Fireball largeFireball = EntityType.FIREBALL.create(entity.level);
                    largeFireball.setPos(e.getX(), e.getY(), e.getZ());
                    entity.level.addFreshEntity(largeFireball);
                }

                // Apply light and damage effects
                Vec3 vectorToCenter = e.getPosition(1).subtract(entity.getPosition(1)).normalize();
                e.setDeltaMovement(e.getDeltaMovement().add(vectorToCenter.scale(0.5)));

                for (int i = 0; i < 20 * 15; i++) {
                    BlockPos randomPos = e.blockPosition().offset(entity.level.random.nextInt(3) - 1, entity.level.random.nextInt(3) - 1, entity.level.random.nextInt(3) - 1);
                    if (entity.level.getBlockState(randomPos).getBlock() == Blocks.AIR) {
                        entity.level.setBlockAndUpdate(randomPos, Blocks.LIGHT.defaultBlockState());
                        entity.level.scheduleTick(randomPos, Blocks.LIGHT, lightDuration);
                        entity.level.scheduleTick(randomPos, Blocks.LIGHT, damageDuration);
                    }
                }

            }
        });

        return false;
    }}

