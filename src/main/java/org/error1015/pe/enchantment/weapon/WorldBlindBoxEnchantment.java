package org.error1015.pe.enchantment.weapon;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEEnchantmentHelper;

public class WorldBlindBoxEnchantment extends Enchantment {
    public WorldBlindBoxEnchantment() {
        super(Rarity.RARE, EnchantmentCategory.WEAPON, PEEnchantmentHelper.MAIN_HAND);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }
}