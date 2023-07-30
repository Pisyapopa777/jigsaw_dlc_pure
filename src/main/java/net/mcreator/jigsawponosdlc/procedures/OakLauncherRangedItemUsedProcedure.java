package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModEntities;
import net.mcreator.jigsawponosdlc.entity.OakLauncherEntity;

public class OakLauncherRangedItemUsedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 10);
		for (int index0 = 0; index0 < (int) (16); index0++) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level;
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new OakLauncherEntity(JigsawPonosDlcModEntities.OAK_LAUNCHER.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, 1, 1);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 15);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
	}
}
