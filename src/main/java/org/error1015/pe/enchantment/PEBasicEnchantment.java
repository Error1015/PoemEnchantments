package org.error1015.pe.enchantment;

import io.netty.util.internal.UnstableApi;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

/**
 * 本模组的所有附魔都需要继承这个，负责重写相关公用逻辑
 */
public class PEBasicEnchantment extends Enchantment {
    public PEBasicEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot[] pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }


    /**
     * 根据附魔稀有度和等级计算附魔花费
     * @param level 附魔等级
     * @return 附魔花费
     */
    @Override
    public int getMaxCost(int level) {
        return switch (this.getRarity()) {
            case COMMON -> 2 + level * 2;
            case UNCOMMON -> 3 + level * 2;
            case RARE -> 4 + level * 2;
            case VERY_RARE -> 4 + level * 3;
        };
    }

    /**
     * 根据附魔稀有度和等级计算附魔花费
     * @param level 附魔等级
     * @return 附魔花费
     */
    @Override
    public int getMinCost(int level) {
        return switch (this.getRarity()) {
            case COMMON -> level;
            case UNCOMMON -> level * 2;
            case RARE -> level * 3;
            case VERY_RARE -> level * 4;
        };
    }
}