package org.error1015.pe;

import lombok.val;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.error1015.pe.enchantment.ModEnchantments;

import java.util.List;

public class PEItemGroup {
    public static final DeferredRegister<CreativeModeTab> REGISTRAR = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PoemEnchantment.MODID);

    /**
     * 返回ModEnchantments注册表中的附魔，并创建附魔书实例，返回附魔书列表。
     * 注意：不要将其定义为静态字段，否则将会在注册附魔时获取实例抛出异常
     */
    private static List<ItemStack> getEnchantments() {
        return ModEnchantments.REGISTRAR.getEntries().stream().map(it -> {
            val enchantment = it.get();
            return EnchantedBookItem.createForEnchantment(new EnchantmentInstance(enchantment, enchantment.getMaxLevel()));
        }).toList();
    }

    public static final RegistryObject<CreativeModeTab> MOD_ITEM_GROUP = REGISTRAR.register("pe_enchantments_group", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + PoemEnchantment.MODID))
            .icon(Items.ENCHANTED_BOOK::getDefaultInstance)
            .displayItems((parm, output) -> output.acceptAll(getEnchantments()))
            .build());
}