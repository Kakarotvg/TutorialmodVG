package kakarotvg.common.tutorial.handlers;

import kakarotvg.common.tutorial.crops.TutorialCrop;
import kakarotvg.common.tutorial.crops.TutorialFood;
import kakarotvg.common.tutorial.crops.TutorialSeeds;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CropHandler {

    public static Block tutorialcrop;
    public static Item tutorialseeds;
    public static Item tutorialfood;

    public static void configureCrops(Configuration config) {
        tutorialcrop = new TutorialCrop(IDHandler.tutorialcropID).setUnlocalizedName("tutorialcrop");
        tutorialseeds = new TutorialSeeds(IDHandler.tutorialseedsID, 4, 0.3F, tutorialcrop.blockID, Block.tilledField.blockID).setUnlocalizedName("tutorialseeds").setCreativeTab(CreativeTabHandler.ttab);
        tutorialfood = new TutorialFood(IDHandler.tutorialfoodID, 5, 0.7F, true).setUnlocalizedName("tutorialfood").setCreativeTab(CreativeTabHandler.ttab);
    }

    public static void registerCrops(GameRegistry registry) {
        registry.registerBlock(tutorialcrop, "tutorialcrop");
        registry.registerItem(tutorialseeds, "tutorialseeds");
        registry.registerItem(tutorialfood, "tutorialfood");

    }

    public static void addGrassSeedDrop(MinecraftForge forge) {
        forge.addGrassSeed(new ItemStack(CropHandler.tutorialseeds), 10);
    }

    public static void addNames(LanguageRegistry registry) {
        registry.addName(tutorialcrop, "Tutorial Crop");
        registry.addName(tutorialseeds, "Tutorial Seeds");
        registry.addName(tutorialfood, "Tutorial Food");
    }
}
