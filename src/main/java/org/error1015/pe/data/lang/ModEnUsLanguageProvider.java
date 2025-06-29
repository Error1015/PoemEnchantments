package org.error1015.pe.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import org.error1015.pe.enchantment.ModEnchantments;
import org.error1015.pe.util.data.EnchantmentDescUtil;
import org.jetbrains.annotations.NotNull;

import static org.error1015.pe.PoemEnchantment.MODID;

public final class ModEnUsLanguageProvider extends LanguageProvider {
    private static ModEnUsLanguageProvider INSTANCE;

    private ModEnUsLanguageProvider(PackOutput output) {
        super(output, MODID, "en_us");
    }

    public static @NotNull ModEnUsLanguageProvider getInstance(PackOutput output) {
        if (INSTANCE == null) {
            INSTANCE = new ModEnUsLanguageProvider(output);
        }
        return INSTANCE;
    }

    @Override
    public void addTranslations() {
        addKeys();
        addEnchantments();
        addEnchantmentDesc();
    }

    private void addEnchantments() {
        addEnchantment(ModEnchantments.REPLACE_BALANCE, "Replace Balance");
        addEnchantment(ModEnchantments.EQUILIBRIUM_BALANCE, "Equilibrium Balance");
        addEnchantment(ModEnchantments.VICTORY_BALANCE, "Victory Balance");
        addEnchantment(ModEnchantments.REASONING, "Reasoning");
        addEnchantment(ModEnchantments.CALMLY, "Calmly");
        addEnchantment(ModEnchantments.SAGE_MOMENT, "Sage Moment");
        addEnchantment(ModEnchantments.BE_COMPASSIONATE, "Be Compassionate");
        addEnchantment(ModEnchantments.BOILING_BLOOD, "Boiling Blood");
        addEnchantment(ModEnchantments.BLOCK_THE_DIVINE_POWER, "Block The Divine Power");
        addEnchantment(ModEnchantments.LOOTING_BLIND_BOX, "Looting Blind Box");
        addEnchantment(ModEnchantments.WORLD_BLIND_BOX, "World Blind Box");
        addEnchantment(ModEnchantments.SHARE_THE_BLESSINGS_AND_THE_DIFFICULTIES, "Share The Blessings And The Difficulties");
        addEnchantment(ModEnchantments.NO_SHARE_THE_BLESSINGS_NO_AFFORD_DIFFICULTIES, "Share The Blessings No The Difficulties");
        addEnchantment(ModEnchantments.UNSTAINED_FROM_MUD, "Unstained From Mud");
    }

    private void addEnchantmentDesc() {
        for (var pair : EnchantmentDescUtil.EN_US_DESC) {
            add(pair.getKey(), pair.getValue());
        }
    }

    private void addKeys() {
        add("itemGroup.poem_enchantment", "Poem Enchantment");
    }
}