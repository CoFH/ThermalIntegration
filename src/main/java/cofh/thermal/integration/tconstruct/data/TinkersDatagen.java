package cofh.thermal.integration.tconstruct.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import slimeknights.tconstruct.library.client.data.material.MaterialPartTextureGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.tools.data.sprite.TinkerPartSpriteProvider;

public class TinkersDatagen {

    public static void registerServerProviders(DataGenerator gen, ExistingFileHelper exFileHelper) {
        AbstractMaterialDataProvider materials = new ThermalMaterialProvider(gen);

        gen.addProvider(materials);
        gen.addProvider(new ThermalMaterialTraitProvider(gen, materials));
        gen.addProvider(new ThermalMaterialStatsProvider(gen, materials));

        gen.addProvider(new ThermalPartsRecipe(gen));
    }

    public static void registerClientProviders(DataGenerator gen, ExistingFileHelper exFileHelper) {
        AbstractMaterialSpriteProvider thermalProvider = new ThermalMaterialSpriteProvider();

        gen.addProvider(new MaterialPartTextureGenerator(gen, exFileHelper, new TinkerPartSpriteProvider(), thermalProvider));
        gen.addProvider(new ThermalMaterialRenderInfo(gen, thermalProvider));
        gen.addProvider(new ThermalLanguageProvider(gen));
    }
}
