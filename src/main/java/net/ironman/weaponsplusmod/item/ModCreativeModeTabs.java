package net.ironman.weaponsplusmod.item;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.ironman.weaponsplusmod.block.ModBlocks;
import net.ironman.weaponsplusmod.worldgen.ModOrePlacement;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeaponsPlusMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TABS.register("items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HELL_GEM.get()))
                    .title(Component.translatable("creativetab.items_tab"))
                    .displayItems((Parameters, output) -> {
                        output.accept(ModItems.RAW_HELL_GEM.get());
                        output.accept(ModItems.HELL_GEM.get());
                        output.accept(ModItems.EMPOWERED_HELL_GEM.get());
                        output.accept(ModItems.HELL_CORE.get());
                        output.accept(ModItems.PHOENIX_FEATHER.get());
                        output.accept(ModItems.AQUA_PEARL.get());
                        output.accept(ModItems.SHARD_OF_THE_OCEAN.get());
                        output.accept(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get());
                        output.accept(ModItems.ENDERIUM_INGOT.get());
                        output.accept(ModItems.ENDERITE_SCRAP.get());
                        output.accept(ModItems.ENDERITE_INGOT.get());
                        output.accept(ModItems.AMBER_CRYSTAL.get());
                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.ELECTRUM_INGOT.get());
                        output.accept(ModItems.RAW_ELECTRUM.get());

                        output.accept(ModItems.HELL_APPLE.get());
                        output.accept(ModItems.AQUA_APPLE.get());
                        output.accept(ModItems.ENDERIUM_APPLE.get());
                        output.accept(ModItems.AMBER_APPLE.get());
                        output.accept(ModItems.ELECTRUM_APPLE.get());

                        // output.accept(ModItems.IRON_ROD.get());

                        output.accept(ModBlocks.HELL_GEM_BLOCK.get());
                        output.accept(ModBlocks.NETHER_HELL_ORE.get());
                        output.accept(ModBlocks.AQUA_BLOCK.get());
                        output.accept(ModBlocks.AQUA_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_AQUA_ORE.get());
                        output.accept(ModBlocks.ENDERIUM_ORE.get());
                        output.accept(ModBlocks.ENDERIUM_BLOCK.get());
                        output.accept(ModBlocks.ANCIENT_ENDERITE.get());
                        output.accept(ModBlocks.ENDERITE_BLOCK.get());
                        output.accept(ModBlocks.AMBER_BLOCK.get());
                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.RUBY_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                        output.accept(ModBlocks.ELECTRUM_BLOCK.get());
                        output.accept(ModBlocks.ELECTRUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TABS.register("tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HELL_SWORD.get()))
                    .title(Component.translatable("creativetab.tools_tab"))
                    .displayItems((Parameters, output) -> {
                        output.accept(ModItems.HELL_SWORD.get());
                        output.accept(ModItems.HELL_AXE.get());
                        output.accept(ModItems.HELL_PICKAXE.get());
                        output.accept(ModItems.HELL_SHOVEL.get());
                        output.accept(ModItems.HELL_HOE.get());
                        output.accept(ModItems.HELL_RAPIER.get());
                        output.accept(ModItems.HELL_CUTLASS.get());
                        output.accept(ModItems.HELL_KATANA.get());
                        output.accept(ModItems.HELL_LONGSWORD.get());
                        output.accept(ModItems.HELL_DAGGER.get());
                        output.accept(ModItems.HELL_BATTLE_AXE.get());
                        output.accept(ModItems.HELL_DOUBLE_AXE.get());
                        output.accept(ModItems.HELL_MULTITOOL.get());
                        output.accept(ModItems.BURNING_SWORD.get());

                        output.accept(ModItems.HELL_HELMET.get());
                        output.accept(ModItems.HELL_CHESTPLATE.get());
                        output.accept(ModItems.HELL_LEGGINGS.get());
                        output.accept(ModItems.HELL_BOOTS.get());

                        output.accept(ModItems.AQUA_SWORD.get());
                        output.accept(ModItems.AQUA_AXE.get());
                        output.accept(ModItems.AQUA_PICKAXE.get());
                        output.accept(ModItems.AQUA_SHOVEL.get());
                        output.accept(ModItems.AQUA_HOE.get());
                        output.accept(ModItems.AQUA_RAPIER.get());
                        output.accept(ModItems.AQUA_CUTLASS.get());
                        output.accept(ModItems.AQUA_KATANA.get());
                        output.accept(ModItems.AQUA_LONGSWORD.get());
                        output.accept(ModItems.AQUA_DAGGER.get());
                        output.accept(ModItems.AQUA_BATTLE_AXE.get());
                        output.accept(ModItems.AQUA_DOUBLE_AXE.get());
                        output.accept(ModItems.AQUA_MULTITOOL.get());

                        output.accept(ModItems.AQUA_HELMET.get());
                        output.accept(ModItems.AQUA_CHESTPLATE.get());
                        output.accept(ModItems.AQUA_LEGGINGS.get());
                        output.accept(ModItems.AQUA_BOOTS.get());

                        output.accept(ModItems.ENDERIUM_SWORD.get());
                        output.accept(ModItems.ENDERIUM_AXE.get());
                        output.accept(ModItems.ENDERIUM_PICKAXE.get());
                        output.accept(ModItems.ENDERIUM_SHOVEL.get());
                        output.accept(ModItems.ENDERIUM_HOE.get());
                        output.accept(ModItems.ENDERIUM_RAPIER.get());
                        output.accept(ModItems.ENDERIUM_CUTLASS.get());
                        output.accept(ModItems.ENDERIUM_KATANA.get());
                        output.accept(ModItems.ENDERIUM_LONGSWORD.get());
                        output.accept(ModItems.ENDERIUM_DAGGER.get());
                        output.accept(ModItems.ENDERIUM_BATTLE_AXE.get());
                        output.accept(ModItems.ENDERIUM_DOUBLE_AXE.get());
                        output.accept(ModItems.ENDERIUM_MULTITOOL.get());

                        output.accept(ModItems.ENDERIUM_HELMET.get());
                        output.accept(ModItems.ENDERIUM_CHESTPLATE.get());
                        output.accept(ModItems.ENDERIUM_LEGGINGS.get());
                        output.accept(ModItems.ENDERIUM_BOOTS.get());

                        output.accept(ModItems.ENDERITE_SWORD.get());
                        output.accept(ModItems.ENDERITE_AXE.get());
                        output.accept(ModItems.ENDERITE_PICKAXE.get());
                        output.accept(ModItems.ENDERITE_SHOVEL.get());
                        output.accept(ModItems.ENDERITE_HOE.get());
                        output.accept(ModItems.ENDERITE_RAPIER.get());
                        output.accept(ModItems.ENDERITE_CUTLASS.get());
                        output.accept(ModItems.ENDERITE_KATANA.get());
                        output.accept(ModItems.ENDERITE_LONGSWORD.get());
                        output.accept(ModItems.ENDERITE_DAGGER.get());
                        output.accept(ModItems.ENDERITE_BATTLE_AXE.get());
                        output.accept(ModItems.ENDERITE_DOUBLE_AXE.get());
                        output.accept(ModItems.ENDERITE_MULTITOOL.get());

                        output.accept(ModItems.ENDERITE_HELMET.get());
                        output.accept(ModItems.ENDERITE_CHESTPLATE.get());
                        output.accept(ModItems.ENDERITE_LEGGINGS.get());
                        output.accept(ModItems.ENDERITE_BOOTS.get());

                        output.accept(ModItems.AMBER_SWORD.get());
                        output.accept(ModItems.AMBER_AXE.get());
                        output.accept(ModItems.AMBER_PICKAXE.get());
                        output.accept(ModItems.AMBER_SHOVEL.get());
                        output.accept(ModItems.AMBER_HOE.get());
                        output.accept(ModItems.AMBER_RAPIER.get());
                        output.accept(ModItems.AMBER_CUTLASS.get());
                        output.accept(ModItems.AMBER_KATANA.get());
                        output.accept(ModItems.AMBER_LONGSWORD.get());
                        output.accept(ModItems.AMBER_DAGGER.get());
                        output.accept(ModItems.AMBER_BATTLE_AXE.get());
                        output.accept(ModItems.AMBER_DOUBLE_AXE.get());
                        output.accept(ModItems.AMBER_MULTITOOL.get());

                        output.accept(ModItems.AMBER_HELMET.get());
                        output.accept(ModItems.AMBER_CHESTPLATE.get());
                        output.accept(ModItems.AMBER_LEGGINGS.get());
                        output.accept(ModItems.AMBER_BOOTS.get());

                        output.accept(ModItems.RUBY_SWORD.get());
                        output.accept(ModItems.RUBY_AXE.get());
                        output.accept(ModItems.RUBY_PICKAXE.get());
                        output.accept(ModItems.RUBY_SHOVEL.get());
                        output.accept(ModItems.RUBY_HOE.get());
                        output.accept(ModItems.RUBY_RAPIER.get());
                        output.accept(ModItems.RUBY_CUTLASS.get());
                        output.accept(ModItems.RUBY_KATANA.get());
                        output.accept(ModItems.RUBY_LONGSWORD.get());
                        output.accept(ModItems.RUBY_DAGGER.get());
                        output.accept(ModItems.RUBY_BATTLE_AXE.get());
                        output.accept(ModItems.RUBY_DOUBLE_AXE.get());
                        output.accept(ModItems.RUBY_MULTITOOL.get());

                        output.accept(ModItems.RUBY_HELMET.get());
                        output.accept(ModItems.RUBY_CHESTPLATE.get());
                        output.accept(ModItems.RUBY_LEGGINGS.get());
                        output.accept(ModItems.RUBY_BOOTS.get());

                        output.accept(ModItems.ELECTRUM_SWORD.get());
                        output.accept(ModItems.ELECTRUM_AXE.get());
                        output.accept(ModItems.ELECTRUM_PICKAXE.get());
                        output.accept(ModItems.ELECTRUM_SHOVEL.get());
                        output.accept(ModItems.ELECTRUM_HOE.get());
                        output.accept(ModItems.ELECTRUM_RAPIER.get());
                        output.accept(ModItems.ELECTRUM_CUTLASS.get());
                        output.accept(ModItems.ELECTRUM_KATANA.get());
                        output.accept(ModItems.ELECTRUM_LONGSWORD.get());
                        output.accept(ModItems.ELECTRUM_DAGGER.get());
                        output.accept(ModItems.ELECTRUM_BATTLE_AXE.get());
                        output.accept(ModItems.ELECTRUM_DOUBLE_AXE.get());
                        output.accept(ModItems.ELECTRUM_MULTITOOL.get());

                        output.accept(ModItems.ELECTRUM_HELMET.get());
                        output.accept(ModItems.ELECTRUM_CHESTPLATE.get());
                        output.accept(ModItems.ELECTRUM_LEGGINGS.get());
                        output.accept(ModItems.ELECTRUM_BOOTS.get());

                        output.accept(ModItems.STONE_RAPIER.get());
                        output.accept(ModItems.STONE_CUTLASS.get());
                        output.accept(ModItems.STONE_KATANA.get());
                        output.accept(ModItems.STONE_LONGSWORD.get());
                        output.accept(ModItems.STONE_DAGGER.get());
                        output.accept(ModItems.STONE_BATTLE_AXE.get());
                        output.accept(ModItems.STONE_DOUBLE_AXE.get());

                        output.accept(ModItems.IRON_RAPIER.get());
                        output.accept(ModItems.IRON_CUTLASS.get());
                        output.accept(ModItems.IRON_KATANA.get());
                        output.accept(ModItems.IRON_LONGSWORD.get());
                        output.accept(ModItems.IRON_DAGGER.get());
                        output.accept(ModItems.IRON_BATTLE_AXE.get());
                        output.accept(ModItems.IRON_DOUBLE_AXE.get());

                        output.accept(ModItems.GOLDEN_RAPIER.get());
                        output.accept(ModItems.GOLDEN_CUTLASS.get());
                        output.accept(ModItems.GOLDEN_KATANA.get());
                        output.accept(ModItems.GOLDEN_LONGSWORD.get());
                        output.accept(ModItems.GOLDEN_DAGGER.get());
                        output.accept(ModItems.GOLDEN_BATTLE_AXE.get());
                        output.accept(ModItems.GOLDEN_DOUBLE_AXE.get());

                        output.accept(ModItems.DIAMOND_RAPIER.get());
                        output.accept(ModItems.DIAMOND_CUTLASS.get());
                        output.accept(ModItems.DIAMOND_KATANA.get());
                        output.accept(ModItems.DIAMOND_LONGSWORD.get());
                        output.accept(ModItems.DIAMOND_DAGGER.get());
                        output.accept(ModItems.DIAMOND_BATTLE_AXE.get());
                        output.accept(ModItems.DIAMOND_DOUBLE_AXE.get());

                        output.accept(ModItems.NETHERITE_RAPIER.get());
                        output.accept(ModItems.NETHERITE_CUTLASS.get());
                        output.accept(ModItems.NETHERITE_KATANA.get());
                        output.accept(ModItems.NETHERITE_LONGSWORD.get());
                        output.accept(ModItems.NETHERITE_DAGGER.get());
                        output.accept(ModItems.NETHERITE_BATTLE_AXE.get());
                        output.accept(ModItems.NETHERITE_DOUBLE_AXE.get());

                        output.accept(ModItems.EMERALD_RAPIER.get());
                        output.accept(ModItems.EMERALD_CUTLASS.get());
                        output.accept(ModItems.EMERALD_KATANA.get());
                        output.accept(ModItems.EMERALD_LONGSWORD.get());
                        output.accept(ModItems.EMERALD_DAGGER.get());
                        output.accept(ModItems.EMERALD_BATTLE_AXE.get());
                        output.accept(ModItems.EMERALD_DOUBLE_AXE.get());


                        output.accept(ModItems.HAMMER.get());
                        //output.accept(ModItems.HATTORI_HANZO_KATANA.get());
                        //output.accept(ModItems.MASTER_SWORD.get());

                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
