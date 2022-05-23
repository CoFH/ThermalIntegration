package cofh.thermal.integration.config;

import cofh.lib.config.IBaseConfig;
import net.minecraftforge.common.ForgeConfigSpec;

import static cofh.thermal.lib.common.ThermalFlags.*;

public class TIntConfig implements IBaseConfig {

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

        //        builder.push("Mod Compatibility");
        //
        //        builder.pop();
    }

    @Override
    public void refresh() {

        setFlag(FLAG_RESOURCE_ROSE_GOLD, boolRoseGold.get());
        setFlag(FLAG_RESOURCE_STEEL, boolSteel.get());
    }

    // region CONFIG VARIABLES
    private ForgeConfigSpec.BooleanValue boolRoseGold;
    private ForgeConfigSpec.BooleanValue boolSteel;
    // endregion
}
