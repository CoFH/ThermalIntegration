package cofh.thermal.integration.compat.tconstruct.data;

import cofh.thermal.integration.compat.tconstruct.modifier.ThermalModifiers;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import slimeknights.tconstruct.library.materials.definition.MaterialId;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.modifiers.util.StaticModifier;

import static cofh.lib.util.constants.ModIds.ID_THERMAL;

public class ThermalLanguageProvider extends LanguageProvider {

    public ThermalLanguageProvider(DataGenerator gen) {

        super(gen, ID_THERMAL, "en_us");
    }

    @Override
    protected void addTranslations() {

        addMaterial(ThermalMaterialProvider.ENDERIUM, "Enderium", "Enderium", "Enderium");
        addMaterial(ThermalMaterialProvider.LUMIUM, "Lumium", "Light me up", "Light me up");
        addMaterial(ThermalMaterialProvider.SIGNALUM, "Signalum", "Mixel Signal", "Mixel Signal");

        addModifier(ThermalModifiers.PANCYTOPENIA, "Pancytopenia", "Mine your own business", "The lower your health the faster you mine");
        addModifier(ThermalModifiers.RADIANT, "Radiant", "You better put torches in here!", "The darker it is the more durability you lose");
        addModifier(ThermalModifiers.SCORN, "Scorn", "XP for days!", "Entities drops are turned into xp.");

        //        add("modifier.thermal.scorn.effect", "Increase the mining speed by 1.2% * y levels below 0");
        //        add("modifier.thermal.scorn.effect_2", "Heals a percentage of damage dealt");
        //        add("modifier.thermal.scorn.effect_3", "All damage dealt ignore armor.");
    }

    public void addMaterial(MaterialId material, String name, String flavor, String desc) {

        String id = material.getPath();
        add("material.thermal." + id, name);
        if (!flavor.equals("")) {
            add("material.thermal." + id + ".flavor", flavor);
        }
        if (!desc.equals("")) {
            add("material.thermal." + id + ".encyclopedia", desc);
        }
    }

    public <T extends Modifier> void addModifier(StaticModifier<T> modifier, String name, String flavor, String desc) {

        String id = modifier.getId().getPath();
        add("modifier.thermal." + id, name);
        add("modifier.thermal." + id + ".flavor", flavor);
        add("modifier.thermal." + id + ".description", desc);
    }

}
