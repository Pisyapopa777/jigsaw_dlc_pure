
package net.mcreator.jigsawponosdlc.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jigsawponosdlc.procedures.InfectedOnEffectActiveTickProcedure;
import net.mcreator.jigsawponosdlc.procedures.InfectedEffectExpiresProcedure;

public class InfectedMobEffect extends MobEffect {
	public InfectedMobEffect() {
		super(MobEffectCategory.HARMFUL, -26215);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jigsaw_ponos_dlc.infected";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		InfectedOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		InfectedEffectExpiresProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
