package net.ironman.weaponsplusmod.datagen.loot;

import net.ironman.weaponsplusmod.block.ModBlocks;
import net.ironman.weaponsplusmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.HELL_GEM_BLOCK.get());
        this.dropSelf(ModBlocks.AQUA_BLOCK.get());
        this.dropSelf(ModBlocks.ENDERITE_BLOCK.get());
        this.dropSelf(ModBlocks.AMBER_BLOCK.get());

        this.add(ModBlocks.NETHER_HELL_ORE.get(),
                block -> createOreDrop(ModBlocks.NETHER_HELL_ORE.get(), ModItems.HELL_GEM.get()));
        this.add(ModBlocks.AQUA_ORE.get(),
                block -> createOreDrop(ModBlocks.AQUA_ORE.get(), ModItems.AQUA_PEARL.get()));
        this.add(ModBlocks.DEEPSLATE_AQUA_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_AQUA_ORE.get(), ModItems.AQUA_PEARL.get()));
        this.add(ModBlocks.ENDERITE_ORE.get(),
                block -> createOreDrop(ModBlocks.ENDERITE_ORE.get(), ModItems.ENDERITE_INGOT.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
