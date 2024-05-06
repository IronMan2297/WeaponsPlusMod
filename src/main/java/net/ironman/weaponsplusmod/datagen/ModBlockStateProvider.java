package net.ironman.weaponsplusmod.datagen;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.ironman.weaponsplusmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, WeaponsPlusMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.NETHER_HELL_ORE);
        blockWithItem(ModBlocks.HELL_GEM_BLOCK);

        blockWithItem(ModBlocks.AQUA_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_AQUA_ORE);
        blockWithItem(ModBlocks.AQUA_BLOCK);

        blockWithItem(ModBlocks.ENDERITE_ORE);
        blockWithItem(ModBlocks.ENDERITE_BLOCK);

        blockWithItem(ModBlocks.AMBER_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
