package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModBlocks;

import java.util.Random;

public class LeavesJigsawerBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double randomus01 = 0;
		double rx = 0;
		double ry = 0;
		double rz = 0;
		rx = Mth.nextInt(new Random(), -1, 1);
		ry = Mth.nextInt(new Random(), -1, 1);
		rz = Mth.nextInt(new Random(), -1, 1);
		randomus01 = Math.random();
		if (!world.getBlockState(new BlockPos(x + rx, y + ry, z + rz)).canOcclude()) {
			if (y > 318) {
				if (Math.random() < 0.05) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 8, Explosion.BlockInteraction.BREAK);
					world.setBlock(new BlockPos(x + rx, y + ry, z + rz), JigsawPonosDlcModBlocks.C_PIG_APPLE_BLOCK.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x, y, z), JigsawPonosDlcModBlocks.PIG_WOOD_LEAVES.get().defaultBlockState(), 3);
				}
			} else {
				if (randomus01 < 0.75) {
					world.setBlock(new BlockPos(x + rx, y + ry, z + rz), JigsawPonosDlcModBlocks.LEAVES_JIGSAWER.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x, y, z), JigsawPonosDlcModBlocks.PIG_WOOD_LEAVES.get().defaultBlockState(), 3);
				} else if (randomus01 < 0.25) {
					world.setBlock(new BlockPos(x, y, z), JigsawPonosDlcModBlocks.PIG_WOOD_LEAVES.get().defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + rx, y + ry, z + rz), JigsawPonosDlcModBlocks.CORRUPTED_PIG_SEEDS.get().defaultBlockState(), 3);
				}
			}
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.azalea_leaves.place")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.azalea_leaves.place")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
	}
}
