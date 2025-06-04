package org.error1015.pe.enchantment;

import lombok.Getter;
import net.minecraft.world.entity.EquipmentSlot;

public enum ModEnchantmentSlotsSet {
    ARMORS(EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET);

    @Getter private final EquipmentSlot[] slots;

    ModEnchantmentSlotsSet(EquipmentSlot... slots) {
        this.slots = slots;
    }
}