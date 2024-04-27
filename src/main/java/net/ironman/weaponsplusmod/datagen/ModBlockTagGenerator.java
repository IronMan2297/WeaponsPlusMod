package net.ironman.weaponsplusmod.datagen;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.ironman.weaponsplusmod.block.ModBlocks;
import net.ironman.weaponsplusmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, WeaponsPlusMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.HELL_GEM_BLOCK.get(),
                        ModBlocks.NETHER_HELL_ORE.get(),
                        ModBlocks.AQUA_BLOCK.get(),
                        ModBlocks.AQUA_ORE.get(),
                        ModBlocks.DEEPSLATE_AQUA_ORE.get(),
                        ModBlocks.ENDERITE_BLOCK.get(),
                        ModBlocks.ENDERITE_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.AQUA_ORE.get(),
                        ModBlocks.AQUA_BLOCK.get(),
                        ModBlocks.DEEPSLATE_AQUA_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.HELL_GEM_BLOCK.get(),
                        ModBlocks.NETHER_HELL_ORE.get(),
                        ModBlocks.ENDERITE_BLOCK.get(),
                        ModBlocks.ENDERITE_ORE.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}