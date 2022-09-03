package cofh.thermal.integration.tconstruct.data;

import cofh.thermal.integration.tconstruct.modifier.ThermalModifiers;
import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialTraitDataProvider;

import javax.annotation.Nonnull;

import static cofh.thermal.integration.tconstruct.data.ThermalMaterialProvider.*;

public class ThermalMaterialTraitProvider extends AbstractMaterialTraitDataProvider {

    public ThermalMaterialTraitProvider(DataGenerator gen, AbstractMaterialDataProvider materials) {
        super(gen, materials);
    }

    @Override
    protected void addMaterialTraits() {
        addDefaultTraits(signalum, ThermalModifiers.PANCYTOPENIA);
        addDefaultTraits(lumium, ThermalModifiers.RADIANT);
        addDefaultTraits(enderium, ThermalModifiers.SCORN);
    }

    @Nonnull
    @Override
    public String getName() {
        return "Thermal Traits";
    }
}