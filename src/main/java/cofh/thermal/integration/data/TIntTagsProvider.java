//package cofh.thermal.integration.data;
//
//import cofh.lib.tags.BlockTagsCoFH;
//import cofh.lib.tags.ItemTagsCoFH;
//import net.minecraft.core.HolderLookup;
//import net.minecraft.data.PackOutput;
//import net.minecraft.data.tags.BlockTagsProvider;
//import net.minecraft.data.tags.ItemTagsProvider;
//import net.minecraft.data.tags.TagsProvider;
//import net.minecraft.tags.BlockTags;
//import net.minecraftforge.common.Tags;
//import net.minecraftforge.common.data.ExistingFileHelper;
//
//import static cofh.lib.util.constants.ModIds.ID_THERMAL;
//import static cofh.lib.util.constants.ModIds.ID_THERMAL_INTEGRATION;
//import static cofh.thermal.core.ThermalCore.BLOCKS;
//import static cofh.thermal.core.ThermalCore.ITEMS;
//import static cofh.thermal.lib.common.ThermalIDs.ID_ROSE_GOLD_BLOCK;
//import static cofh.thermal.lib.common.ThermalIDs.ID_STEEL_BLOCK;
//import static net.minecraftforge.common.Tags.Items.*;
//
//public class TIntTagsProvider {
//
//    public static class Block extends BlockTagsProvider {
//
//        public Block(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
//
//            super(output, lookupProvider, ID_THERMAL_INTEGRATION, existingFileHelper);
//        }
//
//        @Override
//        public String getName() {
//
//            return "Thermal Integration: Block Tags";
//        }
//
//        @SuppressWarnings ("unchecked") // eww, thanks Forge for pushing your Generics varargs warnings down to us.
//        @Override
//        protected void addTags(HolderLookup.Provider pProvider) {
//
//            tag(BlockTags.BEACON_BASE_BLOCKS).add(
//                    BLOCKS.get(ID_ROSE_GOLD_BLOCK),
//                    BLOCKS.get(ID_STEEL_BLOCK)
//            );
//
//            // region RESOURCES
//
//            // endregion
//
//            // region STORAGE
//            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_ROSE_GOLD_BLOCK));
//            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_STEEL_BLOCK));
//
//            tag(BlockTags.NEEDS_STONE_TOOL).add(BLOCKS.get(ID_ROSE_GOLD_BLOCK));
//            tag(BlockTags.NEEDS_STONE_TOOL).add(BLOCKS.get(ID_STEEL_BLOCK));
//
//            tag(BlockTagsCoFH.STORAGE_BLOCKS_ROSE_GOLD).add(BLOCKS.get(ID_ROSE_GOLD_BLOCK));
//            tag(BlockTagsCoFH.STORAGE_BLOCKS_STEEL).add(BLOCKS.get(ID_STEEL_BLOCK));
//
//            tag(Tags.Blocks.STORAGE_BLOCKS).addTags(
//                    BlockTagsCoFH.STORAGE_BLOCKS_ROSE_GOLD,
//                    BlockTagsCoFH.STORAGE_BLOCKS_STEEL
//            );
//            // endregion
//
//            // region TILE BLOCKS
//
//            // endregion
//        }
//
//    }
//
//    public static class Item extends ItemTagsProvider {
//
//        public Item(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagsProvider.TagLookup<net.minecraft.world.level.block.Block>> pBlockTags, ExistingFileHelper existingFileHelper) {
//
//            super(pOutput, pLookupProvider, pBlockTags, ID_THERMAL, existingFileHelper);
//        }
//
//        @Override
//        public String getName() {
//
//            return "Thermal Core: Item Tags";
//        }
//
//        @Override
//        protected void addTags(HolderLookup.Provider pProvider) {
//
//            copy(BlockTagsCoFH.STORAGE_BLOCKS_ROSE_GOLD, ItemTagsCoFH.STORAGE_BLOCKS_ROSE_GOLD);
//            copy(BlockTagsCoFH.STORAGE_BLOCKS_STEEL, ItemTagsCoFH.STORAGE_BLOCKS_STEEL);
//
//            tag(Tags.Items.STORAGE_BLOCKS).addTags(
//                    ItemTagsCoFH.STORAGE_BLOCKS_ROSE_GOLD,
//                    ItemTagsCoFH.STORAGE_BLOCKS_STEEL
//            );
//
//            tag(ItemTagsCoFH.COINS_ROSE_GOLD).add(ITEMS.get("rose_gold_coin"));
//            tag(ItemTagsCoFH.COINS_STEEL).add(ITEMS.get("steel_coin"));
//
//            tag(ItemTagsCoFH.COINS).addTags(
//                    ItemTagsCoFH.COINS_ROSE_GOLD,
//                    ItemTagsCoFH.COINS_STEEL
//            );
//
//            tag(ItemTagsCoFH.DUSTS_ROSE_GOLD).add(ITEMS.get("rose_gold_dust"));
//            tag(ItemTagsCoFH.DUSTS_STEEL).add(ITEMS.get("steel_dust"));
//
//            tag(DUSTS).addTags(
//                    ItemTagsCoFH.DUSTS_ROSE_GOLD,
//                    ItemTagsCoFH.DUSTS_STEEL
//            );
//
//            tag(ItemTagsCoFH.GEARS_ROSE_GOLD).add(ITEMS.get("rose_gold_gear"));
//            tag(ItemTagsCoFH.GEARS_STEEL).add(ITEMS.get("steel_gear"));
//
//            tag(ItemTagsCoFH.GEARS).addTags(
//                    ItemTagsCoFH.GEARS_ROSE_GOLD,
//                    ItemTagsCoFH.GEARS_STEEL
//            );
//
//            tag(ItemTagsCoFH.INGOTS_ROSE_GOLD).add(ITEMS.get("rose_gold_ingot"));
//            tag(ItemTagsCoFH.INGOTS_STEEL).add(ITEMS.get("steel_ingot"));
//
//            tag(INGOTS).addTags(
//                    ItemTagsCoFH.INGOTS_ROSE_GOLD,
//                    ItemTagsCoFH.INGOTS_STEEL
//            );
//
//            tag(ItemTagsCoFH.NUGGETS_ROSE_GOLD).add(ITEMS.get("rose_gold_nugget"));
//            tag(ItemTagsCoFH.NUGGETS_STEEL).add(ITEMS.get("steel_nugget"));
//
//            tag(NUGGETS).addTags(
//                    ItemTagsCoFH.NUGGETS_ROSE_GOLD,
//                    ItemTagsCoFH.NUGGETS_STEEL
//            );
//
//            tag(ItemTagsCoFH.PLATES_ROSE_GOLD).add(ITEMS.get("rose_gold_plate"));
//            tag(ItemTagsCoFH.PLATES_STEEL).add(ITEMS.get("steel_plate"));
//
//            tag(ItemTagsCoFH.PLATES).addTags(
//                    ItemTagsCoFH.PLATES_ROSE_GOLD,
//                    ItemTagsCoFH.PLATES_STEEL
//            );
//        }
//
//    }
//
//}
