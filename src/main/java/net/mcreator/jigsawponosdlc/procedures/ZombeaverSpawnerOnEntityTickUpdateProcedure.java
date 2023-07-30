package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.svisvi.jigsaw.init.JigsawModItems;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModItems;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModEntities;
import net.mcreator.jigsawponosdlc.entity.ZombieBeaverEntity;

import java.util.Random;

public class ZombeaverSpawnerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.2) {
			if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.OVERWORLD)) {
				if (world.canSeeSkyFromBelowWater(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))) {
					for (int index0 = 0; index0 < (int) (20); index0++) {
						if (Math.random() < 0.05) {
							if (world instanceof ServerLevel _serverLevelForEntitySpawn) {
								Entity _entityForSpawning = new ZombieBeaverEntity(JigsawPonosDlcModEntities.ZOMBIE_BEAVER.get(), _serverLevelForEntitySpawn);
								_entityForSpawning.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								{
									Entity _entity = _entityForSpawning;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(2, new ItemStack(JigsawPonosDlcModItems.PUDGE_CHESTPLATE.get()));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(JigsawPonosDlcModItems.PUDGE_CHESTPLATE.get()));
									}
								}
								if (_entityForSpawning instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(JigsawModItems.PUDGEHOOK.get());
									_setstack.setCount(1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
								if (_entityForSpawning instanceof Mob _mobForSpawning)
									_mobForSpawning.finalizeSpawn(_serverLevelForEntitySpawn, world.getCurrentDifficultyAt(_entityForSpawning.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(_entityForSpawning);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new ZombieBeaverEntity(JigsawPonosDlcModEntities.ZOMBIE_BEAVER.get(), _level);
								entityToSpawn.moveTo(x, y, z, (float) Mth.nextDouble(new Random(), 1, 360), (float) Mth.nextDouble(new Random(), 1, 360));
								entityToSpawn.setYBodyRot((float) Mth.nextDouble(new Random(), 1, 360));
								entityToSpawn.setYHeadRot((float) Mth.nextDouble(new Random(), 1, 360));
								entityToSpawn.setDeltaMovement(0, 0, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			}
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.AMBIENT, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.AMBIENT, 1, 1, false);
				}
			}
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
