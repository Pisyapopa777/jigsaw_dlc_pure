package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModEntities;
import net.mcreator.jigsawponosdlc.entity.ExtinguisherEntity;

public class ExtinguisherRangedItemUsedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new ExtinguisherEntity(JigsawPonosDlcModEntities.EXTINGUISHER.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 1, 1);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 7);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new ExtinguisherEntity(JigsawPonosDlcModEntities.EXTINGUISHER.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 1, 1);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 7);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new ExtinguisherEntity(JigsawPonosDlcModEntities.EXTINGUISHER.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 1, 1);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 7);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new ExtinguisherEntity(JigsawPonosDlcModEntities.EXTINGUISHER.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 1, 1);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 7);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new ExtinguisherEntity(JigsawPonosDlcModEntities.EXTINGUISHER.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 1, 1);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 7);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
