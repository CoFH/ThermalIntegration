package cofh.thermal.integration.tconstruct.data;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialStatsDataProvider;
import slimeknights.tconstruct.tools.stats.ExtraMaterialStats;
import slimeknights.tconstruct.tools.stats.HandleMaterialStats;
import slimeknights.tconstruct.tools.stats.HeadMaterialStats;

import javax.annotation.Nonnull;

import static net.minecraft.world.item.Tiers.DIAMOND;
import static net.minecraft.world.item.Tiers.IRON;
import static cofh.thermal.integration.tconstruct.data.ThermalMaterialProvider.*;

public class ThermalMaterialStatsProvider extends AbstractMaterialStatsDataProvider {

    public ThermalMaterialStatsProvider(DataGenerator gen, AbstractMaterialDataProvider materials) {
        super(gen, materials);
    }

    @Override
    protected void addMaterialStats() {
        addMaterialStats(signalum,
                new HeadMaterialStats(580, 8.5f, IRON, 3.1f),
                new HandleMaterialStats(0.7f, 1.05f, 0.95f, 1.0f),
                ExtraMaterialStats.DEFAULT);

        addMaterialStats(lumium,
                new HeadMaterialStats(460, 3.5f, IRON, 3.5f),
                new HandleMaterialStats(1.05f, 1.0f, 1.2f, 0.95f),
                ExtraMaterialStats.DEFAULT);

        addMaterialStats(enderium,
                new HeadMaterialStats(1525, 5.5f, DIAMOND, 4.0f),
                new HandleMaterialStats(1.15f, 1.0f, 0.9f, 0.9f),
                ExtraMaterialStats.DEFAULT);
    }

    @Nonnull
    @Override
    public String getName() {
        return "Thermal Stats";
    }
}
