package kakarotvg.common.tutorial.handlers.Ids;

import net.minecraftforge.common.Configuration;

public class BlockIDs {

    // block ids
    public static int tutorialblockID;
    public static int animatedblockID;

    public static String blockids = "Block IDs";

    public static String liquidids = "Liquid IDs";
    public static String cropids = "Crop IDs";
    public static String tileentityids = "TileEntity IDs";

    // liquid ids
    public static int blocktutorialfluidID;

    // crop ids
    public static int tutorialcropID;

    // tileentityids
    public static int tiletutorialblockID;
    public static int tutorialchestID;

    public static void configureBlockIDs(Configuration config) {
        // block ids
        tutorialblockID = config.get(blockids, "Tutorial Block", 3300).getInt();
        animatedblockID = config.get(blockids, "Animated Block", 3302).getInt();

        // liquid ids
        blocktutorialfluidID = config.get(liquidids, "Tutorial Fluid", 3303).getInt();

        // crop ids
        tutorialcropID = config.get(cropids, "Tutorial Crop", 3304).getInt();

        // tileentity ids
        tiletutorialblockID = config.get(tileentityids, "Tile Entity Tutorial Block", 3305).getInt();
        tutorialchestID = config.get(tileentityids, "Tutorial Chest", 3306).getInt();
    }

}
