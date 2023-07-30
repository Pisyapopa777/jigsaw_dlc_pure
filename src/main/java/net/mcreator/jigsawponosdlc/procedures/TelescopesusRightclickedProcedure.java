package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

public class TelescopesusRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent(("moon phase: " + world.dimensionType().moonPhase(world.dayTime()) + " " + "time: " + world.dayTime() + " " + "temperature:"
					+ world.getBiome(new BlockPos(x, y, z)).value().getBaseTemperature() * 100f + "\u00B0C" + "(" + (world.getBiome(new BlockPos(x, y, z)).value().getBaseTemperature() * 100f + 273.15) + " K)")), (true));
	}
}
