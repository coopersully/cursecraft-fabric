package me.coopersully.Cursecraft.registry.Block.AdvancedWorkbench;

import net.minecraft.recipe.RecipeType;

public class AdvancedWorkbenchRecipeType implements RecipeType<AdvancedWorkbenchRecipe> {

    private AdvancedWorkbenchRecipeType() {}
    public static final AdvancedWorkbenchRecipeType INSTANCE = new AdvancedWorkbenchRecipeType();
    public static final String ID = "advanced_workbench_recipe";

}
