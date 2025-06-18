package org.error1015.pe.enchantment.armor;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;
import org.error1015.pe.util.data.Lang;

public class NoShareTheBlessingsNoAffordDifficultiesEnchantment extends PEBasicEnchantment {
    public NoShareTheBlessingsNoAffordDifficultiesEnchantment() {
        super(Rarity.RARE, EnchantmentCategory.ARMOR, PEEnchantmentHelper.ARMORS);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public  String getDesc(Lang lang) {
        return switch (lang) {
            case EN_US -> "The health regeneration effect on entities within a certain radius will stack on you";
            case ZH_CN -> "一定范围内实体身上的生命恢复效果都会叠加给你";
        };
    }

}