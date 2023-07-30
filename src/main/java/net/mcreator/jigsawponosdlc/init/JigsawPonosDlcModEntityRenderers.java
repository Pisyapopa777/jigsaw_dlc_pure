
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.jigsawponosdlc.client.renderer.ZombiePugalkaRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.ZombieBeaverRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.ZombeaverSpawnerRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.UniversePigRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.TazikKostyl2Renderer;
import net.mcreator.jigsawponosdlc.client.renderer.StonebeaverRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.SledgeDebugRMBRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.PigMinionRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.PerdezhingCloudRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.MosselephantRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.MexPigRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.LeninStatueRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.HitlerStatueRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.GlassDebugRenderer;
import net.mcreator.jigsawponosdlc.client.renderer.BeaverSpiderRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JigsawPonosDlcModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JigsawPonosDlcModEntities.PUSHKA_PERDUSHKA.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.PONOSTHROWER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.PIGGUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.ZOMBIE_BEAVER.get(), ZombieBeaverRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.OP_PIGGUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.BEAVER_GUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.EXTINGUISHER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.SLEDGE_DEBUG_LMB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.SLEDGE_DEBUG_RMB.get(), SledgeDebugRMBRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.PERDEZHING_CLOUD.get(), PerdezhingCloudRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.UNIVERSE_PIG.get(), UniversePigRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.BEAVER_SPIDER.get(), BeaverSpiderRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.PONOSTHROWER_NON_ANAL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.ZOMBEAVER_SPAWNER.get(), ZombeaverSpawnerRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.STONEBEAVER.get(), StonebeaverRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.MOSSELEPHANT.get(), MosselephantRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.SWEET_BREAD_RANGED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.ZOMBIE_PUGALKA.get(), ZombiePugalkaRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.TAZIK_KOSTYL_2.get(), TazikKostyl2Renderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.TAZIK_KOSTYL_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.PIG_MINION.get(), PigMinionRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.MEX_PIG.get(), MexPigRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.GLASS_DEBUG.get(), GlassDebugRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.OAK_LAUNCHER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.VACUUM_CLEANER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.VC_DEBUG_PIG.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.VC_DEBUG_BAD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.VC_DEBUG_MAIN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.LENIN_STATUE.get(), LeninStatueRenderer::new);
		event.registerEntityRenderer(JigsawPonosDlcModEntities.HITLER_STATUE.get(), HitlerStatueRenderer::new);
	}
}
