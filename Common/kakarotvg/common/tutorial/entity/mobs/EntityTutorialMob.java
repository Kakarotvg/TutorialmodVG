package kakarotvg.common.tutorial.entity.mobs;

import kakarotvg.common.tutorial.handlers.items.ItemHandler;
import kakarotvg.common.tutorial.info.Reference;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityTutorialMob extends EntityMob {

    public EntityTutorialMob(World par1World) {
        super(par1World);
        this.setSize(0.9F, 0.9F);
        this.getNavigator().setAvoidsWater(false);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWander(this, 0.25D));
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(3, new EntityAILookIdle(this));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.25D, false));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, EntityVillager.class, 0.25D, true));
        this.targetTasks.addTask(7, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(8, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(9, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.25D);
    }

    public int getAttackStrenth() {
        return 4;
    }

    public static int getArmorValue() {
        return 4;
    }

    public boolean isAIEnabled() {
        return true;
    }

    protected String getLivingSound() {
        return "mob.zombie.say";
    }

    protected String getHurtSound() {
        return "mob.zombie.hurt";
    }

    protected String getDeathSound() {
        return "mob.zombie.death";
    }

    protected int getDroppedItemId() {
        return ItemHandler.tutorialitem.itemID;
    }
}
