package me.coopersully.Cursecraft.mixins;

import me.coopersully.Cursecraft.registry.ccItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Shadow @Final private DefaultedList<ItemStack> equippedArmor;

    @Inject(at = @At("HEAD"), method = "tick")

    // Method runs every in-game tick
    private void tick(CallbackInfo info) {

        metalArmor(); // Metal armor slows players when worn

    }

    public void metalArmor() {
        ItemStack helmetStack = equippedArmor.get(3);
        ItemStack chestplateStack = equippedArmor.get(2);
        ItemStack leggingsStack = equippedArmor.get(1);
        ItemStack bootsStack = equippedArmor.get(0);

        int movementSpeedModifier = 0;

        // Check "helmet" slot for metal armor
        if (helmetStack.getItem().equals(ccItems.METAL_HELMET)) {
            movementSpeedModifier++;
        }

        // Check "chestplate" slot for metal armor
        if (chestplateStack.getItem().equals(ccItems.METAL_CHESTPLATE)) {
            movementSpeedModifier++;
        }

        // Check "leggings" slot for metal armor
        if (leggingsStack.getItem().equals(ccItems.METAL_LEGGINGS)) {
            movementSpeedModifier++;
        }

        // Check "boots" slot for metal armor
        if (bootsStack.getItem().equals(ccItems.METAL_BOOTS)) {
            movementSpeedModifier++;
        }

        // Update player's movement speed if armor is worn
        if (movementSpeedModifier > 0) {
            StatusEffectInstance armorSlowTotal = new StatusEffectInstance(StatusEffect.byRawId(2), 2, movementSpeedModifier, false, false, false);
            ((LivingEntity) (Object) this).addStatusEffect(armorSlowTotal);
        }
    }

}