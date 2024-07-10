package cofh.thermal.integration.common.config;

import cofh.core.common.config.IBaseConfig;
import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.ArrayList;
import java.util.List;

import static cofh.thermal.lib.util.ThermalFlags.*;

public class TIntConfig implements IBaseConfig {

    protected static final List<ModSupportConfig> MOD_CONFIGS = new ArrayList<>();

    public static void addModConfig(String modId, String name) {

        MOD_CONFIGS.add(new ModSupportConfig(modId, name));
    }

    @Override
    public void apply(ModConfigSpec.Builder builder) {

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
    private ModConfigSpec.BooleanValue boolRoseGold;
    private ModConfigSpec.BooleanValue boolSteel;
    // endregion
}
