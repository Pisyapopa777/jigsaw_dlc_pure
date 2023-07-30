package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class TeapotMaceUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAMPFIRE) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jigsaw_ponos_dlc:teapot_ambient")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jigsaw_ponos_dlc:teapot_ambient")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 5, 1, 1, 1, 1);
			loop = 0;
			particleAmount = 64;
			xRadius = 1.5;
			zRadius = 1.5;
			while (loop < particleAmount) {
				world.addParticle(ParticleTypes.PORTAL, (x + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + 0.02), (z + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
			}
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.SOUL_CAMPFIRE) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jigsaw_ponos_dlc:teapot_ambient")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jigsaw_ponos_dlc:teapot_ambient")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 5, 1, 1, 1, 1);
			loop = 0;
			particleAmount = 64;
			xRadius = 1.5;
			zRadius = 1.5;
			while (loop < particleAmount) {
				world.addParticle(ParticleTypes.SOUL, (x + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + 0.02), (z + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
			}
		}
	}
}
