package me.coopersully.Cursecraft.registry.Enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public class SafetyEnchantment extends Enchantment {

    public SafetyEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot[] equipmentSlots) {
        super(weight, target, equipmentSlots);
    }

    @Override
    public int getMinPower(int level) {
        return 100;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {

        if (target instanceof LivingEntity) {
            target.kill();
        }

    }

}