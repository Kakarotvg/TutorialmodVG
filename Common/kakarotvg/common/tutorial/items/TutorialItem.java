package kakarotvg.common.tutorial.items;

import kakarotvg.common.tutorial.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TutorialItem extends Item {

    public TutorialItem(int id) {
        super(id);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconreg) {
        this.itemIcon = iconreg.registerIcon(Reference.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }

}
