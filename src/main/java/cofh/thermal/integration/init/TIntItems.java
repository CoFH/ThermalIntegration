package cofh.thermal.integration.init;

import net.minecraft.world.item.Rarity;

import static cofh.lib.util.constants.ModIds.ID_THERMAL_INTEGRATION;
import static cofh.thermal.core.util.RegistrationHelper.registerMetalSet;

public class TIntItems {

    private TIntItems() {

    }

    public static void register() {

        //        registerMetalSet("aluminum", group, getFlag(FLAG_RESOURCE_ALUMINUM));
        //        registerMetalSet("uranium", group, getFlag(FLAG_RESOURCE_URANIUM));

        registerMetalSet("steel", Rarity.COMMON, false, true, ID_THERMAL_INTEGRATION);
        registerMetalSet("rose_gold", Rarity.COMMON, false, true, ID_THERMAL_INTEGRATION);
    }

}
