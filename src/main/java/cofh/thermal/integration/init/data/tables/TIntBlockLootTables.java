package cofh.thermal.integration.init.data.tables;

import cofh.lib.init.data.loot.BlockLootSubProviderCoFH;

import static cofh.thermal.core.ThermalCore.BLOCKS;
import static cofh.thermal.core.ThermalCore.ITEMS;
import static cofh.thermal.lib.init.ThermalIDs.ID_ROSE_GOLD_BLOCK;
import static cofh.thermal.lib.init.ThermalIDs.ID_STEEL_BLOCK;

public class TIntBlockLootTables extends BlockLootSubProviderCoFH {

    @Override
    protected void generate() {

        var regBlocks = BLOCKS;
        var regItems = ITEMS;

        createSimpleDropTable(regBlocks.get(ID_ROSE_GOLD_BLOCK));
        createSimpleDropTable(regBlocks.get(ID_STEEL_BLOCK));
    }

}
