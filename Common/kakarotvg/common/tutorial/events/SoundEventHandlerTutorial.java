package kakarotvg.common.tutorial.events;

import kakarotvg.common.tutorial.Reference;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SoundEventHandlerTutorial {

    @SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onSoundLoad(SoundLoadEvent event) {
        // Tutorial Animal Sounds
        event.manager.addSound(Reference.modid + ":" + "mob/tutorialanimal/say.ogg");
        event.manager.addSound(Reference.modid + ":" + "mob/tutorialanimal/hurt.ogg");
        event.manager.addSound(Reference.modid + ":" + "mob/tutorialanimal/death.ogg");
    }

}
