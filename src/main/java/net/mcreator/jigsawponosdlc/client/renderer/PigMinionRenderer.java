
package net.mcreator.jigsawponosdlc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jigsawponosdlc.entity.PigMinionEntity;
import net.mcreator.jigsawponosdlc.client.model.ModelBazhenPig;

public class PigMinionRenderer extends MobRenderer<PigMinionEntity, ModelBazhenPig<PigMinionEntity>> {
	public PigMinionRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBazhenPig(context.bakeLayer(ModelBazhenPig.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PigMinionEntity entity) {
		return new ResourceLocation("jigsaw_ponos_dlc:textures/entities/pig_v2.png");
	}
}
