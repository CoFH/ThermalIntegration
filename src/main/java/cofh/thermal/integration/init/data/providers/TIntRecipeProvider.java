package cofh.thermal.integration.init.data.providers;

import cofh.lib.common.conditions.FlagSetCondition;
import cofh.lib.init.data.RecipeProviderCoFH;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;

import static cofh.lib.util.constants.ModIds.ID_THERMAL;
import static cofh.thermal.core.ThermalCore.ITEMS;
import static cofh.thermal.lib.util.ThermalFlags.*;

public class TIntRecipeProvider extends RecipeProviderCoFH {

    public TIntRecipeProvider(PackOutput output) {

        super(output, ID_THERMAL);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        generateMetalRecipes("aluminum", recipeOutput.withConditions(new FlagSetCondition(FLAG_RESOURCE_ALUMINUM)), 0.8F);
        generateMetalRecipes("uranium", recipeOutput.withConditions(new FlagSetCondition(FLAG_RESOURCE_URANIUM)), 1.0F);
        generateMetalRecipes("rose_gold", recipeOutput.withConditions(new FlagSetCondition(FLAG_RESOURCE_ROSE_GOLD)), 0);
        generateMetalRecipes("steel", recipeOutput.withConditions(new FlagSetCondition(FLAG_RESOURCE_STEEL)), 0);
    }

    // region HELPERS
    private void generateMetalRecipes(String type, RecipeOutput consumer, float xp) {

        var reg = ITEMS;

        generateTypeRecipes(reg, consumer, type);
        generateSmeltingAndBlastingRecipes(reg, consumer, type, xp);
    }
    // endregion
}
