package kakarotvg.common.tutorial.crops;

import java.util.Random;

import kakarotvg.common.tutorial.Reference;
import kakarotvg.common.tutorial.handlers.CropHandler;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TutorialCrop extends BlockCrops {
    @SideOnly(Side.CLIENT)
    private Icon[] iconArray;

    public TutorialCrop(int id) {
        super(id);
    }

    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2) {
        if (par2 < 7) {
            if (par2 == 6) {
                par2 = 5;
            }
            return this.iconArray[par2 >> 1];
        } else {
            return this.iconArray[7];
        }
    }

    protected int getSeedItem() {
        return CropHandler.tutorialseeds.itemID;
    }

    protected int getCropItem() {
        return CropHandler.tutorialfood.itemID;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        this.iconArray = new Icon[8];

        for (int i = 0; i < this.iconArray.length; ++i) {
            this.iconArray[i] = register.registerIcon(Reference.modid + ":" + (this.getUnlocalizedName().substring(5) + i));
        }
    }

}
