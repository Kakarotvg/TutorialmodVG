package kakarotvg.common.tutorial.handlers;

import kakarotvg.common.tutorial.events.Tutorialbucketevent;
import net.minecraftforge.common.MinecraftForge;

public class TutorialEventHandler {

    // registers the bucket event class, and allows it to happen
    public static void registerEvents() {
        MinecraftForge.EVENT_BUS.register(new Tutorialbucketevent());
    }

}
