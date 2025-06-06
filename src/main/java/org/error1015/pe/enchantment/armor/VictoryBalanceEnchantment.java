package org.error1015.pe.enchantment.armor;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEEnchantmentHelper;

public class VictoryBalanceEnchantment extends Enchantment {
    public VictoryBalanceEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentCategory.ARMOR, PEEnchantmentHelper.ARMORS);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }
}