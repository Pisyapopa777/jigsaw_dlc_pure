
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JigsawPonosDlcModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("jigsaw_ponos_dlc", "perdezhing"), new SoundEvent(new ResourceLocation("jigsaw_ponos_dlc", "perdezhing")));
		REGISTRY.put(new ResourceLocation("jigsaw_ponos_dlc", "dristanul"), new SoundEvent(new ResourceLocation("jigsaw_ponos_dlc", "dristanul")));
		REGISTRY.put(new ResourceLocation("jigsaw_ponos_dlc", "beaver_ambient"), new SoundEvent(new ResourceLocation("jigsaw_ponos_dlc", "beaver_ambient")));
		REGISTRY.put(new ResourceLocation("jigsaw_ponos_dlc", "beaver_chop"), new SoundEvent(new ResourceLocation("jigsaw_ponos_dlc", "beaver_chop")));
		REGISTRY.put(new ResourceLocation("jigsaw_ponos_dlc", "totemulta1"), new SoundEvent(new ResourceLocation("jigsaw_ponos_dlc", "totemulta1")));
		REGISTRY.put(new ResourceLocation("jigsaw_ponos_dlc", "totemulta2"), new SoundEvent(new ResourceLocation("jigsaw_ponos_dlc", "totemulta2")));
		REGISTRY.put(new ResourceLocation("jigsaw_ponos_dlc", "floppa_shoot"), new SoundEvent(new ResourceLocation("jigsaw_ponos_dlc", "floppa_shoot")));
		REGISTRY.put(new ResourceLocation("jigsaw_ponos_dlc", "beaverzombie_ambient"), new SoundEvent(new ResourceLocation("jigsaw_ponos_dlc", "beaverzombie_ambient")));
		REGISTRY.put(new ResourceLocation("jigsaw_ponos_dlc", "pigburp"), new SoundEvent(new ResourceLocation("jigsaw_ponos_dlc", "pigburp")));
		REGISTRY.put(new ResourceLocation("jigsaw_ponos_dlc", "mosselephant_warn"), new SoundEvent(new ResourceLocation("jigsaw_ponos_dlc", "mosselephant_warn")));
		REGISTRY.put(new ResourceLocation("jigsaw_ponos_dlc", "teapot_ambient"), new SoundEvent(new ResourceLocation("jigsaw_ponos_dlc", "teapot_ambient")));
		REGISTRY.put(new ResourceLocation("jigsaw_ponos_dlc", "spit_helmet"), new SoundEvent(new ResourceLocation("jigsaw_ponos_dlc", "spit_helmet")));
		REGISTRY.put(new ResourceLocation("jigsaw_ponos_dlc", "shoot"), new SoundEvent(new ResourceLocation("jigsaw_ponos_dlc", "shoot")));
		REGISTRY.put(new ResourceLocation("jigsaw_ponos_dlc", "shitty_reload"), new SoundEvent(new ResourceLocation("jigsaw_ponos_dlc", "shitty_reload")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
