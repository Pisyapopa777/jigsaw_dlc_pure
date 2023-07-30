package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;
import net.svisvi.jigsaw.init.JigsawModMobEffects;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class TotemUlta2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double speed2 = 0;
		double Yaw = 0;
		double DristTimer = 0;
		loop = 0;
		particleAmount = 128;
		xRadius = 4;
		zRadius = 4;
		speed2 = 4;
		Yaw = entity.getYRot();
		while (loop < particleAmount) {
			world.addParticle((SimpleParticleType) (JigsawPonosDlcModParticleTypes.FART_CLOUD.get()), (x + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (entity.getY() + 0.02),
					(z + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
			loop = loop + 1;
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jigsaw_ponos_dlc:perdezhing")), SoundSource.PLAYERS, 2, -1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jigsaw_ponos_dlc:perdezhing")), SoundSource.PLAYERS, 2, -1, false);
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 20, 1));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(JigsawModMobEffects.POOP.get(), 160, 1));
				}
			}
		}
		if (world instanceof ServerLevel _level) {
			LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
			entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(entity.getX(), entity.getY(), entity.getZ())));
			entityToSpawn.setVisualOnly(true);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
