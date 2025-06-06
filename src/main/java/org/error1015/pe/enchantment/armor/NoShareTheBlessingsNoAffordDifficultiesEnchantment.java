package org.error1015.pe.enchantment.armor;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEEnchantmentHelper;

public class NoShareTheBlessingsNoAffordDifficultiesEnchantment extends Enchantment {
    public NoShareTheBlessingsNoAffordDifficultiesEnchantment() {
        super(Rarity.RARE, EnchantmentCategory.ARMOR, PEEnchantmentHelper.ARMORS);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }
}