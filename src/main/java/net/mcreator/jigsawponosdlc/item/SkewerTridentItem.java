
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

public class SkewerTridentItem extends SwordItem {
	public SkewerTridentItem() {
		super(new Tier() {
			public int getUses() {
				return 69;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_NUGGET));
			}
		}, 3, -2.4f, new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS));
	}
}
