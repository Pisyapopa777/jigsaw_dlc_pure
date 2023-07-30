
package net.mcreator.jigsawponosdlc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.jigsawponosdlc.entity.MexPigEntity;

public class MexPigRenderer extends MobRenderer<MexPigEntity, PigModel<MexPigEntity>> {
	public MexPigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MexPigEntity entity) {
		return new ResourceLocation("jigsaw_ponos_dlc:textures/entities/mexpig.png");
	}
}
