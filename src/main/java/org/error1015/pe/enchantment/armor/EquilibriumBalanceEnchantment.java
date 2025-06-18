package org.error1015.pe.enchantment.armor;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;
import org.error1015.pe.util.data.Lang;

public class EquilibriumBalanceEnchantment extends PEBasicEnchantment {
    public EquilibriumBalanceEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentCategory.ARMOR, PEEnchantmentHelper.ARMORS);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public String getDesc(Lang lang) {
        return switch (lang) {
            case EN_US -> "When injured, the stat value is evenly distributed for a certain amount of time";
            case ZH_CN -> "受伤时把属性值平均分配, 持续一定时间";
        };
    }

}