package kakarotvg.common.tutorial.fluids;

import kakarotvg.common.tutorial.handlers.liquids.LiquidHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockTutorialFluid extends BlockFluidClassic {

    // super constructor gets the id of the liquid
    public BlockTutorialFluid(int id) {
        // sets the id, the fluid, and the material type
        super(id, LiquidHandler.TutorialFluid, Material.water);
    }

    // gets the texture/icon uses the water texture, not sure how to get custom
    // texture yet
    public Icon getIcon(int side, int meta) {
        return Block.waterMoving.getIcon(side, meta);
    }

    // colors the texture of the fluid to a greenish color
    @Override
    public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z) {
        return 0x007322; // HEX color code
    }

}
