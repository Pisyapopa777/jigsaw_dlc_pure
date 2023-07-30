package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModEntities;
import net.mcreator.jigsawponosdlc.entity.PerdezhingCloudEntity;

public class PushkaPerdushkaHitsEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (world instanceof ServerLevel _serverLevelForEntitySpawn) {
			Entity _entityForSpawning = new PerdezhingCloudEntity(JigsawPonosDlcModEntities.PERDEZHING_CLOUD.get(), _serverLevelForEntitySpawn);
			_entityForSpawning.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
			_entityForSpawning.getPersistentData().putDouble("counter1", 399);
			_entityForSpawning.getPersistentData().putString("dristid", (sourceentity.getStringUUID()));
			if (_entityForSpawning instanceof Mob _mobForSpawning)
				_mobForSpawning.finalizeSpawn(_serverLevelForEntitySpawn, world.getCurrentDifficultyAt(_entityForSpawning.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(_entityForSpawning);
		}
	}
}
