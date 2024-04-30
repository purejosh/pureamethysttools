package net.purejosh.pureamethysttools.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class PureAmethystArmorTickEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.005) {
			PureAmethystRegenEventProcedure.execute(world, x, y, z, entity);
		}
	}
}
