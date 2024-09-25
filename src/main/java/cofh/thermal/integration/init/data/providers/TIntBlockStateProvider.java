package cofh.thermal.integration.init.data.providers;

import cofh.lib.init.data.BlockStateProviderCoFH;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

import static cofh.lib.util.constants.ModIds.ID_THERMAL;
import static cofh.thermal.core.ThermalCore.BLOCKS;
import static cofh.thermal.core.util.RegistrationHelper.deepslate;
import static cofh.thermal.core.util.RegistrationHelper.raw;
import static cofh.thermal.lib.util.ThermalIDs.*;

public class TIntBlockStateProvider extends BlockStateProviderCoFH {

    public TIntBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {

        super(output, ID_THERMAL, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        var reg = BLOCKS;

        simpleBlock(reg.getSup(ID_ALUMINUM_ORE));
        simpleBlock(reg.getSup(deepslate(ID_ALUMINUM_ORE)));
        simpleBlock(reg.getSup(ID_URANIUM_ORE));
        simpleBlock(reg.getSup(deepslate(ID_URANIUM_ORE)));

        simpleBlock(reg.getSup(raw(ID_ALUMINUM_BLOCK)));
        simpleBlock(reg.getSup(raw(ID_URANIUM_BLOCK)));

        simpleBlock(reg.getSup(ID_ALUMINUM_BLOCK));
        simpleBlock(reg.getSup(ID_ROSE_GOLD_BLOCK));
        simpleBlock(reg.getSup(ID_STEEL_BLOCK));
        simpleBlock(reg.getSup(ID_URANIUM_BLOCK));
    }

}
