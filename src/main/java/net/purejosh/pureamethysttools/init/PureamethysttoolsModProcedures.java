
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureamethysttools.init;

import net.purejosh.pureamethysttools.procedures.PureAmethystRegenEventProcedure;
import net.purejosh.pureamethysttools.procedures.PureAmethystArmorTickEventProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class PureamethysttoolsModProcedures {
	public static void load() {
		new PureAmethystRegenEventProcedure();
		new PureAmethystArmorTickEventProcedure();
	}
}
