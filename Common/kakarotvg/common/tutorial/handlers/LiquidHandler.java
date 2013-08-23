package kakarotvg.common.tutorial.handlers;

import kakarotvg.common.tutorial.fluids.BlockTutorialFluid;
import kakarotvg.common.tutorial.fluids.TutorialFluid;
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

    public static void configurefluids(Configuration config) {
        TutorialFluid = new TutorialFluid("Tutorial");
        TutorialLiquid = new BlockTutorialFluid(IDHandler.blocktutorialfluidID).setUnlocalizedName("tutorialfluid");
        tutorialbucket = new TutorialBucket(IDHandler.tutorialbucketID, LiquidHandler.TutorialLiquid.blockID).setUnlocalizedName("tutorialbucket").setCreativeTab(CreativeTabHandler.ttab);
    }

    public static void registerfluids(GameRegistry registry) {
        registry.registerItem(tutorialbucket, "tutorialbucket");
    }

    public static void addNAmes(LanguageRegistry registry) {
        registry.addName(tutorialbucket, "Tutorial Bucket");
    }

    public static void fluidContainerRegistry() {
        FluidContainerRegistry.registerFluidContainer(LiquidHandler.TutorialFluid, new ItemStack(LiquidHandler.tutorialbucket, 1, 1), new ItemStack(Item.bucketEmpty));
    }

}
