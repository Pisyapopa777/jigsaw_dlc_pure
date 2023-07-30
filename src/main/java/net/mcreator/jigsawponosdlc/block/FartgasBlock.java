
package net.mcreator.jigsawponosdlc.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.jigsawponosdlc.procedures.FartgasUpdateTickProcedure;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModFluids;

import java.util.Random;

public class FartgasBlock extends LiquidBlock {
	public FartgasBlock() {
		super(() -> (FlowingFluid) JigsawPonosDlcModFluids.FARTGAS.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 10);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
		super.tick(blockstate, world, pos, random);
		FartgasUpdateTickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		world.scheduleTick(pos, this, 10);
	}
}
