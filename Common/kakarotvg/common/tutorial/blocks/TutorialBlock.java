package kakarotvg.common.tutorial.blocks;

import kakarotvg.common.tutorial.info.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TutorialBlock extends Block {

    public TutorialBlock(int id, Material material) {
        super(id, material);
    }

    // registers the icon/texture of the block, as the unlocalized name

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        this.blockIcon = register.registerIcon(Reference.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }

}
