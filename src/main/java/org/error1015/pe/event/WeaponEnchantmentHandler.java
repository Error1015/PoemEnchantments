package org.error1015.pe.event;

import lombok.val;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.error1015.pe.enchantment.ModEnchantments;

@Mod.EventBusSubscriber
public final class WeaponEnchantmentHandler {
    /**
     * 以理服人
     * 攻击生物时，有10%×附魔等级的概率，使目标生物失去对自身的仇恨。
     * 存在一个问题：设置成空之后目标应该会立刻产生新的仇恨
     */
    @SubscribeEvent
    public static void doReasoningEvent(LivingAttackEvent event) {
        if (event.getEntity().level().isClientSide) return;
        val target = event.getEntity();
        if (event.getSource().getEntity() instanceof LivingEntity attacker) {
            val mainHandItem = attacker.getMainHandItem();
            val level = mainHandItem.getEnchantmentLevel(ModEnchantments.REASONING.get());
            if (level <= 0) return;
            val chance = level * 0.1f;
            if (target instanceof Mob mob && chance > Math.random()) {
                mob.setTarget(null); // 设置为空以清空仇恨
            }
        }
    }
}