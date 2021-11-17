package cofh.thermal.integration;

import cofh.thermal.integration.init.TIntConfig;
import net.minecraftforge.fml.common.Mod;

import static cofh.lib.util.constants.Constants.ID_THERMAL_INTEGRATION;

@Mod(ID_THERMAL_INTEGRATION)
public class ThermalIntegration {

    public ThermalIntegration() {

        TIntConfig.register();

        setFeatureFlags();
    }

    private void setFeatureFlags() {

    }

}
