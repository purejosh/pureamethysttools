package net.purejosh.pureamethysttools.world;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class ModGameRules {

    public static final GameRules.Key<GameRules.IntRule> HEALING_AURA_INTERVAL = GameRuleRegistry.register("pureAmethystToolsHealingAuraInterval", GameRules.Category.PLAYER, GameRuleFactory.createIntRule(8));

    public static void init() {
    }
}
