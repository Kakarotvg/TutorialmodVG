package kakarotvg.common.tutorial.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CreativeTabHandler {

    // the creative tab, registers with the tutorialblock as its texture
    public static CreativeTabs ttab = new CreativeTabs("ttab") {
        public ItemStack getIconItemStack() {
            return new ItemStack(BlockHandler.tutorialblock, 1, 0);
        }
    };

    // sets the name of the creative tab
    public static void setNames(LanguageRegistry registry) {
        registry.instance().addStringLocalization("itemGroup.ttab", "en_US", "Tutorial Tab");
    }

}
