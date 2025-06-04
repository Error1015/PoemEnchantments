package org.error1015.pe.data;

import lombok.val;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.error1015.pe.data.lang.ModEnUsLanguageProvider;
import org.error1015.pe.data.lang.ModZhCnLanguageProvider;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GatherData {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {
        val generator = event.getGenerator();
        val output = generator.getPackOutput();
        val lookup = event.getLookupProvider();

        generator.addProvider(event.includeClient(), ModZhCnLanguageProvider.getInstance(output));
        generator.addProvider(event.includeClient(), ModEnUsLanguageProvider.getInstance(output));
    }
}