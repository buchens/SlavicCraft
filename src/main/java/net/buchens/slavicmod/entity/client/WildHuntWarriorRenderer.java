package net.buchens.slavicmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buchens.slavicmod.SlavicMod;
import net.buchens.slavicmod.entity.custom.WildHuntWarriorEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class WildHuntWarriorRenderer extends GeoEntityRenderer<WildHuntWarriorEntity> {
    public WildHuntWarriorRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WildHuntWarriorModel());
        this.shadowRadius = 2f;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull WildHuntWarriorEntity instance) {
        return new ResourceLocation(SlavicMod.MOD_ID, "textures/entity/wildhunt_warrior.png");
    }

    @Override
    public RenderType getRenderType(WildHuntWarriorEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(2.5f, 2.5f, 2.5f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}