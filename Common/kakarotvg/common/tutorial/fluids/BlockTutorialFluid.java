package kakarotvg.common.tutorial.fluids;

import kakarotvg.common.tutorial.handlers.LiquidHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockTutorialFluid extends BlockFluidClassic {

    public BlockTutorialFluid(int id) {
        super(id, LiquidHandler.TutorialFluid, Material.water);
    }

    public Icon getIcon(int side, int meta) {
        return Block.waterMoving.getIcon(side, meta);
    }

    @Override
    public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z) {
        return 0x007322; // HEX color code
    }

}
