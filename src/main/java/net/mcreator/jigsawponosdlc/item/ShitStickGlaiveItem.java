
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.jigsawponosdlc.procedures.ShitStickGlaiveLivingEntityIsHitWithToolProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModItems;

public class ShitStickGlaiveItem extends SwordItem {
	public ShitStickGlaiveItem() {
		super(new Tier() {
			public int getUses() {
				return 20;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(JigsawPonosDlcModItems.SWEET_BREAD.get()));
			}
		}, 3, -2.4f, new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		ShitStickGlaiveLivingEntityIsHitWithToolProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}
}
