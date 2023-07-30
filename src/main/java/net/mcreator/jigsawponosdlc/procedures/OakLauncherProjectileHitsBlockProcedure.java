package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class OakLauncherProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(new BlockPos(x, y, z)).canOcclude() && (world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
			world.setBlock(new BlockPos(x, y, z), Blocks.OAK_SAPLING.defaultBlockState(), 3);
			for (int index0 = 0; index0 < (int) (16); index0++) {
				if (world instanceof Level _level) {
					BlockPos _bp = new BlockPos(x, y, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x, y, z, 50, 2, 2, 2, 1);
		} else {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 1, Explosion.BlockInteraction.NONE);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HEART, x, y, z, 50, 2, 2, 2, 1);
		}
	}
}
