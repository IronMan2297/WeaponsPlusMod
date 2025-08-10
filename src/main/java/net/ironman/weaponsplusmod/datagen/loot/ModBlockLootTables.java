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
        this.dropSelf(ModBlocks.HELL_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_HELL_BLOCK.get());
        this.dropSelf(ModBlocks.AQUA_BLOCK.get());
        this.dropSelf(ModBlocks.ENDERITE_BLOCK.get());
        this.dropSelf(ModBlocks.ENDERIUM_BLOCK.get());
        this.dropSelf(ModBlocks.AMBER_BLOCK.get());
        this.dropSelf(ModBlocks.RUBY_BLOCK.get());
        this.dropSelf(ModBlocks.ELECTRUM_BLOCK.get());

        this.add(ModBlocks.NETHER_HELL_ORE.get(),
                block -> createOreDrop(ModBlocks.NETHER_HELL_ORE.get(), ModItems.HELL_GEM.get()));
        this.add(ModBlocks.AQUA_ORE.get(),
                block -> createOreDrop(ModBlocks.AQUA_ORE.get(), ModItems.AQUA_PEARL.get()));
        this.add(ModBlocks.DEEPSLATE_AQUA_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_AQUA_ORE.get(), ModItems.AQUA_PEARL.get()));
         this.add(ModBlocks.ANCIENT_ENDERITE.get(),
                 block -> createOreDrop(ModBlocks.ANCIENT_ENDERITE.get(), ModItems.ENDERITE_SCRAP.get()));
         this.add(ModBlocks.ENDERIUM_ORE.get(),
                 block -> createOreDrop(ModBlocks.ENDERIUM_ORE.get(), ModItems.ENDERIUM_INGOT.get()));
        this.add(ModBlocks.RUBY_ORE.get(),
                block -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get()));
        this.add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get()));
        this.add(ModBlocks.ELECTRUM_ORE.get(),
                block -> createOreDrop(ModBlocks.ELECTRUM_ORE.get(), ModItems.ELECTRUM_INGOT.get()));
        this.add(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get(), ModItems.ELECTRUM_INGOT.get()));
        this.add(ModBlocks.AMBER_BLOCK.get(),
                block -> createOreDrop(ModBlocks.AMBER_BLOCK.get(), ModItems.AMBER_CRYSTAL.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
