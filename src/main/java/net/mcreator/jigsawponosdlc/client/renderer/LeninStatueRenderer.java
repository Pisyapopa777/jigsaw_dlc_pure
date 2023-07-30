
package net.mcreator.jigsawponosdlc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jigsawponosdlc.entity.LeninStatueEntity;
import net.mcreator.jigsawponosdlc.client.model.Modellenin;

public class LeninStatueRenderer extends MobRenderer<LeninStatueEntity, Modellenin<LeninStatueEntity>> {
	public LeninStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellenin(context.bakeLayer(Modellenin.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(LeninStatueEntity entity) {
		return new ResourceLocation("jigsaw_ponos_dlc:textures/entities/lenin.png");
	}
}
