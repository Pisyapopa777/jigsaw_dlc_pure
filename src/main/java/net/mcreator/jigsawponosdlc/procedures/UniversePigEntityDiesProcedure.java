package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.List;
import java.util.ArrayList;

public class UniversePigEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (10); index0++) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.death")), SoundSource.MASTER, 99999, -1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.death")), SoundSource.MASTER, 99999, -1, false);
				}
			}
		}
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 40, Explosion.BlockInteraction.DESTROY);
		{
			List<? extends Player> _players = new ArrayList<>(world.players());
			for (Entity entityiterator : _players) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 30, Explosion.BlockInteraction.DESTROY);
			}
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
							"/summon item ~ ~ ~ {Item:{id:\"jigsaw_ponos_dlc:wand_of_mass_destruction\",Count:1b}}");
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 100);
	}
}
