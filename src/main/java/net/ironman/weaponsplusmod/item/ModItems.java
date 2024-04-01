package net.ironman.weaponsplusmod.item;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.ironman.weaponsplusmod.item.custom.BurningSwordItem;
import net.ironman.weaponsplusmod.item.custom.HammerItem;
import net.ironman.weaponsplusmod.item.custom.HattoriHanzoKatanaItem;
import net.ironman.weaponsplusmod.item.custom.ModArmorItem;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> IRON_ROD = ITEMS.register("iron_rod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AQUA_PEARL = ITEMS.register("aqua_pearl",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHARD_OF_THE_OCEAN = ITEMS.register("shard_of_the_ocean",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.create("UNDERWATER", ChatFormatting.AQUA))));

    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer",
            () -> new HammerItem(ModToolTiers.IRON, 2, -3.4f, new Item.Properties().durability(256)));

    /* Standart Hell Weapons and Tools */
    public static final RegistryObject<Item> HELL_SWORD = ITEMS.register("hell_sword",
            () -> new SwordItem(ModToolTiers.HELL, 4,-2.4f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_AXE = ITEMS.register("hell_axe",
            () -> new AxeItem(ModToolTiers.HELL, 6,-3f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_PICKAXE = ITEMS.register("hell_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HELL, 2,-2.8f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_SHOVEL = ITEMS.register("hell_shovel",
            () -> new ShovelItem(ModToolTiers.HELL, 3,-3f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_HOE = ITEMS.register("hell_hoe",
            () -> new HoeItem(ModToolTiers.HELL, -3,0,
                    new Item.Properties().durability(256).fireResistant()));

    /* Special Hell Weapons */
    public static final RegistryObject<Item> HELL_BATTLE_AXE = ITEMS.register("hell_battle_axe",
            () -> new AxeItem(ModToolTiers.HELL, 7,-3.2f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_DOUBLE_AXE = ITEMS.register("hell_double_axe",
            () -> new AxeItem(ModToolTiers.HELL, 9,-3.4f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_RAPIER = ITEMS.register("hell_rapier",
            () -> new SwordItem(ModToolTiers.HELL, 3,-1.4f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_CUTLASS = ITEMS.register("hell_cutlass",
            () -> new SwordItem(ModToolTiers.HELL, 6,-2.8f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_DAGGER = ITEMS.register("hell_dagger",
            () -> new SwordItem(ModToolTiers.HELL,2,-0.2f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_KATANA = ITEMS.register("hell_katana",
            () -> new SwordItem(ModToolTiers.HELL, 5,-2.0f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_LONGSWORD = ITEMS.register("hell_longsword",
            () -> new SwordItem(ModToolTiers.HELL, 8,-3.3f,
                    new Item.Properties().durability(256).fireResistant()));

    public static final RegistryObject<Item> BURNING_SWORD = ITEMS.register("burning_sword",
            () -> new BurningSwordItem(ModToolTiers.HELL, 4,-2.4f,
                    new Item.Properties().durability(256).fireResistant()));

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

    /* Special Aqua Weapons */
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

    /* Aqua Armor */
    public static final RegistryObject<Item> AQUA_HELMET = ITEMS.register("aqua_helmet",
            () -> new ModArmorItem(ModArmorMaterials.AQUA, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> AQUA_CHESTPLATE = ITEMS.register("aqua_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.AQUA, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> AQUA_LEGGINGS = ITEMS.register("aqua_leggings",
            () -> new ModArmorItem(ModArmorMaterials.AQUA, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> AQUA_BOOTS = ITEMS.register("aqua_boots",
            () -> new ModArmorItem(ModArmorMaterials.AQUA, ArmorItem.Type.BOOTS, new Item.Properties()));

    /* Hattori Hanzo Katana*/
    public static final RegistryObject<Item> HATTORI_HANZO_KATANA = ITEMS.register("hattori_hanzo_katana",
            () -> new HattoriHanzoKatanaItem(Tiers.NETHERITE, 6,-2.0f,
                    new Item.Properties().durability(256).fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}