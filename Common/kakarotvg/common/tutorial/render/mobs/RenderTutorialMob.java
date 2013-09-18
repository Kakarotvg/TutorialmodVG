package kakarotvg.common.tutorial.render.mobs;

import kakarotvg.common.tutorial.Reference;
import kakarotvg.common.tutorial.entity.mobs.EntityTutorialMob;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderTutorialMob extends RenderLiving {

    private static final ResourceLocation resourceloc = new ResourceLocation(Reference.modid + ":" + "textures/mob/TutorialMob.png");

    public RenderTutorialMob(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation func_110832_a(EntityTutorialMob entity) {
        return resourceloc;
    }

    protected ResourceLocation func_110775_a(Entity entity) {
        return this.func_110832_a((EntityTutorialMob) entity);
    }

}
