
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class JigsawPonosDlcModTabs {
	public static CreativeModeTab TAB_JIGSAW_PLUS;

	public static void load() {
		TAB_JIGSAW_PLUS = new CreativeModeTab("tabjigsaw_plus") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(JigsawPonosDlcModBlocks.TEAPOT_MACE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
