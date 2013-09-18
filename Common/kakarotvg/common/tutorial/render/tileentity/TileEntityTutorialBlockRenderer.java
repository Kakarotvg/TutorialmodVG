package kakarotvg.common.tutorial.render.tileentity;

import kakarotvg.common.tutorial.Reference;
import kakarotvg.common.tutorial.model.tileentity.ModelTutorialBlock;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

public class TileEntityTutorialBlockRenderer extends TileEntitySpecialRenderer {

    // the model of our block
    public final ModelTutorialBlock model;

    // the model texture of our block
    private static final ResourceLocation resourceloc = new ResourceLocation(Reference.modid + ":" + "textures/tileentity/TutorialBlock.png");

    // also gets model of our block
    public TileEntityTutorialBlockRenderer() {
        this.model = new ModelTutorialBlock();
    }

    // renders tileentity in world
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
        // push matrix tells the renderer to start doing something
        GL11.glPushMatrix();
        // this sets the initial location
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        // this rotates your block otherwise will render upside down
        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        rotateBlock(te.worldObj, te.xCoord, te.yCoord, te.zCoord, te.blockType);
        GL11.glPopMatrix();
        GL11.glPopMatrix();

    }

    // rotates block
    private void rotateBlock(World world, int x, int y, int z, Block block) {
        if (world != null) {

            int dir = world.getBlockMetadata(x, y, z);

            GL11.glPushMatrix();
            // this line rotates renderer
            GL11.glRotatef(dir * (90), 0F, 1F, 0F);
            // gets the texture for model
            Minecraft.getMinecraft().renderEngine.func_110577_a(resourceloc);
            // renders the model
            this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

            GL11.glPopMatrix();
        } else {
            GL11.glPushMatrix();

            GL11.glRotatef(-90F, 0F, 1F, 0F);
            Minecraft.getMinecraft().renderEngine.func_110577_a(resourceloc);
            this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

            GL11.glPopMatrix();

        }
    }
}
