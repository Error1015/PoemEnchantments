package org.error1015.pe.enchantment.armor;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.error1015.pe.enchantment.PEEnchantmentHelper;
import org.error1015.pe.util.data.Lang;

public class UnstainedFromMudEnchantment extends PEBasicEnchantment {
    public UnstainedFromMudEnchantment() {
        super(Rarity.RARE, EnchantmentCategory.ARMOR, PEEnchantmentHelper.ARMORS);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public  String getDesc(Lang lang) {
        return switch (lang) {
            case EN_US -> "Transfer the status effects of nearby entities to you, and distribute the damage dealt by the debuff to other entities";
            case ZH_CN -> "把周围实体的状态效果都转移到你的身上, 由debuff对自身造成的伤害分配给其他实体";
        };
    }

}