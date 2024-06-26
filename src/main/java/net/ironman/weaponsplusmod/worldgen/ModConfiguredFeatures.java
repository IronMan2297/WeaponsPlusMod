package net.ironman.weaponsplusmod.worldgen;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.ironman.weaponsplusmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AQUA_ORE_KEY = registerKey("aqua_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ELECTRUM_ORE_KEY = registerKey("electrum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_HELL_ORE_KEY = registerKey("nether_hell_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ENDERITE_ORE_KEY = registerKey("end_enderite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ENDERIUM_ORE_KEY = registerKey("end_enderium_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> AMBER_GEODE_KEY = registerKey("amber_geode");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceabeles = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceabeles = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceabeles = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceabeles = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldAquaOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.AQUA_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.DEEPSLATE_AQUA_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldElectrumOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ELECTRUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.DEEPSLATE_ELECTRUM_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_AQUA_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAquaOres, 9));
        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 9));
        register(context, OVERWORLD_ELECTRUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldElectrumOres, 9));
        register(context, NETHER_HELL_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceabeles,
                ModBlocks.NETHER_HELL_ORE.get().defaultBlockState(), 9));
        register(context, END_ENDERITE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceabeles,
                ModBlocks.ANCIENT_ENDERITE.get().defaultBlockState(), 7));
        register(context, END_ENDERIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceabeles,
                ModBlocks.ENDERIUM_ORE.get().defaultBlockState(), 9));

        register(context, AMBER_GEODE_KEY, Feature.GEODE,
                new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.DEEPSLATE),
                        BlockStateProvider.simple(Blocks.HONEY_BLOCK),
                        BlockStateProvider.simple(ModBlocks.AMBER_BLOCK.get()),
                        BlockStateProvider.simple(Blocks.BLACKSTONE),
                        List.of(ModBlocks.AMBER_BLOCK.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerSettings(1.7D, 1.2D, 2.5D, 3.5D),
                        new GeodeCrackSettings(0.25D, 1.5D, 1), 0.5D, 0.1D,
                        true, UniformInt.of(3, 8),
                        UniformInt.of(2, 6), UniformInt.of(1, 2),
                        -18, 18, 0.075D, 1));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(WeaponsPlusMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
