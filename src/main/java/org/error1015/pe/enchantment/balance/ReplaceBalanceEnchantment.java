package org.error1015.pe.enchantment.balance;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.ModEnchantmentSlotsSet;

public class ReplaceBalanceEnchantment extends Enchantment {
    public ReplaceBalanceEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentCategory.ARMOR, ModEnchantmentSlotsSet.ARMORS);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }
}