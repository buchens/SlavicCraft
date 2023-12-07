package net.buchens.slavicmod.item.client;

import net.buchens.slavicmod.item.custom.ReinforcedBoarArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ReinforcedBoarArmorRenderer extends GeoArmorRenderer<ReinforcedBoarArmorItem> {
    public ReinforcedBoarArmorRenderer() {
        super(new ReinforcedBoarArmorModel());
        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
