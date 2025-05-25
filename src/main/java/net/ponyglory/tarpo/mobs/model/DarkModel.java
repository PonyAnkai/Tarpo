package net.ponyglory.tarpo.mobs.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.ZombieEntity;
import net.ponyglory.tarpo.mobs.custom.DarkEntity;

public class DarkModel<T extends ZombieEntity> extends EntityModel<T> {
    private final ModelRenderer moob;
    private final ModelRenderer noga_pravo;
    private final ModelRenderer noga_prav;
    private final ModelRenderer cube_r1;
    private final ModelRenderer noga_orav2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer noga_levo;
    private final ModelRenderer noga_leva;
    private final ModelRenderer cube_r3;
    private final ModelRenderer noga_leva2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer golova;
    private final ModelRenderer cube_r5;
    private final ModelRenderer ruka_prav;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer ruka_leva;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer telo;
    private final ModelRenderer cube_r10;
    private final ModelRenderer shea;
    private final ModelRenderer cube_r11;

    public DarkModel() {
        texWidth = 32;
        texHeight = 32;

        moob = new ModelRenderer(this);
        moob.setPos(0.0F, 14.0F, -0.3F);


        noga_pravo = new ModelRenderer(this);
        noga_pravo.setPos(-1.2F, 6.1F, -0.2F);
        moob.addChild(noga_pravo);


        noga_prav = new ModelRenderer(this);
        noga_prav.setPos(0.0F, 2.0F, 0.5F);
        noga_pravo.addChild(noga_prav);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.2F, 1.9F, 0.0F);
        noga_prav.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        cube_r1.texOffs(12, 0).addBox(-1.2F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        noga_orav2 = new ModelRenderer(this);
        noga_orav2.setPos(0.0F, -1.6F, 0.0F);
        noga_pravo.addChild(noga_orav2);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.5F);
        noga_orav2.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        cube_r2.texOffs(14, 6).addBox(-1.0F, -1.3F, -1.4F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        noga_levo = new ModelRenderer(this);
        noga_levo.setPos(1.2F, 6.1F, -0.2F);
        moob.addChild(noga_levo);


        noga_leva = new ModelRenderer(this);
        noga_leva.setPos(0.0F, 2.0F, 0.0F);
        noga_levo.addChild(noga_leva);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-0.2F, 1.9F, 0.5F);
        noga_leva.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        cube_r3.texOffs(0, 14).addBox(-0.8F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        noga_leva2 = new ModelRenderer(this);
        noga_leva2.setPos(0.0F, -1.6F, 0.0F);
        noga_levo.addChild(noga_leva2);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(-0.2F, 1.5F, 0.5F);
        noga_leva2.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        cube_r4.texOffs(8, 14).addBox(-0.8F, -2.8F, -1.7F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        golova = new ModelRenderer(this);
        golova.setPos(0.0F, -4.0F, 0.3F);
        moob.addChild(golova);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 1.0F, -1.0F);
        golova.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
        cube_r5.texOffs(2, 10).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);

        ruka_prav = new ModelRenderer(this);
        ruka_prav.setPos(-3.3F, 0.0F, 0.3F);
        moob.addChild(ruka_prav);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(-0.7F, 2.0F, 0.0F);
        ruka_prav.addChild(cube_r6);
        setRotationAngle(cube_r6, -0.0873F, 0.0F, 0.0873F);
        cube_r6.texOffs(8, 19).addBox(-0.4F, -2.0F, -1.3F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(0.3F, -1.0F, 0.0F);
        ruka_prav.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.1745F, 0.0F, 0.0873F);
        cube_r7.texOffs(16, 11).addBox(-1.1F, -2.0F, -1.3F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        ruka_leva = new ModelRenderer(this);
        ruka_leva.setPos(3.0F, -0.5F, 0.3F);
        moob.addChild(ruka_leva);


        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(0.0F, 2.5F, 0.0F);
        ruka_leva.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.0873F, 0.0F, -0.0873F);
        cube_r8.texOffs(0, 20).addBox(-0.6F, -1.8F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(0.0F, 0.5F, 0.0F);
        ruka_leva.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.1745F, 0.0F, -0.0873F);
        cube_r9.texOffs(16, 16).addBox(-0.8F, -3.0F, -1.1F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        telo = new ModelRenderer(this);
        telo.setPos(0.0F, 0.0F, -0.2F);
        moob.addChild(telo);


        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(0.0F, 4.0F, 0.5F);
        telo.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        cube_r10.texOffs(0, 0).addBox(-2.0F, -6.6F, -1.2F, 4.0F, 6.0F, 2.0F, 0.0F, false);

        shea = new ModelRenderer(this);
        shea.setPos(0.0F, -2.9F, -0.4F);
        moob.addChild(shea);


        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(0.0F, 1.9F, 0.7F);
        shea.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        cube_r11.texOffs(20, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        moob.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

}