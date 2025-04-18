package net.purejosh.pureamethysttools.item;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;
import net.purejosh.pureamethysttools.entity.effect.ModStatusEffects;

import java.util.List;
import java.util.Map;

public class ModArmorSetBonus extends ArmorItem {

    // Maps specific armor materials to their associated status effects.
    private static final Map<RegistryEntry<ArmorMaterial>, List<StatusEffectInstance>> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<RegistryEntry<ArmorMaterial>, List<StatusEffectInstance>>())
                    .put(ModArmorMaterials.PURE_AMETHYST,
                            List.of(new StatusEffectInstance(ModStatusEffects.HEALING_AURA, 10, 0, false, false)))
                    .build();

    // Constructor initializes the armor item with its material, type, and settings.
    public ModArmorSetBonus(RegistryEntry<ArmorMaterial> material, Type type, Settings settings) {
        super(material, type, settings);
    }

    // Runs every tick while this item is in the player's inventory.
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient()) { // Ensures this code only runs on the server-side.
            if (entity instanceof PlayerEntity player) { // Checks if the entity is a player.
                if (hasFullSuitOfArmorOn(player)) { // Verifies the player is wearing a full armor set.
                    evaluateArmorEffects(player); // Applies the associated status effects.
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected); // Ensures standard tick behavior for the item.
    }

    // Evaluates and applies the correct status effects based on the player's armor material.
    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<RegistryEntry<ArmorMaterial>, List<StatusEffectInstance>> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            RegistryEntry<ArmorMaterial> mapArmorMaterial = entry.getKey(); // Gets the armor material.
            List<StatusEffectInstance> mapStatusEffects = entry.getValue(); // Gets the status effects for the material.

            if (hasCorrectArmorOn(mapArmorMaterial, player)) { // Checks if the player is wearing the specified armor material.
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffects); // Applies the associated status effects.
            }
        }
    }

    // Adds status effects to the player if they don't already have them.
    private void addStatusEffectForMaterial(PlayerEntity player, RegistryEntry<ArmorMaterial> mapArmorMaterial, List<StatusEffectInstance> mapStatusEffect) {
        boolean hasPlayerEffect = mapStatusEffect.stream()
                .allMatch(statusEffectInstance -> player.hasStatusEffect(statusEffectInstance.getEffectType()));

        if (!hasPlayerEffect) { // Ensures effects are not duplicated.
            for (StatusEffectInstance instance : mapStatusEffect) {
                player.addStatusEffect(new StatusEffectInstance(
                        instance.getEffectType(), // Effect type.
                        instance.getDuration(), // Duration of the effect.
                        instance.getAmplifier(), // Amplifier for the effect level.
                        instance.isAmbient(), // Whether the effect is ambient.
                        instance.shouldShowParticles() // Whether to display particles for the effect.
                ));
            }
        }
    }

    // Checks if the player is wearing all four armor pieces.
    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !helmet.isEmpty() && !chestplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    // Verifies that the player is wearing armor made of the specified material.
    private boolean hasCorrectArmorOn(RegistryEntry<ArmorMaterial> material, PlayerEntity player) {
        for (ItemStack armorStack : player.getInventory().armor) {
            if (!(armorStack.getItem() instanceof ArmorItem)) { // Ensures the stack is an armor item.
                return false;
            }
        }

        // Compares each armor piece's material with the specified material.
        ArmorItem boots = ((ArmorItem) player.getInventory().getArmorStack(0).getItem());
        ArmorItem leggings = ((ArmorItem) player.getInventory().getArmorStack(1).getItem());
        ArmorItem chestplate = ((ArmorItem) player.getInventory().getArmorStack(2).getItem());
        ArmorItem helmet = ((ArmorItem) player.getInventory().getArmorStack(3).getItem());

        return helmet.getMaterial() == material && chestplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}
