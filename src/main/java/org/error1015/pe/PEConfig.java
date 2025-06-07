package org.error1015.pe;

import lombok.experimental.UtilityClass;
import net.minecraftforge.common.ForgeConfigSpec;

@UtilityClass
public final class PEConfig {
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    static {
        SPEC = BUILDER.build();
    }

}