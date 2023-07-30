
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.jigsawponosdlc.procedures.ProperIncompletePlayerFinishesUsingItemProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

public class ProperBadItem extends Item {
	public ProperBadItem() {
		super(new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS).stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(-1000).saturationMod(-1000f)

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ProperIncompletePlayerFinishesUsingItemProcedure.execute(world, x, y, z);
		return retval;
	}
}
