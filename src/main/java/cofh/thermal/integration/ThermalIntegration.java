package cofh.thermal.integration;

import cofh.lib.config.ConfigManager;
import cofh.thermal.integration.config.TIntConfig;
import cofh.thermal.integration.init.TIntBlocks;
import cofh.thermal.integration.init.TIntItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static cofh.lib.util.constants.Constants.ID_THERMAL_INTEGRATION;
import static cofh.thermal.lib.common.ThermalFlags.*;

@Mod (ID_THERMAL_INTEGRATION)
public class ThermalIntegration {

    public static final ConfigManager COMPAT_CONFIG_MANAGER = new ConfigManager();

    public ThermalIntegration() {

        setFeatureFlags();

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        COMPAT_CONFIG_MANAGER.register(modEventBus)
                .addServerConfig(new TIntConfig())
                .setupServer();

        TIntBlocks.register();
        TIntItems.register();
    }

    private void setFeatureFlags() {

        setFlag(FLAG_RESOURCE_STEEL, true);
        setFlag(FLAG_RESOURCE_ROSE_GOLD, true);
    }

}
