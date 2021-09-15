package me.coopersully.Cursecraft.items;

import me.coopersully.Cursecraft.registry.ccItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class WonderBoxItem extends Item {

    public WonderBoxItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.NONE;
    }

    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {

        if (remainingUseTicks % 4 == 0) {
            user.playSound(SoundEvents.BLOCK_WOOL_BREAK, 0.75F, 2.0F);
        }
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {

        if (user instanceof PlayerEntity) {

            Random random = new Random();

            // Limbonic Sword
            ItemStack LIMBONIC_SWORD = new ItemStack(ccItems.LIMBONIC_SWORD);
            LIMBONIC_SWORD.addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier("Attack Damage", ThreadLocalRandom.current().nextDouble(0.0, 7.0), EntityAttributeModifier.Operation.ADDITION), EquipmentSlot.MAINHAND);
            if (random.nextInt(2) == 1)
                LIMBONIC_SWORD.addAttributeModifier(EntityAttributes.GENERIC_LUCK, new EntityAttributeModifier("Luck", ThreadLocalRandom.current().nextDouble(-1.0, 2.0), EntityAttributeModifier.Operation.MULTIPLY_TOTAL), EquipmentSlot.MAINHAND);
            if (random.nextInt(3) == 1)
                LIMBONIC_SWORD.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Max Health", ThreadLocalRandom.current().nextDouble(-4.0, 5.0), EntityAttributeModifier.Operation.ADDITION), EquipmentSlot.MAINHAND);
            if (random.nextInt(5) == 1)
                LIMBONIC_SWORD.addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier("Movement Speed", ThreadLocalRandom.current().nextDouble(-1.0, 2.0), EntityAttributeModifier.Operation.MULTIPLY_TOTAL), EquipmentSlot.MAINHAND);

            // Limbonic Pickaxe
            ItemStack LIMBONIC_PICKAXE = new ItemStack(ccItems.LIMBONIC_PICKAXE);
            LIMBONIC_PICKAXE.addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier("Attack Damage", ThreadLocalRandom.current().nextDouble(0.0, 5.0), EntityAttributeModifier.Operation.ADDITION), EquipmentSlot.MAINHAND);
            if (random.nextInt(2) == 1)
                LIMBONIC_PICKAXE.addAttributeModifier(EntityAttributes.GENERIC_LUCK, new EntityAttributeModifier("Luck", ThreadLocalRandom.current().nextDouble(-1.0, 2.0), EntityAttributeModifier.Operation.MULTIPLY_TOTAL), EquipmentSlot.MAINHAND);
            if (random.nextInt(3) == 1)
                LIMBONIC_PICKAXE.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Max Health", ThreadLocalRandom.current().nextDouble(-4.0, 5.0), EntityAttributeModifier.Operation.ADDITION), EquipmentSlot.MAINHAND);
            if (random.nextInt(5) == 1)
                LIMBONIC_PICKAXE.addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier("Movement Speed", ThreadLocalRandom.current().nextDouble(-1.0, 2.0), EntityAttributeModifier.Operation.MULTIPLY_TOTAL), EquipmentSlot.MAINHAND);

            // Limbonic Axe
            ItemStack LIMBONIC_AXE = new ItemStack(ccItems.LIMBONIC_AXE);
            LIMBONIC_AXE.addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier("Attack Damage", ThreadLocalRandom.current().nextDouble(0.0, 9.0), EntityAttributeModifier.Operation.ADDITION), EquipmentSlot.MAINHAND);
            if (random.nextInt(2) == 1)
                LIMBONIC_AXE.addAttributeModifier(EntityAttributes.GENERIC_LUCK, new EntityAttributeModifier("Luck", ThreadLocalRandom.current().nextDouble(-1.0, 2.0), EntityAttributeModifier.Operation.MULTIPLY_TOTAL), EquipmentSlot.MAINHAND);
            if (random.nextInt(3) == 1)
                LIMBONIC_AXE.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Max Health", ThreadLocalRandom.current().nextDouble(-4.0, 5.0), EntityAttributeModifier.Operation.ADDITION), EquipmentSlot.MAINHAND);
            if (random.nextInt(5) == 1)
                LIMBONIC_AXE.addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier("Movement Speed", ThreadLocalRandom.current().nextDouble(-1.0, 2.0), EntityAttributeModifier.Operation.MULTIPLY_TOTAL), EquipmentSlot.MAINHAND);

            // Limbonic Shovel
            ItemStack LIMBONIC_SHOVEL = new ItemStack(ccItems.LIMBONIC_SHOVEL);
            LIMBONIC_SHOVEL.addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier("Attack Damage", ThreadLocalRandom.current().nextDouble(0.0, 5.0), EntityAttributeModifier.Operation.ADDITION), EquipmentSlot.MAINHAND);
            if (random.nextInt(2) == 1)
                LIMBONIC_SHOVEL.addAttributeModifier(EntityAttributes.GENERIC_LUCK, new EntityAttributeModifier("Luck", ThreadLocalRandom.current().nextDouble(-1.0, 2.0), EntityAttributeModifier.Operation.MULTIPLY_TOTAL), EquipmentSlot.MAINHAND);
            if (random.nextInt(3) == 1)
                LIMBONIC_SHOVEL.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Max Health", ThreadLocalRandom.current().nextDouble(-4.0, 5.0), EntityAttributeModifier.Operation.ADDITION), EquipmentSlot.MAINHAND);
            if (random.nextInt(5) == 1)
                LIMBONIC_SHOVEL.addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier("Movement Speed", ThreadLocalRandom.current().nextDouble(-1.0, 2.0), EntityAttributeModifier.Operation.MULTIPLY_TOTAL), EquipmentSlot.MAINHAND);

            // Limbonic Hoe
            ItemStack LIMBONIC_HOE = new ItemStack(ccItems.LIMBONIC_HOE);
            LIMBONIC_HOE.addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier("Attack Damage", ThreadLocalRandom.current().nextDouble(0.0, 5.0), EntityAttributeModifier.Operation.ADDITION), EquipmentSlot.MAINHAND);
            if (random.nextInt(2) == 1)
                LIMBONIC_HOE.addAttributeModifier(EntityAttributes.GENERIC_LUCK, new EntityAttributeModifier("Luck", ThreadLocalRandom.current().nextDouble(-1.0, 2.0), EntityAttributeModifier.Operation.MULTIPLY_TOTAL), EquipmentSlot.MAINHAND);
            if (random.nextInt(3) == 1)
                LIMBONIC_HOE.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Max Health", ThreadLocalRandom.current().nextDouble(-4.0, 5.0), EntityAttributeModifier.Operation.ADDITION), EquipmentSlot.MAINHAND);
            if (random.nextInt(5) == 1)
                LIMBONIC_HOE.addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier("Movement Speed", ThreadLocalRandom.current().nextDouble(-1.0, 2.0), EntityAttributeModifier.Operation.MULTIPLY_TOTAL), EquipmentSlot.MAINHAND);


            List<ItemStack> itemStackList = new ArrayList<ItemStack>();
            itemStackList.add(LIMBONIC_SWORD);
            itemStackList.add(LIMBONIC_PICKAXE);
            itemStackList.add(LIMBONIC_SHOVEL);
            itemStackList.add(LIMBONIC_AXE);
            itemStackList.add(LIMBONIC_HOE);

            stack.decrement(1);

            ((PlayerEntity) user).giveItemStack(
                    itemStackList.get(random.nextInt(itemStackList.size()))
            );
            user.playSound(SoundEvents.ENTITY_ELDER_GUARDIAN_CURSE, 0.25F, 0.25F);
        }

        return stack;

    }

}