package cofh.thermal.integration.compat.tconstruct.data;

import cofh.thermal.integration.compat.tconstruct.modifier.ThermalModifiers;
import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialTraitDataProvider;

import javax.annotation.Nonnull;

public class ThermalMaterialTraitProvider extends AbstractMaterialTraitDataProvider {

    public ThermalMaterialTraitProvider(DataGenerator gen, AbstractMaterialDataProvider materials) {

        super(gen, materials);
    }

    @Override
    protected void addMaterialTraits() {

        addDefaultTraits(ThermalMaterialProvider.SIGNALUM, ThermalModifiers.PANCYTOPENIA);
        addDefaultTraits(ThermalMaterialProvider.LUMIUM, ThermalModifiers.RADIANT);
        addDefaultTraits(ThermalMaterialProvider.ENDERIUM, ThermalModifiers.SCORN);
    }

    @Nonnull
    @Override
    public String getName() {

        return "Thermal Integration: TConstruct Material Traits";
    }

}