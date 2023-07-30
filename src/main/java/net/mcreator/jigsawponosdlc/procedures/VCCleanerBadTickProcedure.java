package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModBlocks;
import net.svisvi.jigsaw.init.JigsawModBlocks;

public class VCCleanerBadTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double despawn = 0;
		if (despawn >= 20) {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
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
				if (!immediatesourceentity.level.isClientSide())
					immediatesourceentity.discard();
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 220);
		immediatesourceentity.setNoGravity((false));
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.MYCELIUM, x, y, z, 5, 3, 3, 3, 0);
		sx = -3;
		found = false;
		for (int index0 = 0; index0 < (int) (6); index0++) {
			sy = -3;
			for (int index1 = 0; index1 < (int) (6); index1++) {
				sz = -3;
				for (int index2 = 0; index2 < (int) (6); index2++) {
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getMaterial() == net.minecraft.world.level.material.Material.WATER) {
						world.setBlock(new BlockPos(x + sx, y + sy, z + sz), JigsawModBlocks.PONOS.get().defaultBlockState(), 3);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.goat.milk")), SoundSource.BLOCKS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.goat.milk")), SoundSource.BLOCKS, 1, 1, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CRIT, (x + sx), (y + sy), (z + sz), 2, 0.1, 0.1, 0.1, 0);
						despawn = despawn + 1;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
