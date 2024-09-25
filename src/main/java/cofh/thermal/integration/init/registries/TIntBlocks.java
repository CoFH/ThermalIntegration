package cofh.thermal.integration.init.registries;

import cofh.lib.common.block.OreBlockCoFH;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import static cofh.lib.util.constants.ModIds.ID_THERMAL_INTEGRATION;
import static cofh.thermal.core.init.registries.ThermalCreativeTabs.blocksTab;
import static cofh.thermal.core.util.RegistrationHelper.*;
import static cofh.thermal.lib.util.ThermalIDs.*;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.of;

public class TIntBlocks {

    private TIntBlocks() {

    }

    public static void register() {

        blocksTab(1, registerBlock(ID_ALUMINUM_ORE, OreBlockCoFH::createStoneOre, ID_THERMAL_INTEGRATION));
        blocksTab(1, registerBlock(deepslate(ID_ALUMINUM_ORE), OreBlockCoFH::createDeepslateOre, ID_THERMAL_INTEGRATION));
        blocksTab(1, registerBlock(ID_URANIUM_ORE, OreBlockCoFH::createStoneOre, ID_THERMAL_INTEGRATION));
        blocksTab(1, registerBlock(deepslate(ID_URANIUM_ORE), OreBlockCoFH::createDeepslateOre, ID_THERMAL_INTEGRATION));

        blocksTab(21, registerBlock(raw(ID_ALUMINUM_BLOCK), () -> new Block(of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).strength(5.0F, 6.0F).requiresCorrectToolForDrops()), ID_THERMAL_INTEGRATION));
        blocksTab(21, registerBlock(raw(ID_URANIUM_BLOCK), () -> new Block(of().mapColor(MapColor.TERRACOTTA_GREEN).strength(5.0F, 6.0F).requiresCorrectToolForDrops()), ID_THERMAL_INTEGRATION));

        blocksTab(26, registerBlock(ID_ALUMINUM_BLOCK, () -> new Block(of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ID_THERMAL_INTEGRATION));
        blocksTab(26, registerBlock(ID_URANIUM_BLOCK, () -> new Block(of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ID_THERMAL_INTEGRATION));

        blocksTab(31, registerBlock(ID_ROSE_GOLD_BLOCK, () -> new Block(of().mapColor(MapColor.COLOR_PINK).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ID_THERMAL_INTEGRATION));
        blocksTab(31, registerBlock(ID_STEEL_BLOCK, () -> new Block(of().mapColor(MapColor.COLOR_GRAY).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ID_THERMAL_INTEGRATION));
    }

}
