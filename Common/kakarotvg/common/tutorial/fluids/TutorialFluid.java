package kakarotvg.common.tutorial.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class TutorialFluid extends Fluid {

    public TutorialFluid(String fluidName) {
        super(fluidName);

        setDensity(3);
        setViscosity(600);
        setLuminosity(5);
        FluidRegistry.registerFluid(this);
    }

}
