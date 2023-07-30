
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.jigsawponosdlc.block.TempCloudBlock;
import net.mcreator.jigsawponosdlc.block.TeapotMaceBlock;
import net.mcreator.jigsawponosdlc.block.TeapotBlackBlock;
import net.mcreator.jigsawponosdlc.block.SlimyPigBlockBlock;
import net.mcreator.jigsawponosdlc.block.SlavicTotemUnchargedBlock;
import net.mcreator.jigsawponosdlc.block.ShitterBlock;
import net.mcreator.jigsawponosdlc.block.ShitWooferBlock;
import net.mcreator.jigsawponosdlc.block.ShitIngorBlockBlock;
import net.mcreator.jigsawponosdlc.block.ShitCupBlock;
import net.mcreator.jigsawponosdlc.block.PricelBottleBlock;
import net.mcreator.jigsawponosdlc.block.PonosblockBlock;
import net.mcreator.jigsawponosdlc.block.PigWoodWoodBlock;
import net.mcreator.jigsawponosdlc.block.PigWoodStairsBlock;
import net.mcreator.jigsawponosdlc.block.PigWoodSlabBlock;
import net.mcreator.jigsawponosdlc.block.PigWoodPressurePlateBlock;
import net.mcreator.jigsawponosdlc.block.PigWoodPlanksBlock;
import net.mcreator.jigsawponosdlc.block.PigWoodLogBlock;
import net.mcreator.jigsawponosdlc.block.PigWoodLeavesBlock;
import net.mcreator.jigsawponosdlc.block.PigWoodFenceGateBlock;
import net.mcreator.jigsawponosdlc.block.PigWoodFenceBlock;
import net.mcreator.jigsawponosdlc.block.PigWoodButtonBlock;
import net.mcreator.jigsawponosdlc.block.PigSolutionFluidBlock;
import net.mcreator.jigsawponosdlc.block.PigSaplingBlock;
import net.mcreator.jigsawponosdlc.block.PigLightBlock;
import net.mcreator.jigsawponosdlc.block.PigHogBlockBlock;
import net.mcreator.jigsawponosdlc.block.PigGeyserBlock;
import net.mcreator.jigsawponosdlc.block.PigEyeBlockBlock;
import net.mcreator.jigsawponosdlc.block.PigEggBlock;
import net.mcreator.jigsawponosdlc.block.PigBlockBlock;
import net.mcreator.jigsawponosdlc.block.PerdezhBlockBlock;
import net.mcreator.jigsawponosdlc.block.LeavesJigsawerBlock;
import net.mcreator.jigsawponosdlc.block.JarFilledBlock;
import net.mcreator.jigsawponosdlc.block.JarBlock;
import net.mcreator.jigsawponosdlc.block.FloppaCubeBlock;
import net.mcreator.jigsawponosdlc.block.FartgasBlock;
import net.mcreator.jigsawponosdlc.block.FartTurretBlock;
import net.mcreator.jigsawponosdlc.block.ExplosivePigBlockBlock;
import net.mcreator.jigsawponosdlc.block.DiamondIronBlockBlock;
import net.mcreator.jigsawponosdlc.block.CyberPigBlockBlock;
import net.mcreator.jigsawponosdlc.block.CorruptedPigSeedsBlock;
import net.mcreator.jigsawponosdlc.block.ChiseledPigBlockBlock;
import net.mcreator.jigsawponosdlc.block.CPigAppleBlockBlock;
import net.mcreator.jigsawponosdlc.block.BrawlLeavesBlock;
import net.mcreator.jigsawponosdlc.block.BobrovuhaInfusingBlock;
import net.mcreator.jigsawponosdlc.block.BobrovuhaDoneBlock;
import net.mcreator.jigsawponosdlc.block.BeaverMassBlock;
import net.mcreator.jigsawponosdlc.block.BeaverFireBlock;
import net.mcreator.jigsawponosdlc.JigsawPonosDlcMod;

