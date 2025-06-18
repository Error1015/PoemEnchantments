package org.error1015.pe.enchantment.armor;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;
import org.error1015.pe.util.data.Lang;

public class BlockTheDivinePowerEnchantment extends PEBasicEnchantment {
    public BlockTheDivinePowerEnchantment() {
        super(Rarity.RARE, EnchantmentCategory.ARMOR, PEEnchantmentHelper.ARMORS);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public String getDesc(Lang lang) {
        return switch (lang) {
            case EN_US -> "Offset a certain amount of damage";
            case ZH_CN -> "抵消一定伤害";
        };
    }
}