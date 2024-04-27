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
        simpleItem(ModItems.HAMMER);

        simpleItem(ModItems.WOODEN_MULTITOOL);
        simpleItem(ModItems.STONE_MULTITOOL);
        simpleItem(ModItems.IRON_MULTITOOL);
        simpleItem(ModItems.GOLDEN_MULTITOOL);
        simpleItem(ModItems.DIAMOND_MULTITOOL);
        simpleItem(ModItems.NETHERITE_MULTITOOL);

        simpleItem(ModItems.HELL_SWORD);
        simpleItem(ModItems.HELL_AXE);
        simpleItem(ModItems.HELL_PICKAXE);
        simpleItem(ModItems.HELL_SHOVEL);
        simpleItem(ModItems.HELL_HOE);

        simpleItem(ModItems.HELL_BATTLE_AXE);
        simpleItem(ModItems.HELL_DOUBLE_AXE);
        simpleItem(ModItems.HELL_RAPIER);
        simpleItem(ModItems.HELL_CUTLASS);
        simpleItem(ModItems.HELL_DAGGER);
        simpleItem(ModItems.HELL_KATANA);
        simpleItem(ModItems.HELL_LONGSWORD);
        simpleItem(ModItems.BURNING_SWORD);
        simpleItem(ModItems.HELL_MULTITOOL);

        simpleItem(ModItems.HELL_HELMET);
        simpleItem(ModItems.HELL_CHESTPLATE);
        simpleItem(ModItems.HELL_LEGGINGS);
        simpleItem(ModItems.HELL_BOOTS);

        simpleItem(ModItems.EMERALD_SWORD);
        simpleItem(ModItems.EMERALD_AXE);
        simpleItem(ModItems.EMERALD_PICKAXE);
        simpleItem(ModItems.EMERALD_SHOVEL);
        simpleItem(ModItems.EMERALD_HOE);

        simpleItem(ModItems.EMERALD_MULTITOOL);

        simpleItem(ModItems.EMERALD_HELMET);
        simpleItem(ModItems.EMERALD_CHESTPLATE);
        simpleItem(ModItems.EMERALD_LEGGINGS);
        simpleItem(ModItems.EMERALD_BOOTS);

        simpleItem(ModItems.AQUA_SWORD);
        simpleItem(ModItems.AQUA_AXE);
        simpleItem(ModItems.AQUA_PICKAXE);
        simpleItem(ModItems.AQUA_SHOVEL);
        simpleItem(ModItems.AQUA_HOE);

        simpleItem(ModItems.AQUA_BATTLE_AXE);
        simpleItem(ModItems.AQUA_DOUBLE_AXE);
        simpleItem(ModItems.AQUA_RAPIER);
        simpleItem(ModItems.AQUA_CUTLASS);
        simpleItem(ModItems.AQUA_DAGGER);
        simpleItem(ModItems.AQUA_KATANA);
        simpleItem(ModItems.AQUA_LONGSWORD);
        simpleItem(ModItems.AQUA_MULTITOOL);

        simpleItem(ModItems.AQUA_HELMET);
        simpleItem(ModItems.AQUA_CHESTPLATE);
        simpleItem(ModItems.AQUA_LEGGINGS);
        simpleItem(ModItems.AQUA_BOOTS);



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
