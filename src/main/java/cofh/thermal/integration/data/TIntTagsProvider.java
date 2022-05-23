package cofh.thermal.integration.data;

import cofh.lib.util.references.CoFHTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import static cofh.lib.util.constants.Constants.ID_THERMAL;
import static cofh.lib.util.constants.Constants.ID_THERMAL_INTEGRATION;
import static cofh.thermal.core.ThermalCore.BLOCKS;
import static cofh.thermal.core.ThermalCore.ITEMS;
import static cofh.thermal.lib.common.ThermalIDs.ID_ROSE_GOLD_BLOCK;
import static cofh.thermal.lib.common.ThermalIDs.ID_STEEL_BLOCK;
import static net.minecraftforge.common.Tags.Items.*;

public class TIntTagsProvider {

    public static class Block extends BlockTagsProvider {

        public Block(DataGenerator gen, ExistingFileHelper existingFileHelper) {

            super(gen, ID_THERMAL_INTEGRATION, existingFileHelper);
        }

        @Override
        public String getName() {

            return "Thermal Integration: Block Tags";
        }

        @SuppressWarnings ("unchecked") // eww, thanks Forge for pushing your Generics varargs warnings down to us.
        @Override
        protected void addTags() {

            tag(BlockTags.BEACON_BASE_BLOCKS).add(
                    BLOCKS.get(ID_ROSE_GOLD_BLOCK),
                    BLOCKS.get(ID_STEEL_BLOCK)
            );

            // region RESOURCES

            // endregion

            // region STORAGE
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_ROSE_GOLD_BLOCK));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_STEEL_BLOCK));

            tag(BlockTags.NEEDS_STONE_TOOL).add(BLOCKS.get(ID_ROSE_GOLD_BLOCK));
            tag(BlockTags.NEEDS_STONE_TOOL).add(BLOCKS.get(ID_STEEL_BLOCK));

            tag(CoFHTags.Blocks.STORAGE_BLOCKS_ROSE_GOLD).add(BLOCKS.get(ID_ROSE_GOLD_BLOCK));
            tag(CoFHTags.Blocks.STORAGE_BLOCKS_STEEL).add(BLOCKS.get(ID_STEEL_BLOCK));

            tag(Tags.Blocks.STORAGE_BLOCKS).addTags(
                    CoFHTags.Blocks.STORAGE_BLOCKS_ROSE_GOLD,
                    CoFHTags.Blocks.STORAGE_BLOCKS_STEEL
            );
            // endregion

            // region TILE BLOCKS

            // endregion
        }

    }

    public static class Item extends ItemTagsProvider {

        public Item(DataGenerator gen, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {

            super(gen, blockTagProvider, ID_THERMAL, existingFileHelper);
        }

        @Override
        public String getName() {

            return "Thermal Core: Item Tags";
        }

        @Override
        protected void addTags() {

            copy(CoFHTags.Blocks.STORAGE_BLOCKS_ROSE_GOLD, CoFHTags.Items.STORAGE_BLOCKS_ROSE_GOLD);
            copy(CoFHTags.Blocks.STORAGE_BLOCKS_STEEL, CoFHTags.Items.STORAGE_BLOCKS_STEEL);

            tag(Tags.Items.STORAGE_BLOCKS).addTags(
                    CoFHTags.Items.STORAGE_BLOCKS_ROSE_GOLD,
                    CoFHTags.Items.STORAGE_BLOCKS_STEEL
            );

            tag(CoFHTags.Items.COINS_ROSE_GOLD).add(ITEMS.get("rose_gold_coin"));
            tag(CoFHTags.Items.COINS_STEEL).add(ITEMS.get("steel_coin"));

            tag(CoFHTags.Items.COINS).addTags(
                    CoFHTags.Items.COINS_ROSE_GOLD,
                    CoFHTags.Items.COINS_STEEL
            );

            tag(CoFHTags.Items.DUSTS_ROSE_GOLD).add(ITEMS.get("rose_gold_dust"));
            tag(CoFHTags.Items.DUSTS_STEEL).add(ITEMS.get("steel_dust"));

            tag(DUSTS).addTags(
                    CoFHTags.Items.DUSTS_ROSE_GOLD,
                    CoFHTags.Items.DUSTS_STEEL
            );

            tag(CoFHTags.Items.GEARS_ROSE_GOLD).add(ITEMS.get("rose_gold_gear"));
            tag(CoFHTags.Items.GEARS_STEEL).add(ITEMS.get("steel_gear"));

            tag(CoFHTags.Items.GEARS).addTags(
                    CoFHTags.Items.GEARS_ROSE_GOLD,
                    CoFHTags.Items.GEARS_STEEL
            );

            tag(CoFHTags.Items.INGOTS_ROSE_GOLD).add(ITEMS.get("rose_gold_ingot"));
            tag(CoFHTags.Items.INGOTS_STEEL).add(ITEMS.get("steel_ingot"));

            tag(INGOTS).addTags(
                    CoFHTags.Items.INGOTS_ROSE_GOLD,
                    CoFHTags.Items.INGOTS_STEEL
            );

            tag(CoFHTags.Items.NUGGETS_ROSE_GOLD).add(ITEMS.get("rose_gold_nugget"));
            tag(CoFHTags.Items.NUGGETS_STEEL).add(ITEMS.get("steel_nugget"));

            tag(NUGGETS).addTags(
                    CoFHTags.Items.NUGGETS_ROSE_GOLD,
                    CoFHTags.Items.NUGGETS_STEEL
            );

            tag(CoFHTags.Items.PLATES_ROSE_GOLD).add(ITEMS.get("rose_gold_plate"));
            tag(CoFHTags.Items.PLATES_STEEL).add(ITEMS.get("steel_plate"));

            tag(CoFHTags.Items.PLATES).addTags(
                    CoFHTags.Items.PLATES_ROSE_GOLD,
                    CoFHTags.Items.PLATES_STEEL
            );
        }

    }

}
