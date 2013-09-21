package kakarotvg.common.tutorial.render.mobs;

import kakarotvg.common.tutorial.entity.mobs.EntityTutorialAnimal;
import kakarotvg.common.tutorial.info.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderTutorialAnimal extends RenderLiving {

    private static final ResourceLocation resourceloc = new ResourceLocation(Reference.modid + ":" + "textures/mob/TutorialAnimal.png");

    public RenderTutorialAnimal(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation getTutanimalTexture(EntityTutorialAnimal entity) {
        return resourceloc;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return this.getTutanimalTexture((EntityTutorialAnimal) entity);
    }
}
