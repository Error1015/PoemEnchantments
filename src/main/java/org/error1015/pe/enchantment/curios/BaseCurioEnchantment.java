package org.error1015.pe.enchantment.curios;

import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;

/**
 * 所有给饰品使用的附魔应该继承此类
 */
public class BaseCurioEnchantment extends PEBasicEnchantment {
    public BaseCurioEnchantment(Rarity rarity) {
        super(rarity, PEEnchantmentHelper.CURIOS, PEEnchantmentHelper.NOTHING);
    }
}