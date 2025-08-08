package net.ironman.weaponsplusmod.datagen;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.ironman.weaponsplusmod.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        /* Bows */
        makeBow(pWriter, ModItems.HELL_GEM.get(), ModItems.HELL_BOW.get());
        makeBow(pWriter, ModItems.AQUA_PEARL.get(), ModItems.AQUA_BOW.get());
        makeBow(pWriter, ModItems.ENDERIUM_INGOT.get(), ModItems.ENDERIUM_BOW.get());
        makeBow(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_BOW.get());
        makeBow(pWriter, ModItems.RUBY.get(), ModItems.RUBY_BOW.get());
        makeBow(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_BOW.get());

        /* Apples */
        makeApple(pWriter, ModItems.HELL_GEM.get(), ModItems.HELL_APPLE.get());
        makeApple(pWriter, ModItems.AQUA_PEARL.get(), ModItems.AQUA_APPLE.get());
        makeApple(pWriter, ModItems.ENDERIUM_INGOT.get(), ModItems.ENDERIUM_APPLE.get());
        makeApple(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_APPLE.get());
        makeApple(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_APPLE.get());

        /* Axes */
        makeAxe(pWriter, ModItems.HELL_GEM.get(), ModItems.HELL_AXE.get());
        makeAxe(pWriter, ModItems.AQUA_PEARL.get(), ModItems.AQUA_AXE.get());
        makeAxe(pWriter, ModItems.ENDERIUM_INGOT.get(), ModItems.ENDERIUM_AXE.get());
        makeAxe(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_AXE.get());
        makeAxe(pWriter, ModItems.RUBY.get(), ModItems.RUBY_AXE.get());
        makeAxe(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_AXE.get());
        makeAxe(pWriter, Items.EMERALD, ModItems.EMERALD_AXE.get());

        /* BattleAxes */
        makeBattleAxe(pWriter, ModItems.HELL_GEM.get(), ModItems.HELL_BATTLE_AXE.get());
        makeBattleAxe(pWriter, ModItems.AQUA_PEARL.get(), ModItems.AQUA_BATTLE_AXE.get());
        makeBattleAxe(pWriter, ModItems.ENDERIUM_INGOT.get(), ModItems.ENDERIUM_BATTLE_AXE.get());
        makeBattleAxe(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_BATTLE_AXE.get());
        makeBattleAxe(pWriter, ModItems.RUBY.get(), ModItems.RUBY_BATTLE_AXE.get());
        makeBattleAxe(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_BATTLE_AXE.get());
        makeBattleAxe(pWriter, Items.EMERALD, ModItems.EMERALD_BATTLE_AXE.get());

        /* Cutlass */
        makeCutlass(pWriter, ModItems.HELL_GEM.get(), ModItems.HELL_CUTLASS.get());
        makeCutlass(pWriter, ModItems.AQUA_PEARL.get(), ModItems.AQUA_CUTLASS.get());
        makeCutlass(pWriter, ModItems.ENDERIUM_INGOT.get(), ModItems.ENDERIUM_CUTLASS.get());
        makeCutlass(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_CUTLASS.get());
        makeCutlass(pWriter, ModItems.RUBY.get(), ModItems.RUBY_CUTLASS.get());
        makeCutlass(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_CUTLASS.get());
        makeCutlass(pWriter, Items.EMERALD, ModItems.EMERALD_CUTLASS.get());

        /* Dagger */
        makeDagger(pWriter, ModItems.HELL_GEM.get(), ModItems.HELL_DAGGER.get());
        makeDagger(pWriter, ModItems.AQUA_PEARL.get(), ModItems.AQUA_DAGGER.get());
        makeDagger(pWriter, ModItems.ENDERIUM_INGOT.get(), ModItems.ENDERIUM_DAGGER.get());
        makeDagger(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_DAGGER.get());
        makeDagger(pWriter, ModItems.RUBY.get(), ModItems.RUBY_DAGGER.get());
        makeDagger(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_DAGGER.get());
        makeDagger(pWriter, Items.EMERALD, ModItems.EMERALD_DAGGER.get());

        /* Hoe */
        makeHoe(pWriter, ModItems.HELL_GEM.get(), ModItems.HELL_HOE.get());
        makeHoe(pWriter, ModItems.AQUA_PEARL.get(), ModItems.AQUA_HOE.get());
        makeHoe(pWriter, ModItems.ENDERIUM_INGOT.get(), ModItems.ENDERIUM_HOE.get());
        makeHoe(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_HOE.get());
        makeHoe(pWriter, ModItems.RUBY.get(), ModItems.RUBY_HOE.get());
        makeHoe(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_HOE.get());
        makeHoe(pWriter, Items.EMERALD, ModItems.EMERALD_HOE.get());

        /* Katana */
        makeKatana(pWriter, ModItems.HELL_GEM.get(), ModItems.HELL_SWORD.get(), ModItems.HELL_KATANA.get());
        makeKatana(pWriter, ModItems.AQUA_PEARL.get(), ModItems.AQUA_SWORD.get(), ModItems.AQUA_KATANA.get());
        makeKatana(pWriter, ModItems.ENDERIUM_INGOT.get(), ModItems.ENDERIUM_SWORD.get(), ModItems.ENDERIUM_KATANA.get());
        makeKatana(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_SWORD.get(), ModItems.AMBER_KATANA.get());
        makeKatana(pWriter, ModItems.RUBY.get(), ModItems.RUBY_SWORD.get(), ModItems.RUBY_KATANA.get());
        makeKatana(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_SWORD.get(), ModItems.ELECTRUM_KATANA.get());
        makeKatana(pWriter, Items.EMERALD, ModItems.EMERALD_SWORD.get(), ModItems.EMERALD_KATANA.get());

        /* Longsword */
        makeLongsword(pWriter, ModItems.HELL_GEM.get(), ModItems.HELL_SWORD.get(), ModItems.HELL_LONGSWORD.get());
        makeLongsword(pWriter, ModItems.AQUA_PEARL.get(), ModItems.AQUA_SWORD.get(), ModItems.AQUA_LONGSWORD.get());
        makeLongsword(pWriter, ModItems.ENDERIUM_INGOT.get(), ModItems.ENDERIUM_SWORD.get(), ModItems.ENDERIUM_LONGSWORD.get());
        makeLongsword(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_SWORD.get(), ModItems.AMBER_LONGSWORD.get());
        makeLongsword(pWriter, ModItems.RUBY.get(), ModItems.RUBY_SWORD.get(), ModItems.RUBY_LONGSWORD.get());
        makeLongsword(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_SWORD.get(), ModItems.ELECTRUM_LONGSWORD.get());
        makeLongsword(pWriter, Items.EMERALD, ModItems.EMERALD_SWORD.get(), ModItems.EMERALD_LONGSWORD.get());

        /* Pickaxe */
        makePickaxe(pWriter, ModItems.HELL_GEM.get(), ModItems.HELL_PICKAXE.get());
        makePickaxe(pWriter, ModItems.AQUA_PEARL.get(), ModItems.AQUA_PICKAXE.get());
        makePickaxe(pWriter, ModItems.ENDERIUM_INGOT.get(), ModItems.ENDERIUM_PICKAXE.get());
        makePickaxe(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_PICKAXE.get());
        makePickaxe(pWriter, ModItems.RUBY.get(), ModItems.RUBY_PICKAXE.get());
        makePickaxe(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_PICKAXE.get());
        makePickaxe(pWriter, Items.EMERALD, ModItems.EMERALD_PICKAXE.get());

        /* Rapier */
        makeRapier(pWriter, ModItems.HELL_GEM.get(), ModItems.HELL_RAPIER.get());
        makeRapier(pWriter, ModItems.AQUA_PEARL.get(), ModItems.AQUA_RAPIER.get());
        makeRapier(pWriter, ModItems.ENDERIUM_INGOT.get(), ModItems.ENDERIUM_RAPIER.get());
        makeRapier(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_RAPIER.get());
        makeRapier(pWriter, ModItems.RUBY.get(), ModItems.RUBY_RAPIER.get());
        makeRapier(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_RAPIER.get());
        makeRapier(pWriter, Items.EMERALD, ModItems.EMERALD_RAPIER.get());

        /* Shovel */
        makeShovel(pWriter, ModItems.HELL_GEM.get(), ModItems.HELL_SHOVEL.get());
        makeShovel(pWriter, ModItems.AQUA_PEARL.get(), ModItems.AQUA_SHOVEL.get());
        makeShovel(pWriter, ModItems.ENDERIUM_INGOT.get(), ModItems.ENDERIUM_SHOVEL.get());
        makeShovel(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_SHOVEL.get());
        makeShovel(pWriter, ModItems.RUBY.get(), ModItems.RUBY_SHOVEL.get());
        makeShovel(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_SHOVEL.get());
        makeShovel(pWriter, Items.EMERALD, ModItems.EMERALD_SHOVEL.get());

        /* Sword */
        makeSword(pWriter, ModItems.HELL_GEM.get(), ModItems.HELL_SWORD.get());
        makeSword(pWriter, ModItems.AQUA_PEARL.get(), ModItems.AQUA_SWORD.get());
        makeSword(pWriter, ModItems.ENDERIUM_INGOT.get(), ModItems.ENDERIUM_SWORD.get());
        makeSword(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_SWORD.get());
        makeSword(pWriter, ModItems.RUBY.get(), ModItems.RUBY_SWORD.get());
        makeSword(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_SWORD.get());
        makeSword(pWriter, Items.EMERALD, ModItems.EMERALD_SWORD.get());





    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, WeaponsPlusMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void makeBow(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredient, ItemLike pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pResult)
                .pattern(" MS")
                .pattern("M S")
                .pattern(" MS")
                .define('M', pIngredient)
                .define('S', Tags.Items.STRING)
                .unlockedBy("has_" + pIngredient.toString(), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pIngredient).build()))
                .save(pFinishedRecipeConsumer);
    }

    protected static void makeApple(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredient, ItemLike pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, pResult)
                .pattern("MMM")
                .pattern("MAM")
                .pattern("MMM")
                .define('M', pIngredient)
                .define('A', Items.APPLE)
                .unlockedBy("has_" + pIngredient.toString(), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pIngredient).build()))
                .save(pFinishedRecipeConsumer);
    }

    protected static void makeAxe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredient, ItemLike pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pResult)
                .pattern("MM ")
                .pattern("MS ")
                .pattern(" S ")
                .define('M', pIngredient)
                .define('S', Items.STICK)
                .unlockedBy("has_" + pIngredient.toString(), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pIngredient).build()))
                .save(pFinishedRecipeConsumer);
    }

    protected static void makeBattleAxe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredient, ItemLike pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pResult)
                .pattern("MMM")
                .pattern("MS ")
                .pattern(" S ")
                .define('M', pIngredient)
                .define('S', Items.STICK)
                .unlockedBy("has_" + pIngredient.toString(), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pIngredient).build()))
                .save(pFinishedRecipeConsumer);
    }

    protected static void makeCutlass(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredient, ItemLike pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pResult)
                .pattern("  M")
                .pattern(" MM")
                .pattern(" S ")
                .define('M', pIngredient)
                .define('S', Items.STICK)
                .unlockedBy("has_" + pIngredient.toString(), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pIngredient).build()))
                .save(pFinishedRecipeConsumer);
    }

    protected static void makeDagger(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredient, ItemLike pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pResult)
                .pattern(" M ")
                .pattern(" G ")
                .pattern(" S ")
                .define('M', pIngredient)
                .define('S', Items.STICK)
                .define('G', Items.GOLD_NUGGET)
                .unlockedBy("has_" + pIngredient.toString(), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pIngredient).build()))
                .save(pFinishedRecipeConsumer);
    }

    protected static void makeHoe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredient, ItemLike pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pResult)
                .pattern("MM ")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', pIngredient)
                .define('S', Items.STICK)
                .unlockedBy("has_" + pIngredient.toString(), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pIngredient).build()))
                .save(pFinishedRecipeConsumer);
    }

    protected static void makeKatana(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredient, ItemLike pSword, ItemLike pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pResult)
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" S ")
                .define('M', pIngredient)
                .define('S', pSword)
                .unlockedBy("has_" + pIngredient.toString(), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pIngredient).build()))
                .save(pFinishedRecipeConsumer);
    }

    protected static void makeLongsword(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredient, ItemLike pSword, ItemLike pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pResult)
                .pattern(" M ")
                .pattern(" M ")
                .pattern("MSM")
                .define('M', pIngredient)
                .define('S', pSword)
                .unlockedBy("has_" + pIngredient.toString(), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pIngredient).build()))
                .save(pFinishedRecipeConsumer);
    }

    protected static void makePickaxe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredient, ItemLike pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pResult)
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', pIngredient)
                .define('S', Items.STICK)
                .unlockedBy("has_" + pIngredient.toString(), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pIngredient).build()))
                .save(pFinishedRecipeConsumer);
    }

    protected static void makeRapier(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredient, ItemLike pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pResult)
                .pattern(" M ")
                .pattern(" M ")
                .pattern("MSM")
                .define('M', pIngredient)
                .define('S', Items.STICK)
                .unlockedBy("has_" + pIngredient.toString(), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pIngredient).build()))
                .save(pFinishedRecipeConsumer);
    }

    protected static void makeShovel(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredient, ItemLike pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pResult)
                .pattern(" M ")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', pIngredient)
                .define('S', Items.STICK)
                .unlockedBy("has_" + pIngredient.toString(), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pIngredient).build()))
                .save(pFinishedRecipeConsumer);
    }

    protected static void makeSword(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredient, ItemLike pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pResult)
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" S ")
                .define('M', pIngredient)
                .define('S', Items.STICK)
                .unlockedBy("has_" + pIngredient.toString(), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pIngredient).build()))
                .save(pFinishedRecipeConsumer);
    }
}
