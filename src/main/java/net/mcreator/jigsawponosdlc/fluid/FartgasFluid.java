
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

public abstract class FartgasFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(JigsawPonosDlcModFluids.FARTGAS, JigsawPonosDlcModFluids.FLOWING_FARTGAS,
			FluidAttributes.builder(new ResourceLocation("jigsaw_ponos_dlc:blocks/fart_gas"), new ResourceLocation("jigsaw_ponos_dlc:blocks/fart_gas"))

					.rarity(Rarity.UNCOMMON))
			.explosionResistance(100f)

			.tickRate(1)

			.bucket(JigsawPonosDlcModItems.FARTGAS_BUCKET).block(() -> (LiquidBlock) JigsawPonosDlcModBlocks.FARTGAS.get());

	private FartgasFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (JigsawPonosDlcModParticleTypes.FART_CLOUD.get());
	}

	public static class Source extends FartgasFluid {
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

	public static class Flowing extends FartgasFluid {
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
