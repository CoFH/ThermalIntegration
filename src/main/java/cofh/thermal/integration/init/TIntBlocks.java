package cofh.thermal.integration.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import static cofh.lib.util.constants.ModIds.ID_THERMAL_INTEGRATION;
import static cofh.thermal.core.util.RegistrationHelper.registerBlock;
import static cofh.thermal.lib.common.ThermalCreativeTabs.blocksTab;
import static cofh.thermal.lib.common.ThermalIDs.ID_ROSE_GOLD_BLOCK;
import static cofh.thermal.lib.common.ThermalIDs.ID_STEEL_BLOCK;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.of;

public class TIntBlocks {

    private TIntBlocks() {

    }

    public static void register() {


        //        registerBlock(ID_ALUMINUM_BLOCK, TCoreBlocks::storageBlock, getFlag(FLAG_RESOURCE_ALUMINUM));
        //        registerBlock(ID_URANIUM_BLOCK, TCoreBlocks::storageBlock, getFlag(FLAG_RESOURCE_URANIUM));

        blocksTab(registerBlock(ID_STEEL_BLOCK, () -> new Block(of().mapColor(MapColor.COLOR_GRAY).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ID_THERMAL_INTEGRATION));
        blocksTab(registerBlock(ID_ROSE_GOLD_BLOCK, () -> new Block(of().mapColor(MapColor.COLOR_PINK).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ID_THERMAL_INTEGRATION));
    }

}
