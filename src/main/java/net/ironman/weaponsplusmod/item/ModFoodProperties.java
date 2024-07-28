package net.ironman.weaponsplusmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties HELL_APPLE = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE,200),1f).build();
    public static final FoodProperties AQUA_APPLE = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.CONDUIT_POWER, 200),1f).build();
    public static final FoodProperties ENDERIUM_APPLE = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 200),1f).build();
    public static final FoodProperties AMBER_APPLE = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 400),1f).build();
    public static final FoodProperties ELECTRUM_APPLE = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 200),1f).build();
}
