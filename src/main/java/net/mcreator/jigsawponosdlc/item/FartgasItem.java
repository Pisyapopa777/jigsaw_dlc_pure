
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModFluids;

public class FartgasItem extends BucketItem {
	public FartgasItem() {
		super(JigsawPonosDlcModFluids.FARTGAS, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS));
	}
}
