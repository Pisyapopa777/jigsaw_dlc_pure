
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.jigsawponosdlc.client.particle.PigParticleParticle;
import net.mcreator.jigsawponosdlc.client.particle.FartCloudParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JigsawPonosDlcModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) JigsawPonosDlcModParticleTypes.FART_CLOUD.get(), FartCloudParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) JigsawPonosDlcModParticleTypes.PIG_PARTICLE.get(), PigParticleParticle::provider);
	}
}
