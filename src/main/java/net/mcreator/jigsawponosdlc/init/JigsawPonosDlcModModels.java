
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.jigsawponosdlc.client.model.Modelstonebeaver;
import net.mcreator.jigsawponosdlc.client.model.Modelmosselephant;
import net.mcreator.jigsawponosdlc.client.model.Modellenin;
import net.mcreator.jigsawponosdlc.client.model.Modelhitler;
import net.mcreator.jigsawponosdlc.client.model.Modelfaceted_glass_Converted;
import net.mcreator.jigsawponosdlc.client.model.ModelUniversePig;
import net.mcreator.jigsawponosdlc.client.model.ModelScrap_hammer;
import net.mcreator.jigsawponosdlc.client.model.ModelFloppaMeteor;
import net.mcreator.jigsawponosdlc.client.model.ModelBazhenPig;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class JigsawPonosDlcModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBazhenPig.LAYER_LOCATION, ModelBazhenPig::createBodyLayer);
		event.registerLayerDefinition(Modellenin.LAYER_LOCATION, Modellenin::createBodyLayer);
		event.registerLayerDefinition(Modelmosselephant.LAYER_LOCATION, Modelmosselephant::createBodyLayer);
		event.registerLayerDefinition(Modelhitler.LAYER_LOCATION, Modelhitler::createBodyLayer);
		event.registerLayerDefinition(ModelUniversePig.LAYER_LOCATION, ModelUniversePig::createBodyLayer);
		event.registerLayerDefinition(ModelScrap_hammer.LAYER_LOCATION, ModelScrap_hammer::createBodyLayer);
		event.registerLayerDefinition(Modelfaceted_glass_Converted.LAYER_LOCATION, Modelfaceted_glass_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelstonebeaver.LAYER_LOCATION, Modelstonebeaver::createBodyLayer);
		event.registerLayerDefinition(ModelFloppaMeteor.LAYER_LOCATION, ModelFloppaMeteor::createBodyLayer);
	}
}
