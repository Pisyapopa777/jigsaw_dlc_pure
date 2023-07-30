package net.mcreator.jigsawponosdlc.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class ModelUniversePig<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jigsaw_ponos_dlc", "model_universe_pig"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart rightArm;
	public final ModelPart leftArm;
	public final ModelPart leftLeg;
	public final ModelPart rightLeg;

	public ModelUniversePig(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.rightArm = root.getChild("rightArm");
		this.leftArm = root.getChild("leftArm");
		this.leftLeg = root.getChild("leftLeg");
		this.rightLeg = root.getChild("rightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(407, 0).addBox(-14.0F, 13.0F, -26.0F, 27.0F, 5.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(0, 505).addBox(10.0F, 8.0F, -26.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 505)
						.addBox(10.0F, 8.0F, -20.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 505).addBox(10.0F, 8.0F, -14.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 505)
						.addBox(10.0F, 8.0F, -8.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 505).addBox(-14.0F, 8.0F, -8.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 506)
						.addBox(-14.0F, 3.0F, -11.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 506).addBox(-14.0F, 3.0F, -17.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 506)
						.addBox(-14.0F, 3.0F, -23.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 506).addBox(-11.0F, 3.0F, -26.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 506)
						.addBox(-5.0F, 3.0F, -26.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 506).addBox(1.0F, 3.0F, -26.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 506)
						.addBox(7.0F, 3.0F, -26.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 506).addBox(10.0F, 3.0F, -23.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 506)
						.addBox(10.0F, 3.0F, -17.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 506).addBox(10.0F, 3.0F, -11.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 505)
						.addBox(-14.0F, 8.0F, -14.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 505).addBox(-14.0F, 8.0F, -20.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 505)
						.addBox(-14.0F, 8.0F, -26.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 505).addBox(-8.0F, 8.0F, -26.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 505)
						.addBox(-2.0F, 8.0F, -26.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 505).addBox(4.0F, 8.0F, -26.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(402, 35)
						.addBox(-14.0F, -14.0F, -5.0F, 27.0F, 27.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(417, 72).addBox(-14.0F, -14.0F, -26.0F, 27.0F, 17.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(394, 0)
						.addBox(-6.0F, -5.0F, -30.0F, 11.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(363, 0).addBox(3.0F, -21.0F, -9.0F, 8.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(364, 20)
						.addBox(-12.0F, -21.0F, -9.0F, 8.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -37.0F, -30.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(473, 37).addBox(-4.0F, -47.0F, -55.0F, 6.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 61.0F, 30.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(288, 400).addBox(-24.0F, -16.0F, -30.0F, 48.0F, 32.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(35, 470).addBox(-6.0F, 0.0F, -5.0F, 11.0F, 32.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(15.0F, -8.0F, -21.0F));
		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(86, 470).addBox(-5.0F, 0.0F, -5.0F, 11.0F, 32.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-15.0F, -8.0F, -21.0F));
		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(139, 470).addBox(-5.0F, 0.0F, -4.0F, 11.0F, 32.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-15.0F, -8.0F, 30.0F));
		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(190, 470).addBox(-6.0F, 0.0F, -4.0F, 11.0F, 32.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(15.0F, -8.0F, 30.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.rightArm.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftArm.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
