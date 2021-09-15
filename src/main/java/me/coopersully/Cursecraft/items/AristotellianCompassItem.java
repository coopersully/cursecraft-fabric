package me.coopersully.Cursecraft.items;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class AristotellianCompassItem extends Item {

    public AristotellianCompassItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        StatusEffectInstance glowingEffect = new StatusEffectInstance(StatusEffect.byRawId(24), 40, 1, true, false, false);
        PlayerEntity nearestPlayer = user.getEntityWorld().getClosestPlayer(0.0, 0.0, 0.0, 30, false);

        if (nearestPlayer != null) {
            user.playSound(SoundEvents.ENTITY_ENDER_EYE_LAUNCH, 1.0F, 2.0F);
            nearestPlayer.addStatusEffect(glowingEffect);
        }
        else {
            user.playSound(SoundEvents.ENTITY_ENDER_EYE_DEATH, 1.0F, 2.0F);
            user.sendMessage(Text.of("No players found within range."), true);
        }

        return TypedActionResult.success(user.getStackInHand(hand));
    }

}