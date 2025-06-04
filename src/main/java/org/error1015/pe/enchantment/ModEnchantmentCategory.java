package org.error1015.pe.enchantment;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.util.CuriosUtil;

public class ModEnchantmentCategory {
    public static final EnchantmentCategory ANY = EnchantmentCategory.create("any", item -> item instanceof Item);
    public static final EnchantmentCategory CURIOS = EnchantmentCategory.create("curios", CuriosUtil::isCurioItem);
}