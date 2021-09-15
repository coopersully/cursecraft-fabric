package me.coopersully.Cursecraft.registry.Item;

import me.coopersully.Cursecraft.registry.ccItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BogieBlaster extends Item {

    public BogieBlaster(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand currentHand) {

        ItemStack AMMUNITION = new ItemStack(ccItems.VOIDIAN_ESSENCE);
        PlayerInventory inv = user.getInventory();

        if (inv.contains(AMMUNITION)) {

            user.playSound(SoundEvents.ENTITY_BLAZE_SHOOT, 1.0F, 1.0F);
            inv.removeOne(AMMUNITION);

            FireballEntity bullet = new FireballEntity(world, user, 0, 0, 0, 5);
            bullet.setProperties(user, user.getPitch(), user.getYaw(), 0.0f, 1.5f, 1.0f);
            bullet.setPos(bullet.getX(), bullet.getY() + 1.5, bullet.getZ());
            bullet.setVelocity(bullet.getVelocity().multiply(3));
            bullet.setItem(new ItemStack(Items.BLACK_CONCRETE));
            world.spawnEntity(bullet);

            user.setVelocity(bullet.getVelocity().multiply(-0.5));

        }
        else {
            user.playSound(SoundEvents.BLOCK_DISPENSER_FAIL, 1.0F, 2.0F);
            user.sendMessage(Text.of("Not enough ammunition."), true);
        }

        return TypedActionResult.success(user.getStackInHand(currentHand));
    }

}