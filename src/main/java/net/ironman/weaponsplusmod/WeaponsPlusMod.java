package net.ironman.weaponsplusmod;

import com.mojang.logging.LogUtils;
import net.ironman.weaponsplusmod.block.ModBlocks;
import net.ironman.weaponsplusmod.item.ModCreativeModeTabs;
import net.ironman.weaponsplusmod.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(WeaponsPlusMod.MOD_ID)

public class WeaponsPlusMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "weaponsplusmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public WeaponsPlusMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.WOODEN_MULTITOOL);
            event.accept(ModItems.STONE_MULTITOOL);
            event.accept(ModItems.IRON_MULTITOOL);
            event.accept(ModItems.GOLDEN_MULTITOOL);
            event.accept(ModItems.DIAMOND_MULTITOOL);
            event.accept(ModItems.NETHERITE_MULTITOOL);
            event.accept(ModItems.EMERALD_SHOVEL);
            event.accept(ModItems.EMERALD_PICKAXE);
            event.accept(ModItems.EMERALD_AXE);
            event.accept(ModItems.EMERALD_HOE);
            event.accept(ModItems.EMERALD_MULTITOOL);
        }

        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
        event.accept(ModItems.EMERALD_SWORD);
        event.accept(ModItems.EMERALD_AXE);
        event.accept(ModItems.EMERALD_HELMET);
        event.accept(ModItems.EMERALD_CHESTPLATE);
        event.accept(ModItems.EMERALD_LEGGINGS);
        event.accept(ModItems.EMERALD_BOOTS);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
