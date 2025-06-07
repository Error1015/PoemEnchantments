package org.error1015.pe.util;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;

public final class EnchantmentUtil {
    private EnchantmentUtil() {}

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

    public static int getEnchantmentLevel(ItemStack stack, Enchantment enchantment) {
        return stack.getAllEnchantments().getOrDefault(enchantment, 0);
    }

    /**
     * 物品是否存在某一附魔
     */
    public static boolean isItemHasEnchantments(ItemStack item, Enchantment enchantment) {
        return item.getAllEnchantments().containsKey(enchantment);
    }

    /**
     * 任意装备含有某附魔
     */
    public static boolean isAnyEquipArmorHasEnchantment(Entity entity, Enchantment enchantment) {
        for (ItemStack armorSlot : entity.getArmorSlots()) {
            return isItemHasEnchantments(armorSlot, enchantment);
        }
        return false;
    }


    public static boolean isAllEquipArmorHasEnchantment(Entity entity, Enchantment enchantment) {
        for (ItemStack armorSlot : entity.getArmorSlots()) {
            if (!isItemHasEnchantments(armorSlot, enchantment)) {
                return false;
            }
        }
        return true;  // 所有盔甲都有该附魔
    }
}