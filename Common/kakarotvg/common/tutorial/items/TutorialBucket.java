package kakarotvg.common.tutorial.items;

import kakarotvg.common.tutorial.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBucket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TutorialBucket extends ItemBucket {

    public TutorialBucket(int id, int par1) {
        super(id, par1);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        this.itemIcon = register.registerIcon(Reference.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
}
