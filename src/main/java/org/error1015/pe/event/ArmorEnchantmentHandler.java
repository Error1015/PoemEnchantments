package org.error1015.pe.event;

import lombok.val;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingBreatheEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.error1015.pe.PoemEnchantment;
import org.error1015.pe.enchantment.ModEnchantments;
import org.error1015.pe.util.EnchantmentUtil;

@Mod.EventBusSubscriber(modid = PoemEnchantment.MODID)
public final class ArmorEnchantmentHandler {
    /**
     * 置换天平：
     * 受到伤害或者攻击目标时，会交换自身和目标的所有属性值（比如生命值，生命恢复速度，攻击力，防御力，速度，暴击率，暴击伤害，攻击速度等），该效果持续5×附魔等级秒
     */
    @SubscribeEvent
    public static void doReplaceBalanceEvent(LivingDamageEvent event) {
        if (event.getEntity().level().isClientSide) return;
        val attacker = event.getSource().getEntity();
        if (attacker == null) return;
        int level = EnchantmentUtil.getArmorsEnchantmentsMaxLevel(attacker, ModEnchantments.REPLACE_BALANCE.get());
        // TODO
    }

    /**
     * 平衡天平
     * 受到伤害或者攻击目标时，会将自身和目标的所有属性值求和，然后平均分（比如生命值，生命恢复速度，攻击力，防御力，速度，暴击率，暴击伤害，攻击速度等）该效果持续5×附魔等级秒
     */
    @SubscribeEvent
    public static void doEquilibriumBalanceEvent(LivingDamageEvent event) {
        if (event.getEntity().level().isClientSide) return;
        if (event.getSource().getEntity() instanceof LivingEntity attacker) {
            int level = EnchantmentUtil.getArmorsEnchantmentsMaxLevel(attacker, ModEnchantments.EQUILIBRIUM_BALANCE.get());
            // TODO
        }
    }

    /**
     * 沸腾之血
     * 生命恢复效果增强（1-当前生命值/最大生命值）×附魔等级
     */
    @SubscribeEvent
    public static void doBoilingBloodEvent(LivingBreatheEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity == null || entity.level().isClientSide) return;
        // TODO
    }

}