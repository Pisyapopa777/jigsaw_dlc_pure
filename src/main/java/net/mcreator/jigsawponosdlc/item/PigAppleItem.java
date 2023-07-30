
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

public class PigAppleItem extends Item {
	public PigAppleItem() {
		super(new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS).stacksTo(64).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(8).saturationMod(1f).alwaysEat().meat().build()));
	}
}
