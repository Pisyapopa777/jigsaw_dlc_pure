
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawponosdlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.jigsawponosdlc.block.entity.TeapotMaceBlockEntity;
import net.mcreator.jigsawponosdlc.block.entity.TeapotBlackBlockEntity;
import net.mcreator.jigsawponosdlc.block.entity.FartTurretBlockEntity;
import net.mcreator.jigsawponosdlc.block.entity.BeaverFireBlockEntity;
import net.mcreator.jigsawponosdlc.JigsawPonosDlcMod;

public class JigsawPonosDlcModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, JigsawPonosDlcMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FART_TURRET = register("fart_turret", JigsawPonosDlcModBlocks.FART_TURRET, FartTurretBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BEAVER_FIRE = register("beaver_fire", JigsawPonosDlcModBlocks.BEAVER_FIRE, BeaverFireBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEAPOT_MACE = register("teapot_mace", JigsawPonosDlcModBlocks.TEAPOT_MACE, TeapotMaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEAPOT_BLACK = register("teapot_black", JigsawPonosDlcModBlocks.TEAPOT_BLACK, TeapotBlackBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
