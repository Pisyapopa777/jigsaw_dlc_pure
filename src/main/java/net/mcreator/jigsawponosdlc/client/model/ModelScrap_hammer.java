package net.mcreator.jigsawponosdlc.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelScrap_hammer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jigsaw_ponos_dlc", "model_scrap_hammer"), "main");
	public final ModelPart group;

	public ModelScrap_hammer(ModelPart root) {
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition group = partdefinition.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(41, 39).mirror().addBox(-1.0F, 13.0F, -1.5F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(4, 8).mirror()
						.addBox(-0.75F, 3.0F, -1.25F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 20).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 4)
						.addBox(-2.75F, -7.0F, -6.0F, 5.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(9, 19).addBox(-2.75F, -7.0F, 4.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 17).mirror()
						.addBox(-3.0F, -5.0F, -5.75F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 24).addBox(-3.125F, -7.25F, 3.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 24)
						.addBox(-3.225F, -2.5F, -6.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 24).addBox(1.025F, -2.5F, -6.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 24)
						.addBox(1.125F, -7.25F, 3.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 4).addBox(-2.664F, -2.542F, -3.25F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 16)
						.addBox(0.7391F, -2.4262F, -3.25F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 7).addBox(-2.875F, -6.75F, -5.75F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, 16.0F, 8.0F));
		PartDefinition cube_r1 = group.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 18).addBox(-1.125F, -11.9498F, -0.2183F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r2 = group.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 10).addBox(-3.125F, -10.9147F, -5.5293F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r3 = group.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(34, 7).addBox(-3.5F, -16.2716F, -0.8791F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 7).addBox(0.5F, -16.2716F, -0.8791F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
