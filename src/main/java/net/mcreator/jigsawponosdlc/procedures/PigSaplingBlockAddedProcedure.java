package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModBlocks;

public class PigSaplingBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.2) {
			world.setBlock(new BlockPos(x, y, z), JigsawPonosDlcModBlocks.PIG_WOOD_LOG.get().defaultBlockState(), 3);
			for (int index0 = 0; index0 < (int) (20); index0++) {
				world.setBlock(new BlockPos(x, y + 1, z), JigsawPonosDlcModBlocks.LEAVES_JIGSAWER.get().defaultBlockState(), 3);
			}
		} else {
			world.setBlock(new BlockPos(x, y + 1, z), JigsawPonosDlcModBlocks.CORRUPTED_PIG_SEEDS.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), JigsawPonosDlcModBlocks.PIG_WOOD_LOG.get().defaultBlockState(), 3);
		}
	}
}
