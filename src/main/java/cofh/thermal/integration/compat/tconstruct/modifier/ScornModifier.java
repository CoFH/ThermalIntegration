package cofh.thermal.integration.compat.tconstruct.modifier;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.helper.ModifierUtil;

import java.util.Collection;

// this modifier replaces all item drops with exp.
public class ScornModifier extends Modifier {

    public ScornModifier() {

        MinecraftForge.EVENT_BUS.register(this);
    }

    // destroy all drops by cancelling the event
    @SubscribeEvent
    public void onLivingDrop(LivingDropsEvent event) {

        Entity entity = event.getSource().getEntity();
        if (entity instanceof LivingEntity livingEntity) {
            ItemStack stack = livingEntity.getMainHandItem();
            if (ModifierUtil.getModifierLevel(stack, this.getId()) > 0) {
                event.setCanceled(true);
            }
        }
    }

    // drops items
    @SubscribeEvent
    public void onLivingExpDrop(LivingExperienceDropEvent event) {

        Collection<ItemEntity> drops = event.getEntityLiving().captureDrops();
        Player player = event.getAttackingPlayer();
        if (drops != null && player != null) {
            ItemStack stack = player.getMainHandItem();
            int level = ModifierUtil.getModifierLevel(stack, this.getId());
            event.setDroppedExperience(100 * drops.size() * level);
        }
    }

}