package me.coopersully.Cursecraft.registry;

import me.coopersully.Cursecraft.Main;
import me.coopersully.Cursecraft.registry.StatusEffects.DetachedStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ccStatusEffects {

    public static final StatusEffect DETACHED = new DetachedStatusEffect();

    public static void register() {

        Registry.register(Registry.STATUS_EFFECT, new Identifier(Main.MOD_ID, "detached"), DETACHED);

    }

}
