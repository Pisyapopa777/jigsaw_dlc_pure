
package net.mcreator.jigsawponosdlc.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModParticleTypes;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModItems;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModFluids;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModBlocks;

public abstract class PigSolutionFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(JigsawPonosDlcModFluids.PIG_SOLUTION_FLUID, JigsawPonosDlcModFluids.FLOWING_PIG_SOLUTION_FLUID,
			FluidAttributes.builder(new ResourceLocation("jigsaw_ponos_dlc:blocks/pig_solution"), new ResourceLocation("jigsaw_ponos_dlc:blocks/pig_solution"))

					.rarity(Rarity.UNCOMMON))
			.explosionResistance(100f)

			.tickRate(1)

			.bucket(JigsawPonosDlcModItems.PIG_SOLUTION_FLUID_BUCKET).block(() -> (LiquidBlock) JigsawPonosDlcModBlocks.PIG_SOLUTION_FLUID.get());

	private PigSolutionFluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (JigsawPonosDlcModParticleTypes.FART_CLOUD.get());
	}

	public static class Source extends PigSolutionFluidFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PigSolutionFluidFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
