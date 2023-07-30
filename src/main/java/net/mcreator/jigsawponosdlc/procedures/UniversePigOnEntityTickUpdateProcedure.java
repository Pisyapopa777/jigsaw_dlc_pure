package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class UniversePigOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		entity.getPersistentData().putDouble("counter1", (entity.getPersistentData().getDouble("counter1") + 1));
		if (entity.getPersistentData().getDouble("counter1") % 20 == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 9000, 6));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
						"fill ~10 ~10 ~10 ~-10 ~1 ~-10 air");
			if (Math.random() < 0.05) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 30, Explosion.BlockInteraction.BREAK);
			}
			if (Math.random() < 0.05) {
				if (world instanceof ServerLevel _level)
					_level.setDayTime(15000);
			}
			if (Math.random() < 0.05) {
				if (world instanceof ServerLevel _level)
					_level.setDayTime(1000);
			}
		}
	}
}
