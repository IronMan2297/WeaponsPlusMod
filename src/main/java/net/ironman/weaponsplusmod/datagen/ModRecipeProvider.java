package net.ironman.weaponsplusmod.datagen;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.ironman.weaponsplusmod.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
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
        makeBow(pWriter, ModItems.ENDERITE_INGOT.get(), ModItems.ENDERITE_BOW.get());
        makeBow(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_BOW.get());
        makeBow(pWriter, ModItems.RUBY.get(), ModItems.RUBY_BOW.get());
        makeBow(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_BOW.get());

        /* Apples */
        makeApple(pWriter, ModItems.HELL_GEM.get(), ModItems.HELL_APPLE.get());
        makeApple(pWriter, ModItems.AQUA_PEARL.get(), ModItems.AQUA_APPLE.get());
        makeApple(pWriter, ModItems.ENDERIUM_INGOT.get(), ModItems.ENDERIUM_APPLE.get());
        makeApple(pWriter, ModItems.AMBER_CRYSTAL.get(), ModItems.AMBER_APPLE.get());
        makeApple(pWriter, ModItems.ELECTRUM_INGOT.get(), ModItems.ELECTRUM_APPLE.get());



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
}
