package me.coopersully.Cursecraft.registry;

import me.coopersully.Cursecraft.Main;
import me.coopersully.Cursecraft.enchantments.SafetyEnchantment;
import me.coopersully.Cursecraft.enchantments.SiphoningEnchantment;
import me.coopersully.Cursecraft.enchantments.infused.PoisonEnchantment;
import me.coopersully.Cursecraft.enchantments.infused.SlownessEnchantment;
import me.coopersully.Cursecraft.enchantments.infused.WeaknessEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ccEnchantments {

    public static EquipmentSlot[] mainhand = new EquipmentSlot[] {
            EquipmentSlot.MAINHAND
    };

    public static final Enchantment SiphoningEnchantment = new SiphoningEnchantment(
            Enchantment.Rarity.RARE,
            EnchantmentTarget.WEAPON,
            mainhand
    );

    public static final Enchantment SafetyEnchantment = new SafetyEnchantment(
            Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON,
            mainhand
    );

    public static final Enchantment InfusedSlowness = new SlownessEnchantment(
            Enchantment.Rarity.RARE,
            EnchantmentTarget.WEAPON,
            mainhand
    );

    public static final Enchantment InfusedPoison = new PoisonEnchantment(
            Enchantment.Rarity.RARE,
            EnchantmentTarget.WEAPON,
            mainhand
    );

    public static final Enchantment InfusedWeakness = new WeaknessEnchantment(
            Enchantment.Rarity.RARE,
            EnchantmentTarget.WEAPON,
            mainhand
    );

    public static void register() {

        // Enchantments
        Registry.register(Registry.ENCHANTMENT, new Identifier(Main.MOD_ID, "siphoning"), SiphoningEnchantment);
        Registry.register(Registry.ENCHANTMENT, new Identifier(Main.MOD_ID, "safety"), SafetyEnchantment);

        // Infusion Enchantments
        Registry.register(Registry.ENCHANTMENT, new Identifier(Main.MOD_ID, "infused_slowness"), InfusedSlowness);
        Registry.register(Registry.ENCHANTMENT, new Identifier(Main.MOD_ID, "infused_poison"), InfusedPoison);
        Registry.register(Registry.ENCHANTMENT, new Identifier(Main.MOD_ID, "infused_weakness"), InfusedWeakness);

    }
}
