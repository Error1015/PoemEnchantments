package org.error1015.pe.util;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;

import java.util.List;
import java.util.function.Predicate;

public class EntityUtils {
    /**
     * 获取一定范围内的所有实体
     *
     * @param entity 中心
     * @param radius 半径
     * @param filter 过滤条件
     */
    public static List<Entity> getEntitiesFromRadius(LivingEntity entity, int radius, Predicate<Entity> filter) {
        var pos = entity.blockPosition();
        var aabb = new AABB(pos.getX() - radius, pos.getY() - radius, pos.getZ() - radius, pos.getX() + radius, pos.getY() + radius, pos.getZ() + radius);
        return entity.level().getEntitiesOfClass(Entity.class, aabb).stream().filter(e -> e != null && filter.test(e)).toList();
    }
}