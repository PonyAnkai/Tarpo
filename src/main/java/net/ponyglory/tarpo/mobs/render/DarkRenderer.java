package net.ponyglory.tarpo.mobs.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.util.ResourceLocation;
import net.ponyglory.tarpo.Tarpo;
import net.ponyglory.tarpo.mobs.custom.DarkEntity;
import net.ponyglory.tarpo.mobs.model.DarkModel;

import javax.swing.text.html.parser.Entity;

public class DarkRenderer extends MobRenderer<DarkEntity, DarkModel<DarkEntity>> {

    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Tarpo.MOD_ID, "textures/entity/mobs/dark_texture.png");

    public DarkRenderer (EntityRendererManager rendererManagerIn) { super(rendererManagerIn, new DarkModel<>(), 0.2f); }

    @Override
    public ResourceLocation getTextureLocation(DarkEntity entity) {
        return TEXTURE;
    }
}
