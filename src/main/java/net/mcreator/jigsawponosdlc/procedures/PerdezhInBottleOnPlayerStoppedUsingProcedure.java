package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class PerdezhInBottleOnPlayerStoppedUsingProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		(itemstack).shrink(1);
		entity.hurt(DamageSource.STARVE, 40);
	}
}
