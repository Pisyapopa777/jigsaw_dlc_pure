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

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhitler<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jigsaw_ponos_dlc", "modelhitler"), "main");
	public final ModelPart lenin;
	public final ModelPart bb_main;

	public Modelhitler(ModelPart root) {
		this.lenin = root.getChild("lenin");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition lenin = partdefinition.addOrReplaceChild("lenin",
				CubeListBuilder.create().texOffs(35, 235).addBox(-8.0F, -56.0F, -10.0F, 16.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 224).addBox(-8.0F, -64.0F, -5.0F, 16.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = lenin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(192, 224).addBox(-7.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -64.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r2 = lenin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(128, 236).addBox(0.0F, 0.0F, -1.25F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -57.0F, -7.0F, -0.7441F, 0.3852F, 0.3959F));
		PartDefinition cube_r3 = lenin.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(208, 208).addBox(-8.0F, -7.0F, -7.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(8.0F, -57.0F, -7.0F, -2.5648F, -0.0127F, 3.032F));
		PartDefinition cube_r4 = lenin.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 224).addBox(0.0F, -9.0F, -1.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -57.0F, -7.0F, -0.5829F, 0.0062F, -0.0858F));
		PartDefinition cube_r5 = lenin.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(96, 192).addBox(-8.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -64.0F, -1.0F, -1.9635F, 0.0F, 0.0F));
		PartDefinition cube_r6 = lenin.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 192).addBox(-7.0F, 0.0F, -5.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -40.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r7 = lenin.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, 192).addBox(-4.0F, 0.0F, -5.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -40.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(64, 0).addBox(-24.0F, -16.0F, -24.0F, 48.0F, 16.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(208, 197).addBox(16.0F, -79.0F, 6.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(3.25F)).texOffs(176, 197).addBox(16.0F, -79.0F, 6.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1283F, 0.0283F, -0.3034F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		lenin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
