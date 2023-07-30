
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.jigsawponosdlc.procedures.RoadSignHeavyAxeLivingEntityIsHitWithToolProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

public class RoadSignHeavyAxeItem extends SwordItem {
	public RoadSignHeavyAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1024;
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
				return Ingredient.of(new ItemStack(Blocks.REDSTONE_BLOCK));
			}
		}, 3, -2.4f, new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		RoadSignHeavyAxeLivingEntityIsHitWithToolProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), sourceentity);
		return retval;
	}
}
