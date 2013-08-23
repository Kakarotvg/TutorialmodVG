package kakarotvg.common.tutorial.handlers;

import kakarotvg.common.tutorial.blocks.TutorialBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHandler {

    // blocks
    public static Block tutorialblock;
    public static Block tutorialblock2;
    public static Block animatedblock;

    public static void configureBlocks(Configuration config) {
        tutorialblock = new TutorialBlock(IDHandler.tutorialblockID, Material.iron).setUnlocalizedName("tutorialblock").setCreativeTab(CreativeTabHandler.ttab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        tutorialblock2 = new TutorialBlock(IDHandler.tutorialblock2ID, Material.rock).setUnlocalizedName("tutorialblock2").setCreativeTab(CreativeTabHandler.ttab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        animatedblock = new TutorialBlock(IDHandler.animatedblockID, Material.wood).setUnlocalizedName("animatedblock").setCreativeTab(CreativeTabHandler.ttab).setStepSound(Block.soundClothFootstep).setHardness(1.0F).setResistance(4.0F);
    }

    public static void registerBlocks(GameRegistry registry) {
        registry.registerBlock(tutorialblock, "tutorialblock");
        registry.registerBlock(tutorialblock2, "tutorialblock2");
        registry.registerBlock(animatedblock, "animatedblock");
    }

    public static void addNames(LanguageRegistry registry) {
        registry.addName(tutorialblock, "Tutorial Block");
        registry.addName(tutorialblock2, "Tutorial Block 2");
        registry.addName(animatedblock, "Animated Block");
    }

    public static void setBlockHarvestLevel(MinecraftForge registry) {
        registry.setBlockHarvestLevel(tutorialblock, "pickaxe", 3);
        registry.setBlockHarvestLevel(tutorialblock2, "pickaxe", 2);
        registry.setBlockHarvestLevel(animatedblock, "pickaxe", 1);
    }

}
