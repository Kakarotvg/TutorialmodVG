package kakarotvg.common.tutorial;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = TutorialModInfo.ID, name = TutorialModInfo.MOD_N, version = TutorialModInfo.MOD_V)
@NetworkMod(serverSideRequired = false, clientSideRequired = true)
public class VgTutorial {

    @Instance(TutorialModInfo.MOD_N)
    public static VgTutorial instance;

    @SidedProxy(clientSide = "kakarotvg.common.tutorial.client.ClientProxy", serverSide = "kakarotvg.common.tutorial.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        config.save();

        proxy.init();
    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
