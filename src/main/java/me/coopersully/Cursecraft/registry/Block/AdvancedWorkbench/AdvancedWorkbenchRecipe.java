package me.coopersully.Cursecraft.registry.Block.AdvancedWorkbench;

import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;


public class AdvancedWorkbenchRecipe implements Recipe<CraftingInventory> {

    private final Ingredient inputA;
    private final Ingredient inputB;
    private final ItemStack result;
    private final Identifier id;

    public AdvancedWorkbenchRecipe(Ingredient inputA, Ingredient inputB, ItemStack result, Identifier id) {
        this.inputA = inputA;
        this.inputB = inputB;
        this.result = result;
        this.id = id;
    }

    public Ingredient getInputA() {
        return inputA;
    }

    public Ingredient getInputB() {
        return inputB;
    }

    @Override
    public boolean matches(CraftingInventory inventory, World world) {

        if(inventory.size() < 2) return false;
        return inputA.test(inventory.getStack(0)) && inputB.test(inventory.getStack(1));

    }

    @Override
    public ItemStack craft(CraftingInventory inventory) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean fits(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getOutput() {
        return result;
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return AdvancedWorkbenchRecipeSerializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return AdvancedWorkbenchRecipeType.INSTANCE;
    }

}
