
package net.mcreator.jigsawponosdlc.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.jigsawponosdlc.procedures.PirateCutlassRightclickedProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

public class PirateCutlassItem extends SwordItem {
	public PirateCutlassItem() {
		super(new Tier() {
			public int getUses() {
				return 1300;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.IRON_BLOCK));
			}
		}, 3, -1f, new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		PirateCutlassRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
