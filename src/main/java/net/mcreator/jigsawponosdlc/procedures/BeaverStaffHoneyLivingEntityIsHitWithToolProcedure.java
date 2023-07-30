package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class BeaverStaffHoneyLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double speed = 0;
		double Yaw = 0;
		speed = 3;
		Yaw = sourceentity.getYRot();
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				entityiterator.setDeltaMovement(new Vec3((speed * Math.cos((Yaw + 90) * (Math.PI / 180))), (entity.getDeltaMovement().y()), (speed * Math.sin((Yaw + 90) * (Math.PI / 180)))));
			}
		}
	}
}
