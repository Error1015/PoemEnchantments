package org.error1015.pe.util;

import lombok.experimental.UtilityClass;
import net.minecraft.world.effect.MobEffectInstance;

@UtilityClass
public final class MobEffectsUtil {

    /**
     * 判断效果是不是隐式的
     */
    public boolean isImplicit(MobEffectInstance effect) {
        return !effect.isVisible();
    }

    /**
     * 判断效果是不是显式的
     */
    public boolean isVisible(MobEffectInstance effect) {
        return effect.isVisible();
    }
}