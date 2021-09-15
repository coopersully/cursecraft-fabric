package me.coopersully.Cursecraft.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class SiphoningEnchantment extends Enchantment {

    public SiphoningEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot[] equipmentSlots) {
        super(weight, target, equipmentSlots);
    }

    @Override
    public int getMinPower(int level) {
        return 15;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return true;
    }

}
