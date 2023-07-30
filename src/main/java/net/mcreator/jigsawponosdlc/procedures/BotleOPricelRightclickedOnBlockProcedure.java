package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModBlocks;

public class BotleOPricelRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!world.getBlockState(new BlockPos(x, y + 1, z)).canOcclude()) {
			if (entity.isShiftKeyDown()) {
				(itemstack).shrink(1);
				world.setBlock(new BlockPos(x, y + 1, z), JigsawPonosDlcModBlocks.PRICEL_BOTTLE.get().defaultBlockState(), 3);
			}
		}
	}
}
