package org.error1015.pe.enchantment.weapon;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;
import org.error1015.pe.util.data.Lang;

public class LootingBlindBoxEnchantment extends PEBasicEnchantment {
    public LootingBlindBoxEnchantment() {
        super(Rarity.RARE, EnchantmentCategory.WEAPON, PEEnchantmentHelper.MAIN_HAND);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public  String getDesc(Lang lang) {
        return switch (lang) {
            case EN_US -> "Has a chance to drop the target's drops directly";
            case ZH_CN -> "有概率直接掉落目标的掉落物";
        };
    }

}