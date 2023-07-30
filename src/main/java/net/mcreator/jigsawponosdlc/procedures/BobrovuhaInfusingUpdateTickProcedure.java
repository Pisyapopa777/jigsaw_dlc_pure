package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModBlocks;

public class BobrovuhaInfusingUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.dimensionType().moonPhase(world.dayTime()) == 0) {
			world.setBlock(new BlockPos(x, y, z), JigsawPonosDlcModBlocks.BOBROVUHA_DONE.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
