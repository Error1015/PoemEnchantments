package org.error1015.pe.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.error1015.pe.util.CuriosUtil;

public final class PEEnchantmentHelper {
    public static final EquipmentSlot[] NOTHING = new EquipmentSlot[] {};
    public static final EquipmentSlot[] ARMORS = new EquipmentSlot[] { EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET };
    public static final EquipmentSlot[] HANDS = new EquipmentSlot[] { EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND };
    public static final EquipmentSlot[] MAIN_HAND = new EquipmentSlot[] { EquipmentSlot.MAINHAND };
    public static final EquipmentSlot[] OFF_HAND = new EquipmentSlot[] { EquipmentSlot.OFFHAND };
    public static final EquipmentSlot[] HEAD = new EquipmentSlot[] { EquipmentSlot.HEAD };
    public static final EquipmentSlot[] CHEST = new EquipmentSlot[] { EquipmentSlot.CHEST };
    public static final EquipmentSlot[] LEGS = new EquipmentSlot[] { EquipmentSlot.LEGS };
    public static final EquipmentSlot[] FEET = new EquipmentSlot[] { EquipmentSlot.FEET };
    public static final EnchantmentCategory CURIOS = EnchantmentCategory.create("curios", CuriosUtil::isCurioItem);
    public static final EnchantmentCategory ANY = EnchantmentCategory.create("any", item -> true);
    private PEEnchantmentHelper() { }
}