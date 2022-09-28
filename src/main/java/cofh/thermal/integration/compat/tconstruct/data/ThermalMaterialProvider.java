package cofh.thermal.integration.compat.tconstruct.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.materials.definition.MaterialId;

import javax.annotation.Nonnull;

import static cofh.lib.util.constants.ModIds.ID_THERMAL;

public class ThermalMaterialProvider extends AbstractMaterialDataProvider {

    public static final MaterialId SIGNALUM = createMaterial("signalum");
    public static final MaterialId LUMIUM = createMaterial("lumium");
    public static final MaterialId ENDERIUM = createMaterial("enderium");

    private static MaterialId createMaterial(String name) {

        return new MaterialId(new ResourceLocation(ID_THERMAL, name));
    }

    public ThermalMaterialProvider(DataGenerator gen) {

        super(gen);
    }

    @Override
    protected void addMaterials() {

        addMaterial(SIGNALUM, 4, ORDER_HARVEST + ORDER_COMPAT, false);
        addMaterial(LUMIUM, 4, ORDER_NETHER + ORDER_COMPAT, false);
        addMaterial(ENDERIUM, 4, ORDER_END + ORDER_COMPAT, false);
    }

    @Nonnull
    @Override
    public String getName() {

        return "Thermal Integration: TConstruct Materials";
    }

}
