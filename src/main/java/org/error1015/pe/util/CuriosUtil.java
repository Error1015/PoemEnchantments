package org.error1015.pe.util;

import net.minecraft.world.item.Item;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class CuriosUtil {
    private CuriosUtil() {}
    
    /**
     * 如果物品是ICurioItem的对象或者tag中包含curios的命名空间则为true
     */
    public static boolean isCurioItem(Item item) {
        return item instanceof ICurioItem || item.getDefaultInstance()
                .getTags()
                .anyMatch(tag -> tag.location().getNamespace().equals(CuriosApi.MODID));
    }
}