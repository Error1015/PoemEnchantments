package org.error1015.pe.event;

import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.error1015.pe.PoemEnchantment;

@Mod.EventBusSubscriber(modid = PoemEnchantment.MODID)
public class PoemEnchantmentHandler {
    @SubscribeEvent
    public static void onLivingDamage(LivingDamageEvent event) {
    }
}