package kakarotvg.common.tutorial.handlers.Ids;

import net.minecraftforge.common.Configuration;

public class ToolIDs {

    public static String toolids = "Tool IDs";

    // toold ids
    public static int tutorialaxeID;
    public static int tutorialhoeID;
    public static int tutorialshovelID;
    public static int tutorialswordID;
    public static int tutorialpickaxeID;

    public static void configureToolIDs(Configuration config) {
        // tool ids
        tutorialaxeID = config.get(toolids, "Tutorial Axe", 24100).getInt();
        tutorialhoeID = config.get(toolids, "Tutorial Hoe", 24101).getInt();
        tutorialshovelID = config.get(toolids, "Tutorial Shovel", 24102).getInt();
        tutorialswordID = config.get(toolids, "Tutorial Sword", 24103).getInt();
        tutorialpickaxeID = config.get(toolids, "Tutorial Pickaxe", 24104).getInt();
    }

}
