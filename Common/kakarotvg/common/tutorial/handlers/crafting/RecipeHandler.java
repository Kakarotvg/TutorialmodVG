package kakarotvg.common.tutorial.handlers.crafting;

import kakarotvg.common.tutorial.handlers.armor.ArmorHandler;
import kakarotvg.common.tutorial.handlers.blocks.BlockHandler;
import kakarotvg.common.tutorial.handlers.items.ItemHandler;
import kakarotvg.common.tutorial.handlers.tools.ToolHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {

    // creates the recipes for your custom stuff
    public static void registerCrafting(GameRegistry registry) {
        registry.addRecipe(new ItemStack(BlockHandler.tutorialblock, 1), "ttt", "ttt", "ttt", 't', ItemHandler.tutorialitem);
        registry.addRecipe(new ItemStack(ToolHandler.tutorialaxe, 1), "tt ", "ts ", " s ", 't', ItemHandler.tutorialingot, 's', Item.stick);
        registry.addRecipe(new ItemStack(ToolHandler.tutorialhoe, 1), "tt ", " s ", " s ", 't', ItemHandler.tutorialingot, 's', Item.stick);
        registry.addRecipe(new ItemStack(ToolHandler.tutorialshovel, 1), " t ", " s ", " s ", 't', ItemHandler.tutorialingot, 's', Item.stick);
        registry.addRecipe(new ItemStack(ToolHandler.tutorialsword, 1), " t ", " t ", " s ", 't', ItemHandler.tutorialingot, 's', Item.stick);
        registry.addRecipe(new ItemStack(ToolHandler.tutorialpickaxe, 1), "ttt", " s ", " s ", 't', ItemHandler.tutorialingot, 's', Item.stick);
        registry.addRecipe(new ItemStack(ArmorHandler.tutorialhelm, 1), "ttt", "t t", "   ", 't', ItemHandler.tutorialingot);
        registry.addRecipe(new ItemStack(ArmorHandler.tutorialplate, 1), "t t", "ttt", "ttt", 't', ItemHandler.tutorialingot);
        registry.addRecipe(new ItemStack(ArmorHandler.tutoriallegs, 1), "ttt", "t t", "t t", 't', ItemHandler.tutorialingot);
        registry.addRecipe(new ItemStack(ArmorHandler.tutorialboots, 1), "   ", "t t", "t t", 't', ItemHandler.tutorialingot);
        registry.addShapelessRecipe(new ItemStack(ItemHandler.tutorialitem, 5), new Object[] { BlockHandler.tutorialblock });
        registry.addRecipe(new ItemStack(BlockHandler.tutorialblock, 1, 1), "ttt", "tgt", "ttt", 't', ItemHandler.tutorialitem, 'g', Item.ingotGold);
        registry.addShapelessRecipe(new ItemStack(ItemHandler.tutorialitem, 5), new Object[] { new ItemStack(BlockHandler.tutorialblock, 1, 1) });
    }

    // creates the smelting recipes for the ingot
    public static void registerSmelting(GameRegistry registry) {
        registry.addSmelting(BlockHandler.tutorialblock.blockID, new ItemStack(ItemHandler.tutorialingot), 8.0F);
        registry.addSmelting(BlockHandler.animatedblock.blockID, new ItemStack(ItemHandler.tutorialingot), 12.0F);
    }

}
