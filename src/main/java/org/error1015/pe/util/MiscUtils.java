package org.error1015.pe.util;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

import static org.error1015.pe.PoemEnchantment.MODID;

public class MiscUtils {

    /**
     * 帮助构建aabb
     *
     * @param pos
     * @param x
     * @param y
     * @param z
     * @return AABB
     */
    public static @NotNull AABB genAABB(BlockPos pos, int x, int y, int z) {
        BlockPos p2 = new BlockPos(x, y, z);
        return new AABB(pos, p2);
    }

    public static @NotNull ResourceLocation ofPath(String path) {
        return new ResourceLocation(MODID, path);
    }
}