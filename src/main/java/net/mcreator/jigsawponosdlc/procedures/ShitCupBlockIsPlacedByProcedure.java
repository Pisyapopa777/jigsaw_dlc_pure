package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import java.util.Random;

public class ShitCupBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("forge:ponos_cup_tag"))).getRandomElement(new Random()).orElseGet(() -> Items.AIR)));
			_setstack.setCount(1);
			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
		if (world.isClientSide())
			Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
	}
}
