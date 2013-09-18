package kakarotvg.common.tutorial.proxys;

import kakarotvg.common.tutorial.entity.mobs.EntityTutorialAnimal;
import kakarotvg.common.tutorial.entity.mobs.EntityTutorialMob;
import kakarotvg.common.tutorial.entity.tileentity.TileEntityTutorialBlockEntity;
import kakarotvg.common.tutorial.handlers.TileEntityHandler;
import kakarotvg.common.tutorial.model.mobs.ModelTutorialAnimal;
import kakarotvg.common.tutorial.model.mobs.ModelTutorialMob;
import kakarotvg.common.tutorial.render.item.ItemTutorialBlockRenderer;
import kakarotvg.common.tutorial.render.item.ItemTutorialChestRenderer;
import kakarotvg.common.tutorial.render.mobs.RenderTutorialAnimal;
import kakarotvg.common.tutorial.render.mobs.RenderTutorialMob;
import kakarotvg.common.tutorial.render.tileentity.TileEntityTutorialBlockRenderer;
import kakarotvg.common.tutorial.render.tileentity.TileEntityTutorialChestRenderer;
import kakarotvg.common.tutorial.tileentity.TileEntityTutorialChest;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    // registers renderers
    @Override
    public void registerRenders() {

    }

    // registers render information
    @Override
    public void registerRenderInformation() {
        RenderingRegistry.registerEntityRenderingHandler(EntityTutorialAnimal.class, new RenderTutorialAnimal(new ModelTutorialAnimal(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTutorialMob.class, new RenderTutorialMob(new ModelTutorialMob(), 0.5F));
    }

    // renders things
    public void registerRenderThings() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTutorialBlockEntity.class, new TileEntityTutorialBlockRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTutorialChest.class, new TileEntityTutorialChestRenderer());

        MinecraftForgeClient.registerItemRenderer(TileEntityHandler.tiletutorialblock.blockID, new ItemTutorialBlockRenderer());
        MinecraftForgeClient.registerItemRenderer(TileEntityHandler.tutorialchest.blockID, new ItemTutorialChestRenderer());

    }

    // adds the armor as an armor
    @Override
    public int addArmor(String armor) {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }

}
