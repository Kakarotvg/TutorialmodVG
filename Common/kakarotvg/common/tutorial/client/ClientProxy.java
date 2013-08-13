package kakarotvg.common.tutorial.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import kakarotvg.common.tutorial.CommonProxy;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {

    }

    @Override
    public void registerRenderInformation() {

    }

    @Override
    public int addArmor(String armor) {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }

}
