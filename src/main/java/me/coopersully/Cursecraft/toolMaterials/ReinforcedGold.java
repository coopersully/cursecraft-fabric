package me.coopersully.Cursecraft.toolMaterials;

import me.coopersully.Cursecraft.registry.ccItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ReinforcedGold implements ToolMaterial {

    public static final ReinforcedGold TOOL_MATERIAL = new ReinforcedGold();

    @Override
    public int getDurability() {
        return 282;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0f;
    }

    @Override
    public float getAttackDamage() {
        return 0.0f;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ccItems.REINFORCED_GOLD_INGOT);
    }

}