public class JigsawPonosDlcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JigsawPonosDlcMod.MODID);
	public static final RegistryObject<Block> PONOSBLOCK = REGISTRY.register("ponosblock", () -> new PonosblockBlock());
	public static final RegistryObject<Block> PERDEZH_BLOCK = REGISTRY.register("perdezh_block", () -> new PerdezhBlockBlock());
	public static final RegistryObject<Block> SHIT_WOOFER = REGISTRY.register("shit_woofer", () -> new ShitWooferBlock());
	public static final RegistryObject<Block> BRAWL_LEAVES = REGISTRY.register("brawl_leaves", () -> new BrawlLeavesBlock());
	public static final RegistryObject<Block> FART_TURRET = REGISTRY.register("fart_turret", () -> new FartTurretBlock());
	public static final RegistryObject<Block> DIAMOND_IRON_BLOCK = REGISTRY.register("diamond_iron_block", () -> new DiamondIronBlockBlock());
	public static final RegistryObject<Block> JAR = REGISTRY.register("jar", () -> new JarBlock());
	public static final RegistryObject<Block> JAR_FILLED = REGISTRY.register("jar_filled", () -> new JarFilledBlock());
	public static final RegistryObject<Block> BOBROVUHA_INFUSING = REGISTRY.register("bobrovuha_infusing", () -> new BobrovuhaInfusingBlock());
	public static final RegistryObject<Block> BOBROVUHA_DONE = REGISTRY.register("bobrovuha_done", () -> new BobrovuhaDoneBlock());
	public static final RegistryObject<Block> BEAVER_FIRE = REGISTRY.register("beaver_fire", () -> new BeaverFireBlock());
	public static final RegistryObject<Block> BEAVER_MASS = REGISTRY.register("beaver_mass", () -> new BeaverMassBlock());
	public static final RegistryObject<Block> FARTGAS = REGISTRY.register("fartgas", () -> new FartgasBlock());
	public static final RegistryObject<Block> PIG_SOLUTION_FLUID = REGISTRY.register("pig_solution_fluid", () -> new PigSolutionFluidBlock());
	public static final RegistryObject<Block> SHIT_CUP = REGISTRY.register("shit_cup", () -> new ShitCupBlock());
	public static final RegistryObject<Block> SLAVIC_TOTEM_UNCHARGED = REGISTRY.register("slavic_totem_uncharged", () -> new SlavicTotemUnchargedBlock());
	public static final RegistryObject<Block> FLOPPA_CUBE = REGISTRY.register("floppa_cube", () -> new FloppaCubeBlock());
	public static final RegistryObject<Block> PIG_BLOCK = REGISTRY.register("pig_block", () -> new PigBlockBlock());
	public static final RegistryObject<Block> CHISELED_PIG_BLOCK = REGISTRY.register("chiseled_pig_block", () -> new ChiseledPigBlockBlock());
	public static final RegistryObject<Block> EXPLOSIVE_PIG_BLOCK = REGISTRY.register("explosive_pig_block", () -> new ExplosivePigBlockBlock());
	public static final RegistryObject<Block> SLIMY_PIG_BLOCK = REGISTRY.register("slimy_pig_block", () -> new SlimyPigBlockBlock());
	public static final RegistryObject<Block> PIG_EYE_BLOCK = REGISTRY.register("pig_eye_block", () -> new PigEyeBlockBlock());
	public static final RegistryObject<Block> PIG_LIGHT = REGISTRY.register("pig_light", () -> new PigLightBlock());
	public static final RegistryObject<Block> PIG_EGG = REGISTRY.register("pig_egg", () -> new PigEggBlock());
	public static final RegistryObject<Block> CYBER_PIG_BLOCK = REGISTRY.register("cyber_pig_block", () -> new CyberPigBlockBlock());
	public static final RegistryObject<Block> PIG_HOG_BLOCK = REGISTRY.register("pig_hog_block", () -> new PigHogBlockBlock());
	public static final RegistryObject<Block> PIG_GEYSER = REGISTRY.register("pig_geyser", () -> new PigGeyserBlock());
	public static final RegistryObject<Block> PIG_WOOD_WOOD = REGISTRY.register("pig_wood_wood", () -> new PigWoodWoodBlock());
	public static final RegistryObject<Block> PIG_WOOD_LOG = REGISTRY.register("pig_wood_log", () -> new PigWoodLogBlock());
	public static final RegistryObject<Block> PIG_WOOD_PLANKS = REGISTRY.register("pig_wood_planks", () -> new PigWoodPlanksBlock());
	public static final RegistryObject<Block> PIG_WOOD_LEAVES = REGISTRY.register("pig_wood_leaves", () -> new PigWoodLeavesBlock());
	public static final RegistryObject<Block> PIG_WOOD_STAIRS = REGISTRY.register("pig_wood_stairs", () -> new PigWoodStairsBlock());
	public static final RegistryObject<Block> PIG_WOOD_SLAB = REGISTRY.register("pig_wood_slab", () -> new PigWoodSlabBlock());
	public static final RegistryObject<Block> PIG_WOOD_FENCE = REGISTRY.register("pig_wood_fence", () -> new PigWoodFenceBlock());
	public static final RegistryObject<Block> PIG_WOOD_FENCE_GATE = REGISTRY.register("pig_wood_fence_gate", () -> new PigWoodFenceGateBlock());
	public static final RegistryObject<Block> PIG_WOOD_PRESSURE_PLATE = REGISTRY.register("pig_wood_pressure_plate", () -> new PigWoodPressurePlateBlock());
	public static final RegistryObject<Block> PIG_WOOD_BUTTON = REGISTRY.register("pig_wood_button", () -> new PigWoodButtonBlock());
	public static final RegistryObject<Block> TEAPOT_MACE = REGISTRY.register("teapot_mace", () -> new TeapotMaceBlock());
	public static final RegistryObject<Block> SHITTER = REGISTRY.register("shitter", () -> new ShitterBlock());
	public static final RegistryObject<Block> TEMP_CLOUD = REGISTRY.register("temp_cloud", () -> new TempCloudBlock());
	public static final RegistryObject<Block> LEAVES_JIGSAWER = REGISTRY.register("leaves_jigsawer", () -> new LeavesJigsawerBlock());
	public static final RegistryObject<Block> PIG_SAPLING = REGISTRY.register("pig_sapling", () -> new PigSaplingBlock());
	public static final RegistryObject<Block> CORRUPTED_PIG_SEEDS = REGISTRY.register("corrupted_pig_seeds", () -> new CorruptedPigSeedsBlock());
	public static final RegistryObject<Block> C_PIG_APPLE_BLOCK = REGISTRY.register("c_pig_apple_block", () -> new CPigAppleBlockBlock());
	public static final RegistryObject<Block> PRICEL_BOTTLE = REGISTRY.register("pricel_bottle", () -> new PricelBottleBlock());
	public static final RegistryObject<Block> SHIT_INGOR_BLOCK = REGISTRY.register("shit_ingor_block", () -> new ShitIngorBlockBlock());
	public static final RegistryObject<Block> TEAPOT_BLACK = REGISTRY.register("teapot_black", () -> new TeapotBlackBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PerdezhBlockBlock.registerRenderLayer();
			ShitWooferBlock.registerRenderLayer();
			FartTurretBlock.registerRenderLayer();
			JarBlock.registerRenderLayer();
			JarFilledBlock.registerRenderLayer();
			BobrovuhaInfusingBlock.registerRenderLayer();
			BobrovuhaDoneBlock.registerRenderLayer();
			BeaverFireBlock.registerRenderLayer();
			ShitCupBlock.registerRenderLayer();
			SlavicTotemUnchargedBlock.registerRenderLayer();
			FloppaCubeBlock.registerRenderLayer();
			PigLightBlock.registerRenderLayer();
			PigEggBlock.registerRenderLayer();
			PigGeyserBlock.registerRenderLayer();
			PigWoodLeavesBlock.registerRenderLayer();
			TeapotMaceBlock.registerRenderLayer();
			ShitterBlock.registerRenderLayer();
			TempCloudBlock.registerRenderLayer();
			PigSaplingBlock.registerRenderLayer();
			CPigAppleBlockBlock.registerRenderLayer();
			PricelBottleBlock.registerRenderLayer();
			TeapotBlackBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			BrawlLeavesBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			BrawlLeavesBlock.itemColorLoad(event);
		}
	}
}
