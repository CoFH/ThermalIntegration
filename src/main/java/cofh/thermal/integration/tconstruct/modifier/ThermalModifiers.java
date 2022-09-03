package cofh.thermal.integration.tconstruct.modifier;

import slimeknights.tconstruct.library.modifiers.util.ModifierDeferredRegister;
import slimeknights.tconstruct.library.modifiers.util.StaticModifier;

import static cofh.lib.util.constants.Constants.ID_THERMAL;

public class ThermalModifiers {

    public static ModifierDeferredRegister MODIFIERS = ModifierDeferredRegister.create(ID_THERMAL);

    public static StaticModifier<PancytopeniaModifier> PANCYTOPENIA = MODIFIERS.register("pancytopenia", PancytopeniaModifier::new);
    public static StaticModifier<RadiantModifier> RADIANT = MODIFIERS.register("radiant", RadiantModifier::new);
    public static StaticModifier<ScornModifier> SCORN = MODIFIERS.register("scorn", ScornModifier::new);
}
