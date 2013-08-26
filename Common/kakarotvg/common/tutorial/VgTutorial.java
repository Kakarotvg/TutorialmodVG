package kakarotvg.common.tutorial;

import kakarotvg.common.tutorial.handlers.ArmorHandler;
import kakarotvg.common.tutorial.handlers.BlockHandler;
import kakarotvg.common.tutorial.handlers.CreativeTabHandler;
import kakarotvg.common.tutorial.handlers.CropHandler;
import kakarotvg.common.tutorial.handlers.IDHandler;
import kakarotvg.common.tutorial.handlers.ItemHandler;
import kakarotvg.common.tutorial.handlers.LiquidHandler;
import kakarotvg.common.tutorial.handlers.RecipeHandler;
import kakarotvg.common.tutorial.handlers.ToolHandler;
import kakarotvg.common.tutorial.handlers.TutorialEventHandler;
import kakarotvg.common.tutorial.proxys.CommonProxy;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = TutorialModInfo.ID, name = TutorialModInfo.MOD_N, version = TutorialModInfo.MOD_V)
@NetworkMod(serverSideRequired = false, clientSideRequired = true)
public class VgTutorial {

    @Instance(TutorialModInfo.ID)
    public static VgTutorial instance;

    @SidedProxy(clientSide = "kakarotvg.common.tutorial.proxys.ClientProxy", serverSide = "kakarotvg.common.tutorial.proxys.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        IDHandler.createConfigfile(config);
        config.save();

        BlockHandler.configureBlocks(config);
        BlockHandler.registerBlocks(new GameRegistry());
        BlockHandler.addNames(new LanguageRegistry());
        BlockHandler.setBlockHarvestLevel(new MinecraftForge());

        ItemHandler.configureItems(config);
        ItemHandler.registerItems(new GameRegistry());
        ItemHandler.addNames(new LanguageRegistry());

        ToolHandler.configureTools(config);
        ToolHandler.registerTools(new GameRegistry());
        ToolHandler.addNames(new LanguageRegistry());
        ToolHandler.setToolClass(new MinecraftForge());

        ArmorHandler.configureArmors(config);
        ArmorHandler.registerArmor(new GameRegistry());
        ArmorHandler.addNames(new LanguageRegistry());

        LiquidHandler.configurefluids(config);
        LiquidHandler.registerfluids(new GameRegistry());
        LiquidHandler.addNAmes(new LanguageRegistry());
        LiquidHandler.fluidContainerRegistry();

        CropHandler.configureCrops(config);
        CropHandler.registerCrops(new GameRegistry());
        CropHandler.addNames(new LanguageRegistry());
        CropHandler.addGrassSeedDrop(new MinecraftForge());

        TutorialEventHandler.registerEvents();

        CreativeTabHandler.setNames(new LanguageRegistry());

        ClassRegistry.classRegistry(new GameRegistry());

        // Recipes need to be on bottom. Otherwise you may get a
        // nullpointerexception!
        RecipeHandler.registerCrafting(new GameRegistry());
        RecipeHandler.registerSmelting(new GameRegistry());

        proxy.init();
    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
