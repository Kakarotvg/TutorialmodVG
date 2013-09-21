package kakarotvg.common.tutorial.handlers.armor;

import kakarotvg.common.tutorial.VgTutorial;
import kakarotvg.common.tutorial.armor.TutorialArmor;
import kakarotvg.common.tutorial.handlers.Ids.ArmorIDs;
import kakarotvg.common.tutorial.handlers.creativetabs.CreativeTabHandler;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ArmorHandler {

    public static Item tutorialhelm;
    public static Item tutorialplate;
    public static Item tutoriallegs;
    public static Item tutorialboots;

    // the armor enum
    public static EnumArmorMaterial TUTORIALARMOR = EnumHelper.addArmorMaterial("TUTORIALARMOR", 680, new int[] { 9, 14, 12, 9 }, 10);

    // registers the armors, with the textures and ids.
    public static void configureArmors(Configuration config) {
        tutorialhelm = new TutorialArmor(ArmorIDs.tutorialhelmID, TUTORIALARMOR, VgTutorial.proxy.addArmor("TUTORIALARMOR"), 0, "TUTORIALARMOR_1").setUnlocalizedName("tutorialhelm").setCreativeTab(CreativeTabHandler.ttab);
        tutorialplate = new TutorialArmor(ArmorIDs.tutorialplateID, TUTORIALARMOR, VgTutorial.proxy.addArmor("TUTORIALARMOR"), 1, "TUTORIALARMOR_1").setUnlocalizedName("tutorialplate").setCreativeTab(CreativeTabHandler.ttab);
        tutoriallegs = new TutorialArmor(ArmorIDs.tutoriallegsID, TUTORIALARMOR, VgTutorial.proxy.addArmor("TUTORIALARMOR"), 2, "TUTORIALARMOR_2").setUnlocalizedName("tutoriallegs").setCreativeTab(CreativeTabHandler.ttab);
        tutorialboots = new TutorialArmor(ArmorIDs.tutorialbootsID, TUTORIALARMOR, VgTutorial.proxy.addArmor("TUTORIALARMOR"), 3, "TUTORIALARMOR_1").setUnlocalizedName("tutorialboots").setCreativeTab(CreativeTabHandler.ttab);
    }

    // registers the armor as an item
    public static void registerArmor(GameRegistry registry) {
        registry.registerItem(tutorialhelm, "tutorialhelm");
        registry.registerItem(tutorialplate, "tutorialplate");
        registry.registerItem(tutoriallegs, "tutoriallegs");
        registry.registerItem(tutorialboots, "tutorialboots");
    }

    // registers the armor names
    public static void addNames(LanguageRegistry registry) {
        registry.addName(tutorialhelm, "Tutorial Helmet");
        registry.addName(tutorialplate, "Tutorial Chestplate");
        registry.addName(tutoriallegs, "Tutorial Leggings");
        registry.addName(tutorialboots, "Tutorial Boots");
    }
}
