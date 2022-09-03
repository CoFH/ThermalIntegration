package cofh.thermal.integration.tconstruct.data;

import cofh.lib.data.RecipeProviderCoFH;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import slimeknights.tconstruct.fluids.TinkerFluids;
import slimeknights.tconstruct.library.data.recipe.*;
import slimeknights.tconstruct.library.materials.definition.MaterialId;
import slimeknights.tconstruct.library.materials.definition.MaterialVariantId;
import slimeknights.tconstruct.library.recipe.modifiers.adding.SwappableModifierRecipeBuilder;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.TinkerTools;

import javax.annotation.Nonnull;

import java.util.function.Consumer;

import static cofh.lib.util.constants.Constants.ID_THERMAL;
import static cofh.thermal.integration.tconstruct.data.ThermalMaterialProvider.*;

public class ThermalPartsRecipe extends RecipeProviderCoFH implements IMaterialRecipeHelper, IToolRecipeHelper, ISmelteryRecipeHelper, ICommonRecipeHelper {

    public ThermalPartsRecipe(DataGenerator gen) {
        super(gen, ID_THERMAL);
    }

    @Override
    protected void buildCraftingRecipes(@Nonnull Consumer<FinishedRecipe> consumer) {

        String materialFolder = "compat/tconstruct/material/";
        String slotless = "compat/tconstruct/tools/modifiers/slotless/";

        materialMeltingCasting(consumer, signalum, TinkerFluids.moltenSignalum, true, materialFolder);
        materialMeltingCasting(consumer, lumium, TinkerFluids.moltenLumium, true, materialFolder);
        materialMeltingCasting(consumer, enderium, TinkerFluids.moltenEnderium, true, materialFolder);

        metalMaterialRecipe(consumer, signalum, materialFolder, "signalum", false);
        metalMaterialRecipe(consumer, lumium, materialFolder, "lumium", false);
        metalMaterialRecipe(consumer, enderium, materialFolder, "enderium", false);

        Ingredient plate = Ingredient.of(TinkerTools.plateArmor.values().stream().map(ItemStack::new));

        plateTexture(consumer, plate, signalum, false, slotless);
        plateTexture(consumer, plate, lumium, false, slotless);
        plateTexture(consumer, plate, enderium, false, slotless);
    }

    // method required by tinkers
    @Nonnull
    @Override
    public String getModId() {
        return ID_THERMAL;
    }

    /** Adds recipes for a plate armor texture */
    private void plateTexture(Consumer<FinishedRecipe> consumer, Ingredient tool, MaterialId material, boolean optional, String folder) {
        plateTexture(consumer, tool, material, "ingots/" + material.getPath(), optional, folder);
    }

    /** Adds recipes for a plate armor texture with a custom tag */
    private void plateTexture(Consumer<FinishedRecipe> consumer, Ingredient tool, MaterialVariantId material, String tag, boolean optional, String folder) {
        Ingredient ingot = Ingredient.of(getItemTag("forge", tag));
        if (optional) {
            consumer = withCondition(consumer, tagCondition(tag));
        }
        SwappableModifierRecipeBuilder.modifier(TinkerModifiers.embellishment, material.toString())
                .setTools(tool)
                .addInput(ingot).addInput(ingot).addInput(ingot)
                .save(consumer, wrap(TinkerModifiers.embellishment.getId(), folder, "_" + material.getLocation('_').getPath()));
    }
}
