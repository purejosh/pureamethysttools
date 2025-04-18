package net.purejosh.pureamethysttools.item;

import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.purejosh.pureamethysttools.PureAmethystTools;

import java.util.List;

public class ModItems {
    // Changed my code formatting a bit here, due to the sheer amount of items being registered. I didn't want to add too many helper methods, either, since that would make the code less readable.
    // Tools & Utilities
    public static final Item AMETHYST_SHOVEL = register("amethyst_shovel", new ShovelItem(ModToolMaterials.AMETHYST, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AMETHYST,1.5f, -3.0f))));
    public static final Item AMETHYST_PICKAXE = register("amethyst_pickaxe", new PickaxeItem(ModToolMaterials.AMETHYST, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AMETHYST,1.0f, -2.8f))));
    public static final Item AMETHYST_AXE = register("amethyst_axe", new AxeItem(ModToolMaterials.AMETHYST, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AMETHYST,6.0f, -3.1f))));
    public static final Item AMETHYST_HOE = register("amethyst_hoe", new HoeItem(ModToolMaterials.AMETHYST, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AMETHYST,-2.0f, -1.0f))));
    public static final Item PURE_AMETHYST_SHOVEL = register("pure_amethyst_shovel", new ShovelItem(ModToolMaterials.PURE_AMETHYST, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST,1.5f, -3.0f))));
    public static final Item PURE_AMETHYST_PICKAXE = register("pure_amethyst_pickaxe", new PickaxeItem(ModToolMaterials.PURE_AMETHYST, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST,1.0f, -2.8f))));
    public static final Item PURE_AMETHYST_AXE = register("pure_amethyst_axe", new AxeItem(ModToolMaterials.PURE_AMETHYST, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST,5.0f, -3.0f))));
    public static final Item PURE_AMETHYST_HOE = register("pure_amethyst_hoe", new HoeItem(ModToolMaterials.PURE_AMETHYST, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST,-3.0f, 0.0f))));
    
    // Combat
    public static final Item AMETHYST_SWORD = register("amethyst_sword", new SwordItem(ModToolMaterials.AMETHYST, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AMETHYST,3, -2.4f))));
    public static final Item PURE_AMETHYST_SWORD = register("pure_amethyst_sword", new SwordItem(ModToolMaterials.PURE_AMETHYST, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST,3, -2.4f))));
    public static final Item AMETHYST_HELMET = register("amethyst_helmet", new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.AMETHYST_DURABILITY))));
    public static final Item AMETHYST_CHESTPLATE = register("amethyst_chestplate", new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.AMETHYST_DURABILITY))));
    public static final Item AMETHYST_LEGGINGS = register("amethyst_leggings", new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.AMETHYST_DURABILITY))));
    public static final Item AMETHYST_BOOTS = register("amethyst_boots", new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.AMETHYST_DURABILITY))));

    public static final Item PURE_AMETHYST_HELMET = register("pure_amethyst_helmet", new ArmorItem(ModArmorMaterials.PURE_AMETHYST, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.PURE_AMETHYST_DURABILITY))){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.pureamethysttools.pure_amethyst_set_bonus"));
            tooltip.add(Text.translatable("item.pureamethysttools.pure_amethyst_set_bonus_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item PURE_AMETHYST_CHESTPLATE = register("pure_amethyst_chestplate", new ModArmorSetBonus(ModArmorMaterials.PURE_AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.PURE_AMETHYST_DURABILITY))){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.pureamethysttools.pure_amethyst_set_bonus"));
            tooltip.add(Text.translatable("item.pureamethysttools.pure_amethyst_set_bonus_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item PURE_AMETHYST_LEGGINGS = register("pure_amethyst_leggings", new ArmorItem(ModArmorMaterials.PURE_AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.PURE_AMETHYST_DURABILITY))){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.pureamethysttools.pure_amethyst_set_bonus"));
            tooltip.add(Text.translatable("item.pureamethysttools.pure_amethyst_set_bonus_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item PURE_AMETHYST_BOOTS = register("pure_amethyst_boots", new ArmorItem(ModArmorMaterials.PURE_AMETHYST, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.PURE_AMETHYST_DURABILITY))){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.pureamethysttools.pure_amethyst_set_bonus"));
            tooltip.add(Text.translatable("item.pureamethysttools.pure_amethyst_set_bonus_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    // Food & Drinks
    public static final Item AMETHYST_APPLE = register("amethyst_apple", new Item(new Item.Settings().food(FoodComponents.GOLDEN_APPLE)));
    public static final Item PURE_AMETHYST_APPLE = register("pure_amethyst_apple", new Item(new Item.Settings().food(FoodComponents.GOLDEN_APPLE)));
    public static final Item AMETHYST_CARROT = register("amethyst_carrot", new Item(new Item.Settings().food(FoodComponents.GOLDEN_CARROT)));
    public static final Item PURE_AMETHYST_CARROT = register("pure_amethyst_carrot", new Item(new Item.Settings().food(FoodComponents.GOLDEN_CARROT)));

    // Ingredients
    public static final Item PURE_AMETHYST = register("pure_amethyst", new Item(new Item.Settings()));
    public static final Item AMETHYST_DUST = register("amethyst_dust", new Item(new Item.Settings()));
    public static final Item PURE_AMETHYST_DUST = register("pure_amethyst_dust", new Item(new Item.Settings()));

    // Helper method for registering an item.
    public static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PureAmethystTools.MOD_ID, id), item);
    }

    // Class initializer called from the entrypoint.
    public static void init() {
    }
}
