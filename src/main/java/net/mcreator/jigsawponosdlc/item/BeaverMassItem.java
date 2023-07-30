
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModFluids;

public class BeaverMassItem extends BucketItem {
	public BeaverMassItem() {
		super(JigsawPonosDlcModFluids.BEAVER_MASS, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS));
	}
}
