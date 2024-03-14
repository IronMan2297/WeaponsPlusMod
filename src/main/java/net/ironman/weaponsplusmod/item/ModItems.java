package net.ironman.weaponsplusmod.item;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
