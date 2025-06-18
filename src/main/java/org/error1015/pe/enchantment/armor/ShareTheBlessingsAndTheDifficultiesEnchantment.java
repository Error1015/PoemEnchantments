package org.error1015.pe.enchantment.armor;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;
import org.error1015.pe.util.data.Lang;

public class ShareTheBlessingsAndTheDifficultiesEnchantment extends PEBasicEnchantment {
    public ShareTheBlessingsAndTheDifficultiesEnchantment() {
        super(Rarity.RARE, EnchantmentCategory.ARMOR, PEEnchantmentHelper.ARMORS);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public  String getDesc(Lang lang) {
        return switch (lang) {
            case EN_US -> "Share the health regeneration effect with nearby entities";
            case ZH_CN -> "把身上的生命恢复效果分享给周围的实体";
        };
    }
}