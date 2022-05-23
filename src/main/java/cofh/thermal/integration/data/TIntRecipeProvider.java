package cofh.thermal.integration.data;

import cofh.lib.data.RecipeProviderCoFH;
import cofh.lib.util.references.CoFHTags;
import cofh.thermal.lib.common.ThermalFlags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;

import java.util.function.Consumer;

import static cofh.lib.util.constants.Constants.ID_THERMAL;
import static cofh.thermal.core.ThermalCore.ITEMS;

public class TIntRecipeProvider extends RecipeProviderCoFH {

    public TIntRecipeProvider(DataGenerator generatorIn) {

        super(generatorIn, ID_THERMAL);
        manager = ThermalFlags.manager();
    }

    @Override
    public String getName() {

        return "Thermal Integration: Recipes";
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        var reg = ITEMS;

        generateTypeRecipes(reg, consumer, "steel");
        generateTypeRecipes(reg, consumer, "rose_gold");

        generateSmeltingAndBlastingRecipes(reg, consumer, "steel", 0);
        generateSmeltingAndBlastingRecipes(reg, consumer, "rose_gold", 0);
    }

    // region HELPERS
    private void generateAlloyRecipes(Consumer<FinishedRecipe> consumer) {

        var reg = ITEMS;

        ShapelessRecipeBuilder.shapeless(reg.get("rose_gold_dust"), 2)
                .requires(CoFHTags.Items.DUSTS_COPPER)
                .requires(CoFHTags.Items.DUSTS_GOLD)
                .unlockedBy("has_copper_dust", has(CoFHTags.Items.DUSTS_COPPER))
                .unlockedBy("has_gold_dust", has(CoFHTags.Items.DUSTS_GOLD))
                .save(consumer, ID_THERMAL + ":rose_gold_dust_2");
    }
    // endregion
}
