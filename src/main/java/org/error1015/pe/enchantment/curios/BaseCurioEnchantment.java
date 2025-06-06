package org.error1015.pe.enchantment.curios;

import net.minecraft.world.item.enchantment.Enchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;

/**
 * 所有给饰品使用的附魔应该继承此类
 */
public class BaseCurioEnchantment extends Enchantment {
    public BaseCurioEnchantment(Rarity rarity) {
        //                                                       或许这个东西在这里没有任何作用
        super(rarity, PEEnchantmentHelper.CURIOS, PEEnchantmentHelper.NOTHING);
    }
}