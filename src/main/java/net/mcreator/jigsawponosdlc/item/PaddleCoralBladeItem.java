
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.jigsawponosdlc.procedures.PaddleCoralBladeToolInInventoryTickProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

import java.util.List;

public class PaddleCoralBladeItem extends ShovelItem {
	public PaddleCoralBladeItem() {
		super(new Tier() {
			public int getUses() {
				return 50;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 50;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.BIRCH_PLANKS));
			}
		}, 1, -3f, new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("When equipped  in main and off hand makes you swim faster"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		PaddleCoralBladeToolInInventoryTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
