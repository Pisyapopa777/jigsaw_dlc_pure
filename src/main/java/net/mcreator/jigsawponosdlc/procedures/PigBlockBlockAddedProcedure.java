package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModBlocks;

import java.util.Random;

public class PigBlockBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean ultanul = false;
		double randomus01 = 0;
		double rx = 0;
		double ry = 0;
		double rz = 0;
		double infectionspeed = 0;
		double randomulti13 = 0;
		rx = Mth.nextInt(new Random(), -1, 1);
		ry = Mth.nextInt(new Random(), -1, 1);
		rz = Mth.nextInt(new Random(), -1, 1);
		randomus01 = Math.random();
		if (ultanul == false) {
			randomulti13 = Mth.nextInt(new Random(), 1, 6);
			if (randomulti13 == 1) {
				if (Math.random() < 0.5) {
					if ((world.getBlockState(new BlockPos(x + rx, y + ry, z + rz))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
						world.setBlock(new BlockPos(x + rx, y + ry, z + rz), JigsawPonosDlcModBlocks.PIG_LIGHT.get().defaultBlockState(), 3);
					}
				}
			} else if (randomulti13 == 2) {
				if (Math.random() < 0.05) {
					if ((world.getBlockState(new BlockPos(x + rx, y + ry, z + rz))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
						world.setBlock(new BlockPos(x + rx, y + ry, z + rz), JigsawPonosDlcModBlocks.PIG_GEYSER.get().defaultBlockState(), 3);
					}
				}
			} else if (randomulti13 == 3) {
				if (Math.random() < 0.0025) {
					if ((world.getBlockState(new BlockPos(x + rx, y + ry, z + rz))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
						world.setBlock(new BlockPos(x + rx, y + ry, z + rz), JigsawPonosDlcModBlocks.C_PIG_APPLE_BLOCK.get().defaultBlockState(), 3);
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 10, Explosion.BlockInteraction.BREAK);
					}
				}
			} else if (randomulti13 == 4) {
				if (Math.random() < 0.2) {
					if ((world.getBlockState(new BlockPos(x + rx, y + ry, z + rz))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
						world.setBlock(new BlockPos(x + rx, y + ry, z + rz), JigsawPonosDlcModBlocks.PIG_EGG.get().defaultBlockState(), 3);
					}
				}
			} else if (randomulti13 == 5) {
				if (Math.random() < 0.5) {
					if ((world.getBlockState(new BlockPos(x + rx, y + ry, z + rz))).getMaterial() == net.minecraft.world.level.material.Material.STONE) {
						world.setBlock(new BlockPos(x + rx, y + ry, z + rz), JigsawPonosDlcModBlocks.PIG_SAPLING.get().defaultBlockState(), 3);
					}
				}
			} else if (randomulti13 == 6) {
				if (Math.random() < 0.27) {
					if ((world.getBlockState(new BlockPos(x + rx, y + ry, z + rz))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
						world.setBlock(new BlockPos(x + rx, y + ry, z + rz), JigsawPonosDlcModBlocks.EXPLOSIVE_PIG_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() < 0.2) {
				world.setBlock(new BlockPos(x, y, z), (ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("forge:pigmassodds"))).getRandomElement(new Random()).orElseGet(() -> Blocks.AIR)).defaultBlockState(), 3);
			}
			ultanul = true;
		}
	}
}
