package cofh.thermal.integration;

import net.minecraftforge.fml.common.Mod;

import static cofh.lib.util.constants.Constants.ID_THERMAL_INTEGRATION;
import static cofh.thermal.lib.common.ThermalFlags.*;

@Mod(ID_THERMAL_INTEGRATION)
public class ThermalIntegration {

    public ThermalIntegration() {

        TIntConfig.register();

        setFeatureFlags();
    }

    private void setFeatureFlags() {

    }

}
