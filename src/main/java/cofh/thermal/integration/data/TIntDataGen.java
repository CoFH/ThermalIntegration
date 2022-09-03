package cofh.thermal.integration.data;

import cofh.thermal.integration.tconstruct.data.TinkersDatagen;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import static cofh.lib.util.constants.Constants.ID_THERMAL_INTEGRATION;

@Mod.EventBusSubscriber (bus = Mod.EventBusSubscriber.Bus.MOD, modid = ID_THERMAL_INTEGRATION)
public class TIntDataGen {

    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {

        if (event.includeServer()) {
            registerServerProviders(event);
        }
        if (event.includeClient()) {
            registerClientProviders(event);
        }
    }

    private static void registerServerProviders(GatherDataEvent event) {

        DataGenerator gen = event.getGenerator();
        ExistingFileHelper exFileHelper = event.getExistingFileHelper();

        TIntTagsProvider.Block blockTags = new TIntTagsProvider.Block(gen, exFileHelper);

        gen.addProvider(blockTags);
        gen.addProvider(new TIntTagsProvider.Item(gen, blockTags, exFileHelper));

        gen.addProvider(new TIntLootTableProvider(gen));
        gen.addProvider(new TIntRecipeProvider(gen));

        // load Tinkers Datagen to generate parts, materials and more
        TinkersDatagen.registerServerProviders(gen, exFileHelper);
    }

    private static void registerClientProviders(GatherDataEvent event) {

        DataGenerator gen = event.getGenerator();
        ExistingFileHelper exFileHelper = event.getExistingFileHelper();

        gen.addProvider(new TIntBlockStateProvider(gen, exFileHelper));
        gen.addProvider(new TIntItemModelProvider(gen, exFileHelper));

        // load Tinkers Datagen to generate parts, materials and more
        TinkersDatagen.registerClientProviders(gen, exFileHelper);
    }

}
