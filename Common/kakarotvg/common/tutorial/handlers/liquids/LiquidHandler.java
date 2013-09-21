package kakarotvg.common.tutorial.handlers.liquids;

import kakarotvg.common.tutorial.fluids.BlockTutorialFluid;
import kakarotvg.common.tutorial.fluids.TutorialFluid;
import kakarotvg.common.tutorial.handlers.Ids.BlockIDs;
import kakarotvg.common.tutorial.handlers.Ids.ItemIDs;
import kakarotvg.common.tutorial.handlers.creativetabs.CreativeTabHandler;
import kakarotvg.common.tutorial.items.TutorialBucket;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LiquidHandler {

    // fluids
    public static Fluid TutorialFluid;

    // liquids
    public static Block TutorialLiquid;

    // buckets
    public static Item tutorialbucket;

    // registers the fluid/bucket ids, and textures.
    public static void configurefluids(Configuration config) {
        TutorialFluid = new TutorialFluid("Tutorial");
        TutorialLiquid = new BlockTutorialFluid(BlockIDs.blocktutorialfluidID).setUnlocalizedName("tutorialfluid");
        // registers the bucket id, texture, and the block it places when you
        // right click on the ground.
        tutorialbucket = new TutorialBucket(ItemIDs.tutorialbucketID, LiquidHandler.TutorialLiquid.blockID).setUnlocalizedName("tutorialbucket").setCreativeTab(CreativeTabHandler.ttab);
    }

    // registers the bucket as an item
    // registers tutorial liquid as a block
    public static void registerfluids(GameRegistry registry) {
        registry.registerBlock(TutorialLiquid, "tutorialliquid");
        registry.registerItem(tutorialbucket, "tutorialbucket");
    }

    // registers the names
    public static void addNAmes(LanguageRegistry registry) {
        registry.addName(TutorialLiquid, "Tutorial Liquid");
        registry.addName(tutorialbucket, "Tutorial Bucket");
    }

    // registers the fluidcontainer
    public static void fluidContainerRegistry() {
        FluidContainerRegistry.registerFluidContainer(LiquidHandler.TutorialFluid, new ItemStack(LiquidHandler.tutorialbucket, 1, 1), new ItemStack(Item.bucketEmpty));
    }

}
