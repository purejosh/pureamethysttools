package net.purejosh.pureamethysttools.entity.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.purejosh.pureamethysttools.world.ModGameRules;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HealingAuraStatusEffect extends StatusEffect {

    private static final Random random = new Random(); // Random instance for chance calculations
    private final Map<PlayerEntity, Integer> tickCounters = new HashMap<>(); // Maps players to their tick counters

    public HealingAuraStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        // Check if the player's health is less than their maximum health
        if (entity instanceof PlayerEntity player && player.getHealth() < player.getMaxHealth()) {
            // Ensure this logic runs on the server side only
            if (!player.getWorld().isClient()) {
                // Retrieve or initialize tick counter for this player
                tickCounters.putIfAbsent(player, 0);
                int tickCounter = tickCounters.get(player);

                tickCounter++; // Increment tick counter

                // Compute healing interval
                int healingIntervalTicks = player.getWorld().getGameRules().getInt(ModGameRules.HEALING_AURA_INTERVAL) * 20;

                // Proceed only if at least half the interval has passed
                if (tickCounter >= healingIntervalTicks / 2 && random.nextInt(healingIntervalTicks) == 0) {
                    ServerWorld serverWorld = (ServerWorld) player.getWorld(); // Safely cast to ServerWorld
                    tickCounters.put(player, 0); // Reset tick counter for this player
                    player.heal(1.0F); // Apply healing effect

                    // Play sound effect
                    player.playSoundToPlayer(SoundEvents.BLOCK_TRIAL_SPAWNER_EJECT_ITEM, SoundCategory.PLAYERS, 0.4F, 1.2F);

                    // Spawn particles around the player
                    final double offsetRange = 1.5;
                    for (int i = 0; i < 3; i++) {
                        double offsetX = (Math.random() - 0.5) * offsetRange;
                        double offsetY = Math.random();
                        double offsetZ = (Math.random() - 0.5) * offsetRange;

                        serverWorld.spawnParticles(
                                ParticleTypes.HEART,
                                player.getX() + offsetX,
                                player.getY() + 0.2 + offsetY,
                                player.getZ() + offsetZ,
                                1, // Spawn one particle per iteration
                                0.0, 0.0, 0.0, 0.0
                        );
                    }
                } else {
                    tickCounters.put(player, tickCounter); // Update tick counter in the map
                }
            }
        }
        return true; // Ensure the effect continues applying on subsequent ticks
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
