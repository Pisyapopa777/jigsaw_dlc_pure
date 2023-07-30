package net.mcreator.jigsawponosdlc.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.List;
import java.util.Comparator;

import com.mojang.util.UUIDTypeAdapter;

public class PerdezhingCloudOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("Invulnerable", 1);
		entity.getPersistentData().putDouble("counter1", (entity.getPersistentData().getDouble("counter1") + 1));
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (entityiterator.getPersistentData().getDouble("Invulnerable") != 1) {
						entityiterator.hurt((new EntityDamageSource("drown.player", (world instanceof ServerLevel _serverLevelForGettingEntity ? (new Function<String, Entity>() {
							@Override
							public Entity apply(String _uuidForEntity) {
								Entity _entityFromUUID = null;
								try {
									_entityFromUUID = _serverLevelForGettingEntity.getEntity(UUIDTypeAdapter.fromString(_uuidForEntity));
								} catch (Exception e) {
									_entityFromUUID = null;
								}
								return _entityFromUUID;
							}
						}).apply((entity.getPersistentData().getString("dristid"))) : null))), 4);
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("counter1") % 10 == 0) {
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
								"particle jigsaw_ponos_dlc:fart_cloud ~ ~ ~ 3 3 3 0 700 force");
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, Mth.nextInt(new Random(), 6, 10));
		}
		if (entity.getPersistentData().getDouble("counter1") % 600 == 0) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
