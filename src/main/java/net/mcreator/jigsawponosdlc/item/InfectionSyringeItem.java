
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.jigsawponosdlc.procedures.InfectionSyringeRightclickedProcedure;
import net.mcreator.jigsawponosdlc.procedures.InfectionSyringeLivingEntityIsHitWithItemProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

public class InfectionSyringeItem extends Item {
	public InfectionSyringeItem() {
		super(new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		InfectionSyringeRightclickedProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		InfectionSyringeLivingEntityIsHitWithItemProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
		return retval;
	}
}
