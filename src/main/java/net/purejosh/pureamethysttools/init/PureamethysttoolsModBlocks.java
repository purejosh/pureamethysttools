
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureamethysttools.init;

import net.purejosh.pureamethysttools.block.PureAmethystBlockBlock;
import net.purejosh.pureamethysttools.PureamethysttoolsMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PureamethysttoolsModBlocks {
	public static Block PURE_AMETHYST_BLOCK;

	public static void load() {
		PURE_AMETHYST_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureamethysttoolsMod.MODID, "pure_amethyst_block"), new PureAmethystBlockBlock());
	}

	public static void clientLoad() {
		PureAmethystBlockBlock.clientInit();
	}
}
