package org.error1015.pe.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import org.error1015.pe.PoemEnchantment;
import org.error1015.pe.enchantment.ModEnchantments;
import org.jetbrains.annotations.NotNull;

public final class ModZhCnLanguageProvider extends LanguageProvider {
    private ModZhCnLanguageProvider(PackOutput output) {
        super(output, PoemEnchantment.MODID, "zh_cn");
    }

    public static ModZhCnLanguageProvider INSTANCE;

    public static @NotNull ModZhCnLanguageProvider getInstance(PackOutput output) {
        if (INSTANCE == null) {
            INSTANCE = new ModZhCnLanguageProvider(output);
        }
        return INSTANCE;
    }

    @Override
    public void addTranslations() {
        addKeys();
        addEnchantment(ModEnchantments.REPLACE_BALANCE, "置换天平");
        addEnchantment(ModEnchantments.EQUILIBRIUM_BALANCE, "平衡天平");
        addEnchantment(ModEnchantments.VICTORY_BALANCE,"胜利天平");
    }

    public void addKeys() {
        add("itemGroup.poem_enchantment", "诗词附魔");
    }
}