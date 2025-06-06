package org.error1015.pe;

import net.minecraftforge.common.ForgeConfigSpec;

public final class PEConfig {
    private PEConfig() { }

    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    static {
        SPEC = BUILDER.build();
    }
}