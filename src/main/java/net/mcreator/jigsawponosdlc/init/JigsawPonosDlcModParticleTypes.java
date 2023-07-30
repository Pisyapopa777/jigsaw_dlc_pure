
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.jigsawponosdlc.JigsawPonosDlcMod;

public class JigsawPonosDlcModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, JigsawPonosDlcMod.MODID);
	public static final RegistryObject<ParticleType<?>> FART_CLOUD = REGISTRY.register("fart_cloud", () -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> PIG_PARTICLE = REGISTRY.register("pig_particle", () -> new SimpleParticleType(false));
}
