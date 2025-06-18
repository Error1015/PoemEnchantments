package org.error1015.pe.enchantment.armor;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;
import org.error1015.pe.util.data.Lang;

public class BoilingBloodEnchantment extends PEBasicEnchantment {
    public BoilingBloodEnchantment() {
        super(Rarity.COMMON, EnchantmentCategory.ARMOR, PEEnchantmentHelper.ARMORS);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public String getDesc(Lang lang) {
        return switch (lang) {
            case EN_US -> "Increases health regeneration";
            case ZH_CN -> "加强生命恢复效果";
        };
    }

}