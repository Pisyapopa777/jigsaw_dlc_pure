package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.svisvi.jigsaw.init.JigsawModMobEffects;

public class BeaverFireEntityCollidesInTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(6);
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(JigsawModMobEffects.POOP.get(), 10, 1, (false), (false)));
	}
}
