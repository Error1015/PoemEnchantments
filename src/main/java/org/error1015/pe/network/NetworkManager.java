package org.error1015.pe.network;

import lombok.AccessLevel;
import lombok.Getter;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.error1015.pe.util.MiscUtils;

public final class NetworkManager {
    @Getter(AccessLevel.PACKAGE)
    private static SimpleChannel channel;
    private static final String VERSION = "1.0";
    private static int id = 0;

    static int getId() { return ++id; }

    public static void registerPacket() {
        setChannel();
    }

    private static void setChannel() {
        channel = NetworkRegistry.newSimpleChannel(MiscUtils.ofPath("pe_network"), () -> VERSION, (str) -> str.equals(VERSION), (str) -> str.equals(VERSION));
    }

    private NetworkManager() {}
}