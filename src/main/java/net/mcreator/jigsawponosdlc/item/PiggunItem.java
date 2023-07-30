
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.jigsawponosdlc.procedures.PiggunRangedItemUsedProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModItems;
import net.mcreator.jigsawponosdlc.entity.PiggunEntity;

import java.util.List;

public class PiggunItem extends Item {
	public PiggunItem() {
		super(new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS).durability(50));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Controlled Pig Peapon"));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (true) {
				ItemStack stack = ProjectileWeaponItem.getHeldProjectile(entity, e -> e.getItem() == JigsawPonosDlcModItems.PIG_AMMO.get());
				if (stack == ItemStack.EMPTY) {
					for (int i = 0; i < entity.getInventory().items.size(); i++) {
						ItemStack teststack = entity.getInventory().items.get(i);
						if (teststack != null && teststack.getItem() == JigsawPonosDlcModItems.PIG_AMMO.get()) {
							stack = teststack;
							break;
						}
					}
				}
				if (entity.getAbilities().instabuild || stack != ItemStack.EMPTY) {
					PiggunEntity entityarrow = PiggunEntity.shoot(world, entity, world.getRandom(), 1f, 1, 1);
					itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
					if (entity.getAbilities().instabuild) {
						entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					} else {
						if (new ItemStack(JigsawPonosDlcModItems.PIG_AMMO.get()).isDamageableItem()) {
							if (stack.hurt(1, world.getRandom(), entity)) {
								stack.shrink(1);
								stack.setDamageValue(0);
								if (stack.isEmpty())
									entity.getInventory().removeItem(stack);
							}
						} else {
							stack.shrink(1);
							if (stack.isEmpty())
								entity.getInventory().removeItem(stack);
						}
					}

					PiggunRangedItemUsedProcedure.execute(world, x, y, z, entity, itemstack);
				}
			}
		}
	}
}
