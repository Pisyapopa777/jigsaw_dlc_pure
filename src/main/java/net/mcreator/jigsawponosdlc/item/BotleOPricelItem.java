
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;

import net.mcreator.jigsawponosdlc.procedures.BotleOPricelRightclickedOnBlockProcedure;
import net.mcreator.jigsawponosdlc.procedures.BotleOPricelPlayerFinishesUsingItemProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

public class BotleOPricelItem extends Item {
	public BotleOPricelItem() {
		super(new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS).stacksTo(64).fireResistant().rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BotleOPricelPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		BotleOPricelRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
