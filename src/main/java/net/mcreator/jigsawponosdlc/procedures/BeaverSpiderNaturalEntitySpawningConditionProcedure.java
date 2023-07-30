package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModGameRules;

public class BeaverSpiderNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(JigsawPonosDlcModGameRules.BEAVERSPIDERSPAWN) == true) {
			return true;
		}
		return false;
	}
}
