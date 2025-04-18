package net.purejosh.pureamethysttools.entity.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.purejosh.pureamethysttools.PureAmethystTools;

public class ModStatusEffects {

    public static final RegistryEntry<StatusEffect> HEALING_AURA = register("healing_aura", new HealingAuraStatusEffect(StatusEffectCategory.BENEFICIAL, 0x9966CC));

    public ModStatusEffects() {
    }

    private static RegistryEntry<StatusEffect> register(String id, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(PureAmethystTools.MOD_ID, id), statusEffect);
    }
}
