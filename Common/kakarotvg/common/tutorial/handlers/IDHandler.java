package kakarotvg.common.tutorial.handlers;

import net.minecraftforge.common.Configuration;

public class IDHandler {

    // config categories
    public static String blockids = "Block IDs";
    public static String itemids = "Item IDs";
    public static String toolids = "Tool IDs";
    public static String armorids = "Armor IDs";
    public static String liquidids = "Liquid IDs";
    public static String cropids = "Crop IDs";

    // block ids
    public static int tutorialblockID;
    public static int tutorialblock2ID;
    public static int animatedblockID;

    // item ids
    public static int tutorialitemID;
    public static int tutorialingotID;

    // toold ids
    public static int tutorialaxeID;
    public static int tutorialhoeID;
    public static int tutorialshovelID;
    public static int tutorialswordID;
    public static int tutorialpickaxeID;

    // armor ids
    public static int tutorialhelmID;
    public static int tutorialplateID;
    public static int tutoriallegsID;
    public static int tutorialbootsID;

    // liquid ids
    public static int blocktutorialfluidID;
    public static int tutorialbucketID;

    // crop ids
    public static int tutorialcropID;
    public static int tutorialseedsID;
    public static int tutorialfoodID;

    // the ids that will appear in the config file and are used by everything
    // that uses ids
    public static void createConfigfile(Configuration config) {
        // block ids
        tutorialblockID = config.get(blockids, "Tutorial Block", 3300).getInt();
        tutorialblock2ID = config.get(blockids, "Tutorial Block 2", 3301).getInt();
        animatedblockID = config.get(blockids, "Animated Block", 3302).getInt();
        // item ids
        tutorialitemID = config.get(itemids, "Tutorial Item", 24000).getInt();
        tutorialingotID = config.get(itemids, "Tutorial Ingot", 24001).getInt();
        // tool ids
        tutorialaxeID = config.get(toolids, "Tutorial Axe", 24100).getInt();
        tutorialhoeID = config.get(toolids, "Tutorial Hoe", 24101).getInt();
        tutorialshovelID = config.get(toolids, "Tutorial Shovel", 24102).getInt();
        tutorialswordID = config.get(toolids, "Tutorial Sword", 24103).getInt();
        tutorialpickaxeID = config.get(toolids, "Tutorial Pickaxe", 24104).getInt();
        // armor ids
        tutorialhelmID = config.get(armorids, "Tutorial Helmet", 24200).getInt();
        tutorialplateID = config.get(armorids, "Tutorial Chestplate", 24201).getInt();
        tutoriallegsID = config.get(armorids, "Tutorial Leggings", 24202).getInt();
        tutorialbootsID = config.get(armorids, "Tutorial Boots", 24203).getInt();
        // liquid ids
        blocktutorialfluidID = config.get(liquidids, "Tutorial Fluid", 3350).getInt();
        tutorialbucketID = config.get(liquidids, "Tutorial BUcket", 24250).getInt();
        // crop ids
        tutorialcropID = config.get(cropids, "Tutorial Crop", 3360).getInt();
        tutorialseedsID = config.get(cropids, "Tutorial Seeds", 24300).getInt();
        tutorialfoodID = config.get(cropids, "Tutorial Food", 24301).getInt();

    }

}
