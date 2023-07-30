package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModBlocks;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Iterator;
import java.util.Comparator;

public class PigSolutionFluidUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl && _lvl.isDay()) == false) {
			if ((world.getFluidState(new BlockPos(x, y, z)).createLegacyBlock()).getFluidState().isSource() == true) {
				world.setBlock(new BlockPos(x, y, z), JigsawPonosDlcModBlocks.PIG_BLOCK.get().defaultBlockState(), 3);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jigsaw_ponos_dlc:infection_adv"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
				}
			} else {
				if (y <= 50) {
					if (Math.random() < 0.3) {
						world.setBlock(new BlockPos(x, y, z), JigsawPonosDlcModBlocks.PIG_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
