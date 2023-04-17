
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureamethysttools.init;

import net.purejosh.pureamethysttools.block.AmethystClusterBlockBlock;
import net.purejosh.pureamethysttools.PureamethysttoolsMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class PureamethysttoolsModBlocks {
	public static Block AMETHYST_CLUSTER_BLOCK;

	public static void load() {
		AMETHYST_CLUSTER_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(PureamethysttoolsMod.MODID, "amethyst_cluster_block"), new AmethystClusterBlockBlock());
	}

	public static void clientLoad() {
		AmethystClusterBlockBlock.clientInit();
	}
}
