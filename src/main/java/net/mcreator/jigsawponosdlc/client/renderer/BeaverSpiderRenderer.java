
package net.mcreator.jigsawponosdlc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.jigsawponosdlc.entity.BeaverSpiderEntity;

public class BeaverSpiderRenderer extends MobRenderer<BeaverSpiderEntity, SpiderModel<BeaverSpiderEntity>> {
	public BeaverSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BeaverSpiderEntity entity) {
		return new ResourceLocation("jigsaw_ponos_dlc:textures/entities/bobrospider.png");
	}
}
