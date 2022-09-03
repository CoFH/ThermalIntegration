package cofh.thermal.integration.tconstruct;

import cofh.thermal.integration.tconstruct.modifier.ThermalModifiers;
import net.minecraftforge.eventbus.api.IEventBus;

public class TinkerIntegration {

    public static void init(IEventBus modEventBus) {
        ThermalModifiers.MODIFIERS.register(modEventBus);
    }
}
