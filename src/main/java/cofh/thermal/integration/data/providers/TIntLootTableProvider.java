package cofh.thermal.integration.data.providers;

import cofh.lib.data.LootTableProviderCoFH;
import cofh.thermal.integration.data.tables.TIntBlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;

public class TIntLootTableProvider extends LootTableProviderCoFH {

    public TIntLootTableProvider(PackOutput output) {

        super(output, List.of(
                new SubProviderEntry(TIntBlockLootTables::new, LootContextParamSets.BLOCK)
        ));
    }

}
