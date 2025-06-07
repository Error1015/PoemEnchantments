package org.error1015.pe.util;

import lombok.experimental.UtilityClass;
import lombok.val;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraftforge.items.IItemHandlerModifiable;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.type.capability.ICuriosItemHandler;

@UtilityClass
public final class CuriosUtil {
    /**
     * 如果物品是ICurioItem的对象或者tag中包含curios的命名空间则为true
     */
    public boolean isCurioItem(Item item) {
        return item instanceof ICurioItem || item.getDefaultInstance()
                .getTags()
                .anyMatch(tag -> tag.location().getNamespace().equals(CuriosApi.MODID));
    }

    /**
     * 判断实体是否装备某一个饰品
     */
    public boolean isEquipCurio(LivingEntity livingEntity, Item item) {
        return CuriosApi.getCuriosInventory(livingEntity)
                .resolve()
                .map(iCuriosItemHandler -> iCuriosItemHandler.findFirstCurio(item).isPresent())
                .orElse(false);
    }


    /**
     * 获取实体装备的饰品
     */
    public @Nullable IItemHandlerModifiable getEquipCurios(LivingEntity livingEntity) {
        val curiosInventory = CuriosApi.getCuriosInventory(livingEntity).resolve();
        return curiosInventory.map(ICuriosItemHandler::getEquippedCurios).orElse(null);
    }
}