package org.error1015.pe.enchantment.balance;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.ModEnchantmentSlotsSet;

public class VictoryBalanceEnchantment extends Enchantment {
    public VictoryBalanceEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentCategory.ARMOR, ModEnchantmentSlotsSet.ARMORS.getSlots());
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }
}