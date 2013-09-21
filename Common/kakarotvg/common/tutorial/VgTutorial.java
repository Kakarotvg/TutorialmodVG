package kakarotvg.common.tutorial;

import kakarotvg.common.tutorial.gui.TutorialGuiHandler;
import kakarotvg.common.tutorial.handlers.Ids.ArmorIDs;
import kakarotvg.common.tutorial.handlers.Ids.BlockIDs;
import kakarotvg.common.tutorial.handlers.Ids.ItemIDs;
import kakarotvg.common.tutorial.handlers.Ids.ToolIDs;
import kakarotvg.common.tutorial.handlers.armor.ArmorHandler;
import kakarotvg.common.tutorial.handlers.blocks.BlockHandler;
import kakarotvg.common.tutorial.handlers.crafting.RecipeHandler;
import kakarotvg.common.tutorial.handlers.creativetabs.CreativeTabHandler;
import kakarotvg.common.tutorial.handlers.crops.CropHandler;
import kakarotvg.common.tutorial.handlers.events.TutorialEventHandler;
import kakarotvg.common.tutorial.handlers.items.ItemHandler;
import kakarotvg.common.tutorial.handlers.liquids.LiquidHandler;
import kakarotvg.common.tutorial.handlers.tileentity.TileEntityHandler;
import kakarotvg.common.tutorial.handlers.tools.ToolHandler;
import kakarotvg.common.tutorial.info.TutorialModInfo;
import kakarotvg.common.tutorial.proxys.CommonProxy;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = TutorialModInfo.ID, name = TutorialModInfo.MOD_N, version = TutorialModInfo.MOD_V)
@NetworkMod(serverSideRequired = false, clientSideRequired = true, channels = TutorialModInfo.MOD_C, packetHandler = TutorialPacketHandler.class)
public class VgTutorial {

    @Instance(TutorialModInfo.ID)
    public static VgTutorial instance;
    private TutorialGuiHandler guihandler = new TutorialGuiHandler();

    @SidedProxy(clientSide = "kakarotvg.common.tutorial.proxys.ClientProxy", serverSide = "kakarotvg.common.tutorial.proxys.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        /*
         * Runs the Configuration file and saves the IDs to the file (file will be named Tutorial_Mod.cfg)
         */
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        ArmorIDs.createConfigfile(config);
        BlockIDs.configureBlockIDs(config);
        ToolIDs.configureToolIDs(config);
        ItemIDs.configureItemIDs(config);
        config.save();
        // everything below must be under the cofig.save otherwise minecraft
        // wont work
        // Calls the blockhandler class, making our block show up in game
        BlockHandler.configureBlocks(config);
        BlockHandler.registerBlocks(new GameRegistry());
        BlockHandler.addNames(new LanguageRegistry());
        BlockHandler.setBlockHarvestLevel(new MinecraftForge());

        // calls the ItemHandler class making our Item show up in game
        ItemHandler.configureItems(config);
        ItemHandler.registerItems(new GameRegistry());
        ItemHandler.addNames(new LanguageRegistry());

        // calls the toolhandler class allowing our tools to show up in game
        ToolHandler.configureTools(config);
        ToolHandler.registerTools(new GameRegistry());
        ToolHandler.addNames(new LanguageRegistry());
        ToolHandler.setToolClass(new MinecraftForge());

        // calls the armorhandler class allowing our armors to show up in game
        ArmorHandler.configureArmors(config);
        ArmorHandler.registerArmor(new GameRegistry());
        ArmorHandler.addNames(new LanguageRegistry());

        // calls the liquidhandler class allowing our fluids to show up in game
        LiquidHandler.configurefluids(config);
        LiquidHandler.registerfluids(new GameRegistry());
        LiquidHandler.addNAmes(new LanguageRegistry());
        LiquidHandler.fluidContainerRegistry();

        // calls the crophandler class allowing our crops to show up in game
        CropHandler.configureCrops(config);
        CropHandler.registerCrops(new GameRegistry());
        CropHandler.addNames(new LanguageRegistry());
        CropHandler.addGrassSeedDrop(new MinecraftForge());

        // calls the tileentityhandler class
        TileEntityHandler.ConfigureTiles(config);
        TileEntityHandler.registerTileEntitys(new GameRegistry());
        TileEntityHandler.addNames(new LanguageRegistry());
        TileEntityHandler.tileentityRegistry(new GameRegistry());

        // calls the eventhandler, allowing an empty bucket to pick up our fluid
        TutorialEventHandler.registerEvents();

        /*
         * calls the creative tab handler allowing our creative tab to have its own custom name
         */
        CreativeTabHandler.setNames(new LanguageRegistry());

        /*
         * calls the classregistry class allowing what ever classes we need to register, to show up in the game...
         */
        ClassRegistry.classRegistry(new GameRegistry());
        NetworkRegistry.instance().registerGuiHandler(this, guihandler);

        /*
         * Recipes need to be on bottom. Otherwise you may get a nullpointerexception! calls the recipehandler allowing for our crafting recipes
         */
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
