//package cofh.thermal.integration.data;
//
//import cofh.lib.data.BlockStateProviderCoFH;
//import net.minecraft.data.DataGenerator;
//import net.minecraftforge.common.data.ExistingFileHelper;
//
//import static cofh.lib.util.constants.ModIds.ID_THERMAL;
//import static cofh.thermal.core.ThermalCore.BLOCKS;
//import static cofh.thermal.lib.common.ThermalIDs.ID_ROSE_GOLD_BLOCK;
//import static cofh.thermal.lib.common.ThermalIDs.ID_STEEL_BLOCK;
//
//public class TIntBlockStateProvider extends BlockStateProviderCoFH {
//
//    public TIntBlockStateProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
//
//        super(gen, ID_THERMAL, existingFileHelper);
//    }
//
//    @Override
//    public String getName() {
//
//        return "Thermal Integration: BlockStates";
//    }
//
//    @Override
//    protected void registerStatesAndModels() {
//
//        var reg = BLOCKS;
//
//        simpleBlock(reg.getSup(ID_STEEL_BLOCK));
//        simpleBlock(reg.getSup(ID_ROSE_GOLD_BLOCK));
//    }
//
//}
