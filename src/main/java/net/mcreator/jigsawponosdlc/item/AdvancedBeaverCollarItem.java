
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.jigsawponosdlc.procedures.AdvancedBeaverCollarUseProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

public class AdvancedBeaverCollarItem extends Item {
	public AdvancedBeaverCollarItem() {
		super(new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS).stacksTo(1).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AdvancedBeaverCollarUseProcedure.execute(entity);
		return retval;
	}
}
