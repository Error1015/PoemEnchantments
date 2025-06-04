package org.error1015.pe.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import org.error1015.pe.PoemEnchantment;
import org.error1015.pe.enchantment.ModEnchantments;
import org.jetbrains.annotations.NotNull;

public final class ModEnUsLanguageProvider extends LanguageProvider {
    private ModEnUsLanguageProvider(PackOutput output) {
        super(output, PoemEnchantment.MODID, "en_us");
    }

    private static ModEnUsLanguageProvider INSTANCE;

    public static @NotNull ModEnUsLanguageProvider getInstance(PackOutput output) {
        if (INSTANCE == null) {
            INSTANCE = new ModEnUsLanguageProvider(output);
        }
        return INSTANCE;
    }

    @Override
    public void addTranslations() {
        addKeys();
        addEnchantment(ModEnchantments.REPLACE_BALANCE, "Replace Balance");
        addEnchantment(ModEnchantments.EQUILIBRIUM_BALANCE, "Equilibrium Balance");
    }

    public void addKeys() {
        add("itemGroup.poem_enchantment", "Poem Enchantment");
    }
}