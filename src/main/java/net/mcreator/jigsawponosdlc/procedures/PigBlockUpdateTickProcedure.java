package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModGameRules;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModBlocks;

import java.util.Random;

public class PigBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rx = 0;
		double ry = 0;
		double rz = 0;
		double randomus01 = 0;
		double randomulti13 = 0;
		double infectionspeed = 0;
		double deadrandom = 0;
		boolean ultanul = false;
		boolean dead = false;
		if (Math.random() < 0.35) {
			if (!(dead == true)) {
				if (world.getLevelData().getGameRules().getBoolean(JigsawPonosDlcModGameRules.INFECTIONSPREADING) == true) {
					rx = Mth.nextInt(new Random(), -1, 1);
					ry = Mth.nextInt(new Random(), -1, 1);
					rz = Mth.nextInt(new Random(), -1, 1);
					randomus01 = Math.random();
					infectionspeed = 3;
					deadrandom = Mth.nextInt(new Random(), -1, 1);
					if (randomus01 < 0.2 * infectionspeed) {
						if ((world.getBlockState(new BlockPos(x + rx, y + ry, z + rz))).getMaterial() == net.minecraft.world.level.material.Material.STONE) {
							world.setBlock(new BlockPos(x + rx, y + ry, z + rz), JigsawPonosDlcModBlocks.PIG_BLOCK.get().defaultBlockState(), 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + deadrandom, z))).getBlock() == JigsawPonosDlcModBlocks.PIG_BLOCK.get()) {
						dead = true;
					}
				}
			}
		}
	}
}
