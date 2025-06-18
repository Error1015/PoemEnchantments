package org.error1015.pe.util;

/**
 * 用于模组的数学计算相关
 */
public class PEMath {
    /**
     * 计算球形的体积
     */
    public static double spherical(int radius) {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3.0);
    }

}