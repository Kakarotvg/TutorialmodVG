package kakarotvg.common.tutorial.handlers;

import kakarotvg.common.tutorial.blocks.ItemTutorialBlock;
import kakarotvg.common.tutorial.blocks.MetaBlock;
import kakarotvg.common.tutorial.blocks.TutorialBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHandler {

    // blocks
    public static Block tutorialblock;
    public static Block tutorialblock2;
    public static Block animatedblock;

    // registers the block ids, texturs, resistance, and their hardness
    public static void configureBlocks(Configuration config) {
        tutorialblock = new MetaBlock(IDHandler.tutorialblockID, Material.iron).setUnlocalizedName("tutorialblock").setCreativeTab(CreativeTabHandler.ttab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        animatedblock = new TutorialBlock(IDHandler.animatedblockID, Material.wood).setUnlocalizedName("animatedblock").setCreativeTab(CreativeTabHandler.ttab).setStepSound(Block.soundClothFootstep).setHardness(1.0F).setResistance(4.0F);
    }

    // registers the blocks as blocks
    public static void registerBlocks(GameRegistry registry) {
        registry.registerBlock(tutorialblock, ItemTutorialBlock.class, "tutorialblock");
        registry.registerBlock(animatedblock, "animatedblock");
    }

    private static final String[] multiBlockNames = { "Tutorial Block", "Tutorial Block 2", "Tutorial Block 3", "Tutorial Block 4", "Tutorial Block 5", "Tutorial Block 6", "Tutorial Block 7", "Tutorial Block 8", "Tutorial Block 9", "Tutorial Block 10", "Tutorial Block 11", "Tutorial Block 12", "Tutorial Block 13", "Tutorial Block 14", "Tutorial Block 15", "Tutorial Block 16" };

    // registers the names of teh blocks
    public static void addNames(LanguageRegistry registry) {
        for (int ix = 0; ix < 16; ix++) {
            ItemStack multiBlockStack = new ItemStack(tutorialblock, 1, ix);

            LanguageRegistry.addName(multiBlockStack, multiBlockNames[multiBlockStack.getItemDamage()]);
        }

        // normal block
        registry.addName(animatedblock, "Animated Block");
    }

    // registers the harvestlevel of each block
    public static void setBlockHarvestLevel(MinecraftForge registry) {
        registry.setBlockHarvestLevel(tutorialblock, "pickaxe", 3);
        registry.setBlockHarvestLevel(animatedblock, "pickaxe", 1);
    }

}
