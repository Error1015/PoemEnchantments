package org.error1015.pe.enchantment.weapon;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;
import org.error1015.pe.util.data.Lang;

public class WorldBlindBoxEnchantment extends PEBasicEnchantment {
    public WorldBlindBoxEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentCategory.WEAPON, PEEnchantmentHelper.MAIN_HAND);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public  String getDesc(Lang lang) {
        return switch (lang) {
            case EN_US -> "Has a chance to cause the target to drop any item";
            case ZH_CN -> "有概率使目标掉落一件任意物品";
        };
    }

}