package kakarotvg.common.tutorial.entity.mobs;

import kakarotvg.common.tutorial.Reference;
import kakarotvg.common.tutorial.handlers.ItemHandler;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityTutorialAnimal extends EntityAnimal {

    public EntityTutorialAnimal(World par1World) {
        super(par1World);
        this.setSize(0.9F, 0.9F);
        this.getNavigator().setAvoidsWater(false);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWander(this, 0.25D));
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(3, new EntityAILookIdle(this));
        this.tasks.addTask(4, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(5, new EntityAITempt(this, 1.25D, Item.pumpkinPie.itemID, false));
        this.tasks.addTask(6, new EntityAIFollowParent(this, 1.1D));

    }

    public int getMaxHealth() {
        return 40;
    }

    public boolean isAIEnabled() {
        return true;
    }

    protected String getLivingSound() {
        return Reference.modid + ":" + "mob.tutorialanimal.say";
    }

    protected String getHurtSound() {
        return Reference.modid + ":" + "mob.tutorialanimal.hurt";
    }

    protected String getDeathSound() {
        return Reference.modid + ":" + "mob.tutorialanimal.death";
    }

    protected int getDroppedItemId() {
        return ItemHandler.tutorialingot.itemID;
    }

    public EntityTutorialAnimal spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
        return new EntityTutorialAnimal(this.worldObj);
    }

    public boolean isBreedingItem(ItemStack par1ItemStack) {
        return par1ItemStack != null && par1ItemStack.itemID == Item.pumpkinPie.itemID;
    }

    public EntityAgeable createChild(EntityAgeable par1EntityAgeable) {
        return this.spawnBabyAnimal(par1EntityAgeable);
    }

}
