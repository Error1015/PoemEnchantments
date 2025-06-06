package org.error1015.pe.enchantment.weapon;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEEnchantmentHelper;

public class ReasoningEnchantment extends Enchantment {
    public ReasoningEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentCategory.WEAPON, PEEnchantmentHelper.MAIN_HAND);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }
}