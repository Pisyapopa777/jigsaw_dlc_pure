
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.jigsawponosdlc.procedures.SweetBreadRightclickedOnBlockProcedure;
import net.mcreator.jigsawponosdlc.procedures.SweetBreadPlayerFinishesUsingItemProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

public class SweetBreadItem extends Item {
	public SweetBreadItem() {
		super(new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(-1).saturationMod(-1f).alwaysEat().meat().build()));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SweetBreadRightclickedOnBlockProcedure.execute(entity, itemstack);
		return ar;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SweetBreadPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		SweetBreadRightclickedOnBlockProcedure.execute(context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
