package cofh.thermal.integration.data;

import cofh.lib.data.ItemModelProviderCoFH;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import static cofh.lib.util.constants.ModIds.ID_THERMAL;
import static cofh.thermal.core.ThermalCore.BLOCKS;
import static cofh.thermal.core.ThermalCore.ITEMS;
import static cofh.thermal.lib.common.ThermalIDs.ID_ROSE_GOLD_BLOCK;
import static cofh.thermal.lib.common.ThermalIDs.ID_STEEL_BLOCK;

public class TIntItemModelProvider extends ItemModelProviderCoFH {

    public TIntItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {

        super(generator, ID_THERMAL, existingFileHelper);
    }

    @Override
    public String getName() {

        return "Thermal Integration: Item Models";
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
