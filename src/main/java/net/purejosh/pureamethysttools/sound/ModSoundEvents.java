package net.purejosh.pureamethysttools.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.purejosh.pureamethysttools.PureAmethystTools;

public class ModSoundEvents {

    public static final RegistryEntry<SoundEvent> ITEM_ARMOR_EQUIP_AMETHYST = register("item.armor.equip_amethyst");

    private static RegistryEntry<SoundEvent> register(String id) {
        Identifier identifier = Identifier.of(PureAmethystTools.MOD_ID, id);
        return Registry.registerReference(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }
}
