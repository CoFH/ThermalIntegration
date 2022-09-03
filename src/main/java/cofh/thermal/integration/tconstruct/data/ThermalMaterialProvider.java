package cofh.thermal.integration.tconstruct.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.materials.definition.MaterialId;

import javax.annotation.Nonnull;

import static cofh.lib.util.constants.Constants.ID_THERMAL;

public class ThermalMaterialProvider extends AbstractMaterialDataProvider {

    public static MaterialId signalum = createMaterial("signalum");
    public static MaterialId lumium = createMaterial("lumium");
    public static MaterialId enderium = createMaterial("enderium");

    private static MaterialId createMaterial(String name) {
        return new MaterialId(new ResourceLocation(ID_THERMAL, name));
    }

    public ThermalMaterialProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void addMaterials() {
        addMaterial(signalum, 4, ORDER_HARVEST+ORDER_COMPAT, false);
        addMaterial(lumium, 4, ORDER_NETHER+ORDER_COMPAT, false);
        addMaterial(enderium, 4, ORDER_END+ORDER_COMPAT, false);
    }

    @Nonnull
    @Override
    public String getName() {
        return "Thermal Materials";
    }
}
