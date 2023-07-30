package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class KhuiniaRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double speed = 0;
		double Yaw = 0;
		speed = -3;
		Yaw = entity.getYRot();
		entity.setDeltaMovement(new Vec3((speed * Math.cos((Yaw + 90) * (Math.PI / 180))), 1, (speed * Math.sin((Yaw + 90) * (Math.PI / 180)))));
	}
}
