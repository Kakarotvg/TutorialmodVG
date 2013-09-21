package kakarotvg.common.tutorial.armor;

import java.util.List;

import kakarotvg.common.tutorial.info.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TutorialArmor extends ItemArmor {

    String armorfile;

    /*
     * the super constructor, determines what the user needs to put in when
     * calling the class
     */
    public TutorialArmor(int id, EnumArmorMaterial armormaterial, int par3, int par4, String armorfile) {
        super(id, armormaterial, par3, par4);

        this.armorfile = armorfile;
    }

    // gets the texture of the armor when rendering on the player.
    @Override
    @SideOnly(Side.CLIENT)
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
        if (armorfile == null) return null;

        return (Reference.modid + ":" + "textures/armor/" + armorfile + ".png");
    }

    // gets the icon of the armor as the unlocalized name
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        this.itemIcon = register.registerIcon(Reference.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }

    // adds an enchantment to whatever armor calls this class
    @Override
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
        ItemStack is = new ItemStack(par1, 1, 0);

        is.addEnchantment(Enchantment.protection, 5);

        par3List.add(is);
    }

    // changes the color of the armors name.
    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.uncommon;
    }
}
