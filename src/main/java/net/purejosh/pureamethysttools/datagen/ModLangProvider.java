package net.purejosh.pureamethysttools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.purejosh.pureamethysttools.block.ModBlocks;
import net.purejosh.pureamethysttools.item.ModItems;
import net.purejosh.pureamethysttools.world.ModGameRules;

import java.util.concurrent.CompletableFuture;

public class ModLangProvider extends FabricLanguageProvider {
    public ModLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    // It might be unusual, but I'm going to add these in the same order as ModBlocks
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        // Blocks
        // Building Blocks
        translationBuilder.add(ModBlocks.PURE_AMETHYST_BLOCK, "Block of Pure Amethyst");

        // Items
        // Tools & Utilities
        translationBuilder.add(ModItems.AMETHYST_SHOVEL, "Amethyst Shovel");
        translationBuilder.add(ModItems.AMETHYST_PICKAXE, "Amethyst Pickaxe");
        translationBuilder.add(ModItems.AMETHYST_AXE, "Amethyst Axe");
        translationBuilder.add(ModItems.AMETHYST_HOE, "Amethyst Hoe");
        translationBuilder.add(ModItems.PURE_AMETHYST_SHOVEL, "Pure Amethyst Shovel");
        translationBuilder.add(ModItems.PURE_AMETHYST_PICKAXE, "Pure Amethyst Pickaxe");
        translationBuilder.add(ModItems.PURE_AMETHYST_AXE, "Pure Amethyst Axe");
        translationBuilder.add(ModItems.PURE_AMETHYST_HOE, "Pure Amethyst Hoe");

        // Combat
        translationBuilder.add(ModItems.AMETHYST_SWORD, "Amethyst Sword");
        translationBuilder.add(ModItems.PURE_AMETHYST_SWORD, "Pure Amethyst Sword");
        translationBuilder.add(ModItems.AMETHYST_HELMET, "Amethyst Helmet");
        translationBuilder.add(ModItems.AMETHYST_CHESTPLATE, "Amethyst Chestplate");
        translationBuilder.add(ModItems.AMETHYST_LEGGINGS, "Amethyst Leggings");
        translationBuilder.add(ModItems.AMETHYST_BOOTS, "Amethyst Boots");
        translationBuilder.add(ModItems.PURE_AMETHYST_HELMET, "Pure Amethyst Helmet");
        translationBuilder.add(ModItems.PURE_AMETHYST_CHESTPLATE, "Pure Amethyst Chestplate");
        translationBuilder.add(ModItems.PURE_AMETHYST_LEGGINGS, "Pure Amethyst Leggings");
        translationBuilder.add(ModItems.PURE_AMETHYST_BOOTS, "Pure Amethyst Boots");

        // Food & Drinks
        translationBuilder.add(ModItems.AMETHYST_APPLE, "Amethyst Apple");
        translationBuilder.add(ModItems.PURE_AMETHYST_APPLE, "Pure Amethyst Apple");
        translationBuilder.add(ModItems.AMETHYST_CARROT, "Amethyst Carrot");
        translationBuilder.add(ModItems.PURE_AMETHYST_CARROT, "Pure Amethyst Carrot");

        // Ingredients
        translationBuilder.add(ModItems.PURE_AMETHYST, "Pure Amethyst");
        translationBuilder.add(ModItems.AMETHYST_DUST, "Amethyst Dust");
        translationBuilder.add(ModItems.PURE_AMETHYST_DUST, "Pure Amethyst Dust");

        // Gamerules
        translationBuilder.add("gamerule." + ModGameRules.HEALING_AURA_INTERVAL.getName(), "Pure Amethyst Tools: Healing Aura Interval");
        translationBuilder.add("gamerule." + ModGameRules.HEALING_AURA_INTERVAL.getName() + ".description", "Controls how often (average time in seconds) Healing Aura will trigger.");

        // Tooltips
        translationBuilder.add("item.pureamethysttools.pure_amethyst_set_bonus", "§d◆ Healing Aura §8Set Bonus");
        translationBuilder.add("item.pureamethysttools.pure_amethyst_set_bonus_2", "§7Slow regen at random");

        // Effects
        translationBuilder.add("effect.pureamethysttools.healing_aura", "Healing Aura");

        // Subtitles
        translationBuilder.add("subtitles.pureamethysttools.armor.equip_amethyst", "Equip Amethyst Armor");
    }
}

