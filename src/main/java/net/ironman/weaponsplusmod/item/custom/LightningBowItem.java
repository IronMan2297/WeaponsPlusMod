package net.ironman.weaponsplusmod.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;

public class LightningBowItem extends BowItem {
    public LightningBowItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.level().isClientSide) {
            ServerLevel level = (ServerLevel) attacker.level();
            BlockPos position = target.blockPosition();

            EntityType.LIGHTNING_BOLT.spawn(level, null, (Player) null, target.blockPosition(),
                    MobSpawnType.TRIGGERED, true, true);
        }

        return super.hurtEnemy(stack, target, attacker);
    }


}
