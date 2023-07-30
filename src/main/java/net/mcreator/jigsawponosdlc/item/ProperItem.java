
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.jigsawponosdlc.procedures.ProperPlayerFinishesUsingItemProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

public class ProperItem extends Item {
	public ProperItem() {
		super(new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS).stacksTo(64).fireResistant().rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(-1000).saturationMod(-100f).alwaysEat().meat().build()));
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ProperPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
