package cofh.thermal.integration.init.data.providers;

import cofh.lib.init.data.BlockStateProviderCoFH;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

import static cofh.lib.util.constants.ModIds.ID_THERMAL;
import static cofh.thermal.core.ThermalCore.BLOCKS;
import static cofh.thermal.lib.util.ThermalIDs.ID_ROSE_GOLD_BLOCK;
import static cofh.thermal.lib.util.ThermalIDs.ID_STEEL_BLOCK;

public class TIntBlockStateProvider extends BlockStateProviderCoFH {

    public TIntBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {

        super(output, ID_THERMAL, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        var reg = BLOCKS;

        simpleBlock(reg.getSup(ID_STEEL_BLOCK));
        simpleBlock(reg.getSup(ID_ROSE_GOLD_BLOCK));
    }

}
