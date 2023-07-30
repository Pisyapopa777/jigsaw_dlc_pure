
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class LeninStatueDebugItem extends Item {
	public LeninStatueDebugItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_BREWING).stacksTo(64).rarity(Rarity.COMMON));
	}
}
