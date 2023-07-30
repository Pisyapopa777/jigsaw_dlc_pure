package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.svisvi.jigsaw.init.JigsawModMobEffects;

public class SweetBreadRangedProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 1, 1));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(JigsawModMobEffects.POOP.get(), 60, 1, (false), (false)));
	}
}
