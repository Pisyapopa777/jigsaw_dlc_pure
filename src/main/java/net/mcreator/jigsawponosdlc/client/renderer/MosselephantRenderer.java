
package net.mcreator.jigsawponosdlc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jigsawponosdlc.entity.MosselephantEntity;
import net.mcreator.jigsawponosdlc.client.model.Modelmosselephant;

public class MosselephantRenderer extends MobRenderer<MosselephantEntity, Modelmosselephant<MosselephantEntity>> {
	public MosselephantRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmosselephant(context.bakeLayer(Modelmosselephant.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(MosselephantEntity entity) {
		return new ResourceLocation("jigsaw_ponos_dlc:textures/entities/mosselephant.png");
	}
}
