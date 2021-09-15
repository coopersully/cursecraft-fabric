package me.coopersully.Cursecraft.registry.ToolMaterials;

import me.coopersully.Cursecraft.registry.ccItems;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class BlankPickaxeItem extends PickaxeItem {

    public BlankPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(Limbonic.TOOL_MATERIAL, 0, 0.0F, new Settings().group(ccItems.CURSECRAFT));
    }
}