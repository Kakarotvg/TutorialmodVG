package kakarotvg.common.tutorial.proxys;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    // registers renderers
    @Override
    public void registerRenders() {

    }

    // registers render information
    @Override
    public void registerRenderInformation() {

    }

    // renders things
    public void registerRenderThings() {

    }

    // adds the armor as an armor
    @Override
    public int addArmor(String armor) {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }

}
