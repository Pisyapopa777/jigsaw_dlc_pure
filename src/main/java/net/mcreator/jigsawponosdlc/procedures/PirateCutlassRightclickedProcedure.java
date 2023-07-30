package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.Random;

public class PirateCutlassRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double speed = 0;
		double Yaw = 0;
		speed = 0.8;
		Yaw = entity.getYRot();
		entity.setDeltaMovement(new Vec3((speed * Math.cos((Yaw + 90) * (Math.PI / 180))), (entity.getDeltaMovement().y()), (speed * Math.sin((Yaw + 90) * (Math.PI / 180)))));
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
