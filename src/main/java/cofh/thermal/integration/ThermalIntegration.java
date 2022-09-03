package cofh.thermal.integration;

import cofh.lib.config.ConfigManager;
import cofh.thermal.integration.config.TIntConfig;
import cofh.thermal.integration.init.TIntBlocks;
import cofh.thermal.integration.init.TIntItems;
import cofh.thermal.integration.tconstruct.TinkerIntegration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.NewRegistryEvent;

import static cofh.lib.util.constants.Constants.ID_THERMAL_INTEGRATION;
import static cofh.thermal.lib.common.ThermalFlags.*;

@Mod (ID_THERMAL_INTEGRATION)
public class ThermalIntegration {

    public static final ConfigManager COMPAT_CONFIG_MANAGER = new ConfigManager();

    public ThermalIntegration() {

        setFeatureFlags();

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        TIntConfig.addModConfig("biomesoplenty", "Biomes O' Plenty");
        TIntConfig.addModConfig("create", "Create");
        TIntConfig.addModConfig("dyenamics", "Dyenamics");
        TIntConfig.addModConfig("farmersdelight", "Farmer's Delight");
        TIntConfig.addModConfig("immersiveengineering", "Immersive Engineering");
        TIntConfig.addModConfig("quark", "Quark");
        TIntConfig.addModConfig("refinedstorage", "Refined Storage");
        TIntConfig.addModConfig("tconstruct", "Tinker's Construct");
        TIntConfig.addModConfig("redstone_arsenal", "Redstone Arsenal");

        COMPAT_CONFIG_MANAGER.register(modEventBus)
                .addCommonConfig(new TIntConfig());

        modEventBus.addListener(this::registrySetup);

        // init tinkers compat
        if(ModList.get().isLoaded("tconstruct")) {
            TinkerIntegration.init(modEventBus);
        }

        TIntBlocks.register();
        TIntItems.register();
    }

    private void setFeatureFlags() {

        setFlag(FLAG_RESOURCE_STEEL, true);
        setFlag(FLAG_RESOURCE_ROSE_GOLD, true);
    }

    private void registrySetup(final NewRegistryEvent event) {

        COMPAT_CONFIG_MANAGER.setupCommon();
    }

}
