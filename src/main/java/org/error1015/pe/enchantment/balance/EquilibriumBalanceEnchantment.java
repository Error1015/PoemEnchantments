package org.error1015.pe.enchantment.balance;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.ModEnchantmentSlotsSet;

public class EquilibriumBalanceEnchantment extends Enchantment {
    public EquilibriumBalanceEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentCategory.ARMOR, ModEnchantmentSlotsSet.ARMORS.getSlots());
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }
}