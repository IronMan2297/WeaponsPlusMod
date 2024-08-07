package net.ironman.weaponsplusmod.datagen;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.ironman.weaponsplusmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WeaponsPlusMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RAW_HELL_GEM);
        simpleItem(ModItems.HELL_GEM);
        simpleItem(ModItems.PHOENIX_FEATHER);
        simpleItem(ModItems.EMPOWERED_HELL_GEM);
        simpleItem(ModItems.HELL_CORE);
        simpleItem(ModItems.IRON_ROD);
        simpleItem(ModItems.AQUA_PEARL);
        simpleItem(ModItems.SHARD_OF_THE_OCEAN);
        simpleItem(ModItems.ENDERITE_INGOT);
        simpleItem(ModItems.ENDERITE_SCRAP);
        simpleItem(ModItems.ENDERIUM_INGOT);
        simpleItem(ModItems.AMBER_CRYSTAL);
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.RAW_ELECTRUM);
        simpleItem(ModItems.ELECTRUM_INGOT);
        simpleItem(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE);

       handheldItem(ModItems.WOODEN_MULTITOOL);
       handheldItem(ModItems.STONE_MULTITOOL);
       handheldItem(ModItems.IRON_MULTITOOL);
       handheldItem(ModItems.GOLDEN_MULTITOOL);
       handheldItem(ModItems.DIAMOND_MULTITOOL);
       handheldItem(ModItems.NETHERITE_MULTITOOL);

       handheldItem(ModItems.HELL_SWORD);
       handheldItem(ModItems.HELL_AXE);
       handheldItem(ModItems.HELL_PICKAXE);
       handheldItem(ModItems.HELL_SHOVEL);
       handheldItem(ModItems.HELL_HOE);

       handheldItem(ModItems.HELL_BATTLE_AXE);
       handheldItem(ModItems.HELL_DOUBLE_AXE);
       handheldItem(ModItems.HELL_RAPIER);
       handheldItem(ModItems.HELL_CUTLASS);
       handheldItem(ModItems.HELL_DAGGER);
       handheldItem(ModItems.HELL_KATANA);
       handheldItem(ModItems.HELL_LONGSWORD);
       handheldItem(ModItems.BURNING_SWORD);
       handheldItem(ModItems.HELL_MULTITOOL);

        simpleItem(ModItems.HELL_HELMET);
        simpleItem(ModItems.HELL_CHESTPLATE);
        simpleItem(ModItems.HELL_LEGGINGS);
        simpleItem(ModItems.HELL_BOOTS);

        handheldItem(ModItems.EMERALD_SWORD);
        handheldItem(ModItems.EMERALD_AXE);
        handheldItem(ModItems.EMERALD_PICKAXE);
        handheldItem(ModItems.EMERALD_SHOVEL);
        handheldItem(ModItems.EMERALD_HOE);

        simpleItem(ModItems.EMERALD_MULTITOOL);

        simpleItem(ModItems.EMERALD_HELMET);
        simpleItem(ModItems.EMERALD_CHESTPLATE);
        simpleItem(ModItems.EMERALD_LEGGINGS);
        simpleItem(ModItems.EMERALD_BOOTS);

        handheldItem(ModItems.AQUA_SWORD);
        handheldItem(ModItems.AQUA_AXE);
        handheldItem(ModItems.AQUA_PICKAXE);
        handheldItem(ModItems.AQUA_SHOVEL);
        handheldItem(ModItems.AQUA_HOE);

        handheldItem(ModItems.AQUA_BATTLE_AXE);
        handheldItem(ModItems.AQUA_DOUBLE_AXE);
        handheldItem(ModItems.AQUA_RAPIER);
        handheldItem(ModItems.AQUA_CUTLASS);
        handheldItem(ModItems.AQUA_DAGGER);
        handheldItem(ModItems.AQUA_KATANA);
        handheldItem(ModItems.AQUA_LONGSWORD);
        handheldItem(ModItems.AQUA_MULTITOOL);

        simpleItem(ModItems.AQUA_HELMET);
        simpleItem(ModItems.AQUA_CHESTPLATE);
        simpleItem(ModItems.AQUA_LEGGINGS);
        simpleItem(ModItems.AQUA_BOOTS);

        handheldItem(ModItems.ENDERITE_SWORD);
        handheldItem(ModItems.ENDERITE_AXE);
        handheldItem(ModItems.ENDERITE_PICKAXE);
        handheldItem(ModItems.ENDERITE_SHOVEL);
        handheldItem(ModItems.ENDERITE_HOE);

        handheldItem(ModItems.ENDERITE_BATTLE_AXE);
        handheldItem(ModItems.ENDERITE_DOUBLE_AXE);
        handheldItem(ModItems.ENDERITE_RAPIER);
        handheldItem(ModItems.ENDERITE_CUTLASS);
        handheldItem(ModItems.ENDERITE_DAGGER);
        handheldItem(ModItems.ENDERITE_KATANA);
        handheldItem(ModItems.ENDERITE_LONGSWORD);
        handheldItem(ModItems.ENDERITE_MULTITOOL);

        simpleItem(ModItems.ENDERITE_HELMET);
        simpleItem(ModItems.ENDERITE_CHESTPLATE);
        simpleItem(ModItems.ENDERITE_LEGGINGS);
        simpleItem(ModItems.ENDERITE_BOOTS);

        handheldItem(ModItems.AMBER_SWORD);
        handheldItem(ModItems.AMBER_AXE);
        handheldItem(ModItems.AMBER_PICKAXE);
        handheldItem(ModItems.AMBER_SHOVEL);
        handheldItem(ModItems.AMBER_HOE);

        handheldItem(ModItems.AMBER_BATTLE_AXE);
        handheldItem(ModItems.AMBER_DOUBLE_AXE);
        handheldItem(ModItems.AMBER_RAPIER);
        handheldItem(ModItems.AMBER_CUTLASS);
        handheldItem(ModItems.AMBER_DAGGER);
        handheldItem(ModItems.AMBER_KATANA);
        handheldItem(ModItems.AMBER_LONGSWORD);
        handheldItem(ModItems.AMBER_MULTITOOL);

        simpleItem(ModItems.AMBER_HELMET);
        simpleItem(ModItems.AMBER_CHESTPLATE);
        simpleItem(ModItems.AMBER_LEGGINGS);
        simpleItem(ModItems.AMBER_BOOTS);

        handheldItem(ModItems.ENDERIUM_SWORD);
        handheldItem(ModItems.ENDERIUM_AXE);
        handheldItem(ModItems.ENDERIUM_PICKAXE);
        handheldItem(ModItems.ENDERIUM_SHOVEL);
        handheldItem(ModItems.ENDERIUM_HOE);

        handheldItem(ModItems.ENDERIUM_BATTLE_AXE);
        handheldItem(ModItems.ENDERIUM_DOUBLE_AXE);
        handheldItem(ModItems.ENDERIUM_RAPIER);
        handheldItem(ModItems.ENDERIUM_CUTLASS);
        handheldItem(ModItems.ENDERIUM_DAGGER);
        handheldItem(ModItems.ENDERIUM_KATANA);
        handheldItem(ModItems.ENDERIUM_LONGSWORD);
        handheldItem(ModItems.ENDERIUM_MULTITOOL);

        simpleItem(ModItems.ENDERIUM_HELMET);
        simpleItem(ModItems.ENDERIUM_CHESTPLATE);
        simpleItem(ModItems.ENDERIUM_LEGGINGS);
        simpleItem(ModItems.ENDERIUM_BOOTS);

        handheldItem(ModItems.RUBY_SWORD);
        handheldItem(ModItems.RUBY_AXE);
        handheldItem(ModItems.RUBY_PICKAXE);
        handheldItem(ModItems.RUBY_SHOVEL);
        handheldItem(ModItems.RUBY_HOE);

        handheldItem(ModItems.RUBY_BATTLE_AXE);
        handheldItem(ModItems.RUBY_DOUBLE_AXE);
        handheldItem(ModItems.RUBY_RAPIER);
        handheldItem(ModItems.RUBY_CUTLASS);
        handheldItem(ModItems.RUBY_DAGGER);
        handheldItem(ModItems.RUBY_KATANA);
        handheldItem(ModItems.RUBY_LONGSWORD);
        handheldItem(ModItems.RUBY_MULTITOOL);

        simpleItem(ModItems.RUBY_HELMET);
        simpleItem(ModItems.RUBY_CHESTPLATE);
        simpleItem(ModItems.RUBY_LEGGINGS);
        simpleItem(ModItems.RUBY_BOOTS);

        handheldItem(ModItems.ELECTRUM_SWORD);
        handheldItem(ModItems.ELECTRUM_AXE);
        handheldItem(ModItems.ELECTRUM_PICKAXE);
        handheldItem(ModItems.ELECTRUM_SHOVEL);
        handheldItem(ModItems.ELECTRUM_HOE);

        handheldItem(ModItems.ELECTRUM_BATTLE_AXE);
        handheldItem(ModItems.ELECTRUM_DOUBLE_AXE);
        handheldItem(ModItems.ELECTRUM_RAPIER);
        handheldItem(ModItems.ELECTRUM_CUTLASS);
        handheldItem(ModItems.ELECTRUM_DAGGER);
        handheldItem(ModItems.ELECTRUM_KATANA);
        handheldItem(ModItems.ELECTRUM_LONGSWORD);
        handheldItem(ModItems.ELECTRUM_MULTITOOL);

        simpleItem(ModItems.ELECTRUM_HELMET);
        simpleItem(ModItems.ELECTRUM_CHESTPLATE);
        simpleItem(ModItems.ELECTRUM_LEGGINGS);
        simpleItem(ModItems.ELECTRUM_BOOTS);

        simpleItem(ModItems.HELL_APPLE);
        simpleItem(ModItems.AQUA_APPLE);
        simpleItem(ModItems.ENDERIUM_APPLE);
        simpleItem(ModItems.AMBER_APPLE);
        simpleItem(ModItems.ELECTRUM_APPLE);

        handheldItem(ModItems.STONE_BATTLE_AXE);
        handheldItem(ModItems.STONE_DOUBLE_AXE);
        handheldItem(ModItems.STONE_RAPIER);
        handheldItem(ModItems.STONE_CUTLASS);
        handheldItem(ModItems.STONE_DAGGER);
        handheldItem(ModItems.STONE_KATANA);
        handheldItem(ModItems.STONE_LONGSWORD);

        handheldItem(ModItems.IRON_BATTLE_AXE);
        handheldItem(ModItems.IRON_DOUBLE_AXE);
        handheldItem(ModItems.IRON_RAPIER);
        handheldItem(ModItems.IRON_CUTLASS);
        handheldItem(ModItems.IRON_DAGGER);
        handheldItem(ModItems.IRON_KATANA);
        handheldItem(ModItems.IRON_LONGSWORD);

        handheldItem(ModItems.GOLDEN_BATTLE_AXE);
        handheldItem(ModItems.GOLDEN_DOUBLE_AXE);
        handheldItem(ModItems.GOLDEN_RAPIER);
        handheldItem(ModItems.GOLDEN_CUTLASS);
        handheldItem(ModItems.GOLDEN_DAGGER);
        handheldItem(ModItems.GOLDEN_KATANA);
        handheldItem(ModItems.GOLDEN_LONGSWORD);

        handheldItem(ModItems.DIAMOND_BATTLE_AXE);
        handheldItem(ModItems.DIAMOND_DOUBLE_AXE);
        handheldItem(ModItems.DIAMOND_RAPIER);
        handheldItem(ModItems.DIAMOND_CUTLASS);
        handheldItem(ModItems.DIAMOND_DAGGER);
        handheldItem(ModItems.DIAMOND_KATANA);
        handheldItem(ModItems.DIAMOND_LONGSWORD);

        handheldItem(ModItems.NETHERITE_BATTLE_AXE);
        handheldItem(ModItems.NETHERITE_DOUBLE_AXE);
        handheldItem(ModItems.NETHERITE_RAPIER);
        handheldItem(ModItems.NETHERITE_CUTLASS);
        handheldItem(ModItems.NETHERITE_DAGGER);
        handheldItem(ModItems.NETHERITE_KATANA);
        handheldItem(ModItems.NETHERITE_LONGSWORD);

        handheldItem(ModItems.EMERALD_BATTLE_AXE);
        handheldItem(ModItems.EMERALD_DOUBLE_AXE);
        handheldItem(ModItems.EMERALD_RAPIER);
        handheldItem(ModItems.EMERALD_CUTLASS);
        handheldItem(ModItems.EMERALD_DAGGER);
        handheldItem(ModItems.EMERALD_KATANA);
        handheldItem(ModItems.EMERALD_LONGSWORD);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(WeaponsPlusMod.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(WeaponsPlusMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
