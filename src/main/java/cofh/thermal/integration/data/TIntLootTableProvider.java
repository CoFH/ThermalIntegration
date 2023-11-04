//package cofh.thermal.integration.data;
//
//import cofh.lib.data.LootTableProviderCoFH;
//import net.minecraft.data.DataGenerator;
//
//import static cofh.thermal.core.ThermalCore.BLOCKS;
//import static cofh.thermal.core.ThermalCore.ITEMS;
//import static cofh.thermal.lib.common.ThermalIDs.ID_ROSE_GOLD_BLOCK;
//import static cofh.thermal.lib.common.ThermalIDs.ID_STEEL_BLOCK;
//
//public class TIntLootTableProvider extends LootTableProviderCoFH {
//
//    public TIntLootTableProvider(DataGenerator gen) {
//
//        super(gen);
//    }
//
//    @Override
//    public String getName() {
//
//        return "Thermal Integration: Loot Tables";
//    }
//
//    @Override
//    protected void addTables() {
//
//        var regBlocks = BLOCKS;
//        var regItems = ITEMS;
//
//        createSimpleDropTable(regBlocks.get(ID_ROSE_GOLD_BLOCK));
//        createSimpleDropTable(regBlocks.get(ID_STEEL_BLOCK));
//    }
//
//}
