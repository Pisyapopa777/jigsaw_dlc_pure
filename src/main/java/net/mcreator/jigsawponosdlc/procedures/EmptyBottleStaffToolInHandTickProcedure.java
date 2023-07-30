package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModItems;

public class EmptyBottleStaffToolInHandTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((itemstack).isDamaged() == true) {
			(itemstack).shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(JigsawPonosDlcModItems.EMPTY_BOTTLE_ROSE_RAPIER.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
