package kakarotvg.common.tutorial.events;

import kakarotvg.common.tutorial.handlers.IDHandler;
import kakarotvg.common.tutorial.handlers.LiquidHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class Tutorialbucketevent {

    // Gets the result of the bucket being used on your custom liquid
    @ForgeSubscribe
    public void onBucketFill(FillBucketEvent event) {

        ItemStack result = fillBucket(event.world, event.target);

        if (result == null) return;

        event.result = result;
        event.setResult(Result.ALLOW);

    }

    // determines what the bucket will pick up and return when being used on the
    // custom liquid
    public ItemStack fillBucket(World world, MovingObjectPosition pos) {
        int blockID = world.getBlockId(pos.blockX, pos.blockY, pos.blockZ);

        if ((blockID == IDHandler.blocktutorialfluidID) && world.getBlockMetadata(pos.blockX, pos.blockY, pos.blockZ) == 0) {
            world.setBlock(pos.blockX, pos.blockY, pos.blockZ, 0);
            return new ItemStack(LiquidHandler.tutorialbucket);
        } else
            return null;
    }
}
