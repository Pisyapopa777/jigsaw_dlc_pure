
package net.mcreator.jigsawponosdlc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jigsawponosdlc.entity.HitlerStatueEntity;
import net.mcreator.jigsawponosdlc.client.model.Modelhitler;

public class HitlerStatueRenderer extends MobRenderer<HitlerStatueEntity, Modelhitler<HitlerStatueEntity>> {
	public HitlerStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhitler(context.bakeLayer(Modelhitler.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(HitlerStatueEntity entity) {
		return new ResourceLocation("jigsaw_ponos_dlc:textures/entities/lenin.png");
	}
}
