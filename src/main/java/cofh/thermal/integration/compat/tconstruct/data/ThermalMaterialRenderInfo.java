package cofh.thermal.integration.compat.tconstruct.data;

import net.minecraft.data.DataGenerator;
import org.jetbrains.annotations.Nullable;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialRenderInfoProvider;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;

import javax.annotation.Nonnull;

public class ThermalMaterialRenderInfo extends AbstractMaterialRenderInfoProvider {

    public ThermalMaterialRenderInfo(DataGenerator gen, @Nullable AbstractMaterialSpriteProvider materialSprites) {

        super(gen, materialSprites);
    }

    @Override
    protected void addMaterialRenderInfo() {
        // the color used here is the brightest color in the palette
        buildRenderInfo(ThermalMaterialProvider.SIGNALUM).color(0xFFC787).fallbacks("metal");
        buildRenderInfo(ThermalMaterialProvider.LUMIUM).color(0xFFF1AA).fallbacks("metal");
        buildRenderInfo(ThermalMaterialProvider.ENDERIUM).color(0x76F0E5).fallbacks("metal");
    }

    @Nonnull
    @Override
    public String getName() {

        return "Thermal Integration: TConstruct Material Render Info";
    }

}
