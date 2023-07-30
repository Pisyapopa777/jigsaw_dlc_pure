package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class PonosthrowerNonAnalProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jigsaw_ponos_dlc:dristanul")), SoundSource.PLAYERS, 0, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jigsaw_ponos_dlc:dristanul")), SoundSource.PLAYERS, 0, 1, false);
			}
		}
		entity.setSecondsOnFire(6);
		PonosthrowerNonAnalProjectileHitsBlockProcedure.execute(world, x, y, z);
		if (Math.random() < 0.2) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FALLING_LAVA, x, y, z, 20, 1, 1, 1, 0);
		}
	}
}
