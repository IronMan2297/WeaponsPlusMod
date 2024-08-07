package net.ironman.weaponsplusmod.item;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    HELL("hell", 24, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266655_) -> {
        p_266655_.put(ArmorItem.Type.BOOTS, 4);
        p_266655_.put(ArmorItem.Type.LEGGINGS, 5);
        p_266655_.put(ArmorItem.Type.CHESTPLATE, 7);
        p_266655_.put(ArmorItem.Type.HELMET, 4);
    }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.of(ModItems.HELL_GEM.get())),

    AQUA("aqua", 19, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266655_) -> {
        p_266655_.put(ArmorItem.Type.BOOTS, 3);
        p_266655_.put(ArmorItem.Type.LEGGINGS, 5);
        p_266655_.put(ArmorItem.Type.CHESTPLATE, 6);
        p_266655_.put(ArmorItem.Type.HELMET, 4);
    }), 15, SoundEvents.ARMOR_EQUIP_TURTLE, 2.5F, 0.0F, () -> Ingredient.of(ModItems.AQUA_PEARL.get())),

    EMERALD("emerald", 20, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_123456_) -> {
        p_123456_.put(ArmorItem.Type.BOOTS, 2);
        p_123456_.put(ArmorItem.Type.LEGGINGS, 5);
        p_123456_.put(ArmorItem.Type.CHESTPLATE, 6);
        p_123456_.put(ArmorItem.Type.HELMET, 2);
    }), 12, SoundEvents.ARMOR_EQUIP_GENERIC, 1F, 0.0F, () -> Ingredient.of(Items.EMERALD)),

    ENDERITE("enderite", 20, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_123456_) -> {
        p_123456_.put(ArmorItem.Type.BOOTS, 4);
        p_123456_.put(ArmorItem.Type.LEGGINGS, 7);
        p_123456_.put(ArmorItem.Type.CHESTPLATE, 9);
        p_123456_.put(ArmorItem.Type.HELMET, 4);
    }), 12, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.5F, 0.2F, () -> Ingredient.of(ModItems.ENDERITE_INGOT.get())),

    ENDERIUM("enderium", 20, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_123456_) -> {
        p_123456_.put(ArmorItem.Type.BOOTS, 4);
        p_123456_.put(ArmorItem.Type.LEGGINGS, 9);
        p_123456_.put(ArmorItem.Type.CHESTPLATE, 7);
        p_123456_.put(ArmorItem.Type.HELMET, 4);
    }), 12, SoundEvents.ARMOR_EQUIP_NETHERITE, 2F, 0.1F, () -> Ingredient.of(ModItems.ENDERITE_INGOT.get())),

    AMBER("amber", 20, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_123456_) -> {
        p_123456_.put(ArmorItem.Type.BOOTS, 2);
        p_123456_.put(ArmorItem.Type.LEGGINGS, 4);
        p_123456_.put(ArmorItem.Type.CHESTPLATE, 5);
        p_123456_.put(ArmorItem.Type.HELMET, 2);
    }), 12, SoundEvents.ARMOR_EQUIP_NETHERITE, 0F, 0.0F, () -> Ingredient.of(ModItems.AMBER_CRYSTAL.get())),

    RUBY("ruby", 20, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_123456_) -> {
        p_123456_.put(ArmorItem.Type.BOOTS, 2);
        p_123456_.put(ArmorItem.Type.LEGGINGS, 5);
        p_123456_.put(ArmorItem.Type.CHESTPLATE, 6);
        p_123456_.put(ArmorItem.Type.HELMET, 2);
    }), 12, SoundEvents.ARMOR_EQUIP_NETHERITE, 1.5F, 0.1F, () -> Ingredient.of(ModItems.RUBY.get())),

    ELECTRUM("electrum", 20, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_123456_) -> {
        p_123456_.put(ArmorItem.Type.BOOTS, 3);
        p_123456_.put(ArmorItem.Type.LEGGINGS, 5);
        p_123456_.put(ArmorItem.Type.CHESTPLATE, 7);
        p_123456_.put(ArmorItem.Type.HELMET, 4);
    }), 12, SoundEvents.ARMOR_EQUIP_NETHERITE, 1F, 0.0F, () -> Ingredient.of(ModItems.ELECTRUM_INGOT.get())); // replace ';' with ',' for more MAterials!




    public static final StringRepresentable.EnumCodec<ArmorMaterials> CODEC = StringRepresentable.fromEnum(ArmorMaterials::values);
    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266653_) -> {
        p_266653_.put(ArmorItem.Type.BOOTS, 13);
        p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
        p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
        p_266653_.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionTypeMap,
                      int enchantmentValue, SoundEvent soundEvent, float toughness, float knockbackRes, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionFunctionForType = protectionTypeMap;
        this.enchantmentValue = enchantmentValue;
        this.sound = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackRes;
        this.repairIngredient = repairMaterial;
    }

    public int getDurabilityForType(ArmorItem.Type p_266745_) {
        return HEALTH_FUNCTION_FOR_TYPE.get(p_266745_) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.Type p_266752_) {
        return this.protectionFunctionForType.get(p_266752_);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return WeaponsPlusMod.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String getSerializedName() {
        return WeaponsPlusMod.MOD_ID + ":" + this.name;
    }
}