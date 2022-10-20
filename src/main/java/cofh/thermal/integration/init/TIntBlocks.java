package cofh.thermal.integration.init;

import cofh.thermal.core.util.RegistrationHelper;

import static cofh.lib.util.constants.ModIds.ID_THERMAL_INTEGRATION;
import static cofh.thermal.core.util.RegistrationHelper.registerBlock;
import static cofh.thermal.lib.common.ThermalFlags.*;
import static cofh.thermal.lib.common.ThermalIDs.ID_ROSE_GOLD_BLOCK;
import static cofh.thermal.lib.common.ThermalIDs.ID_STEEL_BLOCK;

public class TIntBlocks {

    private TIntBlocks() {

    }

    public static void register() {


        //        registerBlock(ID_ALUMINUM_BLOCK, TCoreBlocks::storageBlock, getFlag(FLAG_RESOURCE_ALUMINUM));
        //        registerBlock(ID_URANIUM_BLOCK, TCoreBlocks::storageBlock, getFlag(FLAG_RESOURCE_URANIUM));

        registerBlock(ID_STEEL_BLOCK, RegistrationHelper::storageBlock, getFlag(FLAG_RESOURCE_STEEL), ID_THERMAL_INTEGRATION);
        registerBlock(ID_ROSE_GOLD_BLOCK, RegistrationHelper::storageBlock, getFlag(FLAG_RESOURCE_ROSE_GOLD), ID_THERMAL_INTEGRATION);
    }

}
