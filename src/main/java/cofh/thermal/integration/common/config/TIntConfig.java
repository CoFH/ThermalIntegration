package cofh.thermal.integration.common.config;

import cofh.core.common.config.IBaseConfig;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static cofh.lib.util.Constants.TRUE;
import static cofh.thermal.lib.util.ThermalFlags.*;

public class TIntConfig implements IBaseConfig {

    protected static final List<ModSupportConfig> MOD_CONFIGS = new ArrayList<>();

    public static void addModConfig(String modId, String name) {

        MOD_CONFIGS.add(new ModSupportConfig(modId, name));
    }

    @Override
    public void apply(ForgeConfigSpec.Builder builder) {

        builder.push("Materials");

        boolAluminum = builder
                .comment("If TRUE, Thermal Series' Aluminum material and recipes are enabled.")
                .define("Aluminum", true);

        boolRoseGold = builder
                .comment("If TRUE, Thermal Series' Rose Gold material and recipes are enabled.")
                .define("Rose Gold", true);

        boolSteel = builder
                .comment("If TRUE, Thermal Series' Steel material and recipes are enabled.")
                .define("Steel", true);

        boolUranium = builder
                .comment("If TRUE, Thermal Series' Uranium material and recipes are enabled.")
                .define("Uranium", true);

        builder.pop();

        builder.push("Mod Compatibility");

        for (IBaseConfig config : MOD_CONFIGS) {
            config.apply(builder);
        }

        builder.pop();
    }

    @Override
    public void refresh() {

        setFlag(FLAG_RESOURCE_ALUMINUM, boolAluminum.get());
        setFlag(FLAG_RESOURCE_ROSE_GOLD, boolRoseGold.get());
        setFlag(FLAG_RESOURCE_STEEL, boolSteel.get());
        setFlag(FLAG_RESOURCE_URANIUM, boolUranium.get());

        for (IBaseConfig config : MOD_CONFIGS) {
            config.refresh();
        }
    }

    // region CONFIG VARIABLES
    private Supplier<Boolean> boolAluminum = TRUE;
    private Supplier<Boolean> boolRoseGold = TRUE;
    private Supplier<Boolean> boolSteel = TRUE;
    private Supplier<Boolean> boolUranium = TRUE;
    // endregion
}
