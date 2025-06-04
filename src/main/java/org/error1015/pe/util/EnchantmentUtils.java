package org.error1015.pe.util;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;

public class EnchantmentUtils {
    /**
     * 获取实体全身装备中某附魔最大等级
     */
    public static int getArmorsEnchantmentsMaxLevel(Entity entity, Enchantment enchantment) {
        int level = 0;
        for (ItemStack armorSlot : entity.getArmorSlots()) {
            if (level < armorSlot.getEnchantmentLevel(enchantment)) {
                level = armorSlot.getEnchantmentLevel(enchantment);
            }
        }
        return level;
    }
}