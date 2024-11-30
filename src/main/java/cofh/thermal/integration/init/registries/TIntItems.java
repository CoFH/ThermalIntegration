package cofh.thermal.integration.init.registries;

import net.minecraft.world.item.Rarity;

import static cofh.lib.util.constants.ModIds.ID_THERMAL_INTEGRATION;
import static cofh.thermal.core.util.RegistrationHelper.registerMetalSet;

public class TIntItems {

    private TIntItems() {

    }

    public static void register() {

        registerMetalSet("aluminum", Rarity.COMMON, false, false, ID_THERMAL_INTEGRATION, 1001);
        registerMetalSet("uranium", Rarity.COMMON, false, false, ID_THERMAL_INTEGRATION, 1001);
        registerMetalSet("rose_gold", Rarity.COMMON, false, true, ID_THERMAL_INTEGRATION, 1051);
        registerMetalSet("steel", Rarity.COMMON, false, true, ID_THERMAL_INTEGRATION, 1051);
    }

}
