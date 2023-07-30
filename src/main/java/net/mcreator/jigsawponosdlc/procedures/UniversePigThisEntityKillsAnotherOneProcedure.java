package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class UniversePigThisEntityKillsAnotherOneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (10); index0++) {
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(Math.random() + 10 + x, Math.random() + 10 + y, Math.random() + 10 + z)));
				entityToSpawn.setVisualOnly(false);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
