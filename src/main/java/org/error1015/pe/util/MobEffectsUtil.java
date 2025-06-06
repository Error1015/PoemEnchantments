package org.error1015.pe.util;

import net.minecraft.world.effect.MobEffectInstance;

public final class MobEffectsUtil {
    private MobEffectsUtil() { }

    /**
     * 判断效果是不是隐式的
     */
    public static boolean isImplicit(MobEffectInstance effect) {
        return !effect.isVisible();
    }

    /**
     * 判断效果是不是显式的
     */
    public static boolean isVisible(MobEffectInstance effect) {
        return effect.isVisible();
    }
}