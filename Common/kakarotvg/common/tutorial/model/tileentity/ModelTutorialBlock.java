package kakarotvg.common.tutorial.model.tileentity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTutorialBlock extends ModelBase {
    // fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;

    public ModelTutorialBlock() {
        textureWidth = 128;
        textureHeight = 64;

        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(0F, 0F, 0F, 10, 11, 10);
        Shape1.setRotationPoint(-5F, 13F, -5F);
        Shape1.setTextureSize(128, 64);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 45, 0);
        Shape2.addBox(0F, 0F, 0F, 2, 10, 2);
        Shape2.setRotationPoint(-6F, 14F, -6F);
        Shape2.setTextureSize(128, 64);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 45, 0);
        Shape3.addBox(0F, 0F, 0F, 2, 10, 2);
        Shape3.setRotationPoint(-6F, 14F, 4F);
        Shape3.setTextureSize(128, 64);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 45, 0);
        Shape4.addBox(0F, 0F, 0F, 2, 10, 2);
        Shape4.setRotationPoint(4F, 14F, 4F);
        Shape4.setTextureSize(128, 64);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 45, 0);
        Shape5.addBox(0F, 0F, 0F, 2, 10, 2);
        Shape5.setRotationPoint(4F, 14F, -6F);
        Shape5.setTextureSize(128, 64);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 0F, 0F);
        Shape6 = new ModelRenderer(this, 57, 0);
        Shape6.addBox(0F, 0F, 0F, 8, 2, 8);
        Shape6.setRotationPoint(-4F, 13F, -4F);
        Shape6.setTextureSize(128, 64);
        Shape6.mirror = true;
        setRotation(Shape6, 0.1919862F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Shape1.render(f5);
        Shape2.render(f5);
        Shape3.render(f5);
        Shape4.render(f5);
        Shape5.render(f5);
        Shape6.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
