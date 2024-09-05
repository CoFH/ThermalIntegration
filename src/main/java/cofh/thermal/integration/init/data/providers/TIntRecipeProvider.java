package cofh.thermal.integration.init.data.providers;

import cofh.lib.common.conditions.FlagSetCondition;
import cofh.lib.init.data.RecipeProviderCoFH;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;

import static cofh.lib.util.constants.ModIds.ID_THERMAL;
import static cofh.thermal.core.ThermalCore.ITEMS;
import static cofh.thermal.lib.util.ThermalFlags.FLAG_RESOURCE_ROSE_GOLD;
import static cofh.thermal.lib.util.ThermalFlags.FLAG_RESOURCE_STEEL;

public class TIntRecipeProvider extends RecipeProviderCoFH {

    public TIntRecipeProvider(PackOutput output) {

        super(output, ID_THERMAL);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        generateAlloyRecipes("steel", recipeOutput.withConditions(new FlagSetCondition(FLAG_RESOURCE_STEEL)));
        generateAlloyRecipes("rose_gold", recipeOutput.withConditions(new FlagSetCondition(FLAG_RESOURCE_ROSE_GOLD)));
    }

    // region HELPERS
    private void generateAlloyRecipes(String type, RecipeOutput consumer) {

        var reg = ITEMS;

        generateTypeRecipes(reg, consumer, type);
        generateSmeltingAndBlastingRecipes(reg, consumer, type, 0);
    }
    // endregion
}
