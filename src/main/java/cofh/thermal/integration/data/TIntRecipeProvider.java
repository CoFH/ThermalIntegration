//package cofh.thermal.integration.data;
//
//import cofh.lib.data.RecipeProviderCoFH;
//import cofh.thermal.lib.common.ThermalFlags;
//import net.minecraft.data.PackOutput;
//import net.minecraft.data.recipes.FinishedRecipe;
//
//import java.util.function.Consumer;
//
//import static cofh.lib.util.constants.ModIds.ID_THERMAL;
//import static cofh.thermal.core.ThermalCore.ITEMS;
//import static cofh.thermal.lib.common.ThermalFlags.FLAG_RESOURCE_ROSE_GOLD;
//import static cofh.thermal.lib.common.ThermalFlags.FLAG_RESOURCE_STEEL;
//
//public class TIntRecipeProvider extends RecipeProviderCoFH {
//
//    public TIntRecipeProvider(PackOutput output) {
//
//        super(output, ID_THERMAL);
//        manager = ThermalFlags.manager();
//    }
//
//    @Override
//    public String getName() {
//
//        return "Thermal Integration: Recipes";
//    }
//
//    @Override
//    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
//
//        generateAlloyRecipes("steel", withConditions(consumer).flag(FLAG_RESOURCE_STEEL));
//        generateAlloyRecipes("rose_gold", withConditions(consumer).flag(FLAG_RESOURCE_ROSE_GOLD));
//    }
//
//    // region HELPERS
//    private void generateAlloyRecipes(String type, Consumer<FinishedRecipe> consumer) {
//
//        var reg = ITEMS;
//
//        generateTypeRecipes(reg, consumer, type);
//        generateSmeltingAndBlastingRecipes(reg, consumer, type, 0);
//    }
//    // endregion
//}
