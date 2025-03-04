package net.ironman.weaponsplusmod.item;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.ironman.weaponsplusmod.item.custom.*;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.ibm.icu.impl.ValidIdentifiers.Datatype.x;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WeaponsPlusMod.MOD_ID);

    public static final RegistryObject<Item> RAW_HELL_GEM = ITEMS.register("raw_hell_gem",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> HELL_GEM = ITEMS.register("hell_gem",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> PHOENIX_FEATHER = ITEMS.register("phoenix_feather",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.create("ANCIENT", ChatFormatting.GOLD))));

    public static final RegistryObject<Item> EMPOWERED_HELL_GEM = ITEMS.register("empowered_hell_gem",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> HELL_CORE = ITEMS.register("hell_core",
            () -> new FuelItem(new Item.Properties().fireResistant().rarity(Rarity.RARE), 2000));

    public static final RegistryObject<Item> IRON_ROD = ITEMS.register("iron_rod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AQUA_PEARL = ITEMS.register("aqua_pearl",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHARD_OF_THE_OCEAN = ITEMS.register("shard_of_the_ocean",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.create("UNDERWATER", ChatFormatting.AQUA))));

    public static final RegistryObject<Item> ENDERITE_SCRAP = ITEMS.register("enderite_scrap",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE_INGOT = ITEMS.register("enderite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERIUM_INGOT = ITEMS.register("enderium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMBER_CRYSTAL = ITEMS.register("amber_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ELECTRUM = ITEMS.register("raw_electrum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("enderite_upgrade_smithing_template",
            () -> new EnderiteUpgradeItem(new Item.Properties()));

    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer",
            () -> new HammerItem(Tiers.IRON, 2, -3.4f, new Item.Properties().durability(256)));

    /* Multitools */
    public static final RegistryObject<Item> WOODEN_MULTITOOL = ITEMS.register("wooden_multitool",
            () -> new PaxelItem(Tiers.WOOD, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> STONE_MULTITOOL = ITEMS.register("stone_multitool",
            () -> new PaxelItem(Tiers.STONE, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> IRON_MULTITOOL = ITEMS.register("iron_multitool",
            () -> new PaxelItem(Tiers.IRON, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> GOLDEN_MULTITOOL = ITEMS.register("golden_multitool",
            () -> new PaxelItem(Tiers.GOLD, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> DIAMOND_MULTITOOL = ITEMS.register("diamond_multitool",
            () -> new PaxelItem(Tiers.DIAMOND, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> NETHERITE_MULTITOOL = ITEMS.register("netherite_multitool",
            () -> new PaxelItem(Tiers.NETHERITE, 2, 3, new Item.Properties().durability(256)));

    /* Standart Hell Weapons and Tools */
    public static final RegistryObject<Item> HELL_SWORD = ITEMS.register("hell_sword",
            () -> new SwordItem(ModToolTiers.HELL, 4,-2.4f,
                    new SwordItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_AXE = ITEMS.register("hell_axe",
            () -> new AxeItem(ModToolTiers.HELL, 6,-3f,
                    new AxeItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_PICKAXE = ITEMS.register("hell_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HELL, 2,-2.8f,
                    new PickaxeItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_SHOVEL = ITEMS.register("hell_shovel",
            () -> new ShovelItem(ModToolTiers.HELL, 3,-3f,
                    new ShovelItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_HOE = ITEMS.register("hell_hoe",
            () -> new HoeItem(ModToolTiers.HELL, -3,0,
                    new HoeItem.Properties().durability(256).fireResistant()));

    /* Special Hell Weapons and Tools */
    public static final RegistryObject<Item> HELL_BATTLE_AXE = ITEMS.register("hell_battle_axe",
            () -> new AxeItem(ModToolTiers.HELL, 7,-3.2f,
                    new AxeItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_DOUBLE_AXE = ITEMS.register("hell_double_axe",
            () -> new AxeItem(ModToolTiers.HELL, 9,-3.4f,
                    new AxeItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_RAPIER = ITEMS.register("hell_rapier",
            () -> new SwordItem(ModToolTiers.HELL, 3,-1.4f,
                    new SwordItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_CUTLASS = ITEMS.register("hell_cutlass",
            () -> new SwordItem(ModToolTiers.HELL, 6,-2.8f,
                    new SwordItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_DAGGER = ITEMS.register("hell_dagger",
            () -> new SwordItem(ModToolTiers.HELL,2,-0.2f,
                    new SwordItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_KATANA = ITEMS.register("hell_katana",
            () -> new SwordItem(ModToolTiers.HELL, 5,-2.0f,
                    new SwordItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_LONGSWORD = ITEMS.register("hell_longsword",
            () -> new SwordItem(ModToolTiers.HELL, 8,-3.3f,
                    new SwordItem.Properties().durability(256).fireResistant()));

    public static final RegistryObject<Item> BURNING_SWORD = ITEMS.register("burning_sword",
            () -> new BurningSwordItem(ModToolTiers.HELL, 4,-2.4f,
                    new Item.Properties().durability(256).fireResistant()));

    public static final RegistryObject<Item> HELL_MULTITOOL = ITEMS.register("hell_multitool",
            () -> new PaxelItem(ModToolTiers.HELL, 2, 3, new Item.Properties().durability(256)));

    /* Hell Armor */
    public static final RegistryObject<Item> HELL_HELMET = ITEMS.register("hell_helmet",
            () -> new ModArmorItem(ModArmorMaterials.HELL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HELL_CHESTPLATE = ITEMS.register("hell_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.HELL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HELL_LEGGINGS = ITEMS.register("hell_leggings",
            () -> new ModArmorItem(ModArmorMaterials.HELL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HELL_BOOTS = ITEMS.register("hell_boots",
            () -> new ModArmorItem(ModArmorMaterials.HELL, ArmorItem.Type.BOOTS, new Item.Properties()));


    /* Emerald Weapons and Tools */
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModToolTiers.EMERALD, 3,-2.4f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModToolTiers.EMERALD, 5,-3f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EMERALD, 0,-2.8f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModToolTiers.EMERALD, 1,-3f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModToolTiers.EMERALD, -3,-0.5f,
                    new Item.Properties().durability(256)));

    public static final RegistryObject<Item> EMERALD_MULTITOOL = ITEMS.register("emerald_multitool",
            () -> new PaxelItem(ModToolTiers.EMERALD, 2, 3, new Item.Properties().durability(256)));

    /* Emerald Armor */
    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties()));


    /* Standart Aqua Weapons and Tools */
    public static final RegistryObject<Item> AQUA_SWORD = ITEMS.register("aqua_sword",
            () -> new SwordItem(ModToolTiers.AQUA, 4,-2.4f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AQUA_AXE = ITEMS.register("aqua_axe",
            () -> new AxeItem(ModToolTiers.AQUA, 6,-3f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AQUA_PICKAXE = ITEMS.register("aqua_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AQUA, 2,-2.8f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AQUA_SHOVEL = ITEMS.register("aqua_shovel",
            () -> new ShovelItem(ModToolTiers.AQUA, 3,-3f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AQUA_HOE = ITEMS.register("aqua_hoe",
            () -> new HoeItem(ModToolTiers.AQUA, -3,0,
                    new Item.Properties().durability(256)));

    /* Special Aqua Weapons and Tools */
    public static final RegistryObject<Item> AQUA_BATTLE_AXE = ITEMS.register("aqua_battle_axe",
            () -> new AxeItem(ModToolTiers.AQUA, 7,-3.2f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AQUA_DOUBLE_AXE = ITEMS.register("aqua_double_axe",
            () -> new AxeItem(ModToolTiers.AQUA, 9,-3.4f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AQUA_RAPIER = ITEMS.register("aqua_rapier",
            () -> new SwordItem(ModToolTiers.AQUA, 3,-1.4f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AQUA_CUTLASS = ITEMS.register("aqua_cutlass",
            () -> new SwordItem(ModToolTiers.AQUA, 6,-2.8f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AQUA_DAGGER = ITEMS.register("aqua_dagger",
            () -> new SwordItem(ModToolTiers.AQUA,2,-0.2f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AQUA_KATANA = ITEMS.register("aqua_katana",
            () -> new SwordItem(ModToolTiers.AQUA, 5,-2.0f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AQUA_LONGSWORD = ITEMS.register("aqua_longsword",
            () -> new SwordItem(ModToolTiers.AQUA, 8,-3.3f,
                    new Item.Properties().durability(256)));

    public static final RegistryObject<Item> AQUA_MULTITOOL = ITEMS.register("aqua_multitool",
            () -> new PaxelItem(ModToolTiers.AQUA, 2, 3, new Item.Properties().durability(256)));

    /* Aqua Armor */
    public static final RegistryObject<Item> AQUA_HELMET = ITEMS.register("aqua_helmet",
            () -> new ModArmorItem(ModArmorMaterials.AQUA, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> AQUA_CHESTPLATE = ITEMS.register("aqua_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.AQUA, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> AQUA_LEGGINGS = ITEMS.register("aqua_leggings",
            () -> new ModArmorItem(ModArmorMaterials.AQUA, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> AQUA_BOOTS = ITEMS.register("aqua_boots",
            () -> new ModArmorItem(ModArmorMaterials.AQUA, ArmorItem.Type.BOOTS, new Item.Properties()));

    /* Standart ENDERITE Weapons and Tools */
    public static final RegistryObject<Item> ENDERITE_SWORD = ITEMS.register("enderite_sword",
            () -> new SwordItem(ModToolTiers.ENDERITE, 4,-2.4f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_AXE = ITEMS.register("enderite_axe",
            () -> new AxeItem(ModToolTiers.ENDERITE, 6,-3f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_PICKAXE = ITEMS.register("enderite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDERITE, 2,-2.8f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_SHOVEL = ITEMS.register("enderite_shovel",
            () -> new ShovelItem(ModToolTiers.ENDERITE, 3,-3f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_HOE = ITEMS.register("enderite_hoe",
            () -> new HoeItem(ModToolTiers.ENDERITE, -3,0,
                    new Item.Properties().durability(256).fireResistant()));

    /* Special Enderite Weapons and Tools */
    public static final RegistryObject<Item> ENDERITE_BATTLE_AXE = ITEMS.register("enderite_battle_axe",
            () -> new AxeItem(ModToolTiers.ENDERITE, 7,-3.2f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_DOUBLE_AXE = ITEMS.register("enderite_double_axe",
            () -> new AxeItem(ModToolTiers.ENDERITE, 9,-3.4f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_RAPIER = ITEMS.register("enderite_rapier",
            () -> new SwordItem(ModToolTiers.ENDERITE, 3,-1.4f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_CUTLASS = ITEMS.register("enderite_cutlass",
            () -> new SwordItem(ModToolTiers.ENDERITE, 6,-2.8f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_DAGGER = ITEMS.register("enderite_dagger",
            () -> new SwordItem(ModToolTiers.ENDERITE,2,-0.2f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_KATANA = ITEMS.register("enderite_katana",
            () -> new SwordItem(ModToolTiers.ENDERITE, 5,-2.0f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_LONGSWORD = ITEMS.register("enderite_longsword",
            () -> new SwordItem(ModToolTiers.ENDERITE, 8,-3.3f,
                    new Item.Properties().durability(256).fireResistant()));

    public static final RegistryObject<Item> ENDERITE_MULTITOOL = ITEMS.register("enderite_multitool",
            () -> new PaxelItem(ModToolTiers.ENDERITE, 2, 3, new Item.Properties().durability(256)));

    /* Enderite Armor */
    public static final RegistryObject<Item> ENDERITE_HELMET = ITEMS.register("enderite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ENDERITE_CHESTPLATE = ITEMS.register("enderite_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ENDERITE_LEGGINGS = ITEMS.register("enderite_leggings",
            () -> new ModArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ENDERITE_BOOTS = ITEMS.register("enderite_boots",
            () -> new ModArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    /* Standart Amber Weapons and Tools */
    public static final RegistryObject<Item> AMBER_SWORD = ITEMS.register("amber_sword",
            () -> new SwordItem(ModToolTiers.AMBER, 4,-2.4f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AMBER_AXE = ITEMS.register("amber_axe",
            () -> new AxeItem(ModToolTiers.AMBER, 6,-3f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AMBER_PICKAXE = ITEMS.register("amber_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMBER, 2,-2.8f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AMBER_SHOVEL = ITEMS.register("amber_shovel",
            () -> new ShovelItem(ModToolTiers.AMBER, 3,-3f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AMBER_HOE = ITEMS.register("amber_hoe",
            () -> new HoeItem(ModToolTiers.AMBER, -3,0,
                    new Item.Properties().durability(256)));

    /* Special Amber Weapons and Tools */
    public static final RegistryObject<Item> AMBER_BATTLE_AXE = ITEMS.register("amber_battle_axe",
            () -> new AxeItem(ModToolTiers.AMBER, 7,-3.2f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AMBER_DOUBLE_AXE = ITEMS.register("amber_double_axe",
            () -> new AxeItem(ModToolTiers.AMBER, 9,-3.4f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AMBER_RAPIER = ITEMS.register("amber_rapier",
            () -> new SwordItem(ModToolTiers.AMBER, 3,-1.4f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AMBER_CUTLASS = ITEMS.register("amber_cutlass",
            () -> new SwordItem(ModToolTiers.AMBER, 6,-2.8f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AMBER_DAGGER = ITEMS.register("amber_dagger",
            () -> new SwordItem(ModToolTiers.AMBER,2,-0.2f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AMBER_KATANA = ITEMS.register("amber_katana",
            () -> new SwordItem(ModToolTiers.AMBER, 5,-2.0f,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> AMBER_LONGSWORD = ITEMS.register("amber_longsword",
            () -> new SwordItem(ModToolTiers.AMBER, 8,-3.3f,
                    new Item.Properties().durability(256)));

    public static final RegistryObject<Item> AMBER_MULTITOOL = ITEMS.register("amber_multitool",
            () -> new PaxelItem(ModToolTiers.AMBER, 2, 3, new Item.Properties().durability(256)));

    /* Amber Armor */
    public static final RegistryObject<Item> AMBER_HELMET = ITEMS.register("amber_helmet",
            () -> new ModArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_CHESTPLATE = ITEMS.register("amber_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_LEGGINGS = ITEMS.register("amber_leggings",
            () -> new ModArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_BOOTS = ITEMS.register("amber_boots",
            () -> new ModArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.BOOTS, new Item.Properties()));

    /* Standart ENDERIUM Weapons and Tools */
    public static final RegistryObject<Item> ENDERIUM_SWORD = ITEMS.register("enderium_sword",
            () -> new SwordItem(ModToolTiers.ENDERIUM, 4,-2.4f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERIUM_AXE = ITEMS.register("enderium_axe",
            () -> new AxeItem(ModToolTiers.ENDERIUM, 6,-3f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERIUM_PICKAXE = ITEMS.register("enderium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDERIUM, 2,-2.8f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERIUM_SHOVEL = ITEMS.register("enderium_shovel",
            () -> new ShovelItem(ModToolTiers.ENDERIUM, 3,-3f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERIUM_HOE = ITEMS.register("enderium_hoe",
            () -> new HoeItem(ModToolTiers.ENDERIUM, -3,0,
                    new Item.Properties().durability(256).fireResistant()));

    /* Special Enderium Weapons and Tools */
    public static final RegistryObject<Item> ENDERIUM_BATTLE_AXE = ITEMS.register("enderium_battle_axe",
            () -> new AxeItem(ModToolTiers.ENDERIUM, 7,-3.2f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERIUM_DOUBLE_AXE = ITEMS.register("enderium_double_axe",
            () -> new AxeItem(ModToolTiers.ENDERIUM, 9,-3.4f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERIUM_RAPIER = ITEMS.register("enderium_rapier",
            () -> new SwordItem(ModToolTiers.ENDERIUM, 3,-1.4f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERIUM_CUTLASS = ITEMS.register("enderium_cutlass",
            () -> new SwordItem(ModToolTiers.ENDERIUM, 6,-2.8f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERIUM_DAGGER = ITEMS.register("enderium_dagger",
            () -> new SwordItem(ModToolTiers.ENDERIUM,2,-0.2f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERIUM_KATANA = ITEMS.register("enderium_katana",
            () -> new SwordItem(ModToolTiers.ENDERIUM, 5,-2.0f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ENDERIUM_LONGSWORD = ITEMS.register("enderium_longsword",
            () -> new SwordItem(ModToolTiers.ENDERIUM, 8,-3.3f,
                    new Item.Properties().durability(256).fireResistant()));

    public static final RegistryObject<Item> ENDERIUM_MULTITOOL = ITEMS.register("enderium_multitool",
            () -> new PaxelItem(ModToolTiers.ENDERIUM, 2, 3, new Item.Properties().durability(256)));

    /* Enderium Armor */
    public static final RegistryObject<Item> ENDERIUM_HELMET = ITEMS.register("enderium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ENDERIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ENDERIUM_CHESTPLATE = ITEMS.register("enderium_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.ENDERIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ENDERIUM_LEGGINGS = ITEMS.register("enderium_leggings",
            () -> new ModArmorItem(ModArmorMaterials.ENDERIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ENDERIUM_BOOTS = ITEMS.register("enderium_boots",
            () -> new ModArmorItem(ModArmorMaterials.ENDERIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    /* Standart Ruby Weapons and Tools */
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, 4,-2.4f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTiers.RUBY, 6,-3f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, 2,-2.8f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, 3,-3f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModToolTiers.RUBY, -3,0,
                    new Item.Properties().durability(256).fireResistant()));

    /* Special Ruby Weapons and Tools */
    public static final RegistryObject<Item> RUBY_BATTLE_AXE = ITEMS.register("ruby_battle_axe",
            () -> new AxeItem(ModToolTiers.RUBY, 7,-3.2f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> RUBY_DOUBLE_AXE = ITEMS.register("ruby_double_axe",
            () -> new AxeItem(ModToolTiers.RUBY, 9,-3.4f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> RUBY_RAPIER = ITEMS.register("ruby_rapier",
            () -> new SwordItem(ModToolTiers.RUBY, 3,-1.4f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> RUBY_CUTLASS = ITEMS.register("ruby_cutlass",
            () -> new SwordItem(ModToolTiers.RUBY, 6,-2.8f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> RUBY_DAGGER = ITEMS.register("ruby_dagger",
            () -> new SwordItem(ModToolTiers.RUBY,2,-0.2f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> RUBY_KATANA = ITEMS.register("ruby_katana",
            () -> new SwordItem(ModToolTiers.RUBY, 5,-2.0f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> RUBY_LONGSWORD = ITEMS.register("ruby_longsword",
            () -> new SwordItem(ModToolTiers.RUBY, 8,-3.3f,
                    new Item.Properties().durability(256).fireResistant()));

    public static final RegistryObject<Item> RUBY_MULTITOOL = ITEMS.register("ruby_multitool",
            () -> new PaxelItem(ModToolTiers.RUBY, 2, 3, new Item.Properties().durability(256)));

    /* Ruby Armor */
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));

    /* Standart Electrum Weapons and Tools */
    public static final RegistryObject<Item> ELECTRUM_SWORD = ITEMS.register("electrum_sword",
            () -> new SwordItem(ModToolTiers.ELECTRUM, 4,-2.4f,
                    new SwordItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_AXE = ITEMS.register("electrum_axe",
            () -> new AxeItem(ModToolTiers.ELECTRUM, 6,-3f,
                    new AxeItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_PICKAXE = ITEMS.register("electrum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ELECTRUM, 2,-2.8f,
                    new PickaxeItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_SHOVEL = ITEMS.register("electrum_shovel",
            () -> new ShovelItem(ModToolTiers.ELECTRUM, 3,-3f,
                    new ShovelItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_HOE = ITEMS.register("electrum_hoe",
            () -> new HoeItem(ModToolTiers.ELECTRUM, -3,0,
                    new HoeItem.Properties().durability(256).fireResistant()));

    /* Special Electrum Weapons and Tools */
    public static final RegistryObject<Item> ELECTRUM_BATTLE_AXE = ITEMS.register("electrum_battle_axe",
            () -> new AxeItem(ModToolTiers.ELECTRUM, 7,-3.2f,
                    new AxeItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_DOUBLE_AXE = ITEMS.register("electrum_double_axe",
            () -> new AxeItem(ModToolTiers.ELECTRUM, 9,-3.4f,
                    new AxeItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_RAPIER = ITEMS.register("electrum_rapier",
            () -> new SwordItem(ModToolTiers.ELECTRUM, 3,-1.4f,
                    new SwordItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_CUTLASS = ITEMS.register("electrum_cutlass",
            () -> new SwordItem(ModToolTiers.ELECTRUM, 6,-2.8f,
                    new SwordItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_DAGGER = ITEMS.register("electrum_dagger",
            () -> new SwordItem(ModToolTiers.ELECTRUM,2,-0.2f,
                    new SwordItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_KATANA = ITEMS.register("electrum_katana",
            () -> new SwordItem(ModToolTiers.ELECTRUM, 5,-2.0f,
                    new SwordItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_LONGSWORD = ITEMS.register("electrum_longsword",
            () -> new SwordItem(ModToolTiers.ELECTRUM, 8,-3.3f,
                    new SwordItem.Properties().durability(256).fireResistant()));

    // public final static RegistryObject<Item> ELECTRUM_BOW = ITEMS.register("electrum_bow",
    //         () -> new LightningBowItem(new Item.Properties().durability(500)));

    public static final RegistryObject<Item> ELECTRUM_MULTITOOL = ITEMS.register("electrum_multitool",
            () -> new PaxelItem(ModToolTiers.ELECTRUM, 2, 3, new Item.Properties().durability(256)));

    /* Hell Armor */
    public static final RegistryObject<Item> ELECTRUM_HELMET = ITEMS.register("electrum_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ELECTRUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_CHESTPLATE = ITEMS.register("electrum_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.ELECTRUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_LEGGINGS = ITEMS.register("electrum_leggings",
            () -> new ModArmorItem(ModArmorMaterials.ELECTRUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_BOOTS = ITEMS.register("electrum_boots",
            () -> new ModArmorItem(ModArmorMaterials.ELECTRUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    /* Ore Apples */
    public static final RegistryObject<Item> HELL_APPLE = ITEMS.register("hell_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HELL_APPLE)));
    public static final RegistryObject<Item> AQUA_APPLE = ITEMS.register("aqua_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.AQUA_APPLE)));
    public static final RegistryObject<Item> ENDERIUM_APPLE = ITEMS.register("enderium_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ENDERIUM_APPLE)));
    public static final RegistryObject<Item> AMBER_APPLE = ITEMS.register("amber_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.AMBER_APPLE)));
    public static final RegistryObject<Item> ELECTRUM_APPLE = ITEMS.register("electrum_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ELECTRUM_APPLE)));

    /* Stone Special Weapons */
    public static final RegistryObject<Item> STONE_BATTLE_AXE = ITEMS.register("stone_battle_axe",
            () -> new AxeItem(Tiers.STONE, 7,-3.2f,
                    new AxeItem.Properties().durability(256)));
    public static final RegistryObject<Item> STONE_DOUBLE_AXE = ITEMS.register("stone_double_axe",
            () -> new AxeItem(Tiers.STONE, 9,-3.4f,
                    new AxeItem.Properties().durability(256)));
    public static final RegistryObject<Item> STONE_RAPIER = ITEMS.register("stone_rapier",
            () -> new SwordItem(Tiers.STONE, 3,-1.4f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> STONE_CUTLASS = ITEMS.register("stone_cutlass",
            () -> new SwordItem(Tiers.STONE, 6,-2.8f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> STONE_DAGGER = ITEMS.register("stone_dagger",
            () -> new SwordItem(Tiers.STONE,2,-0.2f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> STONE_KATANA = ITEMS.register("stone_katana",
            () -> new SwordItem(Tiers.STONE, 5,-2.0f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> STONE_LONGSWORD = ITEMS.register("stone_longsword",
            () -> new SwordItem(Tiers.STONE, 8,-3.3f,
                    new SwordItem.Properties().durability(256)));

    /* Iron Special Weapons */
    public static final RegistryObject<Item> IRON_BATTLE_AXE = ITEMS.register("iron_battle_axe",
            () -> new AxeItem(Tiers.IRON, 7,-3.2f,
                    new AxeItem.Properties().durability(256)));
    public static final RegistryObject<Item> IRON_DOUBLE_AXE = ITEMS.register("iron_double_axe",
            () -> new AxeItem(Tiers.IRON, 9,-3.4f,
                    new AxeItem.Properties().durability(256)));
    public static final RegistryObject<Item> IRON_RAPIER = ITEMS.register("iron_rapier",
            () -> new SwordItem(Tiers.IRON, 3,-1.4f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> IRON_CUTLASS = ITEMS.register("iron_cutlass",
            () -> new SwordItem(Tiers.IRON, 6,-2.8f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> IRON_DAGGER = ITEMS.register("iron_dagger",
            () -> new SwordItem(Tiers.IRON,2,-0.2f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> IRON_KATANA = ITEMS.register("iron_katana",
            () -> new SwordItem(Tiers.IRON, 5,-2.0f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> IRON_LONGSWORD = ITEMS.register("iron_longsword",
            () -> new SwordItem(Tiers.IRON, 8,-3.3f,
                    new SwordItem.Properties().durability(256)));

    /* Gold Special Weapons */
    public static final RegistryObject<Item> GOLDEN_BATTLE_AXE = ITEMS.register("golden_battle_axe",
            () -> new AxeItem(Tiers.GOLD, 7,-3.2f,
                    new AxeItem.Properties().durability(256)));
    public static final RegistryObject<Item> GOLDEN_DOUBLE_AXE = ITEMS.register("golden_double_axe",
            () -> new AxeItem(Tiers.GOLD, 9,-3.4f,
                    new AxeItem.Properties().durability(256)));
    public static final RegistryObject<Item> GOLDEN_RAPIER = ITEMS.register("golden_rapier",
            () -> new SwordItem(Tiers.GOLD, 3,-1.4f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> GOLDEN_CUTLASS = ITEMS.register("golden_cutlass",
            () -> new SwordItem(Tiers.GOLD, 6,-2.8f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> GOLDEN_DAGGER = ITEMS.register("golden_dagger",
            () -> new SwordItem(Tiers.GOLD,2,-0.2f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> GOLDEN_KATANA = ITEMS.register("golden_katana",
            () -> new SwordItem(Tiers.GOLD, 5,-2.0f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> GOLDEN_LONGSWORD = ITEMS.register("golden_longsword",
            () -> new SwordItem(Tiers.GOLD, 8,-3.3f,
                    new SwordItem.Properties().durability(256)));

    /* Diamond Special Weapons */
    public static final RegistryObject<Item> DIAMOND_BATTLE_AXE = ITEMS.register("diamond_battle_axe",
            () -> new AxeItem(Tiers.DIAMOND, 7,-3.2f,
                    new AxeItem.Properties().durability(256)));
    public static final RegistryObject<Item> DIAMOND_DOUBLE_AXE = ITEMS.register("diamond_double_axe",
            () -> new AxeItem(Tiers.DIAMOND, 9,-3.4f,
                    new AxeItem.Properties().durability(256)));
    public static final RegistryObject<Item> DIAMOND_RAPIER = ITEMS.register("diamond_rapier",
            () -> new SwordItem(Tiers.DIAMOND, 3,-1.4f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> DIAMOND_CUTLASS = ITEMS.register("diamond_cutlass",
            () -> new SwordItem(Tiers.DIAMOND, 6,-2.8f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger",
            () -> new SwordItem(Tiers.DIAMOND,2,-0.2f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> DIAMOND_KATANA = ITEMS.register("diamond_katana",
            () -> new SwordItem(Tiers.DIAMOND, 5,-2.0f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> DIAMOND_LONGSWORD = ITEMS.register("diamond_longsword",
            () -> new SwordItem(Tiers.DIAMOND, 8,-3.3f,
                    new SwordItem.Properties().durability(256)));

    /* Netherite Special Weapons */
    public static final RegistryObject<Item> NETHERITE_BATTLE_AXE = ITEMS.register("netherite_battle_axe",
            () -> new AxeItem(Tiers.NETHERITE, 7,-3.2f,
                    new AxeItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_DOUBLE_AXE = ITEMS.register("netherite_double_axe",
            () -> new AxeItem(Tiers.NETHERITE, 9,-3.4f,
                    new AxeItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_RAPIER = ITEMS.register("netherite_rapier",
            () -> new SwordItem(Tiers.NETHERITE, 3,-1.4f,
                    new SwordItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_CUTLASS = ITEMS.register("netherite_cutlass",
            () -> new SwordItem(Tiers.NETHERITE, 6,-2.8f,
                    new SwordItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_DAGGER = ITEMS.register("netherite_dagger",
            () -> new SwordItem(Tiers.NETHERITE,2,-0.2f,
                    new SwordItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_KATANA = ITEMS.register("netherite_katana",
            () -> new SwordItem(Tiers.NETHERITE, 5,-2.0f,
                    new SwordItem.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_LONGSWORD = ITEMS.register("netherite_longsword",
            () -> new SwordItem(Tiers.NETHERITE, 8,-3.3f,
                    new SwordItem.Properties().durability(256).fireResistant()));

    /* Emerald Special Weapons */
    public static final RegistryObject<Item> EMERALD_BATTLE_AXE = ITEMS.register("emerald_battle_axe",
            () -> new AxeItem(ModToolTiers.EMERALD, 7,-3.2f,
                    new AxeItem.Properties().durability(256)));
    public static final RegistryObject<Item> EMERALD_DOUBLE_AXE = ITEMS.register("emerald_double_axe",
            () -> new AxeItem(ModToolTiers.EMERALD, 9,-3.4f,
                    new AxeItem.Properties().durability(256)));
    public static final RegistryObject<Item> EMERALD_RAPIER = ITEMS.register("emerald_rapier",
            () -> new SwordItem(ModToolTiers.EMERALD, 3,-1.4f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> EMERALD_CUTLASS = ITEMS.register("emerald_cutlass",
            () -> new SwordItem(ModToolTiers.EMERALD, 6,-2.8f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> EMERALD_DAGGER = ITEMS.register("emerald_dagger",
            () -> new SwordItem(ModToolTiers.EMERALD,2,-0.2f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> EMERALD_KATANA = ITEMS.register("emerald_katana",
            () -> new SwordItem(ModToolTiers.EMERALD, 5,-2.0f,
                    new SwordItem.Properties().durability(256)));
    public static final RegistryObject<Item> EMERALD_LONGSWORD = ITEMS.register("emerald_longsword",
            () -> new SwordItem(ModToolTiers.EMERALD, 8,-3.3f,
                    new SwordItem.Properties().durability(256)));

    /* EX Weapons*/
    public static final RegistryObject<Item> HATTORI_HANZO_KATANA = ITEMS.register("hattori_hanzo_katana",
            () -> new HattoriHanzoKatanaItem(Tiers.NETHERITE, 6,-2.0f,
                    new Item.Properties().durability(256).fireResistant()));

    public static final RegistryObject<Item> MASTER_SWORD = ITEMS.register("master_sword",
            () -> new SwordItem(Tiers.NETHERITE, 6, -2.0f,
                    new Item.Properties().fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}