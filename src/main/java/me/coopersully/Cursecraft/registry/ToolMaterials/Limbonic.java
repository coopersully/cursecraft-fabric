package me.coopersully.Cursecraft.registry.ToolMaterials;

import me.coopersully.Cursecraft.registry.ccItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Limbonic implements ToolMaterial {

    public static final Limbonic TOOL_MATERIAL = new Limbonic();

    @Override
    public int getDurability() {
        return 1561;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0f;
    }

    @Override
    public float getAttackDamage() {
        return 0.0f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ccItems.VOIDIAN_ESSENCE);
    }

}