
package net.mcreator.jigsawponosdlc.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.jigsawponosdlc.procedures.PonosthrowerSummonFireProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModItems;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class PonosthrowerEntity extends AbstractArrow implements ItemSupplier {
	public PonosthrowerEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(JigsawPonosDlcModEntities.PONOSTHROWER.get(), world);
	}

	public PonosthrowerEntity(EntityType<? extends PonosthrowerEntity> type, Level world) {
		super(type, world);
	}

	public PonosthrowerEntity(EntityType<? extends PonosthrowerEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public PonosthrowerEntity(EntityType<? extends PonosthrowerEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.FIRE);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(JigsawPonosDlcModItems.PONOS.get());
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		PonosthrowerSummonFireProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		PonosthrowerSummonFireProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		PonosthrowerSummonFireProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		PonosthrowerSummonFireProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
		if (this.inGround)
			this.discard();
	}

	public static PonosthrowerEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		PonosthrowerEntity entityarrow = new PonosthrowerEntity(JigsawPonosDlcModEntities.PONOSTHROWER.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		entityarrow.setSecondsOnFire(100);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static PonosthrowerEntity shoot(LivingEntity entity, LivingEntity target) {
		PonosthrowerEntity entityarrow = new PonosthrowerEntity(JigsawPonosDlcModEntities.PONOSTHROWER.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 0.6f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(1);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entityarrow.setSecondsOnFire(100);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.PLAYERS, 1, 1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
