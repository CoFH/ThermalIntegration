package cofh.thermal.integration.compat.tconstruct.modifier;

import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerEvent;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

import javax.annotation.Nonnull;

/**
 * Half Blood Modifier
 * The lower your health, the faster you mine.
 */
public class PancytopeniaModifier extends Modifier {

    /**
     * Calculate the bonus speed the player receives based on their health.
     *
     * @param player Player entity
     * @param level  Modifier level
     * @return Speed Bonus
     */
    private float calcBonus(Player player, int level) {

        return (((player.getHealth() - player.getMaxHealth()) * -1) * level) * 0.5f;
    }

    @Override
    public void onBreakSpeed(@Nonnull IToolStackView tool, int level, @Nonnull PlayerEvent.BreakSpeed event, @Nonnull Direction sideHit, boolean isEffective, float miningSpeedModifier) {

        event.setNewSpeed(event.getOriginalSpeed() + calcBonus(event.getPlayer(), level));
    }

}
