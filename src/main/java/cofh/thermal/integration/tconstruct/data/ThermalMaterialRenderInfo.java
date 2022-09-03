package cofh.thermal.integration.tconstruct.data;

import net.minecraft.data.DataGenerator;
import org.jetbrains.annotations.Nullable;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialRenderInfoProvider;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;

import javax.annotation.Nonnull;

import static cofh.thermal.integration.tconstruct.data.ThermalMaterialProvider.*;

public class ThermalMaterialRenderInfo extends AbstractMaterialRenderInfoProvider {

    public ThermalMaterialRenderInfo(DataGenerator gen, @Nullable AbstractMaterialSpriteProvider materialSprites) {
        super(gen, materialSprites);
    }

    @Override
    protected void addMaterialRenderInfo() {
        // the color used here is the brightest color in the palette
        buildRenderInfo(signalum).color(0xFFC787).fallbacks("metal");
        buildRenderInfo(lumium).color(0xFFF1AA).fallbacks("metal");
        buildRenderInfo(enderium).color(0x76F0E5).fallbacks("metal");
    }

    @Nonnull
    @Override
    public String getName() {
        return "Thermal Render Info";
    }
}
