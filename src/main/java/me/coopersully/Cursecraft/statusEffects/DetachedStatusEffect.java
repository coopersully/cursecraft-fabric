package me.coopersully.Cursecraft.statusEffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Objects;

public class DetachedStatusEffect extends StatusEffect {

    public DetachedStatusEffect() {
        super(StatusEffectType.NEUTRAL, 0xF3F2ED);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if (entity instanceof PlayerEntity) {

            entity.setInvisible(false);

            entity.setInvulnerable(false);

            Objects.requireNonNull(entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED)).setBaseValue(0.1f);

        }
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if (entity instanceof PlayerEntity) {

            entity.setInvisible(true);

            entity.setInvulnerable(true);

            entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).setBaseValue(0.0);

        }
    }

}
