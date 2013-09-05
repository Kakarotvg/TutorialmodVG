package kakarotvg.common.tutorial.handlers;

import kakarotvg.common.tutorial.tools.TutorialAxe;
import kakarotvg.common.tutorial.tools.TutorialHoe;
import kakarotvg.common.tutorial.tools.TutorialPickaxe;
import kakarotvg.common.tutorial.tools.TutorialShovel;
import kakarotvg.common.tutorial.tools.TutorialSword;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ToolHandler {

    public static Item tutorialaxe;
    public static Item tutorialhoe;
    public static Item tutorialshovel;
    public static Item tutorialsword;
    public static Item tutorialpickaxe;

    // tool enum
    public static EnumToolMaterial TUTORIALTOOLS = EnumHelper.addToolMaterial("TUTORIALTOOLS", 4, 1450, 8, 9, 10);

    // registers the tool's textures, id, enum, and creative tab
    public static void configureTools(Configuration config) {
        tutorialaxe = new TutorialAxe(IDHandler.tutorialaxeID, TUTORIALTOOLS).setUnlocalizedName("tutorialaxe").setCreativeTab(CreativeTabHandler.ttab);
        tutorialhoe = new TutorialHoe(IDHandler.tutorialhoeID, TUTORIALTOOLS).setUnlocalizedName("tutorialhoe").setCreativeTab(CreativeTabHandler.ttab);
        tutorialshovel = new TutorialShovel(IDHandler.tutorialshovelID, TUTORIALTOOLS).setUnlocalizedName("tutorialshovel").setCreativeTab(CreativeTabHandler.ttab);
        tutorialsword = new TutorialSword(IDHandler.tutorialswordID, TUTORIALTOOLS).setUnlocalizedName("tutorialsword").setCreativeTab(CreativeTabHandler.ttab);
        tutorialpickaxe = new TutorialPickaxe(IDHandler.tutorialpickaxeID, TUTORIALTOOLS).setUnlocalizedName("tutorialpickaxe").setCreativeTab(CreativeTabHandler.ttab);
    }

    // registers the tools as items
    public static void registerTools(GameRegistry registry) {
        registry.registerItem(tutorialaxe, "tutorialaxe");
        registry.registerItem(tutorialhoe, "tutorialhoe");
        registry.registerItem(tutorialshovel, "tutorialshovel");
        registry.registerItem(tutorialsword, "tutorialsword");
        registry.registerItem(tutorialpickaxe, "tutorialpickaxe");
    }

    // registers the tools names
    public static void addNames(LanguageRegistry registry) {
        registry.addName(tutorialaxe, "Tutorial Axe");
        registry.addName(tutorialhoe, "Tutorial Hoe");
        registry.addName(tutorialshovel, "Tutorial Shovel");
        registry.addName(tutorialsword, "Tutorial Sword");
        registry.addName(tutorialpickaxe, "Tutorial Pickaxe");
    }

    // registers the tools tool type
    public static void setToolClass(MinecraftForge registry) {
        registry.setToolClass(tutorialaxe, "axe", 4);
        registry.setToolClass(tutorialhoe, "hoe", 4);
        registry.setToolClass(tutorialshovel, "shovel", 4);
        registry.setToolClass(tutorialsword, "sword", 4);
        registry.setToolClass(tutorialpickaxe, "pickaxe", 4);
    }

}
