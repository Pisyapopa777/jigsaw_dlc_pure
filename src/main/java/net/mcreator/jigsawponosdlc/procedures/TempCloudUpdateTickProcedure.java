package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class TempCloudUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double timer = 0;
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
				if (Math.random() < 0.02) {
					if (y < 0) {
						world.setBlock(new BlockPos(x, y, z),
								(ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("forge:ores_in_ground/deepslate"))).getRandomElement(new Random()).orElseGet(() -> Blocks.AIR)).defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x, y, z), (ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("forge:ores_in_ground/stone"))).getRandomElement(new Random()).orElseGet(() -> Blocks.AIR)).defaultBlockState(),
								3);
					}
				} else {
					if (y < 0) {
						world.setBlock(new BlockPos(x, y, z), Blocks.DEEPSLATE.defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x, y, z), Blocks.STONE.defaultBlockState(), 3);
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 80);
	}
}
