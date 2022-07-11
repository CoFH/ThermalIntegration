package cofh.thermal.integration.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Rarity;

import static cofh.lib.util.constants.ModIds.ID_THERMAL_INTEGRATION;
import static cofh.thermal.core.util.RegistrationHelper.registerMetalSet;
import static cofh.thermal.lib.common.ThermalFlags.*;
import static cofh.thermal.lib.common.ThermalItemGroups.THERMAL_ITEMS;

public class TIntItems {

    private TIntItems() {

    }

    public static void register() {

        CreativeModeTab group = THERMAL_ITEMS;

        //        registerMetalSet("aluminum", group, getFlag(FLAG_RESOURCE_ALUMINUM));
        //        registerMetalSet("uranium", group, getFlag(FLAG_RESOURCE_URANIUM));

        registerMetalSet("steel", group, Rarity.COMMON, getFlag(FLAG_RESOURCE_STEEL), false, true, ID_THERMAL_INTEGRATION);
        registerMetalSet("rose_gold", group, Rarity.COMMON, getFlag(FLAG_RESOURCE_ROSE_GOLD), false, true, ID_THERMAL_INTEGRATION);
    }

}
