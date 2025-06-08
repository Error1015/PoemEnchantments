package org.error1015.pe.util.data;

import org.error1015.pe.enchantment.ModEnchantments;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class EnchantmentDescUtil {

    /**
     * 根据语言来返回不同的键值对列表，键是 enchantment.modid.enchantmentid.desc, 值从PEBasicEnchantment.getDesc(Lang)中取
     * @param lang 语言类型
     */
    public static @NotNull List<Pair<String, String>> genEnchantmentDesc(Lang lang) {
        var list = new ArrayList<Pair<String, String>>();

        for (var entry : ModEnchantments.REGISTRAR.getEntries()) {
            if (entry != null && entry.get() instanceof PEBasicEnchantment enchantment) {
                var descPath = enchantment.getDescriptionId() + ".desc";

                switch (lang) {
                    case EN_US -> list.add(Pair.of(descPath, enchantment.getDesc(Lang.EN_US)));
                    case ZH_CN -> list.add(Pair.of(descPath, enchantment.getDesc(Lang.ZH_CN)));
                }
            }
        }

        return list;
    }

}