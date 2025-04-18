package net.purejosh.pureamethysttools.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.purejosh.pureamethysttools.block.ModBlocks;

// This is used to arrange items in creative tabs. These are in order of tabs and sort order in the tab.
public class ModItemGroups {
    public static void init() {
        // Building Blocks
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, Blocks.AMETHYST_BLOCK, ModBlocks.PURE_AMETHYST_BLOCK);

        // Tools & Utilities
        registerItemOrder(ItemGroups.TOOLS, Items.GOLDEN_HOE, ModItems.AMETHYST_SHOVEL);
        registerItemOrder(ItemGroups.TOOLS, ModItems.AMETHYST_SHOVEL, ModItems.AMETHYST_PICKAXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.AMETHYST_PICKAXE, ModItems.AMETHYST_AXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.AMETHYST_AXE, ModItems.AMETHYST_HOE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.AMETHYST_HOE, ModItems.PURE_AMETHYST_SHOVEL);
        registerItemOrder(ItemGroups.TOOLS, ModItems.PURE_AMETHYST_SHOVEL, ModItems.PURE_AMETHYST_PICKAXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.PURE_AMETHYST_PICKAXE, ModItems.PURE_AMETHYST_AXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.PURE_AMETHYST_AXE, ModItems.PURE_AMETHYST_HOE);

        // Combat
        registerItemOrder(ItemGroups.COMBAT, Items.GOLDEN_SWORD, ModItems.AMETHYST_SWORD);
        registerItemOrder(ItemGroups.COMBAT, ModItems.AMETHYST_SWORD, ModItems.PURE_AMETHYST_SWORD);
        registerItemOrder(ItemGroups.COMBAT, Items.GOLDEN_AXE, ModItems.AMETHYST_AXE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.AMETHYST_AXE, ModItems.PURE_AMETHYST_AXE);
        registerItemOrder(ItemGroups.COMBAT, Items.GOLDEN_BOOTS, ModItems.AMETHYST_HELMET);
        registerItemOrder(ItemGroups.COMBAT, ModItems.AMETHYST_HELMET, ModItems.AMETHYST_CHESTPLATE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.AMETHYST_CHESTPLATE, ModItems.AMETHYST_LEGGINGS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.AMETHYST_LEGGINGS, ModItems.AMETHYST_BOOTS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.AMETHYST_BOOTS, ModItems.PURE_AMETHYST_HELMET);
        registerItemOrder(ItemGroups.COMBAT, ModItems.PURE_AMETHYST_HELMET, ModItems.PURE_AMETHYST_CHESTPLATE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.PURE_AMETHYST_CHESTPLATE, ModItems.PURE_AMETHYST_LEGGINGS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.PURE_AMETHYST_LEGGINGS, ModItems.PURE_AMETHYST_BOOTS);

        // Food & Drinks
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, Items.GOLDEN_APPLE, ModItems.AMETHYST_APPLE);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.AMETHYST_APPLE, ModItems.PURE_AMETHYST_APPLE);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, Items.GOLDEN_CARROT, ModItems.AMETHYST_CARROT);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.AMETHYST_CARROT, ModItems.PURE_AMETHYST_CARROT);

        // Ingredients
        registerItemOrder(ItemGroups.INGREDIENTS, Items.AMETHYST_SHARD, ModItems.PURE_AMETHYST);
        registerItemOrder(ItemGroups.INGREDIENTS, Items.GLOWSTONE_DUST, ModItems.AMETHYST_DUST);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.AMETHYST_DUST, ModItems.PURE_AMETHYST_DUST);
    }

    // I wanted to optimize my code, so instead of using the full syntax that kaupenjoe uses, I created this "wrapper method"
    // to handle the modifyEntriesEvent. This makes the above registration about 43% more efficient.
    private static void registerItemOrder(RegistryKey<ItemGroup> itemGroup, ItemConvertible before, ItemConvertible after) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register((entries) -> entries.addAfter(before, after));
    }
}