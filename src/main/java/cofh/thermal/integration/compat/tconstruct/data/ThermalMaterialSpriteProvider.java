package cofh.thermal.integration.compat.tconstruct.data;

import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import slimeknights.tconstruct.library.client.data.spritetransformer.GreyToColorMapping;

import javax.annotation.Nonnull;

public class ThermalMaterialSpriteProvider extends AbstractMaterialSpriteProvider {

    @Nonnull
    @Override
    public String getName() {

        return "Thermal Integration: TConstruct Material Sprite Provider";
    }

    @Override
    protected void addAllMaterials() {

        // Note: Leading 0xFF needed for colors.

        buildMaterial(ThermalMaterialProvider.SIGNALUM)
                .meleeHarvest()
                .fallbacks("metal")
                .colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF8C0003).addARGB(102, 0xFFBB1400).addARGB(140, 0xFFEF3706).addARGB(178, 0xFFFB6114).addARGB(216, 0xFFFF9543).addARGB(255, 0xFFFFC787).build());

        buildMaterial(ThermalMaterialProvider.LUMIUM)
                .meleeHarvest()
                .fallbacks("metal")
                .colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFFB6611C).addARGB(102, 0xFFD3933A).addARGB(140, 0xFFE2BC5D).addARGB(178, 0xFFF4DD71).addARGB(216, 0xFFFFED95).addARGB(255, 0xFFFFF1AA).build());

        buildMaterial(ThermalMaterialProvider.ENDERIUM)
                .meleeHarvest()
                .fallbacks("metal")
                .colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF011224).addARGB(102, 0xFF0A3057).addARGB(140, 0xFF1D7E8C).addARGB(178, 0xFF2CA8AF).addARGB(216, 0xFF4BCFCD).addARGB(255, 0xFF76F0E5).build());

    }

}
