
package net.mcreator.jigsawponosdlc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.jigsawponosdlc.entity.StonebeaverEntity;
import net.mcreator.jigsawponosdlc.client.model.Modelstonebeaver;

public class StonebeaverRenderer extends MobRenderer<StonebeaverEntity, Modelstonebeaver<StonebeaverEntity>> {
	public StonebeaverRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstonebeaver(context.bakeLayer(Modelstonebeaver.LAYER_LOCATION)), 1f);
		this.addLayer(new EyesLayer<StonebeaverEntity, Modelstonebeaver<StonebeaverEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("jigsaw_ponos_dlc:textures/entities/stonebeaver2.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(StonebeaverEntity entity) {
		return new ResourceLocation("jigsaw_ponos_dlc:textures/entities/stonebeaver.png");
	}
}
