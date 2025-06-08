package org.error1015.pe.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import org.error1015.pe.enchantment.ModEnchantments;
import org.error1015.pe.util.EnchantmentUtil;
import org.error1015.pe.util.data.EnchantmentDescUtil;
import org.error1015.pe.util.data.Lang;
import org.jetbrains.annotations.NotNull;

import static org.error1015.pe.PoemEnchantment.MODID;

public final class ModZhCnLanguageProvider extends LanguageProvider {
    private static ModZhCnLanguageProvider INSTANCE;

    private ModZhCnLanguageProvider(PackOutput output) {
        super(output, MODID, "zh_cn");
    }

    public static @NotNull ModZhCnLanguageProvider getInstance(PackOutput output) {
        if (INSTANCE == null) {
            INSTANCE = new ModZhCnLanguageProvider(output);
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
        addEnchantment(ModEnchantments.REPLACE_BALANCE, "置换天平");
        addEnchantment(ModEnchantments.EQUILIBRIUM_BALANCE, "平衡天平");
        addEnchantment(ModEnchantments.VICTORY_BALANCE, "胜利天平");
        addEnchantment(ModEnchantments.REASONING, "以理服人");
        addEnchantment(ModEnchantments.CALMLY, "心平气和");
        addEnchantment(ModEnchantments.SAGE_MOMENT, "贤者时刻");
        addEnchantment(ModEnchantments.BE_COMPASSIONATE, "慈悲为怀");
        addEnchantment(ModEnchantments.BOILING_BLOOD, "沸腾之血");
        addEnchantment(ModEnchantments.BLOCK_THE_DIVINE_POWER, "格挡神力");
        addEnchantment(ModEnchantments.DROPPING_BLIND_BOX, "掉落物盲盒");
        addEnchantment(ModEnchantments.LOOTING_BLIND_BOX, "战利品盲盒");
        addEnchantment(ModEnchantments.WORLD_BLIND_BOX, "世界盲盒");
        addEnchantment(ModEnchantments.SHARE_THE_BLESSINGS_AND_THE_DIFFICULTIES, "有福同享，有难同当");
        addEnchantment(ModEnchantments.NO_SHARE_THE_BLESSINGS_NO_AFFORD_DIFFICULTIES, "有福独享，有难不当");
        addEnchantment(ModEnchantments.UNSTAINED_FROM_MUD, "出淤泥而不染，濯清涟而不妖");
    }

    private void addEnchantmentDesc() {
        for (var pair : EnchantmentDescUtil.ZH_CN_DESC) {
            add(pair.getKey(), pair.getValue());
        }
    }

    private void addKeys() {
        add("itemGroup.poem_enchantment", "诗词附魔");
    }
}