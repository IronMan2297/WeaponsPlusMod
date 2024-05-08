package net.ironman.weaponsplusmod.util;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(WeaponsPlusMod.MOD_ID, name));
        }
        private static TagKey<Item> forgetag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> NEEDS_HELL_TOOL = tag("needs_hell_tool");
        public static final TagKey<Block> NEEDS_AQUA_TOOL = tag("needs_aqua_tool");
        public static final TagKey<Block> NEEDS_ENDERITE_TOOL = tag("needs_enderite_tool");
        public static final TagKey<Block> NEEDS_ENDERIUM_TOOL = tag("needs_enderium_tool");
        public static final TagKey<Block> NEEDS_AMBER_TOOL = tag("needs_amber_tool");
        public static final TagKey<Block> PAXEL_MINEABLE = tag("mineable/paxel");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(WeaponsPlusMod.MOD_ID, name));
        }
        private static TagKey<Block> forgetag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
