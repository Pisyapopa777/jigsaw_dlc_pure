package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;

public class TazikKostyl2OnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isOnGround() == true) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 1, Explosion.BlockInteraction.BREAK);
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
