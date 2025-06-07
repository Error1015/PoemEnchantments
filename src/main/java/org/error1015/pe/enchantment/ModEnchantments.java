package org.error1015.pe.enchantment;

import lombok.experimental.UtilityClass;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.error1015.pe.enchantment.armor.*;
import org.error1015.pe.enchantment.weapon.*;

import static org.error1015.pe.PoemEnchantment.MODID;

@UtilityClass
public final class ModEnchantments {
    public static final DeferredRegister<Enchantment> REGISTRAR = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MODID);
    public static final RegistryObject<Enchantment> REPLACE_BALANCE = REGISTRAR.register("replace_balance", ReplaceBalanceEnchantment::new);
    public static final RegistryObject<Enchantment> EQUILIBRIUM_BALANCE = REGISTRAR.register("equilibrium_balance", EquilibriumBalanceEnchantment::new);
    public static final RegistryObject<Enchantment> VICTORY_BALANCE = REGISTRAR.register("victory_balance", VictoryBalanceEnchantment::new);
    public static final RegistryObject<Enchantment> REASONING = REGISTRAR.register("reasoning", ReasoningEnchantment::new);
    public static final RegistryObject<Enchantment> CALMLY = REGISTRAR.register("calmly", CalmlyEnchantment::new);
    public static final RegistryObject<Enchantment> SAGE_MOMENT = REGISTRAR.register("sage_moment", SageMomentEnchantment::new);
    public static final RegistryObject<Enchantment> BE_COMPASSIONATE = REGISTRAR.register("be_compassionate", BeCompassionateEnchantment::new);
    public static final RegistryObject<Enchantment> BOILING_BLOOD = REGISTRAR.register("boiling_blood", BoilingBloodEnchantment::new);
    public static final RegistryObject<Enchantment> BLOCK_THE_DIVINE_POWER = REGISTRAR.register("block_the_divine_power", BlockTheDivinePowerEnchantment::new);
    public static final RegistryObject<Enchantment> DROPPING_BLIND_BOX = REGISTRAR.register("dropping_blind_box", BlockTheDivinePowerEnchantment::new);
    public static final RegistryObject<Enchantment> LOOTING_BLIND_BOX = REGISTRAR.register("looting_blind_box", LootingBlindBoxEnchantment::new);
    public static final RegistryObject<Enchantment> WORLD_BLIND_BOX = REGISTRAR.register("world_blind_box", WorldBlindBoxEnchantment::new);
    public static final RegistryObject<Enchantment> SHARE_THE_BLESSINGS_AND_THE_DIFFICULTIES = REGISTRAR.register("share_the_blessings_and_the_difficulties", ShareTheBlessingsAndTheDifficultiesEnchantment::new);
    public static final RegistryObject<Enchantment> NO_SHARE_THE_BLESSINGS_NO_AFFORD_DIFFICULTIES = REGISTRAR.register("no_share_the_blessings_no_afford_difficulties", NoShareTheBlessingsNoAffordDifficultiesEnchantment::new);
    public static final RegistryObject<Enchantment> UNSTAINED_FROM_MUD = REGISTRAR.register("unstained_from_mud", UnstainedFromMudEnchantment::new);
}