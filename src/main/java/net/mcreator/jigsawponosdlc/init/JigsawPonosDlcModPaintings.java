
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.decoration.Motive;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JigsawPonosDlcModPaintings {
	@SubscribeEvent
	public static void registerMotives(RegistryEvent.Register<Motive> event) {
		event.getRegistry().register(new Motive(32, 32).setRegistryName("balls"));
		event.getRegistry().register(new Motive(64, 48).setRegistryName("pag"));
		event.getRegistry().register(new Motive(64, 48).setRegistryName("svyatostrun"));
		event.getRegistry().register(new Motive(64, 32).setRegistryName("beaver_nazi"));
		event.getRegistry().register(new Motive(32, 32).setRegistryName("blabbits"));
		event.getRegistry().register(new Motive(32, 32).setRegistryName("slonik"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("ded"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("ded_sad"));
		event.getRegistry().register(new Motive(64, 48).setRegistryName("pot_sight"));
	}
}
