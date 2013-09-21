package kakarotvg.common.tutorial.handlers.Ids;

import net.minecraftforge.common.Configuration;

public class ItemIDs {

    public static String itemids = "Item IDs";
    public static String liquidids = "Liquid IDs";
    public static String cropids = "Crop IDs";

    // item ids
    public static int tutorialitemID;
    public static int tutorialingotID;

    // liquid ids
    public static int tutorialbucketID;

    // crop ids
    public static int tutorialseedsID;
    public static int tutorialfoodID;

    public static void configureItemIDs(Configuration config) {
        // item ids
        tutorialitemID = config.get(itemids, "Tutorial Item", 24000).getInt();
        tutorialingotID = config.get(itemids, "Tutorial Ingot", 24001).getInt();

        // liquid ids
        tutorialbucketID = config.get(liquidids, "Tutorial BUcket", 24002).getInt();

        // crop ids
        tutorialseedsID = config.get(cropids, "Tutorial Seeds", 24003).getInt();
        tutorialfoodID = config.get(cropids, "Tutorial Food", 24004).getInt();
    }

}
