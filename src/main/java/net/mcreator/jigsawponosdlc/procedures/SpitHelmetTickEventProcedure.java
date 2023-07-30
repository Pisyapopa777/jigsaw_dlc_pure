package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.LlamaSpit;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SpitHelmetTickEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double timer = 0;
		if (itemstack.getOrCreateTag().getDouble("cc1") < 120) {
			itemstack.getOrCreateTag().putDouble("cc1", (itemstack.getOrCreateTag().getDouble("cc1") + 1));
		}
		if (!entity.isShiftKeyDown()) {
			itemstack.getOrCreateTag().putBoolean("sus", (false));
		} else if (itemstack.getOrCreateTag().getDouble("cc1") >= 20 && itemstack.getOrCreateTag().getBoolean("sus") == false && entity.isShiftKeyDown()) {
			itemstack.getOrCreateTag().putBoolean("sus", (true));
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			itemstack.getOrCreateTag().putDouble("cc1", 0);
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level;
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getProjectile(Level level, Entity shooter) {
							Projectile entityToSpawn = new LlamaSpit(EntityType.LLAMA_SPIT, level);
							entityToSpawn.setOwner(shooter);
							return entityToSpawn;
						}
					}.getProjectile(projectileLevel, entity);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 3);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jigsaw_ponos_dlc:spit_helmet")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jigsaw_ponos_dlc:spit_helmet")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
		}
	}
}
