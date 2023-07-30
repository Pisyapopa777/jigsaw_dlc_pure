
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.jigsawponosdlc.entity.ZombiePugalkaEntity;
import net.mcreator.jigsawponosdlc.entity.ZombieBeaverEntity;
import net.mcreator.jigsawponosdlc.entity.ZombeaverSpawnerEntity;
import net.mcreator.jigsawponosdlc.entity.VacuumCleanerEntity;
import net.mcreator.jigsawponosdlc.entity.VCDebugPigEntity;
import net.mcreator.jigsawponosdlc.entity.VCDebugMainEntity;
import net.mcreator.jigsawponosdlc.entity.VCDebugBadEntity;
import net.mcreator.jigsawponosdlc.entity.UniversePigEntity;
import net.mcreator.jigsawponosdlc.entity.TazikKostyl2Entity;
import net.mcreator.jigsawponosdlc.entity.TazikKostyl1Entity;
import net.mcreator.jigsawponosdlc.entity.SweetBreadRangedEntity;
import net.mcreator.jigsawponosdlc.entity.StonebeaverEntity;
import net.mcreator.jigsawponosdlc.entity.SledgeDebugRMBEntity;
import net.mcreator.jigsawponosdlc.entity.SledgeDebugLMBEntity;
import net.mcreator.jigsawponosdlc.entity.PushkaPerdushkaEntity;
import net.mcreator.jigsawponosdlc.entity.PonosthrowerNonAnalEntity;
import net.mcreator.jigsawponosdlc.entity.PonosthrowerEntity;
import net.mcreator.jigsawponosdlc.entity.PiggunEntity;
import net.mcreator.jigsawponosdlc.entity.PigMinionEntity;
import net.mcreator.jigsawponosdlc.entity.PerdezhingCloudEntity;
import net.mcreator.jigsawponosdlc.entity.OpPiggunEntity;
import net.mcreator.jigsawponosdlc.entity.OakLauncherEntity;
import net.mcreator.jigsawponosdlc.entity.MosselephantEntity;
import net.mcreator.jigsawponosdlc.entity.MexPigEntity;
import net.mcreator.jigsawponosdlc.entity.LeninStatueEntity;
import net.mcreator.jigsawponosdlc.entity.HitlerStatueEntity;
import net.mcreator.jigsawponosdlc.entity.GlassDebugEntity;
import net.mcreator.jigsawponosdlc.entity.ExtinguisherEntity;
import net.mcreator.jigsawponosdlc.entity.BeaverSpiderEntity;
import net.mcreator.jigsawponosdlc.entity.BeaverGunEntity;
import net.mcreator.jigsawponosdlc.JigsawPonosDlcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JigsawPonosDlcModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, JigsawPonosDlcMod.MODID);
	public static final RegistryObject<EntityType<PushkaPerdushkaEntity>> PUSHKA_PERDUSHKA = register("projectile_pushka_perdushka", EntityType.Builder.<PushkaPerdushkaEntity>of(PushkaPerdushkaEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PushkaPerdushkaEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PonosthrowerEntity>> PONOSTHROWER = register("projectile_ponosthrower",
			EntityType.Builder.<PonosthrowerEntity>of(PonosthrowerEntity::new, MobCategory.MISC).setCustomClientFactory(PonosthrowerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PiggunEntity>> PIGGUN = register("projectile_piggun",
			EntityType.Builder.<PiggunEntity>of(PiggunEntity::new, MobCategory.MISC).setCustomClientFactory(PiggunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ZombieBeaverEntity>> ZOMBIE_BEAVER = register("zombie_beaver",
			EntityType.Builder.<ZombieBeaverEntity>of(ZombieBeaverEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3).setCustomClientFactory(ZombieBeaverEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OpPiggunEntity>> OP_PIGGUN = register("projectile_op_piggun",
			EntityType.Builder.<OpPiggunEntity>of(OpPiggunEntity::new, MobCategory.MISC).setCustomClientFactory(OpPiggunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BeaverGunEntity>> BEAVER_GUN = register("projectile_beaver_gun",
			EntityType.Builder.<BeaverGunEntity>of(BeaverGunEntity::new, MobCategory.MISC).setCustomClientFactory(BeaverGunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ExtinguisherEntity>> EXTINGUISHER = register("projectile_extinguisher",
			EntityType.Builder.<ExtinguisherEntity>of(ExtinguisherEntity::new, MobCategory.MISC).setCustomClientFactory(ExtinguisherEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SledgeDebugLMBEntity>> SLEDGE_DEBUG_LMB = register("projectile_sledge_debug_lmb",
			EntityType.Builder.<SledgeDebugLMBEntity>of(SledgeDebugLMBEntity::new, MobCategory.MISC).setCustomClientFactory(SledgeDebugLMBEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SledgeDebugRMBEntity>> SLEDGE_DEBUG_RMB = register("projectile_sledge_debug_rmb",
			EntityType.Builder.<SledgeDebugRMBEntity>of(SledgeDebugRMBEntity::new, MobCategory.MISC).setCustomClientFactory(SledgeDebugRMBEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PerdezhingCloudEntity>> PERDEZHING_CLOUD = register("perdezhing_cloud", EntityType.Builder.<PerdezhingCloudEntity>of(PerdezhingCloudEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(0).setUpdateInterval(3).setCustomClientFactory(PerdezhingCloudEntity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<UniversePigEntity>> UNIVERSE_PIG = register("universe_pig", EntityType.Builder.<UniversePigEntity>of(UniversePigEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(UniversePigEntity::new).fireImmune().sized(3.5f, 5f));
	public static final RegistryObject<EntityType<BeaverSpiderEntity>> BEAVER_SPIDER = register("beaver_spider",
			EntityType.Builder.<BeaverSpiderEntity>of(BeaverSpiderEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(BeaverSpiderEntity::new)

					.sized(1.4f, 0.9f));
	public static final RegistryObject<EntityType<PonosthrowerNonAnalEntity>> PONOSTHROWER_NON_ANAL = register("projectile_ponosthrower_non_anal", EntityType.Builder.<PonosthrowerNonAnalEntity>of(PonosthrowerNonAnalEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PonosthrowerNonAnalEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ZombeaverSpawnerEntity>> ZOMBEAVER_SPAWNER = register("zombeaver_spawner", EntityType.Builder.<ZombeaverSpawnerEntity>of(ZombeaverSpawnerEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZombeaverSpawnerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StonebeaverEntity>> STONEBEAVER = register("stonebeaver", EntityType.Builder.<StonebeaverEntity>of(StonebeaverEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StonebeaverEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<MosselephantEntity>> MOSSELEPHANT = register("mosselephant", EntityType.Builder.<MosselephantEntity>of(MosselephantEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MosselephantEntity::new).fireImmune().sized(2.5f, 2.5f));
	public static final RegistryObject<EntityType<SweetBreadRangedEntity>> SWEET_BREAD_RANGED = register("projectile_sweet_bread_ranged", EntityType.Builder.<SweetBreadRangedEntity>of(SweetBreadRangedEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SweetBreadRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ZombiePugalkaEntity>> ZOMBIE_PUGALKA = register("zombie_pugalka", EntityType.Builder.<ZombiePugalkaEntity>of(ZombiePugalkaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(40).setUpdateInterval(3).setCustomClientFactory(ZombiePugalkaEntity::new).fireImmune().sized(1f, 2f));
	public static final RegistryObject<EntityType<TazikKostyl2Entity>> TAZIK_KOSTYL_2 = register("tazik_kostyl_2", EntityType.Builder.<TazikKostyl2Entity>of(TazikKostyl2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TazikKostyl2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TazikKostyl1Entity>> TAZIK_KOSTYL_1 = register("projectile_tazik_kostyl_1",
			EntityType.Builder.<TazikKostyl1Entity>of(TazikKostyl1Entity::new, MobCategory.MISC).setCustomClientFactory(TazikKostyl1Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PigMinionEntity>> PIG_MINION = register("pig_minion",
			EntityType.Builder.<PigMinionEntity>of(PigMinionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PigMinionEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<MexPigEntity>> MEX_PIG = register("mex_pig",
			EntityType.Builder.<MexPigEntity>of(MexPigEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(MexPigEntity::new).fireImmune().sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<GlassDebugEntity>> GLASS_DEBUG = register("projectile_glass_debug",
			EntityType.Builder.<GlassDebugEntity>of(GlassDebugEntity::new, MobCategory.MISC).setCustomClientFactory(GlassDebugEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<OakLauncherEntity>> OAK_LAUNCHER = register("projectile_oak_launcher",
			EntityType.Builder.<OakLauncherEntity>of(OakLauncherEntity::new, MobCategory.MISC).setCustomClientFactory(OakLauncherEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VacuumCleanerEntity>> VACUUM_CLEANER = register("projectile_vacuum_cleaner",
			EntityType.Builder.<VacuumCleanerEntity>of(VacuumCleanerEntity::new, MobCategory.MISC).setCustomClientFactory(VacuumCleanerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VCDebugPigEntity>> VC_DEBUG_PIG = register("projectile_vc_debug_pig",
			EntityType.Builder.<VCDebugPigEntity>of(VCDebugPigEntity::new, MobCategory.MISC).setCustomClientFactory(VCDebugPigEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VCDebugBadEntity>> VC_DEBUG_BAD = register("projectile_vc_debug_bad",
			EntityType.Builder.<VCDebugBadEntity>of(VCDebugBadEntity::new, MobCategory.MISC).setCustomClientFactory(VCDebugBadEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VCDebugMainEntity>> VC_DEBUG_MAIN = register("projectile_vc_debug_main",
			EntityType.Builder.<VCDebugMainEntity>of(VCDebugMainEntity::new, MobCategory.MISC).setCustomClientFactory(VCDebugMainEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LeninStatueEntity>> LENIN_STATUE = register("lenin_statue", EntityType.Builder.<LeninStatueEntity>of(LeninStatueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LeninStatueEntity::new).fireImmune().sized(3f, 5f));
	public static final RegistryObject<EntityType<HitlerStatueEntity>> HITLER_STATUE = register("hitler_statue", EntityType.Builder.<HitlerStatueEntity>of(HitlerStatueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HitlerStatueEntity::new).fireImmune().sized(3f, 5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ZombieBeaverEntity.init();
			PerdezhingCloudEntity.init();
			UniversePigEntity.init();
			BeaverSpiderEntity.init();
			ZombeaverSpawnerEntity.init();
			StonebeaverEntity.init();
			MosselephantEntity.init();
			ZombiePugalkaEntity.init();
			TazikKostyl2Entity.init();
			PigMinionEntity.init();
			MexPigEntity.init();
			LeninStatueEntity.init();
			HitlerStatueEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ZOMBIE_BEAVER.get(), ZombieBeaverEntity.createAttributes().build());
		event.put(PERDEZHING_CLOUD.get(), PerdezhingCloudEntity.createAttributes().build());
		event.put(UNIVERSE_PIG.get(), UniversePigEntity.createAttributes().build());
		event.put(BEAVER_SPIDER.get(), BeaverSpiderEntity.createAttributes().build());
		event.put(ZOMBEAVER_SPAWNER.get(), ZombeaverSpawnerEntity.createAttributes().build());
		event.put(STONEBEAVER.get(), StonebeaverEntity.createAttributes().build());
		event.put(MOSSELEPHANT.get(), MosselephantEntity.createAttributes().build());
		event.put(ZOMBIE_PUGALKA.get(), ZombiePugalkaEntity.createAttributes().build());
		event.put(TAZIK_KOSTYL_2.get(), TazikKostyl2Entity.createAttributes().build());
		event.put(PIG_MINION.get(), PigMinionEntity.createAttributes().build());
		event.put(MEX_PIG.get(), MexPigEntity.createAttributes().build());
		event.put(LENIN_STATUE.get(), LeninStatueEntity.createAttributes().build());
		event.put(HITLER_STATUE.get(), HitlerStatueEntity.createAttributes().build());
	}
}
