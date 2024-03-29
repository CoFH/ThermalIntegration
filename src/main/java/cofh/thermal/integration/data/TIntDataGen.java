package cofh.thermal.integration.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static cofh.lib.util.constants.ModIds.ID_THERMAL_INTEGRATION;

@Mod.EventBusSubscriber (bus = Mod.EventBusSubscriber.Bus.MOD, modid = ID_THERMAL_INTEGRATION)
public class TIntDataGen {

    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {

        DataGenerator gen = event.getGenerator();
        ExistingFileHelper exFileHelper = event.getExistingFileHelper();

        TIntTagsProvider.Block blockTags = new TIntTagsProvider.Block(gen, exFileHelper);

        gen.addProvider(event.includeServer(), blockTags);
        gen.addProvider(event.includeServer(), new TIntTagsProvider.Item(gen, blockTags, exFileHelper));

        gen.addProvider(event.includeServer(), new TIntLootTableProvider(gen));
        gen.addProvider(event.includeServer(), new TIntRecipeProvider(gen));

        gen.addProvider(event.includeClient(), new TIntBlockStateProvider(gen, exFileHelper));
        gen.addProvider(event.includeClient(), new TIntItemModelProvider(gen, exFileHelper));
    }

}
