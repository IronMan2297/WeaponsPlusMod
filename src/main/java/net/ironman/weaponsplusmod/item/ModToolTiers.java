package net.ironman.weaponsplusmod.item;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.ironman.weaponsplusmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier HELL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2300, 8.5f, 3f, 24,
                    ModTags.Blocks.NEEDS_HELL_TOOL, () -> Ingredient.of(ModItems.HELL_GEM.get())),
            new ResourceLocation(WeaponsPlusMod.MOD_ID, "hell"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier AQUA = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1500, 8.5f, 3f, 31,
                    ModTags.Blocks.NEEDS_AQUA_TOOL, () -> Ingredient.of(ModItems.AQUA_PEARL.get())),
            new ResourceLocation(WeaponsPlusMod.MOD_ID, "aqua"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier ENDERITE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 4444, 8.5f, 3f, 44,
                    ModTags.Blocks.NEEDS_ENDERITE_TOOL, () -> Ingredient.of(ModItems.ENDERITE_INGOT.get())),
            new ResourceLocation(WeaponsPlusMod.MOD_ID, "enderite"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier EMERALD = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1234, 8.5f, 3f, 19,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Items.EMERALD)),
            new ResourceLocation(WeaponsPlusMod.MOD_ID, "emerald"), List.of(Tiers.NETHERITE), List.of());
}