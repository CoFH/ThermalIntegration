package cofh.thermal.integration.common.config;

import cofh.core.common.config.IBaseConfig;
import net.minecraftforge.common.ForgeConfigSpec;

import static cofh.lib.util.Utils.isModLoaded;
import static cofh.thermal.lib.util.ThermalFlags.setFlag;

public class ModSupportConfig implements IBaseConfig {

    protected final String modId;
    protected final String modName;

    private ForgeConfigSpec.BooleanValue modSupport;

    public ModSupportConfig(String modId, String modName) {

        this.modId = modId;
        this.modName = modName;
    }

    @Override
    public void apply(ForgeConfigSpec.Builder builder) {

        modSupport = builder
                .comment("If TRUE, mod integration support for " + modName + " is enabled, if the mod is loaded.")
                .define(modName, true);
    }

    @Override
    public void refresh() {

        setFlag("mod_" + modId, () -> modSupport.get() && isModLoaded(modId));
    }

}
