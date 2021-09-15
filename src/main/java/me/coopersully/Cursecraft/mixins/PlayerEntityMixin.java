package me.coopersully.Cursecraft.mixins;

import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Timer;
import java.util.TimerTask;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {

    @Inject(at = @At("HEAD"), method = "tick")

    // Method runs every in-game tick
    private void tick(CallbackInfo info) {

        PlayerEntity user = ((PlayerEntity) (Object) this);
        EntityAttributeInstance userMaxHealthInstance = user.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);

        if (user.isDead()) {
            user.addScoreboardTag("cc.dead");
        }

        if (user.isAlive() && user.getScoreboardTags().contains("cc.dead")) {

            respawnHandler(user);
            user.removeScoreboardTag("cc.dead");

        }

        if (user.experienceLevel == 0 && !(user.getScoreboardTags().contains("cc.dead"))) {
            user.kill();
        } else if (user.experienceLevel >= 3) {
            assert userMaxHealthInstance != null;
            userMaxHealthInstance.setBaseValue((user.experienceLevel * 0.0 / 3) * 2);
        }

    }

    public void respawnHandler(PlayerEntity user) {

        user.experienceLevel = 3;
        user.setInvisible(true);
        user.setInvulnerable(true);

        float userSpeed = user.getMovementSpeed();
        user.setMovementSpeed(0.0f);

        user.sendMessage(Text.of("You will respawn momentarily."), true);

        final Timer pause = new Timer();
        pause.schedule(new TimerTask() {
            @Override
            public void run() {
                user.setInvisible(false);
                user.setInvulnerable(false);
                user.setMovementSpeed(userSpeed);
                user.experienceLevel = 3;

                user.sendMessage(Text.of("You awake in the land of the living."), true);
                pause.cancel();
            }
        }, 15000
        );

    }


}