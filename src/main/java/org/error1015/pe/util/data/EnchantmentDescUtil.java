package org.error1015.pe.util.data;

import lombok.val;
import org.error1015.pe.enchantment.ModEnchantments;
import org.error1015.pe.enchantment.PEBasicEnchantment;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public final class EnchantmentDescUtil {

    public static final List<Pair<String, String>> ZH_CN_DESC = genEnchantmentDesc(Lang.ZH_CN);
    public static final List<Pair<String, String>> EN_US_DESC = genEnchantmentDesc(Lang.EN_US);

    /**
     * 根据语言来返回不同的键值对列表，键是 enchantment.modid.enchantmentid.desc, 值从PEBasicEnchantment.getDesc(Lang)中取
     *
     * @param lang 语言类型
     */
    private static @NotNull List<Pair<String, String>> genEnchantmentDesc(Lang lang) {
        val list = new ArrayList<Pair<String, String>>();
        // 遍历注册表拿到RegisterObject<Enchantment>
        for (var entry : ModEnchantments.REGISTRAR.getEntries()) {
            if (entry != null && entry.get() instanceof PEBasicEnchantment enchantment) {
                var descPath = enchantment.getDescriptionId() + ".desc";
                list.add(Pair.of(descPath, enchantment.getDesc(lang)));
            }
        }
        return list;
    }

    private EnchantmentDescUtil() {
        throw new IllegalArgumentException("Utility class created Instance.");
    }
}