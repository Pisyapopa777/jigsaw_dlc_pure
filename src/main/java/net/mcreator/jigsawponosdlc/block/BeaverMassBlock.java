
package net.mcreator.jigsawponosdlc.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModFluids;

public class BeaverMassBlock extends LiquidBlock {
	public BeaverMassBlock() {
		super(() -> (FlowingFluid) JigsawPonosDlcModFluids.BEAVER_MASS.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
