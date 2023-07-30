package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModBlocks;

public class PigAppleCorruptedPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), JigsawPonosDlcModBlocks.CORRUPTED_PIG_SEEDS.get().defaultBlockState(), 3);
	}
}
