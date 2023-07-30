package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class PonosthrowerNonAnalWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == immediatesourceentity) && !(entityiterator == entity)) {
					entityiterator.hurt(DamageSource.IN_FIRE, 4);
					entityiterator.setSecondsOnFire(2);
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FALLING_HONEY, x, y, z, 4, 0.7, 0.7, 0.7, 0.1);
	}
}
