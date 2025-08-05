package net.ironman.weaponsplusmod.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.List;

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

//    @Override
//    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
//        if (!level.isClientSide) {
//            shootFireWave(level, player);
//        }
//
//        player.getCooldowns().addCooldown(this, 60); // z.B. 3 Sekunden Cooldown
//        return InteractionResultHolder.success(player.getItemInHand(hand));
//    }
//
//    private void shootFireWave(Level level, Player player) {
//        Vec3 lookVec = player.getLookAngle().normalize(); // Blickrichtung
//        Vec3 origin = player.position().add(0, player.getEyeHeight(), 0); // Startpunkt auf Augenhöhe
//
//        // Rechts- und Hoch-Vektor berechnen für Flächenverteilung
//        Vec3 rightVec = lookVec.cross(new Vec3(0, 1, 0)).normalize();
//        Vec3 upVec = rightVec.cross(lookVec).normalize();
//
//        int range = 5; // Reichweite
//        int width = 1;  // seitliche Ausbreitung (z.B. 3 = ca. 7 Blöcke breit)
//
//        for (int i = 1; i <= range; i++) {
//            Vec3 center = origin.add(lookVec.scale(i));
//
//            for (int x = -width; x <= width; x++) {
//                Vec3 offset = rightVec.scale(x);
//                Vec3 posVec = center.add(offset);
//                BlockPos pos = BlockPos.containing(posVec);
//
//                if (level.getBlockState(pos).isAir()) {
//                    level.setBlock(pos, Blocks.FIRE.defaultBlockState(), 3);
//                }
//
//                // Gegner in der Nähe entzünden
//                AABB area = new AABB(pos).inflate(0.5);
//                List<LivingEntity> entities = level.getEntitiesOfClass(LivingEntity.class, area, e -> !e.equals(player));
//
//                for (LivingEntity entity : entities) {
//                    entity.setSecondsOnFire(4);
//                }
//            }
//        }
//    }
}