package kakarotvg.common.tutorial.gui;

import kakarotvg.common.tutorial.entity.tileentity.TileEntityTutorialBlockEntity;
import kakarotvg.common.tutorial.tileentity.tileentitytutorialblock.ContainerTutorialBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class TutorialGuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileentity = world.getBlockTileEntity(x, y, z);

        if (tileentity instanceof TileEntityTutorialBlockEntity) {
            return new ContainerTutorialBlock(player.inventory, (TileEntityTutorialBlockEntity) tileentity);
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileentity = world.getBlockTileEntity(x, y, z);

        if (tileentity instanceof TileEntityTutorialBlockEntity) {
            return new TutorialBlockGui(player.inventory, (TileEntityTutorialBlockEntity) tileentity);
        }

        return null;
    }

}
