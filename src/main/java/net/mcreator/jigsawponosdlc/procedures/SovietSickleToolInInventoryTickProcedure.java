package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModItems;

public class SovietSickleToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == JigsawPonosDlcModItems.SOVIET_SLEDGE.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == JigsawPonosDlcModItems.SOVIET_SICKLE.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == JigsawPonosDlcModItems.SOVIET_SICKLE.get()
						&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == JigsawPonosDlcModItems.SOVIET_SLEDGE.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 1));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 5, 1));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 5, 1));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SOUL, x, y, z, 5, 3, 3, 3, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, x, y, z, 5, 3, 3, 3, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.MYCELIUM, x, y, z, 5, 3, 3, 3, 1);
		}
	}
}
