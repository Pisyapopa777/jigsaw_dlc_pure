
package net.mcreator.jigsawponosdlc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.jigsawponosdlc.entity.UniversePigEntity;
import net.mcreator.jigsawponosdlc.client.model.ModelUniversePig;

public class UniversePigRenderer extends MobRenderer<UniversePigEntity, ModelUniversePig<UniversePigEntity>> {
	public UniversePigRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelUniversePig(context.bakeLayer(ModelUniversePig.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<UniversePigEntity, ModelUniversePig<UniversePigEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("jigsaw_ponos_dlc:textures/entities/universepig_1.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(UniversePigEntity entity) {
		return new ResourceLocation("jigsaw_ponos_dlc:textures/entities/universepig.png");
	}
}
