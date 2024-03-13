package net.ironman.weaponsplusmod.item;

import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.ironman.weaponsplusmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import javax.security.auth.login.Configuration;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeaponsPlusMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("ores_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HELL_GEM.get()))
                    .title(Component.translatable("creativetab.ores_tab"))
                    .displayItems((Parameters, output) -> {
                        output.accept(ModItems.RAW_HELL_GEM.get());
                        output.accept(ModItems.HELL_GEM.get());

                        output.accept(ModBlocks.HELL_GEM_BLOCK.get());
                        output.accept(ModBlocks.NETHER_HELL_ORE.get());

                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
