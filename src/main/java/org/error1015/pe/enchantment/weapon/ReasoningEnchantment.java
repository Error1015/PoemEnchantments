package org.error1015.pe.enchantment.weapon;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;
import org.error1015.pe.util.data.Lang;

public class ReasoningEnchantment extends PEBasicEnchantment {
    public ReasoningEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentCategory.WEAPON, PEEnchantmentHelper.MAIN_HAND);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public  String getDesc(Lang lang) {
        return switch (lang) {
            case EN_US -> "Has a chance to cause the target to lose hatred of themselves";
            case ZH_CN -> "有概率使目标失去对自身的仇恨";
        };
    }

}