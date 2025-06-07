package org.error1015.pe.util.data;

import org.error1015.pe.enchantment.ModEnchantments;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class EnchantmentDescUtil {
    public static @NotNull List<Pair<String, String>> genEnchantmentDesc(Lang lang) {
        var list = new ArrayList<Pair<String, String>>();

        for (var entry : ModEnchantments.REGISTRAR.getEntries()) {
            if (entry != null && entry.get() instanceof PEBasicEnchantment enchantment) {
                var descPath = entry.get().getDescriptionId() + ".desc";

                switch (lang) {
                    case EN_US -> list.add(Pair.of(descPath, enchantment.getDesc(Lang.EN_US)));
                    case ZH_CN -> list.add(Pair.of(descPath, enchantment.getDesc(Lang.ZH_CN)));
                }
            }
        }

        return list;
    }
}