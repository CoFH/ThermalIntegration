package cofh.thermal.integration.compat.tconstruct;

import net.minecraftforge.eventbus.api.IEventBus;

import static cofh.thermal.integration.compat.tconstruct.modifier.ThermalModifiers.MODIFIERS;

public class TConstructPlugin {

    public static void init(IEventBus modEventBus) {

        MODIFIERS.register(modEventBus);
    }

}
