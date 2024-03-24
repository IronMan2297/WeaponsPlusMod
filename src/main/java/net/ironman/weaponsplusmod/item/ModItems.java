package net.ironman.weaponsplusmod.item;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
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
            () -> new SwordItem(ModToolTiers.HELL, 3,-0.2f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_KATANA = ITEMS.register("hell_katana",
            () -> new SwordItem(ModToolTiers.HELL, 5,-2.0f,
                    new Item.Properties().durability(256).fireResistant()));
    public static final RegistryObject<Item> HELL_LONGSWORD = ITEMS.register("hell_longsword",
            () -> new SwordItem(ModToolTiers.HELL, 8,-3.3f,
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

    /* Hattori Hanzo Katana*/
    public static final RegistryObject<Item> HATTORI_HANZO_KATANA = ITEMS.register("hattori_hanzo_katana",
            () -> new HattoriHanzoKatanaItem(Tiers.NETHERITE, 6,-2.0f,
                    new Item.Properties().durability(256).fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
