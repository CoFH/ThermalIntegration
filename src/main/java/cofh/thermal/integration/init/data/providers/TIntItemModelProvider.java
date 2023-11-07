package cofh.thermal.integration.init.data.providers;

import cofh.lib.init.data.ItemModelProviderCoFH;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

import static cofh.lib.util.constants.ModIds.ID_THERMAL;
import static cofh.thermal.core.ThermalCore.BLOCKS;
import static cofh.thermal.core.ThermalCore.ITEMS;
import static cofh.thermal.lib.init.ThermalIDs.ID_ROSE_GOLD_BLOCK;
import static cofh.thermal.lib.init.ThermalIDs.ID_STEEL_BLOCK;

public class TIntItemModelProvider extends ItemModelProviderCoFH {

    public TIntItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {

        super(output, ID_THERMAL, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        var regBlocks = BLOCKS;
        var regItems = ITEMS;

        blockItem(regBlocks.getSup(ID_STEEL_BLOCK));
        blockItem(regBlocks.getSup(ID_ROSE_GOLD_BLOCK));

        alloySet(regItems, "steel");
        alloySet(regItems, "rose_gold");
    }

}
