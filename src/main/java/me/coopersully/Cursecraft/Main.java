package me.coopersully.Cursecraft;

import com.mojang.authlib.exceptions.MinecraftClientHttpException;
import me.coopersully.Cursecraft.blocks.AdvancedWorkbench.AdvancedWorkbenchRecipeSerializer;
import me.coopersully.Cursecraft.blocks.AdvancedWorkbench.AdvancedWorkbenchRecipeType;
import me.coopersully.Cursecraft.registry.ccBlocks;
import me.coopersully.Cursecraft.registry.ccItems;
import me.coopersully.Cursecraft.registry.ccStatusEffects;
import me.coopersully.Cursecraft.registry.ccEnchantments;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

    public static final String MOD_ID = "cc";

    @Override
    public void onInitialize() {

        ccItems.register(); // Register all items added in registry.ccItems
        ccBlocks.register(); // Register all blocks added in registry.ccBlocks
        ccEnchantments.register(); // Register all enchantments added in registry.ccEnchantments
        ccStatusEffects.register(); // Register all enchantments added in registry.ccStatusEffects

        Registry.register(Registry.RECIPE_SERIALIZER, AdvancedWorkbenchRecipeSerializer.ID,
                AdvancedWorkbenchRecipeSerializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(MOD_ID, AdvancedWorkbenchRecipeType.ID), AdvancedWorkbenchRecipeType.INSTANCE);

    }

}