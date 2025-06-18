package org.error1015.pe.enchantment.weapon;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;
import org.error1015.pe.util.data.Lang;

public class SageMomentEnchantment extends PEBasicEnchantment {
    public SageMomentEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentCategory.WEAPON, PEEnchantmentHelper.MAIN_HAND);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public  String getDesc(Lang lang) {
        return switch (lang) {
            case EN_US -> "Probability causes the target to lose all actions except movement for a period of time";
            case ZH_CN -> "概率使目标失去除了移动之外的所有行为, 持续一段时间";
        };
    }

}