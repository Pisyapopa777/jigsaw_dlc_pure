
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.jigsawponosdlc.potion.InfectedMobEffect;
import net.mcreator.jigsawponosdlc.JigsawPonosDlcMod;

public class JigsawPonosDlcModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, JigsawPonosDlcMod.MODID);
	public static final RegistryObject<MobEffect> INFECTED = REGISTRY.register("infected", () -> new InfectedMobEffect());
}
