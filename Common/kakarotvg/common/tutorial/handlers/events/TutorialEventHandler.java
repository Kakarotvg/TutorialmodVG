package kakarotvg.common.tutorial.handlers.events;

import kakarotvg.common.tutorial.events.SoundEventHandlerTutorial;
import kakarotvg.common.tutorial.events.Tutorialbucketevent;
import net.minecraftforge.common.MinecraftForge;

public class TutorialEventHandler {

    // registers the bucket event class, and allows it to happen
    public static void registerEvents() {
        MinecraftForge.EVENT_BUS.register(new Tutorialbucketevent());
        MinecraftForge.EVENT_BUS.register(new SoundEventHandlerTutorial());
    }

}
