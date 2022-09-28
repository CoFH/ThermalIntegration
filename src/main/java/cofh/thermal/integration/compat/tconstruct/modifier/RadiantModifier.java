package cofh.thermal.integration.compat.tconstruct.modifier;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

import javax.annotation.Nonnull;

/**
 * Lumina Modifier
 * The darker it is, the more durability you lose.
 */
public class RadiantModifier extends Modifier {

    /**
     * Calculate the tool durability damage
     *
     * @param amount Amount of durability damage to deal
     * @param light  Light level for the block below the player
     * @param level  Radiant Modifier level
     * @return Tool Damage
     */
    private int calcToolDamage(int amount, int light, int level) {

        int[] invertLevels = {16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        float bonus = invertLevels[light];
        return (int) (amount + bonus * level);
    }

    @Override
    public int onDamageTool(@Nonnull IToolStackView tool, int level, int amount, @Nullable LivingEntity holder) {

        if (holder != null) {
            Level world = holder.getLevel();
            BlockState blockState = world.getBlockState(holder.blockPosition().below());

            // Default Tool Damage when flying
            if (blockState.isAir()) {
                return super.onDamageTool(tool, level, amount, holder);
            } else {
                int lightlevel = blockState.getLightEmission(world, holder.blockPosition());
                return calcToolDamage(amount, lightlevel, level);
            }
        }
        return super.onDamageTool(tool, level, amount, holder);
    }

}
