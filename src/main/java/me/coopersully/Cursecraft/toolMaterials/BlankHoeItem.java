package me.coopersully.Cursecraft.toolMaterials;

import me.coopersully.Cursecraft.registry.ccItems;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class BlankHoeItem extends HoeItem {

    public BlankHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(LimbonicToolMaterial.TOOL_MATERIAL, 0, 0.0F, new Settings().group(ccItems.CURSECRAFT));
    }
}
