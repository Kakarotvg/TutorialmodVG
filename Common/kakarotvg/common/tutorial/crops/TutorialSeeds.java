package kakarotvg.common.tutorial.crops;

import kakarotvg.common.tutorial.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TutorialSeeds extends ItemFood implements IPlantable {

    private int cropId;

    private int soilId;

    // super constructor
    public TutorialSeeds(int id, int foodregen, float saturation, int cropid, int soilid) {
        super(id, foodregen, saturation, false);

        this.cropId = cropid;
        this.soilId = soilid;
    }

    // when the player right clicks with the Item
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3world, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
        if (par7 != 1) {
            return false;
        } else if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack)) {
            int i1 = par3world.getBlockId(par4, par5, par6);
            Block soil = Block.blocksList[i1];

            if (soil != null && soil.canSustainPlant(par3world, par4, par5, par6, ForgeDirection.UP, this) && par3world.isAirBlock(par4, par5 + 1, par6)) {
                par3world.setBlock(par4, par5 + 1, par6, this.cropId);
                --par1ItemStack.stackSize;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // gets the enumplant type
    @Override
    public EnumPlantType getPlantType(World world, int x, int y, int z) {
        return EnumPlantType.Crop;
    }

    // gets the plant id
    @Override
    public int getPlantID(World world, int x, int y, int z) {
        return cropId;
    }

    // gets the metadata
    @Override
    public int getPlantMetadata(World world, int x, int y, int z) {
        return 0;
    }

    // registers the icon as the unlocalized name
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        this.itemIcon = register.registerIcon(Reference.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }

}
