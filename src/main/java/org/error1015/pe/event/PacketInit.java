package org.error1015.pe.event;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.error1015.pe.network.NetworkManager;

@Mod.EventBusSubscriber
public class PacketInit {
    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(NetworkManager::registerPacket); // 初始化networking
    }
}