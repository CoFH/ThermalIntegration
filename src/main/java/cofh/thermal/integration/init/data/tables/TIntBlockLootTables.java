package cofh.thermal.integration.init.data.tables;

import cofh.lib.init.data.loot.BlockLootSubProviderCoFH;

import static cofh.thermal.core.ThermalCore.BLOCKS;
import static cofh.thermal.core.ThermalCore.ITEMS;
import static cofh.thermal.core.util.RegistrationHelper.deepslate;
import static cofh.thermal.lib.util.ThermalIDs.*;
import static cofh.thermal.lib.util.ThermalIDs.ID_URANIUM_ORE;

public class TIntBlockLootTables extends BlockLootSubProviderCoFH {

    @Override
    protected void generate() {

        var regBlocks = BLOCKS;
        var regItems = ITEMS;

        createSimpleDropTable(regBlocks.get(ID_ALUMINUM_BLOCK));
        createSimpleDropTable(regBlocks.get(ID_ROSE_GOLD_BLOCK));
        createSimpleDropTable(regBlocks.get(ID_STEEL_BLOCK));
        createSimpleDropTable(regBlocks.get(ID_URANIUM_BLOCK));

        add(regBlocks.get(ID_ALUMINUM_ORE), getSilkTouchOreTable(regBlocks.get(ID_ALUMINUM_ORE), regItems.get("raw_aluminum")));
        add(regBlocks.get(ID_URANIUM_ORE), getSilkTouchOreTable(regBlocks.get(ID_URANIUM_ORE), regItems.get("raw_uranium")));

        add(regBlocks.get(deepslate(ID_ALUMINUM_ORE)), getSilkTouchOreTable(regBlocks.get(deepslate(ID_ALUMINUM_ORE)), regItems.get("raw_aluminum")));
        add(regBlocks.get(deepslate(ID_URANIUM_ORE)), getSilkTouchOreTable(regBlocks.get(deepslate(ID_URANIUM_ORE)), regItems.get("raw_uranium")));
    }

}
