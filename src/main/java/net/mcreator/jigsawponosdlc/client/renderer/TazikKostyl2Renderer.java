
package net.mcreator.jigsawponosdlc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jigsawponosdlc.entity.TazikKostyl2Entity;
import net.mcreator.jigsawponosdlc.client.model.ModelFloppaMeteor;

public class TazikKostyl2Renderer extends MobRenderer<TazikKostyl2Entity, ModelFloppaMeteor<TazikKostyl2Entity>> {
	public TazikKostyl2Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelFloppaMeteor(context.bakeLayer(ModelFloppaMeteor.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TazikKostyl2Entity entity) {
		return new ResourceLocation("jigsaw_ponos_dlc:textures/entities/floppameteor.png");
	}
}
