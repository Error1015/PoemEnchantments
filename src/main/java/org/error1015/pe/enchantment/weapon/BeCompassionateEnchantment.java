package org.error1015.pe.enchantment.weapon;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;
import org.error1015.pe.util.data.Lang;

public class BeCompassionateEnchantment extends PEBasicEnchantment {
    public BeCompassionateEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentCategory.WEAPON, PEEnchantmentHelper.MAIN_HAND);
    }

    @Override
    public  String getDesc(Lang lang) {
        return switch (lang) {
            case EN_US -> "When the damage dealt kills the target, the damage leaves 1 health for the target";
            case ZH_CN -> "当造成的伤害能直接击杀目标时，本次伤害会给目标留下 1 点生命值";
        };
    }

}