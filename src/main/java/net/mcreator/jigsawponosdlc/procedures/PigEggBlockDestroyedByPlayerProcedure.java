package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModEntities;
import net.mcreator.jigsawponosdlc.entity.PigMinionEntity;
import net.mcreator.jigsawponosdlc.entity.MexPigEntity;

import java.util.Random;

public class PigEggBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double randomus = 0;
		randomus = Math.ceil(Mth.nextDouble(new Random(), 1, 5));
		for (int index0 = 0; index0 < (int) (randomus); index0++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new PigMinionEntity(JigsawPonosDlcModEntities.PIG_MINION.get(), _level);
				entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		for (int index1 = 0; index1 < (int) (Math.ceil(randomus) / 2); index1++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MexPigEntity(JigsawPonosDlcModEntities.MEX_PIG.get(), _level);
				entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
