package org.error1015.pe.enchantment.armor;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;
import org.error1015.pe.util.data.Lang;

public class ReplaceBalanceEnchantment extends PEBasicEnchantment {
    public ReplaceBalanceEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentCategory.ARMOR, PEEnchantmentHelper.ARMORS);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public  String getDesc(Lang lang) {
        return switch (lang) {
            case EN_US -> "When injured, swap attribute values with the attacker for a period of time";
            case ZH_CN -> "受伤时, 与攻击者交换属性值, 持续一段时间";
        };
    }
}