package net.ironman.weaponsplusmod.villager;

import com.google.common.collect.ImmutableSet;
import net.ironman.weaponsplusmod.WeaponsPlusMod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, WeaponsPlusMod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, WeaponsPlusMod.MOD_ID);

    public static final RegistryObject<PoiType> BLACKSMITH_POI = POI_TYPES.register("blacksmith_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.ANVIL.getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> BLACKSMITH =
            VILLAGER_PROFESSIONS.register("blacksmith", () -> new VillagerProfession("blacksmith",
                    x -> x.get() == BLACKSMITH_POI.get(), x -> x.get() == BLACKSMITH_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));


    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
