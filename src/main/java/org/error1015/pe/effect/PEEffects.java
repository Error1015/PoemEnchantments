package org.error1015.pe.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.error1015.pe.effect.balance.ReplaceBalanceEffect;

import static org.error1015.pe.PoemEnchantment.MODID;

public final class PEEffects {
    public static final DeferredRegister<MobEffect> REGISTRAR = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MODID);

    public static final RegistryObject<MobEffect> REPLACE_BALANCE_EFFECT = REGISTRAR.register("replace_balance_effect", ReplaceBalanceEffect::new);
}