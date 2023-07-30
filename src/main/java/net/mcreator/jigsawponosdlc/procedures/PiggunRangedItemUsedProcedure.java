package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModMobEffects;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModEntities;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModBlocks;
import net.mcreator.jigsawponosdlc.entity.PiggunEntity;

public class PiggunRangedItemUsedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new PiggunEntity(JigsawPonosDlcModEntities.PIGGUN.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 1, 1);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 1.5, 10);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new PiggunEntity(JigsawPonosDlcModEntities.PIGGUN.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 1, 1);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 1.5, 10);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new PiggunEntity(JigsawPonosDlcModEntities.PIGGUN.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 1, 1);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 1.5, 10);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new PiggunEntity(JigsawPonosDlcModEntities.PIGGUN.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 1, 1);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 1.5, 10);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new PiggunEntity(JigsawPonosDlcModEntities.PIGGUN.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 1, 1);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 1.5, 10);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 10);
		if ((itemstack).getDamageValue() > 30) {
			if (Math.random() < 0.05) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(JigsawPonosDlcModMobEffects.INFECTED.get(), 120, 1));
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 1, Explosion.BlockInteraction.BREAK);
				world.setBlock(new BlockPos(x, y, z), JigsawPonosDlcModBlocks.PIG_SOLUTION_FLUID.get().defaultBlockState(), 3);
			}
		}
	}
}
