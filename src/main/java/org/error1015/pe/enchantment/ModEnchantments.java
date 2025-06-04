package org.error1015.pe.enchantment;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.error1015.pe.PoemEnchantment;
import org.error1015.pe.enchantment.balance.EquilibriumBalanceEnchantment;
import org.error1015.pe.enchantment.balance.ReplaceBalanceEnchantment;
import org.error1015.pe.enchantment.balance.VictoryBalanceEnchantment;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> REGISTRAR = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, PoemEnchantment.MODID);

    public static final RegistryObject<Enchantment> REPLACE_BALANCE = REGISTRAR.register("replace_balance", ReplaceBalanceEnchantment::new);
    public static final RegistryObject<Enchantment> EQUILIBRIUM_BALANCE = REGISTRAR.register("equilibrium_balance", EquilibriumBalanceEnchantment::new);
    public static final RegistryObject<Enchantment> VICTORY_BALANCE = REGISTRAR.register("victory_balance", VictoryBalanceEnchantment::new);

    private ModEnchantments() {}
}