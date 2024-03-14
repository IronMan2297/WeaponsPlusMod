package net.ironman.weaponsplusmod.item;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.ironman.weaponsplusmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier HELL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2300, 1.6f, 3f, 24,
                    ModTags.Blocks.NEEDS_HELL_TOOL, () -> Ingredient.of(ModItems.HELL_GEM.get())),
            new ResourceLocation(WeaponsPlusMod.MOD_ID, "alexandrite"), List.of(Tiers.NETHERITE), List.of());
}