package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class InfectedOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
		if (!((world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getMaterial() == net.minecraft.world.level.material.Material.CLAY)) {
			if (!((world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getMaterial() == net.minecraft.world.level.material.Material.AIR)) {
				world.setBlock(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()),
						(ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("forge:pigmassodds"))).getRandomElement(new Random()).orElseGet(() -> Blocks.AIR)).defaultBlockState(), 3);
			}
		}
	}
}
