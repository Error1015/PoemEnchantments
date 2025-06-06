package org.error1015.pe.enchantment.weapon;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEEnchantmentHelper;

public class SageMomentEnchantment extends Enchantment {
    public SageMomentEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentCategory.WEAPON, PEEnchantmentHelper.MAIN_HAND);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }
}