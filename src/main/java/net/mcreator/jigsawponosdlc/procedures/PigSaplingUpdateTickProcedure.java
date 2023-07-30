package net.mcreator.jigsawponosdlc.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModBlocks;

public class PigSaplingUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getBlockState(new BlockPos(x + 2, y, z + 2)).canOcclude()) {
			if (!world.getBlockState(new BlockPos(x + -2, y, z + -2)).canOcclude()) {
				if (!world.getBlockState(new BlockPos(x + -2, y, z + 2)).canOcclude()) {
					if (!world.getBlockState(new BlockPos(x + 2, y, z + -2)).canOcclude()) {
						if (!world.getBlockState(new BlockPos(x + 1, y, z + 1)).canOcclude()) {
							if (!world.getBlockState(new BlockPos(x + -1, y, z + -1)).canOcclude()) {
								if (!world.getBlockState(new BlockPos(x + -1, y, z + 1)).canOcclude()) {
									if (!world.getBlockState(new BlockPos(x + 1, y, z + -1)).canOcclude()) {
										if (!world.getBlockState(new BlockPos(x, y + 11, z)).canOcclude()) {
											world.setBlock(new BlockPos(x, y, z), JigsawPonosDlcModBlocks.PIG_WOOD_LOG.get().defaultBlockState(), 3);
											if (world instanceof ServerLevel _serverworld) {
												StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("jigsaw_ponos_dlc", "ptree_big"));
												if (template != null) {
													template.placeInWorld(_serverworld, new BlockPos(x + 2, y + 1, z - 2), new BlockPos(x + 2, y + 1, z - 2),
															new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
												}
											}
										} else if (!world.getBlockState(new BlockPos(x, y + 8, z)).canOcclude()) {
											world.setBlock(new BlockPos(x, y, z), JigsawPonosDlcModBlocks.PIG_WOOD_LOG.get().defaultBlockState(), 3);
											if (world instanceof ServerLevel _serverworld) {
												StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("jigsaw_ponos_dlc", "ptree_avg"));
												if (template != null) {
													template.placeInWorld(_serverworld, new BlockPos(x + 2, y + 1, z - 2), new BlockPos(x + 2, y + 1, z - 2),
															new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
												}
											}
										} else if (!world.getBlockState(new BlockPos(x, y + 5, z)).canOcclude()) {
											world.setBlock(new BlockPos(x, y, z), JigsawPonosDlcModBlocks.PIG_WOOD_LOG.get().defaultBlockState(), 3);
											if (world instanceof ServerLevel _serverworld) {
												StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("jigsaw_ponos_dlc", "ptree_small"));
												if (template != null) {
													template.placeInWorld(_serverworld, new BlockPos(x + 1, y + 1, z - 1), new BlockPos(x + 1, y + 1, z - 1),
															new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
												}
											}
										} else {
											world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
										}
									} else {
										world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
									}
								} else {
									world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								}
							} else {
								world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							}
						} else {
							world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					} else {
						world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					}
				} else {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			} else {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		} else {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
