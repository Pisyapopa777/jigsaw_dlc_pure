package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ShitCupUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), ForgeRegistries.BLOCKS.getValue(new ResourceLocation("jigsaw:ponos")).defaultBlockState(), 3);
	}
}
