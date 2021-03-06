package me.coopersully.Cursecraft.toolMaterials;

import me.coopersully.Cursecraft.registry.ccItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class LimbonicToolMaterial implements ToolMaterial {

    public static final LimbonicToolMaterial TOOL_MATERIAL = new LimbonicToolMaterial();

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