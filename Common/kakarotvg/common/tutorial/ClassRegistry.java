package kakarotvg.common.tutorial;

import kakarotvg.common.tutorial.blocks.TutorialGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClassRegistry {

    public static void classRegistry(GameRegistry reg) {
        reg.registerWorldGenerator(new TutorialGenerator());

    }

}
