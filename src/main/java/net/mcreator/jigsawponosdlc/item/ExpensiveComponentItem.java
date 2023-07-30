
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

public class ExpensiveComponentItem extends Item {
	public ExpensiveComponentItem() {
		super(new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}
}
