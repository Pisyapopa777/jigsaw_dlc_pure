
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

public class ErshikTwinBladeItem extends HoeItem {
	public ErshikTwinBladeItem() {
		super(new Tier() {
			public int getUses() {
				return 256;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 50;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.STRING));
			}
		}, 0, -2f, new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS));
	}
}
