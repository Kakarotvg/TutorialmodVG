package kakarotvg.common.tutorial.blocks;

import java.util.List;

import kakarotvg.common.tutorial.info.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MetaBlock extends Block {

    public MetaBlock(int id, Material material) {
        super(id, material);
    }

    @Override
    public int damageDropped(int par1) {
        return par1;
    }

    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        icons = new Icon[16];

        for (int i = 0; i < icons.length; i++) {
            icons[i] = register.registerIcon(Reference.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int par1, int par2) {
        return icons[par2];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(int par1, CreativeTabs tab, List list) {
        for (int i = 0; i < 16; i++) {
            list.add(new ItemStack(par1, 1, i));
        }
    }

}
