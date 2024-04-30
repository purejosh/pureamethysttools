/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureamethysttools.init;

import net.purejosh.pureamethysttools.item.PureAmethystSwordItem;
import net.purejosh.pureamethysttools.item.PureAmethystShovelItem;
import net.purejosh.pureamethysttools.item.PureAmethystPickaxeItem;
import net.purejosh.pureamethysttools.item.PureAmethystHoeItem;
import net.purejosh.pureamethysttools.item.PureAmethystGemItem;
import net.purejosh.pureamethysttools.item.PureAmethystAxeItem;
import net.purejosh.pureamethysttools.item.PureAmethystArmorItem;
import net.purejosh.pureamethysttools.item.AmethystSwordItem;
import net.purejosh.pureamethysttools.item.AmethystShovelItem;
import net.purejosh.pureamethysttools.item.AmethystPickaxeItem;
import net.purejosh.pureamethysttools.item.AmethystHoeItem;
import net.purejosh.pureamethysttools.item.AmethystAxeItem;
import net.purejosh.pureamethysttools.item.AmethystArmorItem;
import net.purejosh.pureamethysttools.PureamethysttoolsMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class PureamethysttoolsModItems {
	public static Item PURE_AMETHYST_ARMOR_HELMET;
	public static Item PURE_AMETHYST_ARMOR_CHESTPLATE;
	public static Item PURE_AMETHYST_ARMOR_LEGGINGS;
	public static Item PURE_AMETHYST_ARMOR_BOOTS;
	public static Item PURE_AMETHYST_AXE;
	public static Item PURE_AMETHYST_HOE;
	public static Item PURE_AMETHYST_PICKAXE;
	public static Item PURE_AMETHYST_SHOVEL;
	public static Item PURE_AMETHYST_SWORD;
	public static Item AMETHYST_ARMOR_HELMET;
	public static Item AMETHYST_ARMOR_CHESTPLATE;
	public static Item AMETHYST_ARMOR_LEGGINGS;
	public static Item AMETHYST_ARMOR_BOOTS;
	public static Item AMETHYST_AXE;
	public static Item AMETHYST_PICKAXE;
	public static Item AMETHYST_SWORD;
	public static Item AMETHYST_SHOVEL;
	public static Item AMETHYST_HOE;
	public static Item PURE_AMETHYST_GEM;
	public static Item PURE_AMETHYST_BLOCK;

	public static void load() {
		PURE_AMETHYST_ARMOR_HELMET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "pure_amethyst_armor_helmet"), new PureAmethystArmorItem.Helmet());
		PURE_AMETHYST_ARMOR_CHESTPLATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "pure_amethyst_armor_chestplate"), new PureAmethystArmorItem.Chestplate());
		PURE_AMETHYST_ARMOR_LEGGINGS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "pure_amethyst_armor_leggings"), new PureAmethystArmorItem.Leggings());
		PURE_AMETHYST_ARMOR_BOOTS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "pure_amethyst_armor_boots"), new PureAmethystArmorItem.Boots());
		PURE_AMETHYST_AXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "pure_amethyst_axe"), new PureAmethystAxeItem());
		PURE_AMETHYST_HOE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "pure_amethyst_hoe"), new PureAmethystHoeItem());
		PURE_AMETHYST_PICKAXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "pure_amethyst_pickaxe"), new PureAmethystPickaxeItem());
		PURE_AMETHYST_SHOVEL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "pure_amethyst_shovel"), new PureAmethystShovelItem());
		PURE_AMETHYST_SWORD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "pure_amethyst_sword"), new PureAmethystSwordItem());
		AMETHYST_ARMOR_HELMET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_armor_helmet"), new AmethystArmorItem.Helmet());
		AMETHYST_ARMOR_CHESTPLATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_armor_chestplate"), new AmethystArmorItem.Chestplate());
		AMETHYST_ARMOR_LEGGINGS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_armor_leggings"), new AmethystArmorItem.Leggings());
		AMETHYST_ARMOR_BOOTS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_armor_boots"), new AmethystArmorItem.Boots());
		AMETHYST_AXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_axe"), new AmethystAxeItem());
		AMETHYST_PICKAXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_pickaxe"), new AmethystPickaxeItem());
		AMETHYST_SWORD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_sword"), new AmethystSwordItem());
		AMETHYST_SHOVEL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_shovel"), new AmethystShovelItem());
		AMETHYST_HOE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_hoe"), new AmethystHoeItem());
		PURE_AMETHYST_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "pure_amethyst_gem"), new PureAmethystGemItem());
		PURE_AMETHYST_BLOCK = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureamethysttoolsMod.MODID, "pure_amethyst_block"), new BlockItem(PureamethysttoolsModBlocks.PURE_AMETHYST_BLOCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(PURE_AMETHYST_BLOCK));
	}

	public static void clientLoad() {
	}
}
