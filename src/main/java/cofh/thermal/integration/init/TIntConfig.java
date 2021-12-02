package cofh.thermal.integration.init;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class TIntConfig {

    private static boolean registered = false;

    public static void register() {

        if (registered) {
            return;
        }
        FMLJavaModLoadingContext.get().getModEventBus().register(TIntConfig.class);
        registered = true;
    }

    public static void setup() {

        // This allows flags to be set before the server configuration is generated.
        genServerConfig();

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, serverSpec);
    }

    private TIntConfig() {

    }

    // region CONFIG SPEC
    private static final ForgeConfigSpec.Builder SERVER_CONFIG = new ForgeConfigSpec.Builder();
    private static ForgeConfigSpec serverSpec;

    private static void genServerConfig() {

        serverSpec = SERVER_CONFIG.build();

        refreshServerConfig();
    }

    private static void refreshServerConfig() {

    }
    // endregion

    // region CONFIGURATION
    @SubscribeEvent
    public static void configLoading(final ModConfig.Loading event) {

        switch (event.getConfig().getType()) {
            case CLIENT:
                break;
            case SERVER:
                refreshServerConfig();
        }
    }

    @SubscribeEvent
    public static void configReloading(ModConfig.Reloading event) {

        switch (event.getConfig().getType()) {
            case CLIENT:
                break;
            case SERVER:
                refreshServerConfig();
        }
    }
    // endregion
}
