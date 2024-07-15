package net.ironman.weaponsplusmod.datagen;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.ironman.weaponsplusmod.item.ModItems;
import net.ironman.weaponsplusmod.loot.AddItemModifier;
import net.ironman.weaponsplusmod.loot.AddSusSandItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output) {
        super(output, WeaponsPlusMod.MOD_ID);
    }

    @Override
    protected void start() {

        add("phoenix_feather_from_suspicious_sand", new AddSusSandItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_pyramid")).build() },
                ModItems.PHOENIX_FEATHER.get()));

        add("shard_of_the_ocean_from_suspicious_sand", new AddSusSandItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/ocean_ruin_warm")).build() },
                ModItems.SHARD_OF_THE_OCEAN.get()));

        add("shard_of_the_ocean_from_buried_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/buried_treasure")).build() },
                ModItems.SHARD_OF_THE_OCEAN.get()));

        add("shard_of_the_ocean_from_shipwreck_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build() },
                ModItems.SHARD_OF_THE_OCEAN.get()));

        add("enderite_upgrade_smithing_template_from_end_city_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/end_city_treasure")).build() },
                ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get()));

    }
}
