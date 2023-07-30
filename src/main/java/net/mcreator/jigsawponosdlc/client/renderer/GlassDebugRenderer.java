package net.mcreator.jigsawponosdlc.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.jigsawponosdlc.entity.GlassDebugEntity;
import net.mcreator.jigsawponosdlc.client.model.Modelfaceted_glass_Converted;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GlassDebugRenderer extends EntityRenderer<GlassDebugEntity> {
	private static final ResourceLocation texture = new ResourceLocation("jigsaw_ponos_dlc:textures/entities/faceted_glass_ent.png");
	private final Modelfaceted_glass_Converted model;

	public GlassDebugRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelfaceted_glass_Converted(context.bakeLayer(Modelfaceted_glass_Converted.LAYER_LOCATION));
	}

	@Override
	public void render(GlassDebugEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(GlassDebugEntity entity) {
		return texture;
	}
}
