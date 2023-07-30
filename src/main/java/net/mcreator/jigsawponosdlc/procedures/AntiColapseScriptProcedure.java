package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class AntiColapseScriptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == (ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("forge:pig_mass_ultas"))).getRandomElement(new Random()).orElseGet(() -> Blocks.AIR))) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
