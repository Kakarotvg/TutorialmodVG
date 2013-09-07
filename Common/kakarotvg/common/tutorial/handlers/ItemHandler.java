package kakarotvg.common.tutorial.handlers;

import kakarotvg.common.tutorial.items.TutorialItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHandler {

    public static Item tutorialitem;
    public static Item tutorialingot;

    // registers the item's ids and textures
    public static void configureItems(Configuration config) {
        tutorialitem = new TutorialItem(IDHandler.tutorialitemID).setUnlocalizedName("tutorialitem").setCreativeTab(CreativeTabHandler.ttab);
        tutorialingot = new TutorialItem(IDHandler.tutorialingotID).setUnlocalizedName("tutorialingot").setCreativeTab(CreativeTabHandler.ttab);
    }

    // registers the items as items
    public static void registerItems(GameRegistry registry) {
        registry.registerItem(tutorialitem, "tutorialitem");
        registry.registerItem(tutorialingot, "tutorialingot");
    }

    // registers the item names
    public static void addNames(LanguageRegistry registry) {
        registry.addName(tutorialitem, "Tutorial Item");
        registry.addName(tutorialingot, "Tutorial Ingot");
    }

}