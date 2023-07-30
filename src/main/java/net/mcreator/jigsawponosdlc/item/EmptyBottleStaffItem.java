
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;

import net.mcreator.jigsawponosdlc.procedures.EmptyBottleStaffToolInHandTickProcedure;
import net.mcreator.jigsawponosdlc.procedures.BottlePenetrationProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

public class EmptyBottleStaffItem extends SwordItem {
	public EmptyBottleStaffItem() {
		super(new Tier() {
			public int getUses() {
				return 5;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.GREEN_STAINED_GLASS));
			}
		}, 3, -3f, new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		BottlePenetrationProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		EmptyBottleStaffToolInHandTickProcedure.execute(entity, itemstack);
	}
}
