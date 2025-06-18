package org.error1015.pe.enchantment.armor;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;
import org.error1015.pe.util.data.Lang;

public class VictoryBalanceEnchantment extends PEBasicEnchantment {
    public VictoryBalanceEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentCategory.ARMOR, PEEnchantmentHelper.ARMORS);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public  String getDesc(Lang lang) {
        return switch (lang) {
            case EN_US -> "Compare and swap the attribute values of the attacker and itself, and the attribute of the attacker is the larger value and the attacker's attribute is the smaller value";
            case ZH_CN -> "比较攻击者和自身的属性值并交换, 并且自身的属性为较大值, 攻击者的属性为较小值";
        };
    }

}