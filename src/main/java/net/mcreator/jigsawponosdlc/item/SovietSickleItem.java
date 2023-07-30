
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.jigsawponosdlc.procedures.SovietSickleToolInInventoryTickProcedure;
import net.mcreator.jigsawponosdlc.procedures.SovietSickleRightclickedOnBlockProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

import java.util.List;

public class SovietSickleItem extends SwordItem {
	public SovietSickleItem() {
		super(new Tier() {
			public int getUses() {
				return 2048;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 11;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 3, -3f, new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("it's better to use it with soviet sledge"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		SovietSickleRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SovietSickleToolInInventoryTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
