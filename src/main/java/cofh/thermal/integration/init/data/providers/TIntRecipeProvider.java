package cofh.thermal.integration.init.data.providers;

import cofh.lib.init.data.RecipeProviderCoFH;
import cofh.thermal.lib.util.ThermalFlags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static cofh.lib.util.constants.ModIds.ID_THERMAL;
import static cofh.thermal.core.ThermalCore.ITEMS;
import static cofh.thermal.lib.util.ThermalFlags.*;

public class TIntRecipeProvider extends RecipeProviderCoFH {

    public TIntRecipeProvider(PackOutput output) {

        super(output, ID_THERMAL);
        manager = ThermalFlags.manager();
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        generateMetalRecipes("aluminum", withConditions(consumer).flag(FLAG_RESOURCE_ALUMINUM), 0.8F);
        generateMetalRecipes("uranium", withConditions(consumer).flag(FLAG_RESOURCE_URANIUM), 1.0F);
        generateMetalRecipes("rose_gold", withConditions(consumer).flag(FLAG_RESOURCE_ROSE_GOLD), 0);
        generateMetalRecipes("steel", withConditions(consumer).flag(FLAG_RESOURCE_STEEL), 0);
    }

    // region HELPERS
    private void generateMetalRecipes(String type, Consumer<FinishedRecipe> consumer, float xp) {

        var reg = ITEMS;

        generateTypeRecipes(reg, consumer, type);
        generateSmeltingAndBlastingRecipes(reg, consumer, type, xp);
    }
    // endregion
}
