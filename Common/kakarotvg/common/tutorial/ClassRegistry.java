package kakarotvg.common.tutorial;

import kakarotvg.common.tutorial.generation.TutorialGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClassRegistry {

    // registers the worldgenerator class
    public static void classRegistry(GameRegistry reg) {
        reg.registerWorldGenerator(new TutorialGenerator());

    }

}
