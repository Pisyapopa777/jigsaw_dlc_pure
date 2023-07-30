
package net.mcreator.jigsawponosdlc.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModParticleTypes;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModItems;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModFluids;
import net.mcreator.jigsawponosdlc.init.JigsawPonosDlcModBlocks;

public abstract class BeaverMassFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(JigsawPonosDlcModFluids.BEAVER_MASS, JigsawPonosDlcModFluids.FLOWING_BEAVER_MASS,
			FluidAttributes.builder(new ResourceLocation("jigsaw_ponos_dlc:blocks/beavermass"), new ResourceLocation("jigsaw_ponos_dlc:blocks/beavermass"))

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty"))))
			.explosionResistance(100f)

			.tickRate(3)

			.bucket(JigsawPonosDlcModItems.BEAVER_MASS_BUCKET).block(() -> (LiquidBlock) JigsawPonosDlcModBlocks.BEAVER_MASS.get());

	private BeaverMassFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (JigsawPonosDlcModParticleTypes.FART_CLOUD.get());
	}

	public static class Source extends BeaverMassFluid {
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

	public static class Flowing extends BeaverMassFluid {
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
