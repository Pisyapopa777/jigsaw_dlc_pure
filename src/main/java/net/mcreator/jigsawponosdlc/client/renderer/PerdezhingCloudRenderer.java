
package net.mcreator.jigsawponosdlc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.jigsawponosdlc.entity.PerdezhingCloudEntity;

public class PerdezhingCloudRenderer extends MobRenderer<PerdezhingCloudEntity, CowModel<PerdezhingCloudEntity>> {
	public PerdezhingCloudRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(PerdezhingCloudEntity entity) {
		return new ResourceLocation("jigsaw_ponos_dlc:textures/entities/1_piksiel.png");
	}
}
