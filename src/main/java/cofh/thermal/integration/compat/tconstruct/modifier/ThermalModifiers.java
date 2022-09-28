package cofh.thermal.integration.compat.tconstruct.modifier;

import slimeknights.tconstruct.library.modifiers.util.ModifierDeferredRegister;
import slimeknights.tconstruct.library.modifiers.util.StaticModifier;

import static cofh.lib.util.constants.ModIds.ID_THERMAL;

public class ThermalModifiers {

    public static final ModifierDeferredRegister MODIFIERS = ModifierDeferredRegister.create(ID_THERMAL);

    public static final StaticModifier<ScornModifier> SCORN = MODIFIERS.register("scorn", ScornModifier::new);
    public static final StaticModifier<RadiantModifier> RADIANT = MODIFIERS.register("radiant", RadiantModifier::new);
    public static final StaticModifier<PancytopeniaModifier> PANCYTOPENIA = MODIFIERS.register("pancytopenia", PancytopeniaModifier::new);

}
