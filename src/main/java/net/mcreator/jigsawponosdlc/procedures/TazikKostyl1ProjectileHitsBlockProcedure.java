package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModEntities;
import net.mcreator.jigsawponosdlc.entity.TazikKostyl2Entity;

import java.util.Random;

public class TazikKostyl1ProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double kordy = 0;
		double kordy2 = 0;
		for (int index0 = 0; index0 < (int) (8); index0++) {
			kordy = Mth.nextDouble(new Random(), -3, 3);
			kordy2 = Mth.nextDouble(new Random(), -3, 3);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new TazikKostyl2Entity(JigsawPonosDlcModEntities.TAZIK_KOSTYL_2.get(), _level);
				entityToSpawn.moveTo((x + kordy), (y + 12), (z + kordy2), 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, (-1), 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
