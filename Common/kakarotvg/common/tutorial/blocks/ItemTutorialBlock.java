package kakarotvg.common.tutorial.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemTutorialBlock extends ItemBlock {

    public ItemTutorialBlock(int id) {
        super(id);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        String name = "";
        switch (itemstack.getItemDamage()) {
            case 0: {
                name = "first";
                break;
            }
            case 1: {
                name = "second";
                break;
            }
            case 2: {
                name = "third";
                break;
            }
            case 3: {
                name = "fourth";
                break;
            }
            case 4: {
                name = "fifth";
                break;
            }
            case 5: {
                name = "sixth";
                break;
            }
            case 6: {
                name = "seventh";
                break;
            }
            case 7: {
                name = "eighth";
                break;
            }
            case 8: {
                name = "ninth";
                break;
            }
            case 9: {
                name = "tenth";
                break;
            }
            case 10: {
                name = "eleventh";
                break;
            }
            case 11: {
                name = "twelvth";
                break;
            }
            case 12: {
                name = "thirteenth";
                break;
            }
            case 13: {
                name = "fourteenth";
                break;
            }
            case 14: {
                name = "fifteenth";
                break;
            }
            case 15: {
                name = "sixteenth";
                break;
            }
            default:
                name = "broken";
        }
        return getUnlocalizedName() + "." + name;
    }

    public int getMetadata(int par1) {
        return par1;
    }

}
