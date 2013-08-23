package kakarotvg.common.tutorial.proxys;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {

    }

    @Override
    public void registerRenderInformation() {

    }

    public void registerRenderThings() {

    }

    @Override
    public int addArmor(String armor) {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }

}
