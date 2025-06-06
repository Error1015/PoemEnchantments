package org.error1015.pe.util;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public final class CuriosUtil {
    private CuriosUtil() { }

    /**
     * 如果物品是ICurioItem的对象或者tag中包含curios的命名空间则为true
     */
    public static boolean isCurioItem(Item item) {
        return item instanceof ICurioItem || item.getDefaultInstance()
                .getTags()
                .anyMatch(tag -> tag.location().getNamespace().equals(CuriosApi.MODID));
    }

    /**
     * 判断实体是否装备某一个饰品
     */
    public static boolean isEquipCurio(LivingEntity livingEntity, Item item) {
        return CuriosApi.getCuriosInventory(livingEntity).resolve()
                .map(iCuriosItemHandler -> iCuriosItemHandler.findFirstCurio(item).isPresent())
                .orElse(false);
    }
}