package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class PonosblockEntityCollidesInTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.DROWN, 1);
		entity.clearFire();
	}
}
