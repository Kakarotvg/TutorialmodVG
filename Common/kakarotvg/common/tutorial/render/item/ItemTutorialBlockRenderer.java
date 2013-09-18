package kakarotvg.common.tutorial.render.item;

import kakarotvg.common.tutorial.entity.tileentity.TileEntityTutorialBlockEntity;
import kakarotvg.common.tutorial.model.tileentity.ModelTutorialBlock;
import kakarotvg.common.tutorial.tileentity.TileEntityTutorialChest;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemTutorialBlockRenderer implements IItemRenderer {

    private ModelTutorialBlock modeltutorialblock;

    public ItemTutorialBlockRenderer() {
        modeltutorialblock = new ModelTutorialBlock();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        TileEntityRenderer.instance.renderTileEntityAt(new TileEntityTutorialBlockEntity(), 0.0D, 0.0D, 0.0D, 0.0F);
    }

}
