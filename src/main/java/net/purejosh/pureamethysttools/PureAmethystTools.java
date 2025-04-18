package net.purejosh.pureamethysttools;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.purejosh.pureamethysttools.block.ModBlocks;
import net.purejosh.pureamethysttools.item.ModArmorMaterials;
import net.purejosh.pureamethysttools.item.ModItemGroups;
import net.purejosh.pureamethysttools.item.ModItems;
import net.purejosh.pureamethysttools.world.ModGameRules;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PureAmethystTools implements ModInitializer {
	public static final String MOD_ID = "pureamethysttools";
	public static final String MOD_NAME = "Pure Amethyst Tools";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// This code is executed when the mod is loaded.
	@Override
	public void onInitialize() {
		// This is the log line that gets printed when the mod is loaded.
		LOGGER.info(PureAmethystTools.MOD_NAME + " by purejosh has been loaded!");
		// Now, I call the init methods in the registry classes.
		ModGameRules.init();
		ModArmorMaterials.init();
		ModItems.init();
		ModBlocks.init();
		ModItemGroups.init();
	}
	// This is used in the configured features and placed features registry. No idea why.
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
