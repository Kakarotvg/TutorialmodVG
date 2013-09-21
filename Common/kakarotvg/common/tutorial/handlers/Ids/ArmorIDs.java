package kakarotvg.common.tutorial.handlers.Ids;

import net.minecraftforge.common.Configuration;

public class ArmorIDs {

    // config categories
    public static String armorids = "Armor IDs";

    // armor ids
    public static int tutorialhelmID;
    public static int tutorialplateID;
    public static int tutoriallegsID;
    public static int tutorialbootsID;

    // the ids that will appear in the config file and are used by everything
    // that uses ids
    public static void createConfigfile(Configuration config) {
        // armor ids
        tutorialhelmID = config.get(armorids, "Tutorial Helmet", 24200).getInt();
        tutorialplateID = config.get(armorids, "Tutorial Chestplate", 24201).getInt();
        tutoriallegsID = config.get(armorids, "Tutorial Leggings", 24202).getInt();
        tutorialbootsID = config.get(armorids, "Tutorial Boots", 24203).getInt();

    }

}
