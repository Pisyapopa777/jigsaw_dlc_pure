package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModBlocks;

public class PonosthrowerNonAnalProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -3;
		found = false;
		for (int index0 = 0; index0 < (int) (6); index0++) {
			sy = -3;
			for (int index1 = 0; index1 < (int) (6); index1++) {
				sz = -3;
				for (int index2 = 0; index2 < (int) (6); index2++) {
					if (!((world.getBlockState(new BlockPos(x + sx, (y + sy) - 1, z + sz))).getMaterial() == net.minecraft.world.level.material.Material.AIR)
							&& !((world.getBlockState(new BlockPos(x + sx, (y + sy) - 1, z + sz))).getBlock() == JigsawPonosDlcModBlocks.BEAVER_FIRE.get())
							&& (world.getBlockState(new BlockPos(x + sx, (y + sy) - 0, z + sz))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
						if (Math.random() < 0.07) {
							world.setBlock(new BlockPos(x + sx, y + sy, z + sz), JigsawPonosDlcModBlocks.BEAVER_FIRE.get().defaultBlockState(), 3);
						}
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
