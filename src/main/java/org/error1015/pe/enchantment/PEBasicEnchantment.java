package org.error1015.pe.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.util.data.Lang;

import java.util.Set;

/**
 * 本模组的所有附魔都需要继承这个，负责重写相关公用逻辑
 */
public abstract class PEBasicEnchantment extends Enchantment {
    public PEBasicEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot[] pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    public abstract String getDesc(Lang lang);

    /**
     * 根据附魔稀有度和等级计算附魔花费
     * TODO: 数值未定
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
     * TODO: 数值未定
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

    /**
     * 防止附魔书被重复添加到不同的创造模式标签页中
     * @param book the item being added to the creative tab
     * @param allowedCategories the enchantment categories allowed in the creative tab
     */
    @Override
    public boolean allowedInCreativeTab(Item book, Set<EnchantmentCategory> allowedCategories) {
        return false;
    }
}