package org.error1015.pe.effect.balance;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;


public class ReplaceBalanceEffect extends MobEffect {
    public ReplaceBalanceEffect() {
        super(MobEffectCategory.NEUTRAL, 0xEEEEEEE);
    }

    @Override
    public void applyEffectTick(@NotNull LivingEntity living, int amplifier) {
        if (living.level().isClientSide) return;
        super.applyEffectTick(living, amplifier);
    }
}