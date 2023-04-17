
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureamethysttools.init;

import net.purejosh.pureamethysttools.item.FragileAmethystSwordItem;
import net.purejosh.pureamethysttools.item.FragileAmethystShovelItem;
import net.purejosh.pureamethysttools.item.FragileAmethystPickaxeItem;
import net.purejosh.pureamethysttools.item.FragileAmethystHoeItem;
import net.purejosh.pureamethysttools.item.FragileAmethystAxeItem;
import net.purejosh.pureamethysttools.item.FragileAmethystArmorItem;
import net.purejosh.pureamethysttools.item.AmethystSwordItem;
import net.purejosh.pureamethysttools.item.AmethystShovelItem;
import net.purejosh.pureamethysttools.item.AmethystPickaxeItem;
import net.purejosh.pureamethysttools.item.AmethystHoeItem;
import net.purejosh.pureamethysttools.item.AmethystAxeItem;
import net.purejosh.pureamethysttools.item.AmethystArmorItem;
import net.purejosh.pureamethysttools.PureamethysttoolsMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class PureamethysttoolsModItems {
	public static Item FRAGILE_AMETHYST_SWORD;
	public static Item FRAGILE_AMETHYST_ARMOR_HELMET;
	public static Item FRAGILE_AMETHYST_ARMOR_CHESTPLATE;
	public static Item FRAGILE_AMETHYST_ARMOR_LEGGINGS;
	public static Item FRAGILE_AMETHYST_ARMOR_BOOTS;
	public static Item AMETHYST_SWORD;
	public static Item AMETHYST_ARMOR_HELMET;
	public static Item AMETHYST_ARMOR_CHESTPLATE;
	public static Item AMETHYST_ARMOR_LEGGINGS;
	public static Item AMETHYST_ARMOR_BOOTS;
	public static Item FRAGILE_AMETHYST_SHOVEL;
	public static Item FRAGILE_AMETHYST_PICKAXE;
	public static Item FRAGILE_AMETHYST_AXE;
	public static Item FRAGILE_AMETHYST_HOE;
	public static Item AMETHYST_SHOVEL;
	public static Item AMETHYST_PICKAXE;
	public static Item AMETHYST_AXE;
	public static Item AMETHYST_HOE;
	public static Item AMETHYST_CLUSTER_BLOCK;

	public static void load() {
		FRAGILE_AMETHYST_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "fragile_amethyst_sword"), new FragileAmethystSwordItem());
		FRAGILE_AMETHYST_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "fragile_amethyst_armor_helmet"), new FragileAmethystArmorItem.Helmet());
		FRAGILE_AMETHYST_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "fragile_amethyst_armor_chestplate"), new FragileAmethystArmorItem.Chestplate());
		FRAGILE_AMETHYST_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "fragile_amethyst_armor_leggings"), new FragileAmethystArmorItem.Leggings());
		FRAGILE_AMETHYST_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "fragile_amethyst_armor_boots"), new FragileAmethystArmorItem.Boots());
		AMETHYST_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_sword"), new AmethystSwordItem());
		AMETHYST_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_armor_helmet"), new AmethystArmorItem.Helmet());
		AMETHYST_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_armor_chestplate"), new AmethystArmorItem.Chestplate());
		AMETHYST_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_armor_leggings"), new AmethystArmorItem.Leggings());
		AMETHYST_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_armor_boots"), new AmethystArmorItem.Boots());
		FRAGILE_AMETHYST_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "fragile_amethyst_shovel"), new FragileAmethystShovelItem());
		FRAGILE_AMETHYST_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "fragile_amethyst_pickaxe"), new FragileAmethystPickaxeItem());
		FRAGILE_AMETHYST_AXE = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "fragile_amethyst_axe"), new FragileAmethystAxeItem());
		FRAGILE_AMETHYST_HOE = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "fragile_amethyst_hoe"), new FragileAmethystHoeItem());
		AMETHYST_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_shovel"), new AmethystShovelItem());
		AMETHYST_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_pickaxe"), new AmethystPickaxeItem());
		AMETHYST_AXE = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_axe"), new AmethystAxeItem());
		AMETHYST_HOE = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_hoe"), new AmethystHoeItem());
		AMETHYST_CLUSTER_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_cluster_block"),
				new BlockItem(PureamethysttoolsModBlocks.AMETHYST_CLUSTER_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	}
}
