package org.error1015.pe;

import com.mojang.logging.LogUtils;
import lombok.val;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.error1015.pe.enchantment.ModEnchantments;
import org.slf4j.Logger;

@Mod(PoemEnchantment.MODID)
public class PoemEnchantment {
    public static final String MODID = "poem_enchantment";
    public static final Logger LOGGER = LogUtils.getLogger();

    public PoemEnchantment() {
        val modBus = FMLJavaModLoadingContext.get().getModEventBus();
        val loadingContext = ModLoadingContext.get();

        ModEnchantments.REGISTRAR.register(modBus);
        PEItemGroup.REGISTRAR.register(modBus);

        loadingContext.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}