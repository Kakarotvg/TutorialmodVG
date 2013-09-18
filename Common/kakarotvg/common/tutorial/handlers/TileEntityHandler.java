package kakarotvg.common.tutorial.handlers;

import kakarotvg.common.tutorial.blocks.TutorialChest;
import kakarotvg.common.tutorial.entity.tileentity.TileEntityTutorialBlockEntity;
import kakarotvg.common.tutorial.tileentity.TileEntityTutorialChest;
import kakarotvg.common.tutorial.tileentity.tileentitytutorialblock.TileEntityTutorialBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TileEntityHandler {

    public static Block tiletutorialblock;
    public static Block tutorialchest;

    public static void ConfigureTiles(Configuration config) {
        tiletutorialblock = new TileEntityTutorialBlock(IDHandler.tiletutorialblockID, Material.rock, false).setUnlocalizedName("tiletutorialblock").setCreativeTab(CreativeTabHandler.ttab);
        tutorialchest = new TutorialChest(IDHandler.tutorialchestID, 0).setUnlocalizedName("tutorialchest").setCreativeTab(CreativeTabHandler.ttab);
    }

    public static void registerTileEntitys(GameRegistry registry) {
        registry.registerBlock(tiletutorialblock, "tiletutorialblock");
        registry.registerBlock(tutorialchest, "tutorialchest");
    }

    public static void addNames(LanguageRegistry registry) {
        registry.addName(tiletutorialblock, "Tile Tutorial Block");
        registry.addName(tutorialchest, "Tutorial Chest");
    }

    public static void tileentityRegistry(GameRegistry registry) {
        registry.registerTileEntity(TileEntityTutorialBlockEntity.class, "TileEntityTutorialBlock");
        registry.registerTileEntity(TileEntityTutorialChest.class, "TileEntityTutorialChest");
    }

}
