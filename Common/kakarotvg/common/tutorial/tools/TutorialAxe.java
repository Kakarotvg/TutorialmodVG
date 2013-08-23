package kakarotvg.common.tutorial.tools;

import kakarotvg.common.tutorial.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class TutorialAxe extends ItemAxe {

    public TutorialAxe(int id, EnumToolMaterial toolmaterial) {
        super(id, toolmaterial);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        this.itemIcon = register.registerIcon(Reference.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }

}
