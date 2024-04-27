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
