
package net.mcreator.jigsawponosdlc.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.jigsawponosdlc.procedures.PyroHelmetTickEventProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModTabs;

import java.util.List;

public abstract class PyroItem extends ArmorItem {
	public PyroItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 8;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 0;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.COAL_BLOCK));
			}

			@Override
			public String getName() {
				return "pyro";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends PyroItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(JigsawPonosDlcModTabs.TAB_JIGSAW_PLUS).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("Grants immunity from flamethrowers"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "jigsaw_ponos_dlc:textures/models/armor/pyro_mask__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PyroHelmetTickEventProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}
}
