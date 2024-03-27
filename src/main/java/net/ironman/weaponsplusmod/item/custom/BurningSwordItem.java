package net.ironman.weaponsplusmod.item.custom;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class BurningSwordItem extends SwordItem {
    public BurningSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if(entity instanceof LivingEntity livingEntity) {
            livingEntity.setSecondsOnFire(30);
            spawnFireParticles(entity.level(), entity.getX(), entity.getY(), entity.getZ());
        }

        return super.onLeftClickEntity(stack, player, entity);
    }

   private void spawnFireParticles(Level world, double x, double y, double z) {
       for (int i = 0; i < 5; i++) {
           double offsetX = world.random.nextGaussian() * 0.02D;
           double offsetY = world.random.nextGaussian() * 0.02D;
           double offsetZ = world.random.nextGaussian() * 0.02D;
           world.addParticle(ParticleTypes.FLAME, x + world.random.nextFloat(), y + world.random.nextFloat() * 0.5, z + world.random.nextFloat(), offsetX, offsetY, offsetZ);
       }
   }
}