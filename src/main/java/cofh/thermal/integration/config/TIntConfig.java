package cofh.thermal.integration.config;

import cofh.core.config.IBaseConfig;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.ArrayList;
import java.util.List;

import static cofh.thermal.lib.common.ThermalFlags.*;

public class TIntConfig implements IBaseConfig {

    protected static final List<ModSupportConfig> MOD_CONFIGS = new ArrayList<>();

    public static void addModConfig(String modId, String name) {

        MOD_CONFIGS.add(new ModSupportConfig(modId, name));
    }

    @Override
    public void apply(ForgeConfigSpec.Builder builder) {

        builder.push("Materials");

        boolRoseGold = builder
                .comment("If TRUE, Thermal Series' Rose Gold material and recipes are enabled.")
                .define("Rose Gold", true);

        boolSteel = builder
                .comment("If TRUE, Thermal Series' Steel material and recipes are enabled.")
                .define("Steel", true);

        builder.pop();

        builder.push("Mod Compatibility");

        for (IBaseConfig config : MOD_CONFIGS) {
            config.apply(builder);
        }

        builder.pop();
    }

    @Override
    public void refresh() {

        setFlag(FLAG_RESOURCE_ROSE_GOLD, boolRoseGold.get());
        setFlag(FLAG_RESOURCE_STEEL, boolSteel.get());

        for (IBaseConfig config : MOD_CONFIGS) {
            config.refresh();
        }
    }

    // region CONFIG VARIABLES
    private ForgeConfigSpec.BooleanValue boolRoseGold;
    private ForgeConfigSpec.BooleanValue boolSteel;
    // endregion
}
